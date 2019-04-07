(ns twenty48.utils
  (:gen-class))

(def transpose (partial apply map vector))
(def filter-not-zero (partial filter (comp not zero?)))
(def group-identicals (partial partition-by identity))
(def sum-identicals (partial map (partial apply +)))
(def add-padding-left
  (comp
   (partial take 4)
   #(concat % (repeat 0))))

(def move-left
  (comp
   sum-identicals
   group-identicals
   filter-not-zero))

(def move-left-with-padding (comp add-padding-left move-left))

(def move-right-with-padding
  (comp reverse move-left-with-padding reverse))
