(ns app.calculate.gause
  (:gen-class))

(defn add-one-to-n [max-num]
  (/ (* max-num (inc max-num)) 2))