# Microservices-QuizzApp

## Overview

This repository contains the backend for the Quizz application, which is built using the Eureka server within the Spring framework. The project structure is divided into microservices to ensure scalability and ease of maintenance. Each component of the application is housed in its dedicated folder:

- `api-gateway` - The API Gateway responsible for routing traffic to the appropriate microservices.
- `question-service` - The service responsible for managing quiz questions.
- `quiz-service` - The service that handles the quiz logic.
- `service-registry` - A service registry based on the Eureka server, which enables service discovery and their instances.

The backend utilizes a PostgreSQL database to store application data.

## Prerequisites

Before you start the application, make sure you have installed the following software:

- Java version 17 or newer
- Maven for managing project dependencies
- PostgreSQL database server

## Configuration

1. Clone the repository to your local machine.
2. Configure the PostgreSQL database connection in each service (api-gateway, question-service, quiz-service) by editing the `application.properties` or `application.yml` files with the appropriate credentials.
3. Create a PostgreSQL database and apply any necessary database migrations (if provided in the repository).

## Running the Application

To start the application, you need to run all four main components that work together. Below are instructions on how to run each service:

### Service Registry (Eureka Server)

Navigate to the `service-registry` folder and execute the following commands:

```bash
cd service-registry
mvn clean install
mvn spring-boot:run
The API Gateway will now route requests to the appropriate services.
```
### Question Service
Move to the question-service folder and start the microservice:
```bash
cd question-service
mvn clean install
mvn spring-boot:run
```

### Quiz Service
Similarly, start the quiz service:
```bash
cd quiz-service
mvn clean install
mvn spring-boot:run
```

### Verifying Operation
After starting all components, you can verify the operation of the application by visiting:

The Eureka Dashboard at http://localhost:8761 to see registered microservice instances.
The API Gateway at http://localhost:8765, where 8765 is the port on which the API Gateway was started.
Technical Support
If you encounter any issues, please open an issue in the repository, or contact the development team directly.
