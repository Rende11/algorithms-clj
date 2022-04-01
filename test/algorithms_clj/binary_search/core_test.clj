(ns algorithms-clj.binary-search.core-test
  (:require [algorithms-clj.binary-search.core :as sut]
            [clojure.test :refer [deftest testing is]]))

(deftest test-binary-search
  (testing "Target present in vector"
    (is (= 0 (sut/search [100] 100)))
    (is (= 3 (sut/search [-1 2 6 10 15] 10)))
    (is (= 0 (sut/search [-1 2 6 10 15] -1)))
    (is (= 100 (sut/search (vec (range 1000)) 100))))

  (testing "Target is absent"
    (is (= -1 (sut/search [-1 2 6 10 15] 100)))
    (is (= -1 (sut/search [-1 2 6 10 15] -100)))
    (is (= -1 (sut/search [] 100500)))))
