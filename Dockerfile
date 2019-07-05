FROM theasp/clojurescript-nodejs:shadow-cljs

ENV WORK_DIR=/usr/src/app

RUN wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein && \
    mv lein /usr/bin && chmod a+x /usr/bin/lein

USER node

RUN lein

WORKDIR ${WORK_DIR}

COPY package.json yarn.lock shadow-cljs.edn project.clj ${WORK_DIR}/

#RUN lein deps

#COPY ./ ${WORK_DIR}
#RUN shadow-cljs release client server
