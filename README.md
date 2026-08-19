# SimpleWebApp

A simple RESTful web application built with **Java** and **Spring Boot**. The project demonstrates a basic layered application structure using controllers, a model, and a service layer, with CRUD operations for products.

## Tech Stack

- Java 25
- Spring Boot 4.1.0
- Spring Web MVC
- Maven
- Spring Boot DevTools

## Project Structure

```text
SimpleWebApp/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── shruthan/
│                   └── simpleWebApp/
│                       ├── SimpleWebAppApplication.java
│                       ├── controller/
│                       │   ├── HomeController.java
│                       │   ├── LoginController.java
│                       │   └── ProductController.java
│                       ├── model/
│                       │   └── Product.java
│                       └── service/
│                           └── ProductService.java
└── .gitignore
```

## Features

- Basic home and about endpoints
- Login endpoint example
- Product CRUD operations
- Layered structure using Controller, Service, and Model packages
- In-memory product data using a Java `List`

## API Endpoints

### Home

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Returns a welcome message |
| GET | `/about` | Returns an about message |
| GET | `/login` | Returns a login page message |

### Products

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get a product by ID |
| POST | `/products` | Add a new product |
| PUT | `/products` | Update an existing product |
| DELETE | `/products` | Delete a product |

## Product Model

A product contains the following fields:

```text
productId   int
productName String
price       int
```

## Getting Started

### Prerequisites

Make sure the following are installed:

- Java 25 or compatible JDK
- Maven
- An IDE such as IntelliJ IDEA or Eclipse

### Clone the Repository

```bash
git clone https://github.com/shruthan650/SimpleWebApp.git
cd SimpleWebApp
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

The application starts on the default Spring Boot port:

```text
http://localhost:8080
```

## Example Requests

### Get All Products

```http
GET http://localhost:8080/products
```

### Get Product by ID

```http
GET http://localhost:8080/products/101
```

### Add a Product

```http
POST http://localhost:8080/products
Content-Type: application/json

{
  "productId": 104,
  "productName": "Laptop",
  "price": 75000
}
```

### Update a Product

```http
PUT http://localhost:8080/products
Content-Type: application/json

{
  "productId": 104,
  "productName": "Gaming Laptop",
  "price": 90000
}
```

### Delete a Product

```http
DELETE http://localhost:8080/products
Content-Type: application/json

{
  "productId": 104
}
```

## Notes

The current implementation stores product data in memory, so changes are lost when the application restarts. No external database is configured in this version.

## Learning Objectives

This project is intended as a beginner-friendly example for understanding:

- Spring Boot application setup
- REST controllers
- HTTP methods such as GET, POST, PUT, and DELETE
- Dependency injection with Spring
- Layered application structure
- JSON request and response handling
- Maven project configuration

## Author

**Shruthan**

GitHub: [@shruthan650](https://github.com/shruthan650)
