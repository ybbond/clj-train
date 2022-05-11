(ns clj-train.nandgame-test
  (:require [clojure.test :refer [deftest testing is]]
            [clj-train.nandgame :refer :all]))

(deftest relay-off-test
  (testing "If control true and input true should be true"
    (is (= (relay-off ONE ONE) ONE)))
  (testing "If control true and input false should be false"
    (is (= (relay-off ONE ZERO) ZERO)))
  (testing "If control false and input true should be false"
    (is (= (relay-off ZERO ONE) ZERO)))
  (testing "If control false and input false should be false"
    (is (= (relay-off ZERO ZERO) ZERO))))

(deftest relay-on-test
  (testing "If control true and input true should be false"
    (is (= (relay-on ONE ONE) ZERO)))
  (testing "If control true and input false should be false"
    (is (= (relay-on ONE ZERO) ZERO)))
  (testing "If control false and input true should be true"
    (is (= (relay-on ZERO ONE) ONE)))
  (testing "If control false and input false should be false"
    (is (= (relay-on ZERO ZERO) ZERO))))

(deftest nand-gate-test
  (testing "1 NAND 1 = 0"
    (is (= (nand-gate ONE ONE) ZERO)))
  (testing "1 NAND 0 = 1"
    (is (= (nand-gate ONE ZERO) ONE)))
  (testing "0 NAND 1 = 1"
    (is (= (nand-gate ZERO ONE) ONE)))
  (testing "0 NAND 0 = 1"
    (is (= (nand-gate ZERO ZERO) ONE))))

(deftest invert-gate-test
  (testing "INVERT 1 = 0"
    (is (= (invert-gate ONE) ZERO)))
  (testing "INVERT 0 = 1"
    (is (= (invert-gate ZERO) ONE))))

(deftest and-gate-test
  (testing "1 AND 1 = 1"
    (is (= (and-gate ONE ONE) ONE)))
  (testing "1 AND 0 = 0"
    (is (= (and-gate ONE ZERO) ZERO)))
  (testing "0 AND 1 = 0"
    (is (= (and-gate ZERO ONE) ZERO)))
  (testing "0 AND 0 = 0"
    (is (= (and-gate ZERO ZERO) ZERO))))

(deftest or-gate-test
  (testing "1 OR 1 = 1"
    (is (= (or-gate ONE ONE) ONE)))
  (testing "1 OR 0 = 1"
    (is (= (or-gate ONE ZERO) ONE)))
  (testing "0 OR 1 = 1"
    (is (= (or-gate ZERO ONE) ONE)))
  (testing "0 OR 0 = 0"
    (is (= (or-gate ZERO ZERO) ZERO))))

(deftest xor-gate-test
  (testing "1 XOR 1 = 0"
    (is (= (xor-gate ONE ONE) ZERO)))
  (testing "1 XOR 0 = 1"
    (is (= (xor-gate ONE ZERO) ONE)))
  (testing "0 XOR 1 = 1"
    (is (= (xor-gate ZERO ONE) ONE)))
  (testing "0 XOR 0 = 0"
    (is (= (xor-gate ZERO ZERO) ZERO))))


;; raw test
(deftest nand-gate-raw-test
  (testing "1 NAND 1 = 0"
    (is (= (nand-gate ONE ONE) ZERO)))
  (testing "1 NAND 0 = 1"
    (is (= (nand-gate-raw ONE ZERO) ONE)))
  (testing "0 NAND 1 = 1"
    (is (= (nand-gate-raw ZERO ONE) ONE)))
  (testing "0 NAND 0 = 1"
    (is (= (nand-gate-raw ZERO ZERO) ONE))))

(deftest invert-gate-raw-test
  (testing "INVERT 1 = 0"
    (is (= (invert-gate-raw ONE) ZERO)))
  (testing "INVERT 0 = 1"
    (is (= (invert-gate-raw ZERO) ONE))))

(deftest and-gate-raw-test
  (testing "1 AND 1 = 1"
    (is (= (and-gate-raw ONE ONE) ONE)))
  (testing "1 AND 0 = 0"
    (is (= (and-gate-raw ONE ZERO) ZERO)))
  (testing "0 AND 1 = 0"
    (is (= (and-gate-raw ZERO ONE) ZERO)))
  (testing "0 AND 0 = 0"
    (is (= (and-gate-raw ZERO ZERO) ZERO))))

(deftest or-gate-raw-test
  (testing "1 OR 1 = 1"
    (is (= (or-gate-raw ONE ONE) ONE)))
  (testing "1 OR 0 = 1"
    (is (= (or-gate-raw ONE ZERO) ONE)))
  (testing "0 OR 1 = 1"
    (is (= (or-gate-raw ZERO ONE) ONE)))
  (testing "0 OR 0 = 0"
    (is (= (or-gate-raw ZERO ZERO) ZERO))))

(deftest xor-gate-raw-test
  (testing "1 XOR 1 = 0"
    (is (= (xor-gate-raw ONE ONE) ZERO)))
  (testing "1 XOR 0 = 1"
    (is (= (xor-gate-raw ONE ZERO) ONE)))
  (testing "0 XOR 1 = 1"
    (is (= (xor-gate-raw ZERO ONE) ONE)))
  (testing "0 XOR 0 = 0"
    (is (= (xor-gate-raw ZERO ZERO) ZERO))))
