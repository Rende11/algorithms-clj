.PHONY: test

test:
		clojure -M:test

repl:
		clojure -M:cider
