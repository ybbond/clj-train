(ns clj-train.scratchpad
  (:gen-class)
  (:require [clojure.string :as str]))

(str/blank? "")
(str/lower-case "Foo")
(str/split "test" #"e")

(defn foo ^String
  "returns string"
  ([^String test]
   test)
  ([^String h ^String s]
   (str h s)))

(foo "1")
(foo "20.0" "20.0")

(let [temp-celcius ^int  28
      conv-fahrenheit ^int  (+ (* temp-celcius (/ 9 5)) 32)
      conv-reaumur ^int  (* temp-celcius 0.8)]

  (prn conv-fahrenheit)
  (prn conv-reaumur))
