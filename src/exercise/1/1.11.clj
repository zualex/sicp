(ns exercise.1.1.11)

(defn f-custom-tree [n]
  (if (< n 3)
    n
    (+
     (f-custom-tree (- n 1))
     (f-custom-tree (- n 2))
     (f-custom-tree (- n 3)))))

(defn f-custom-iter [a, b, c, counter]
  (if (< counter 0)
    c
    (f-custom-iter b c (+ a b c) (- counter 1))))

(defn f-custom-opt [n]
  (if (< n 3)
    n
    (f-custom-iter 0 1 2 (- n 3))))

(f-custom-tree 1)
(f-custom-opt 1)
; => 1
(f-custom-tree 2)
(f-custom-opt 2)
; => 2
(f-custom-tree 3)
(f-custom-opt 3)
; => 3
(f-custom-tree 4)
(f-custom-opt 4)
; => 6
(f-custom-tree 5)
(f-custom-opt 5)
; => 11
(f-custom-tree 6)
(f-custom-opt 6)
; => 20
