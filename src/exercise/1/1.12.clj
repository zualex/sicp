(ns exercise.1.1.12)

(defn f [n, i]
  (cond
    (or (< n 0) (< i 0) (> i n)) nil
    (or (= n 0) (= i 0) (= n i)) 1
    :else (+
           (f (- n 1) (- i 1))
           (f (- n 1) i))
    ))


(f 0 0)
; => 1
(f 1 0)
; => 1
(f 1 1)
; => 1
(f 2 0)
; => 1
(f 2 1)
; => 2
(f 3 2)
; => 3
(f 4 2)
; => 6

(f 4 100)
; => nil
(f 1 -1)
; => nil
(f -1 1)
; => nil
