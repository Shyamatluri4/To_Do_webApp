#🚀 To-Do Web App Backend

A Spring Boot-based REST API backend for a To-Do web application. This backend provides CRUD operations for managing to-do items and serves the React frontend.

## Features

- RESTful API for to-do item management
- In-memory data storage (H2 database)
- CORS support for frontend integration
- CRUD operations: Create, Read, Update, Delete to-do items

## Technologies Used

- **Spring Boot**: Framework for building the REST API
- **Spring Web**: For REST controllers and HTTP handling
- **Java 17**: Programming language
- **Maven**: Build tool and dependency management
- **H2 Database**: In-memory database for data persistence

## API Endpoints

### GET /api/todoItems
Fetch all to-do items.

**Response:**
```json
[
  {
    "id": 1,
    "task": "Click to edit task name",
    "isDone": false
  }
]
```

### POST /api/todoItems
Create a new to-do item.

**Response:**
```json
{
  "id": 2,
  "task": "New Task",
  "isDone": false
}
```

### PUT /api/todoItems/{id}
Update an existing to-do item.

**Request Body:**
```json
{
  "task": "Updated Task",
  "isDone": true
}
```

**Response:**
```json
{
  "id": 1,
  "task": "Updated Task",
  "isDone": true
}
```

### DELETE /api/todoItems/{id}
Delete a to-do item by ID.

**Response:**
```
"ok"
```

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Installation

1. Navigate to the backend directory:
   ```
   cd To_Do_webApp
   ```

2. Build the project:
   ```
   mvn clean install
   ```

## Usage

1. Run the application:
   ```
   mvn spring-boot:run
   ```

   The server will start on [http://localhost:8080](http://localhost:8080).

2. The API will be available at `http://localhost:8080/api/todoItems`.

3. Ensure the React frontend is configured to connect to this backend (CORS is enabled for `http://localhost:3000`).


## 📁 Backend Structure

```text
backend
│
├── src/main/java/com/todoapp
│   ├── controller/   # REST controllers
│   ├── service/      # Business logic
│   ├── repository/   # Data access layer
│   ├── domain/       # Entity models
│   └── TodoWebApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── target/           # Build output (ignored in Git)
└── pom.xml

## Testing

Run tests with:
```
mvn test