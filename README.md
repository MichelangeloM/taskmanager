<h2 align="center">
    Task Manager
</h2>

Simple REST API for managing tasks, built with Java and Spring Boot.
This project was developed to demonstrate backend development skills, 
including REST APIs, database interaction, and clean architecture.


## Getting started

- [Features]
- [Tech Stack]
- [Project Structure]
- [API - Endpoints]
- [How to run]
- [Testing]

## Features

- Create, read, update, and delete tasks (CRUD)
- Mark tasks as completed 
- Filter tasks (completed / active)
- Sort tasks by due date 
- Handle errors with custom exception handling 
- Input validation

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- MAVEN

## Project Structure

- src/main/java/com/example/taskmanager │ 
- ├── controller # REST controllers (API endpoints)
- ├── service # Business logic 
- ├── repository # Database access (JPA) 
- ├── model # Entity classes 
- ├── exception # Custom exceptions & handlers


## API - Endpoints

- Get all tasks: GET /tasks
- POST /tasks :
  <h5 align="center">
{
"title": "Study for interview",
"completed": false,
"dueDate": "2026-03-25"
} </h5>
- Update a task: PUT /tasks/{id}
- Delete a task: DELETE /tasks/{id}
- Mark task as completed: PUT /tasks/{id}/complete
- Get active tasks: GET /tasks/active
- Get completed tasks: GET /tasks/completed
- Get tasks sorted by due date: GET /tasks/sorted

## How to run

Clone the repository.

Open the project in your IDE
Run the main class:
TaskmanagerApplication.java

The server will start on:
http://localhost:8080

## Testing

You can test the API using:

- Postman
- IntelliJ HTTP Client

## Author

Project developed as part of backend learning and interview preparation.

