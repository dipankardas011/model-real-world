FROM gradle:jdk8 AS builder

WORKDIR /api

COPY . .

RUN gradle build

ENTRYPOINT ["gradle"]

CMD ["run"]