# Linguagem Java e Ferramentas Relacionadas (API's, Bibliotecas, Frameworks, Gerenciadores de Projetos,...)
- Exemplos práticos envolvendo situações do dia a dia, características e propriedades nativas da linguagem Java -> Java Básico; Problemas Diversos
- Exemplos práticos envolvendo situações do dia a dia, utilizando-se Linguagem Java e Framework JUnit -> Junit
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem Java, framework Spring (Spring Boot, Spring Web), framework 
  Selenium e gerenciador de projetos Maven -> Selenium
- Exemplo prático envolvendo situação do dia a dia, utilizando-se framework Spring (Spring Boot, Spring Data JPA, Spring Web), gerenciador
  de projetos Maven e Banco de Dados H2 -> Spring -> Padrões de Projeto Spring.
- Exemplo prático envolvendo situação do dia a dia, utilizando-se framework Spring (Spring Boot, Spring Web), gerenciador de projetos Maven 
  e framework Swagger -> Spring -> Swagger.
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem de programação Java, framework Spring (Spring Boot, Spring Web),
  framework Junit, biblioteca java Lombok, API Jackson, gerenciador de projetos Maven -> Spring -> API.
- Exemplos práticos envolvendo situação do dia a dia utilizando-se:
  - Linguagem Java, framework Spring (Spring Boot, Spring Web), framework Swagger, banco de dados H2, biblioteca java Lombok, API JPA, 
    gerenciador de projetos Maven -> Spring -> Estoques Cerveja;
  - Linguagem Java, gerenciador de projetos Maven, framework Spring (Spring Boot, Spring Data), banco de dados H2, biblioteca java Lombok, 
    framework Junit, API JPA, ferramenta Hibernate ORM -> Spring -> Gestão de Pessoas;
  - Linguagem Java, gerenciador de projetos Maven, framework Spring (Spring Boot, Spring Web, Spring Cloud), API JPA -> Spring -> Veículos,
    E-mail,...(DI, IoC);
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem Java, framework Spring (Spring Data, Spring Web), banco de dados
  PostgreSQL, API JPA, ferramenta de abstração de estruturas de log da implementação ou aplicação SLF4J e gerenciador de projetos Gradle -> 
  API Nearby Service -> JPA
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem Java, framework JDBC, banco de dados MySQL e gerenciador de
  projetos Gradle -> JDBC
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem Java, linguagem de consulta java-sql JPQL, API JPA e gerenciador
  de projetos Gradle -> Classe Alunos -> JPA
- Exemplo prático envolvendo situação do dia a dia, utilizando-se linguagem Java, framework Spring (Spring Data, Spring Boot), banco de dados
  em disco H2, banco de dados PostgreSQL, API JPA, ferramenta de análise de código PMD, e gerenciador de projetos Gradle -> PMI e InMemory H2
  -> JPA

## Legenda das Abreviações nos Nomes dos Pacotes

dio -> digital innovation one (https://web.dio.me/home)
psbc -> programa start by capgemini (bootcamp) (http://capgeminischool.brazilsouth.cloudapp.azure.com/login/index.php#section-3)
rj -> rinaldo júnior (instrutor java) (https://www.youtube.com/@rinaldodev)
uj -> universidade java (http://www.universidadejava.com.br/java/)

## JDBC e JPA
### Cities API

#### Requerimentos

* Linux
* Git
* Java 8 ou Superior
* Docker
* IDE
* Heroku CLI
* Travis CLI

### DataBase

### Postgres

* [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```shell script
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=
cities postgres
```

* [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)
* [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)
* [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)
* [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)
* [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)

### Access

```shell script
docker exec -it cities-db /bin/bash

psql -U postgres_user_city cities
```

### Query Earth Distance

Point
```roomsql
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube
```roomsql
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

### Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 8 ou Superior
+ Gradle Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ PostgreSQL Driver

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

### Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

```shell script
heroku create dio-cities-api --addons=heroku-postgresql
```

## Code Quality

### PMD

+ https://pmd.github.io/pmd-6.8.0/index.html

### Checkstyle

+ https://checkstyle.org/

+ https://checkstyle.org/google_style.html

+ http://google.github.io/styleguide/javaguide.html

```shell script
wget https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
```

### InMemory Database Testing

+ http://www.h2database.com/html/features.html


### Migrations

+ https://flywaydb.org/

## CI

### Travis
+ https://github.com/travis-ci/travis.rb#readme

+ https://docs.travis-ci.com/user/tutorial/

### extra

+ https://docs.travis-ci.com/user/conditional-builds-stages-jobs/
+ https://docs.travis-ci.com/user/deployment-v2/conditional

+ [Heroku Deployment](https://docs.travis-ci.com/user/deployment/heroku/)
