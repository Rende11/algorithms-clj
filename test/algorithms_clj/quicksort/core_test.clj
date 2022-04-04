(ns algorithms-clj.quicksort.core-test
  (:require [algorithms-clj.quicksort.core :as sut]
            [clojure.test :refer [deftest is]]))

(deftest quicksort
  (is (= [] (sut/qsort [])))
  (is (= [-2 -1 0 1 4 7 8 10 18] (sut/qsort [8 7 10 -1 18 0 -2 4 1])))
  (is (= [-5 -4 -3 -2 -1 0 1 2 3 4 5] (sut/qsort (shuffle (range -5 6))))))
