(defn abs [x]
  (if (< x 0) (- x) x))

(defn square [x]
  (* x x))

(defn qube [x]
  (* x x x))

(defn improve-v2 [guess, x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(improve-v2 1 2)

(defn good-enough? [guess, x]
  (< (abs (- (qube guess) x)) 0.001))

(defn qbrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (qbrt-iter (improve-v2 guess x)
               x)))

(qbrt-iter 1.0 27)