(ns exercise.1.1.3)

(defn sum-of-square [a, b]
  (+ (* a a) (* b b)))

(defn sum-of-square-only-two-large [n1, n2, n3]
  (cond (and (< n1 n2) (< n1 n3)) (sum-of-square n2 n3)
        (and (< n2 n1) (< n2 n3)) (sum-of-square n1 n3)
        :else (sum-of-square n1 n2)))

(sum-of-square 2 3)
; => 13

(sum-of-square-only-two-large 2 3 1)
; => 13

(sum-of-square-only-two-large 1 1 1)
; => 2

(sum-of-square-only-two-large 1 2 2)
; => 8

(sum-of-square-only-two-large 1 1 2)
; => 5

(sum-of-square-only-two-large 1 4 3)
; => 25
