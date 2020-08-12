# springboot-rest-postgre
Spring Boot with REST Api and JPA (EntityManager) + Postgre


How to test:
curl --location --request GET 'http://localhost:8080/recuperaProduto'

---------------------------------------------------------------------
curl --location --request POST 'http://localhost:8080/recuperaProdutoFiltro' \
--header 'Content-Type: application/json' \
--data-raw ' {"id": 2, "descricao": "Produto"} '

---------------------------------------------------------------------
curl --location --request POST 'http://localhost:8080/gravaProduto' \
--header 'Content-Type: application/json' \
--data-raw '{ "descricao": "Produto ABC" }'

---------------------------------------------------------------------

