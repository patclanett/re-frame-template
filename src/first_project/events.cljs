(ns first-project.events
  (:require
   [re-frame.core :as re-frame]
   [first-project.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
