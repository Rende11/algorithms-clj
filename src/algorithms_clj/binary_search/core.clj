(ns algorithms-clj.binary-search.core)

(defn search [coll target]
  (loop [left 0
         right (dec (count coll))]
    (if (> left right)
      -1
      (let [mid (-> (- right left)
                    (/ 2)
                    (+ left)
                    (int))
            guess (nth coll mid)]
        (cond
          (= guess target)
          mid

          (> guess target)
          (recur left (dec mid))

          (< guess target)
          (recur (inc mid) right))))))
