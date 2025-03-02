FullStack-Application-CRUD
A complete full-stack CRUD (Create, Read, Update, Delete) application built using React.js for the frontend and Spring Boot for the backend.

Project Structure
FullStack-Application-CRUD/
│── fullstack-application-backend/   # Spring Boot backend
│── fullstack-frontend/              # React.js frontend
│── README.md                        # Project documentation

Tech Stack

Frontend:
React.js
React Router
Bootstrap / Tailwind
Axios (For API calls)

Backend:
Spring Boot
Spring Data JPA
Hibernate
MySQL / H2 Database
REST API

Setup & Installation

1️⃣ Clone the repository:
git clone https://github.com/Bhushankapse/FullStack-Application-CRUD-.git
cd FullStack-Application-CRUD

2️⃣ Backend Setup (Spring Boot)
cd fullstack-application-backend
mvn clean install
mvn spring-boot:run
🔹 Note: Ensure that your database is set up correctly in application.properties.

3️⃣ Frontend Setup (React.js)
cd ../fullstack-frontend
npm install
npm start

# 📌 API Endpoints (Backend)
| Method | Endpoint       | Description      |
|--------|----------------|-----------------|
| GET    | `/users`       | Get all users   |
| GET    | `/users/{id}`  | Get user by ID  |
| POST   | `/users`       | Add new user    |
| PUT    | `/users/{id}`  | Update user     |
| DELETE | `/users/{id}`  | Delete user     |

Contributors
👤 Bhushan Kapse
[GitHub Profile]:(https://github.com/Bhushankapse)
