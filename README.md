# FlightScheduleSV

FlightScheduleSV contiene una aplicación Spring Boot que sirve como backend para gestionar información relacionada con vuelos, incluyendo llegadas y salidas. Este README proporciona una descripción general del proyecto, su estructura y cómo iniciar la aplicación.

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto)
2. [Cómo Iniciar la Aplicación](#cómo-iniciar-la-aplicación)
3. [Endpoints Disponibles](#endpoints-disponibles)
4. [Configuración](#configuracion)
5. [Pruebas con POSTMAN](#pruebas-con-postman)

## Estructura del Proyecto

El proyecto está organizado en varias carpetas que representan diferentes componentes:

- **FlightController:** Contiene los métodos para realizar consultas mediante operaciones POST, DELETE y PUT.

- **Model:** Contiene las clases de modelo `Arrival` y `Departure`.

- **Repository:** Contiene las interfaces `ArrivalRepository` y `DepartureRepository`.

- **Service:** Contiene las clases `ArrivalService` y `DepartureService`.

- **target:** Contiene el archivo JAR generado después de compilar el proyecto.

## Cómo Iniciar la Aplicación

 Para iniciar la aplicación:

1. Navega hasta el directorio raíz del proyecto.

2. Construir el proyecto a partir del Lifecycle package de Maven.

3. Se nos generará un archivo .jar  en el directorio target (schedule-0.0.1-SNAPSHOT.jar).

4. Ejecutar la aplicación mediante java -jar target/schedule-0.0.1-SNAPSHOT.jar.

5. La aplicación estará disponible en http://localhost:8080.

## Endpoints Disponibles
La aplicación proporciona los siguientes endpoints:

· **POST /v1/api/flights/departures:** Agrega una nueva llegada.

· **GET /v1/api/arrivals:** Obtiene la lista de llegadas.

· **DELETE /v1/api/arrivals/{id}:** Elimina la llegada con el ID especificado.

· **PUT /v1/api/arrivals/{id}:** Actualiza la llegada con el ID especificado.

· **POST /v1/api/departures:** Agrega una nueva salida.

· **GET /api/departures:** Obtiene la lista de salidas.

· **DELETE /api/departures/{id}:** Elimina la salida con el ID especificado.

· **PUT /api/departures/{id}:** Actualiza la salida con el ID especificado.

## Configuración
El archivo de configuración principal se encuentra en src/main/resources/application.properties y contiene propiedades como la configuración de la base de datos.

#Database connection and configuration
```
spring.datasource.url=jdbc:mysql://bi6s3pdv2xip3lbyknhr-mysql.services.clever-cloud.com:3306/bi6s3pdv2xip3lbyknhr
spring.datasource.username=uvxzsqezx9jzkisu
spring.datasource.password=c6yUwGB6Xc836j2WJxx2
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```
La base de datos está desplegada online.
**DDBB Username:** uvxzsqezx9jzkisu
**DDBB Password:** c6yUwGB6Xc836j2WJxx2

## Pruebas con POSTMAN
He probado los endpoints utilizando POSTMAN.

Llegadas:

**- GET /arrivals:** Obtiene la lista de llegadas.
**- GET /arrivals/{id}:** Obtiene detalles de una llegada específica.

  
**- POST /arrivals:** Crea una nueva llegada.
```// Ejemplo para POST /v1/api/flights/arrivals
{
  "airport": "SVQ",
  "flightStatus": "On Time",
  "aircraftType": "Airbus A330",
  "flightNumber": "FR12345",
  "origin": "TFS",
  "estimatedTimeOfArrival": "2023-11-18T18:32:00",
  "totalPassengers": 180,
  "totalLuggage": 80
}
```
**- PUT /arrivals/{id}:** Actualiza una llegada existente.
```// Ejemplo para PUT proporcionando la ID
{
  "airport": "PMI",
  "flightStatus": "Delayed",
  "aircraftType": "Boeing 737",
  "flightNumber": "FR9423",
  "origin": "BCN",
  "estimatedTimeOfArrival": "2023-11-18T12:30:00",
  "totalPassengers": 170,
  "totalLuggage": 110
}
```
**- DELETE /arrivals/{id}:** Elimina una llegada existente.

Salidas:

**- GET /departures:** Obtiene la lista de salidas.
**- GET /departures/{id}:** Obtiene detalles de una salida específica.


**- POST /departures:** Crea una nueva salida.
```// Ejemplo para POST departures
{
  "airport": "SVQ",
  "flightNumber": "FR7784",
  "destination": "CIA",
  "estimatedTimeOfDeparture": "2023-11-18T18:00:00",
  "totalPassengers": 163,
  "totalLuggage": 90
}
```

**- PUT /departures/{id}:** Actualiza una salida existente.
```
// Ejemplo para PUT departures mediante ID
{
  "airport": "MAD",
  "flightNumber": "VY7784",
  "destination": "FCO",
  "estimatedTimeOfDeparture": "2023-11-18T18:00:00",
  "totalPassengers": 121,
  "totalLuggage": 13
}
```
**- DELETE /departures/{id}:** Elimina una salida existente.
