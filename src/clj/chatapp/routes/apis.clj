(ns chatapp.routes.apis
  (:require [chatapp.middleware :as middleware]
            [reitit.ring :as ring]
            [ring.util.response]))

(defn save-user! [request]
;;   (db/create-user! params)
;;   (ring/router "/docs")
  )

(defn api-routes [param]
  ["/api" {:middleware
           [middleware/wrap-csrf
            middleware/wrap-formats]}
   ["/save-user" {:get {:handler save-user!
                        :parameters {:name "Musa"}
                        :header ["Content-type" "application/edn"]}}]
   ["/check" {:get param}]
   ])