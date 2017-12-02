(ns secret-santa.core
  (:gen-class))

(def my-santas ["Joey" "Phoebe" "Ross" "Chandler" "Monica" "Rachel"])

(defn secret-santa [] (let [
  shuffled (shuffle my-santas)
  shifted (cons (last shuffled) (butlast shuffled))
  ]
  (zipmap shuffled shifted)))

;; boilerplate, leave me alone
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (secret-santa)))
