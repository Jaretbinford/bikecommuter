(ns bikecommuter.core
  (:require [com.stuartsierra.component :as c]
            [arachne.log :as log]))

(defrecord Widget []
  c/Lifecycle
   (start [this]
     (log/info :msg "Hello, World!")
     this)
   (stop [this]
     (log/info :msg "Goodnight!")
     this))


;example run:
;(def w (->Widget))
;(c/start w)
;end example


(defn make-widget
  "Constructor for a Widget"
  []
  (->Widget))