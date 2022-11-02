(ns first-project.views
  (:require
   [re-frame.core :as re-frame]
   [first-project.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "ayo??"]
     ]))
