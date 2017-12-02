(ns secret-santa.core
  (:gen-class))

(def my-santas ["Joey" "Phoebe" "Ross" "Chandler" "Monica" "Rachel"])

(defn secret-santa [] (let [
  randomised-santas (shuffle my-santas)
  shifted-santas (cons (last randomised-santas) (butlast randomised-santas))
  ]
  (zipmap randomised-santas shifted-santas)))

;; boilerplate, leave me alone
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (secret-santa)))
