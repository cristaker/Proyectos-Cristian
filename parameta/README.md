# Prueba tecnica parameta

Este proyecto implementa un servicio rest que recibe atributos de un empleado, valida fechas y que los atributos no vengan vacios, verifica que el empleado sea mayor de edad y retorna un objeto json que adiciona a los datos recibidos el tiempo de vinculacion y la edad actual del empleado.

## Requisitos

- Java JDK 17
- Maven
- Docker (opcional, para ejecutar la base de datos MySQL en un contenedor)
- Postman (opcional, para probar los endpoints)

## Ejecución

Para la ejecución de esta aplicación, puedes hacerlo de dos maneras diferentes:
- Clona el repositorio desde la URL: 
- Luego de haber clonado el repositorio, ejecuta el siguiente comando: `docker-compose up --build` en la consola de comandos, asegurate de ubicarte en la raiz del proyecto clonado.
- También puedes levantar la aplicación desde cualquier entorno de desarrollo. Sin embargo, ten en cuenta que, para una ejecución correcta en este caso, debes tener instalado MySQL 8.4 en la máquina local, tenerlo en ejecución y haber creado la base de datos `parameta`.

## Pruebas

Una vez que tengas el proyecto en ejecución, puedes realizar pruebas utilizando una herramienta como Postman para probar la API.

### Creación de Tickets

Para las pruebas y guardado en la base de datos mediante el método GET, se recomienda usar este body de ejemplo:
```
{
  "nombres": "christian",
  "apellidos": "sanchez",
  "tipoDocumento": "Cédula",
  "numeroDocumento": "123456789",
  "fechaNacimiento": "2006-05-15",
  "fechaVinculacion": "2020-01-01",
  "cargo": "Desarrollador",
  "salario": 5000.00
}

```