(ns ^:figwheel-no-load dots.dev
  (:require
    [dots.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
