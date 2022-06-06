(ns chatapp.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [chatapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[chatapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[chatapp has shut down successfully]=-"))
   :middleware wrap-dev})
