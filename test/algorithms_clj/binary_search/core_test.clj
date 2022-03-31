(ns algorithms-clj.binary-search.core-test
  (:require [algorithms-clj.binary-search.core :as sut]
            [clojure.test :refer [deftest is]]))

(deftest test-binary-search
  (is (= 3 (sut/search [1 2 3 4 5] 4))))
