(ns clj-train.pangram-test
  (:require [clojure.test :refer [deftest testing is]]
            [clj-train.pangram :refer [pangram?]]))

(deftest pangram?-test
  (let [test-string "The quick brown fox jumps over the lazy dog."
        expected true]
    (testing (str "[expect " expected "] " test-string)
      (is (= (pangram? test-string) expected))))

  (let [test-string "Pack my box with five dozen liquor jugs."
        expected true]
    (testing (str "[expect " expected "] " test-string)
      (is (= (pangram? test-string) expected))))

  (let [test-string "Not every sentence is a a pangram. An example"
        expected false]
    (testing (str "[expect " expected "] " test-string)
      (is (= (pangram? test-string) expected)))))
