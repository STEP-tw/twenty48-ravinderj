(ns twenty48.utils-test
  (:require [clojure.test :refer :all]
            [twenty48.utils :refer :all]))

(deftest filter-non-zeroes
  (testing "filter non-zeroes from the list"
    (is (= '(2 2) (filter-not-zero '(2 0 2 0))))))

(deftest group-similar-ones
  (testing "groups the numbers which are similar"
    (is (= '((2 2) (2) (4 4)) (group-identicals-in-pairs '(2 2 2 4 4))))))

(deftest add-similar-ones
  (testing "add the numbers which are similar"
    (is (= '(4 8) (sum-identicals '((2 2) (4 4)))))))

(deftest apply-left-padding
  (testing "apply trailing padding"
    (is (= '(4 8 0 0) (add-padding-left '(4 8))))))

(deftest moving-left-with-padding
  (testing
    (is (= '(4 0 0 0) (move-left-with-padding '(2 0 2 0))))))

(deftest moving-right-with-padding
  (testing
    (is (= '(0 0 0 4) (move-right-with-padding '(2 0 2 0))))))

(deftest transpose-matrix
  (testing
   (is (= '((1 3) (2 4)) (transpose '((1 2) (3 4)))))))