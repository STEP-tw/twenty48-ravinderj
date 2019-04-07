(ns twenty48.core
  (:require [twenty48.utils :refer :all])
  (:gen-class))

(def move-grid-right
  (partial map move-right-with-padding))

(def move-grid-left
  (partial map move-left-with-padding))

(def move-grid-down
  (comp
   transpose
   move-grid-right
   transpose))

(def move-grid-up
  (comp
   transpose
   move-grid-left
   transpose))
