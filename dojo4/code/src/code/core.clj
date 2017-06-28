(ns code.core)

(defn sleep-sort-1 [v]
  (->> v
       (map #(.start (Thread. (fn [] (Thread/sleep %) (println %)))))))

(defn sleep-sort-2 [v]
  (->> v
       (map #(future (Thread/sleep %) (println %)))))

(defn sleep-sort [v]
  (->> v
       (map #(let [p (promise)]
               (future (Thread/sleep %) (deliver p %))
               (future (println (deref p)))))))

(defn sleep-sort [v]
  (->> v
       (map #(let [p (promise)] (future (Thread/sleep %) (deliver p %)) p))
       (map #(future (println (deref %))))))

(sleep-sort [2 6 8 3 10 7])

