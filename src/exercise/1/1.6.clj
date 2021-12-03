(ns exercise.1.1.6)

(defn abs [x]
  (if (< x 0) (- x) x))

(defn square [x]
  (* x x))

(defn average [x, y]
  (/ (+ x y) 2))

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


(average 1 2)
(improve 1.4167, 2)
(good-enough? 1.4142 2)
(sqrt-iter 1.0 2)
(sqrt 9)


(defn new-if [predicate, then-clause, else-clause]
  (cond
    (= predicate true) then-clause
    :else else-clause))

(new-if (= 2 3) 0 5)
(new-if (= 1 1) 0 5)


(defn sqrt-iter-new-if [guess x]
  (new-if (good-enough? guess x)
    guess
    (sqrt-iter-new-if (improve guess x)
               x)))

;(sqrt-iter-new-if 1.0 2)
;(sqrt-iter-new-if 2.0 9)

; new-if это функция и она сначала вычиляется свои аргументы, в аргументах есть опять вызов sqrt-iter-new-if, то есть попадём в бесконечную рекурсию
