(ns clj-train.nandgame)

(def ONE true)
(def ZERO false)

(defn relay-off ^Boolean
  [^Boolean control ^Boolean input]
  (and control input))

(defn relay-on ^Boolean
  [^Boolean control ^Boolean input]
  (and (not control) input))

(defn nand-gate ^Boolean
  [^Boolean a ^Boolean b]
  (relay-on (relay-off a b) true))

(defn invert-gate ^Boolean
  [^Boolean input]
  (nand-gate input input))

(defn and-gate ^Boolean
  [^Boolean a ^Boolean b]
  (invert-gate (nand-gate a b)))

(defn or-gate ^Boolean
  [^Boolean a ^Boolean b]
  (nand-gate (nand-gate a a) (nand-gate b b)))

;; (defn xor-gate ^Boolean
;;   [^Boolean a ^Boolean b]
;;   (and-gate (nand-gate a b) (or-gate a b)))

;; more efficient
(defn xor-gate ^Boolean
  [^Boolean a ^Boolean b]
  (let [temp-nand (nand-gate a b)]
    (nand-gate
      (nand-gate a temp-nand)
      (nand-gate b temp-nand)
      )))

(defn nand-gate-raw ^Boolean
  [^Boolean a ^Boolean b]
  (and (not (and a b)) true))

(defn invert-gate-raw ^Boolean
  [^Boolean input]
  (and (not (and input input)) true))

(defn and-gate-raw ^Boolean
  [^Boolean a ^Boolean b]
  (let [temp-nand (and (not (and a b)) true)]

    (and (not (and temp-nand temp-nand)) true)))

(defn or-gate-raw ^Boolean
  [^Boolean a ^Boolean b]
  (let [temp-nand-a (and (not (and a a)) true)
        temp-nand-b (and (not (and b b)) true)]

    (and (not (and temp-nand-a temp-nand-b)) true)))

;; (defn xor-gate-raw ^Boolean
;;   [^Boolean a ^Boolean b]
;;   (let [temp-nand (and (not (and a b)) true)
;;         temp-nand-a (and (not (and a a)) true)
;;         temp-nand-b (and (not (and b b)) true)
;;         temp-or (and (not (and temp-nand-a temp-nand-b)) true)]

;;     (and
;;      (not
;;       (and (and (not (and temp-nand temp-or)) true)
;;            (and (not (and temp-nand temp-or)) true)))
;;      true)))

;; more efficient
(defn xor-gate-raw ^Boolean
  [^Boolean a ^Boolean b]
  (let [temp-nand (and (not (and a b)) true)
        temp-nand-a (and (not (and a temp-nand)) true)
        temp-nand-b (and (not (and b temp-nand)) true)]

    (and (not (and temp-nand-a temp-nand-b)) true)))
