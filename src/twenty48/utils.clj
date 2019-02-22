(ns twenty48.utils
  (:gen-class))

(def transpose (partial apply map vector))
(def not-zero? (comp not zero?))
(def not-empty? (comp not empty?))
(def filter-not-zero (partial filter not-zero?))
(def group-identicals (partial partition-by identity))
(def sum-identicals (partial map (partial apply +)))
(def add-padding
  (comp
   (partial take 4)
   #(concat % (repeat 0))))

(def move-elements-left
  (comp
   add-padding
   sum-identicals
   group-identicals
   filter-not-zero))
