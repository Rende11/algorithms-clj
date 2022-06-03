(ns algorithms-clj.breadth-first-search.core)


(defn search [graph root target]
  (loop [queue (get graph root) checked? #{}]
    (when (seq queue)
      (let [node (first queue)]
        (cond
          (checked? node)
          (recur (vec (rest queue)) checked?)

          (= node target)
          true

          :else
          (recur (into (vec (rest queue)) (get graph node)) (conj checked? node)))))))
