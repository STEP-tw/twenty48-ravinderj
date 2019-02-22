(ns twenty48.utils-test
  (:require [clojure.test :refer :all]
            [twenty48.utils :refer :all]))

(deftest is-not-zero?
  (testing "returns true for number not zero"
    (is (true? (not-zero? 2)))))

(deftest filter-non-zeroes
  (testing "filter non-zeroes from the list"
    (is (= '(2 2) (filter-not-zero '(2 0 2 0))))))

(deftest group-similar-ones
  (testing "groups the numbers which are similar"
    (is (= '((2 2) (4 4)) (group-identicals '(2 2 4 4))))))

(deftest add-identicals
  (testing "add the identical numbers"
    (is (= '(4 8) (sum-identicals '((2 2) (4 4)))))))

(deftest apply-padding
  (testing "apply trailing padding"
    (is (= '(4 8 0 0) (add-padding '(4 8))))))
