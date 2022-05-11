(ns clj-train.pangram
  (:require [clojure.string :refer [lower-case index-of]]))

(defn pangram?
  "Detect if given string `s' is pangram or not"
  [s]
  (->> (seq "abcdefghijklmnopqrstuvwxyz")
       (map (fn [x] (index-of (lower-case s) x)))
       ;; equivalent
       ;; (map #(* (index-of (lower-case s) %)))
       (reduce 'and)
       (boolean)))
