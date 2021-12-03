(defn abs [x]
  (if (< x 0) (- x) x))

(defn square [x]
  (* x x))

(defn average [x, y]
  (/ (+ x y) 2))

(defn improve [guess, x]
  (average guess (/ x guess)))

(defn good-enough-v2? [guess, prev-guess]
  (< (abs (/ (- guess prev-guess) prev-guess)) 0.001))

(defn sqrt-iter [guess prev-guess x]
  (if (good-enough-v2? guess prev-guess)
    guess
    (sqrt-iter (improve guess x)
               guess
               x)))

(sqrt-iter 1.0 0.5 0.0001)