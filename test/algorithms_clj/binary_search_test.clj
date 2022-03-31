(ns algorithms-clj.binary-search-test
  (:require [algorithms-clj.binary-search-test :as sut]
            [clojure.test :refer [deftest testing is]]))

(deftest binary-search
  (is (= (sut/search [1 2 3 4 5])))
  )
