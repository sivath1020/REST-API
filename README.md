🟢 Spring Boot REST API with MongoDB

This project is a Spring Boot backend REST API that connects with MongoDB for data storage.
It allows you to perform basic CRUD operations — that is, you can add, view, and delete data using RESTful API endpoints.
The project is built using Maven and tested using Postman. MongoDB is used as the main database for storing the submitted form data.

📘 Project Overview

The main goal of this project is to show how Spring Boot can be connected with MongoDB and how to build simple APIs for data management.
There is no frontend webpage for this project; it focuses only on the backend part. You can use Postman to test all the APIs.

⚙️ Features

You can add new form data using a POST request.
You can view all stored data or view specific data by ID using GET requests.
You can delete data by ID using a DELETE request.
MongoDB automatically stores all the information in a collection called FormData.

🧱 Technologies Used

Spring Boot – Backend framework
MongoDB – Database used to store data
Maven – Used for dependency management and build
Lombok – Reduces boilerplate code (like getters and setters)
Postman – Used for testing API endpoints

⚙️ Configuration Details:

In the application.properties file, the MongoDB connection and server details are set as follows:
Application name: demo
Server port: 8080
MongoDB URI: mongodb://localhost:27017/newdb
Database name: newdb
This means the project connects to a MongoDB database called newdb, running locally on your computer.

💻 How to Run the Project:

Make sure MongoDB is installed and running on your system.
Open this project in VS Code or IntelliJ IDEA.
Run the project using the command mvn spring-boot:run or by running the DemoApplication.java file directly.
Once started, the server will run on http://localhost:8080
Open Postman to test the API endpoints.

📮 API Endpoints (for Postman Testing):
1. Add Data (POST Method)

URL: http://localhost:8080/api/submit

Body (raw JSON):
{
  "id": "1",
  "name": "Siva",
  "password": "12345",
  "address": "Chennai",
  "phonenumber": "9876543210",
  "date": "2025-11-06"
}
Response: Thank you for Submitting

2. Get All Data (GET Method)
URL: http://localhost:8080/api/all

3. Get Data by ID (GET Method)
URL: http://localhost:8080/api/1

4. Delete Data by ID (DELETE Method)
URL: http://localhost:8080/api/1

🧠 How the Project Works:

DemoModel.java – This file defines the structure of the data stored in MongoDB, including fields like id, name, password, address, phonenumber, and date.
Demorepository.java – This interface helps in connecting Spring Boot to MongoDB and performs operations like save, find, and delete.
DemoController.java – This file contains all the REST API endpoints and connects them to the repository for database actions.
application.properties – This file manages the MongoDB connection and server configurations.
MongoDB – Stores all the submitted data in a collection called FormData.

🧾 Example Data Stored in MongoDB:

When you submit a form using Postman, the data will look like this inside MongoDB:

{
  "_id": "1",
  "name": "Siva",
  "password": "12345",
  "address": "Chennai",
  "phonenumber": "9876543210",
  "date": "2025-11-06"
}

🧩 Summary:

This project demonstrates how to use Spring Boot with MongoDB to build a simple backend REST API.
It covers how to connect to a MongoDB database, create REST endpoints, and perform data operations using Postman.
It is a good beginner-level project for students or developers learning Java Full Stack (backend part) using Spring Boot and MongoDB.

Developer: Sivath.V
Date: November 2025
Project Title: Spring Boot REST API with MongoDB
