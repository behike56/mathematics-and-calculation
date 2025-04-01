(ns app.core
  (:require [app.calculate.gause :as gause])
  (:gen-class))

(defn hello
  "シンプルな関数例"
  [name]
  (str "Hello, " name "!"))


(defn -main
  "エントリポイント"
  [& args]
  (println (gause/add-one-to-n 1000)))