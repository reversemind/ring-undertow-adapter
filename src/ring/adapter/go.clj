(ns ring.adapter.go
  (require [ring.adapter.undertow :refer [run-undertow]]))

(defn -main [req]
  {:status 200
   :body   "Hello world"})

(run-undertow -main {:port 8080})