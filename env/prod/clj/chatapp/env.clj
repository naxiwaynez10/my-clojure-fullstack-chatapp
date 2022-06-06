(ns chatapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[chatapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[chatapp has shut down successfully]=-"))
   :middleware identity})
