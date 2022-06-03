(ns algorithms-clj.breadth-first-search.core-test
  (:require [algorithms-clj.breadth-first-search.core :as sut]
            [clojure.test :refer [deftest testing is]]))

(def flights
    {:london [:amsterdam :berlin]
     :amsterdam [:berlin :praha :warszawa]
     :berlin [:praha :warszawa :wien]
     :praha [:warszawa :wien :bratislava :london]
     :wien []
     :bratislava []})


(deftest test-search
  (testing "Find available paths"
    (is (true? (sut/search flights :london :berlin)))
    (is (true? (sut/search flights :london :bratislava)))
    (is (true? (sut/search flights :amsterdam :warszawa))))
  (testing "Unavailable paths"
    (is (nil? (sut/search flights :warszawa :bratislava)))
    (is (nil? (sut/search flights :one :two)))))
