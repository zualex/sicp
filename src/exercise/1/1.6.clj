(ns exercise.1.1.6
  (:require [common :refer [abs square average]]))

(defn improve [guess, x]
  (average guess (/ x guess)))

(defn good-enough? [guess, x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x)
               x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))


(improve 1.4167, 2)
;=> 1.41421574
(good-enough? 1.4142 2)
; => true
(sqrt-iter 1.0 2)
; => 1.41421568
(sqrt 9)
; => 3.0000915541


(defn new-if [predicate, then-clause, else-clause]
  (cond
    (= predicate true) then-clause
    :else else-clause))

(new-if (= 2 3) 0 5)
; => 5
(new-if (= 1 1) 0 5)
; => 0

(defn sqrt-iter-new-if [guess x]
  (new-if (good-enough? guess x)
    guess
    (sqrt-iter-new-if (improve guess x)
               x)))

(sqrt-iter-new-if 1.0 2)
; => Execution error (StackOverflowError) at java.lang.Number/<init> (REPL:-1)
