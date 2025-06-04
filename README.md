# Desafio Java Spring Boot

Desarrollar una API que conecte con el front-end de una aplicacion web que muestra frases de peliculas:

## Paquetes principales
dto
model
controller
service
repository
config

## Proceso
- Inclusion de dependencias PostgreSQL, Spring DATA JPA, Java Spring Web
- Crear la base de datos PostgreSQL
- Conexion con la base de datos 
- Mapear la tabla de la base de datos
- Mapear solo los datos necesarios del @Entity con DTO
- Usar repository para ejecutar consultas en la base de datos que traigan una frase aleatoria
- Creacion de clase Service para procesar los datos de la base de datos
- Programacion de controllers que llamen los metodos del service y mapeen los endpoints
- Manejo de CORS

