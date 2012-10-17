(ns interop.Sample
  (:gen-class))

(defn -main [& _]
  (throw (UnsupportedOperationException. "Not yet implemented")))