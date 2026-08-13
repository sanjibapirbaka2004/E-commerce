
# E-commer-app
 E-Commerce Backend

A RESTful E-Commerce backend application developed using Java and Spring Boot.
The application provides APIs for managing products, users, shopping carts, orders, and other e-commerce operations.

🚀 Features

* User registration and management
* Product management
* Product search
* Product category management
* Shopping cart management
* Order creation and management
* RESTful APIs
* Database integration
* Exception handling
* Input validation
* API testing using Postman
* Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* REST API
* Mongodb
* Maven
* Postman
* Git & GitHub
* Project Architecture

The application follows a layered architecture:
Client
  ↓
REST Controller
  ↓
Service Layer
  ↓
Repository Layer
  ↓
Database
Project structure:
src
└── main
    ├── java
    │   └── com.example.ecommerce
    │       ├── controller
    │       ├── service
    │       ├── repository
    │       ├── entity
    │       ├── dto
    │       ├── exception
    │       └── EcommerceApplication.java
    │
    └── resources
        └── application.properties
End points:-
PRODUCT APIS :-
Method         Endpoints                   Descriptions
GET            /api/products             get all product
GET           /api/products/{id}.        Get product by ID
POST          /api/products              Create product
PUT          /api/products/{id}          Update a product
DELETE     /api/products/{id}.           delete product

USER APIS:-
Method          EndPoints               Descriptions
GET            /api/users                  get all users
GET            /api/users/{id}           Get user by ID
POST           /api/users                Create user
PUT             /api/users/{id}          Update a user
DELETE         /api/user/{id}            delete users

ORDER APIS :-
Method           EndPoints            Desriptions
Order            /api/orders         Create orders
GET              /api/orders/{id}     Get order details 
GET            /api/orders/user/{userId}  Get user’s orders
GET


