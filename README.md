# ✅ Full Stack To-Do Application (React + Spring Boot)

A full-stack **To-Do web application** built using **React** for the frontend and **Spring Boot** for the backend.  
The project demonstrates RESTful API design, frontend–backend integration, and clean separation of concerns.

---

## 📸 Application Preview

> UI screenshots showcasing task creation, listing, updates, and deletion.

![Todo UI 1](<img width="1899" height="897" alt="Image" src="https://github.com/user-attachments/assets/66d1590f-a68f-4963-b422-34ca2f412762" />)
![Todo UI 2](<img width="1894" height="911" alt="Image" src="https://github.com/user-attachments/assets/79a481e0-cac6-4bb8-aeaf-20fefad5c0cd" />)
![Todo UI 3](<img width="1901" height="897" alt="Image" src="https://github.com/user-attachments/assets/0c2a261b-c2a9-4141-a68f-5b8d99aed055" />)
![Todo UI 4](<img width="1899" height="901" alt="Image" src="https://github.com/user-attachments/assets/d35f9a8b-abac-4c2d-bc44-dbc743d63d78" />)
![Todo UI 5](<img width="1895" height="890" alt="Image" src="https://github.com/user-attachments/assets/5a48c492-0ed1-45bb-bdbe-ddd688f1ccb9" />)

---

## 🧩 Tech Stack

### Frontend

- React
- JavaScript
- HTML5 & CSS3
- Axios / Fetch API

### Backend

- Java 17 / 21
- Spring Boot
- Spring Web (REST APIs)
- Maven
- Embedded Tomcat

---

## 🏗️ Project Structure

```text
To_Do-webApp/
│
├── To_Do_webApp/          # Spring Boot backend
│   ├── react/             # React frontend
│   │   ├── public/
│   │   ├── src/
│   │   │   ├── components/
│   │   │   └── ...
│   │   ├── package.json
│   │   └── README.md
│   ├── src/
│   │   ├── main/java/com/todoapp/
│   │   │   ├── controller/
│   │   │   ├── domain/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── test/
│   ├── pom.xml
│   └── mvnw
├── screenshots/           # Application screenshots
└── README.md              # This file
```

---

## 🚀 Getting Started

### Prerequisites

- **Java 17** or higher
- **Node.js** (version 14 or higher)
- **npm** or **yarn**
- **Maven** 3.6 or higher

### Installation

1. **Clone the repository:**
```bash
git clone <repository-url>
cd To_Do-webApp
```

2. **Backend Setup:**
```bash
cd To_Do_webApp
mvn clean install
```

3. **Frontend Setup:**
```bash
cd react
npm install
```

### Running the Application

1. **Start the Backend:**
```bash
cd To_Do_webApp
mvn spring-boot:run
```
   The backend will run on [http://localhost:8080](http://localhost:8080).

2. **Start the Frontend:**
```bash
cd react
npm start
```
   The frontend will run on [http://localhost:3000](http://localhost:3000).

3. Open your browser and navigate to http://localhost:3000 to use the application.

---

## API Endpoints

The backend provides the following REST API endpoints:

- GET /api/todoItems - Fetch all to-do items
- POST /api/todoItems - Create a new to-do item
- PUT /api/todoItems/{id} - Update a to-do item
- DELETE /api/todoItems/{id} - Delete a to-do item

For detailed API documentation, see the backend README: [To_Do_webApp/README.md](To_Do_webApp/README.md)

---

## Testing

### Backend Tests

```bash
cd To_Do_webApp
mvn test
```

### Frontend Tests

```bash
cd To_Do_webApp/react
npm test
```
