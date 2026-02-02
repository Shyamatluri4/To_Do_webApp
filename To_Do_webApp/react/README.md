# 🎨To-Do Web App Frontend

A modern, responsive React-based frontend for a To-Do web application. This frontend interacts with a Spring Boot backend to manage to-do items.

## Features

- Add, view, and manage to-do items
- Responsive design using Material-UI
- Clean and intuitive user interface
- Integration with backend API for data persistence

## Technologies Used

- **React**: JavaScript library for building user interfaces
- **Material-UI**: React components implementing Google's Material Design
- **Create React App**: Build setup and development server
- **Axios** (if used for API calls): HTTP client for API requests

## Prerequisites

- Node.js (version 14 or higher)
- npm or yarn package manager
- Backend server running (Spring Boot application in the parent directory)

## Installation

1. Navigate to the react directory:

   ```
   cd To_Do_webApp/react
   ```

2. Install dependencies:
   ```
   npm install
   ```

## Usage

1. Start the development server:

   ```
   npm start
   ```

   The app will run on [http://localhost:3000](http://localhost:3000).

2. Ensure the backend server is running on its designated port (usually 8080).

3. Open your browser and navigate to the app URL.

## Available Scripts

- `npm start`: Runs the app in development mode
- `npm test`: Launches the test runner in interactive watch mode
- `npm run build`: Builds the app for production to the `build` folder
- `npm run eject`: Ejects from Create React App (irreversible)

## 📁 Frontend Structure

```text
frontend
│
├── src/
│   ├── components/   # UI components
│   ├── pages/        # Page-level components
│   ├── App.js
│   └── index.js
│
├── public/
├── package.json
└── node_modules/     # Ignored in Git