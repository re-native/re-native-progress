(ns re-native.progress
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-progress (js/require "react-native-progress"))

(def ProgressBar (.-Bar react-native-progress))
(def ProgressPie (.-Pie react-native-progress))
(def ProgressCircle (.-Circle react-native-progress))
(def ProgressCircleSnail (.-CircleSnail react-native-progress))

(assert react-native-progress)
(assert ProgressBar)
(assert ProgressPie)
(assert ProgressCircle)
(assert ProgressCircleSnail)

(def progress-bar (r/adapt-react-class ProgressBar))
(def progress-pie (r/adapt-react-class ProgressPie))
(def progress-circle (r/adapt-react-class ProgressCircle))
(def progress-circle-snail (r/adapt-react-class ProgressCircleSnail))
