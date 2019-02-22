(ns twenty48.core
  (:require [twenty48.utils :refer :all])
  (:gen-class))

(defn move-grid-right
  "Moves an entire grid to the right"
  [grid]
  grid)

(def move-grid-left
  (comp
   (partial map move-elements-left)
   (partial take-while not-empty?)
   (partial iterate rest)))

(defn move-grid-down
  "Moves an entire grid down"
  [grid]
  grid)

(defn move-grid-up
  "Moves an entire grid up"
  [grid]
  grid)
