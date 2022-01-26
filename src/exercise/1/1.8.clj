(ns exercise.1.1.8
  (:require [common :refer [abs square cube]]))

(defn improve-v2 [guess, x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(improve-v2 1 2)
; => 4/3

(defn good-enough? [guess, x]
  (< (abs (- (cube guess) x)) 0.001))

(defn qbrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (qbrt-iter (improve-v2 guess x)
               x)))

(qbrt-iter 1.0 27)
; => 3.0000005410641766