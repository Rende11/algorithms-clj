(ns algorithms-clj.quicksort.core)

(defn split-by [f coll]
  (reduce (fn [[left right] value]
            (if (f value)
              [(conj left value) right]
              [left (conj right value)]))
          [[][]]
          coll))

(defn qsort [coll]
  (let [size (count coll)]
    (if (< size 2)
      coll
      (let [base-element (first coll)
            [less more] (split-by (partial > base-element) (rest coll))]
        (into
         (into (qsort less) [base-element])
         (qsort more))))))
