(ns common)

(defn abs [x]
  (if (< x 0) (- x) x))

(defn square [x]
  (* x x))

(defn cube [x]
  (* x x x))

(defn average [x, y]
  (/ (+ x y) 2))