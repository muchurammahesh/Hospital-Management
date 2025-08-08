# 🏥 Hospital Management System

A **Java & Spring Boot-based** application for managing hospital operations such as patients, doctors, staff, appointments, rooms, and billing.  
The system follows a **layered architecture** with REST APIs, DTO mapping, logging, and authentication using **JWT**.

---

## 📜 Table of Contents
- [Overview](#-overview)
- [Features](#-features)
- [Architecture](#-architecture)
- [Flow of an API Request](#-flow-of-an-api-request)
- [Tech Stack](#-tech-stack)
- [Modules](#-modules)
- [Setup & Installation](#-setup--installation)
- [Folder Structure](#-folder-structure)
- [License](#-license)
- [Author](#-author)

---

## 📖 Overview
The **Hospital Management System** simplifies record-keeping and operations within a hospital by providing an **easy-to-use GUI** (Swing/JavaFX for desktop version) or **REST APIs** (Spring Boot version) for backend communication.  
It is designed with **scalability, security, and maintainability** in mind.

---

## ✨ Features
- 🧑‍⚕️ **Doctors Management** – Add, update, search, delete doctors.
- 🧑‍🤝‍🧑 **Patients Management** – Maintain patient records and history.
- 🧑‍💼 **Staff Management** – Manage nurses, receptionists, and technicians.
- 📅 **Appointment Scheduling** – Book, update, and cancel appointments.
- 🛏 **Room & Bed Management** – Track room allocations and bed availability.
- 💳 **Billing System** – Generate invoices and track payments.
- 📊 **Reports** – Generate various operational reports.
- 🔐 **Authentication** – JWT-based login system.
- 📬 **Notifications** – Email alerts using Spring Mail.

---

## 🏗 Architecture
The application follows a **Layered Architecture**:

Client → Filters → DispatcherServlet → Controller → Service → ServiceImpl → DAO → Database

---

## 🔄 Flow of an API Request
1. **Client** sends HTTP request (e.g., `POST /api/patients`).
2. **Filters** apply authentication & logging.
3. **Dispatcher Servlet** routes request to the correct controller.
4. **Controller** validates request and calls the service layer.
5. **Service** contains business logic.
6. **Service Implementation** calls DAO layer.
7. **DAO** interacts with the database using JPA/Hibernate.
8. **Response** is mapped to a **DTO**.
9. **Builders** format the response object.
10. **Loggers** record the request & response.
11. **Exceptions** are handled globally.
12. **Notifications** (e.g., emails) are sent if needed.
13. **Response** is returned to the client.

---

## 🛠 Tech Stack

| Technology | Logo |
|------------|------|
| Java | ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) |
| Spring Boot | ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) |
| Spring Security | ![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white) |
| Spring Data JPA | ![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white) |
| MySQL | ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) |
| H2 Database | ![H2](https://img.shields.io/badge/H2-Database-003B57?style=for-the-badge) |
| JWT | ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=jsonwebtokens) |
| Swagger | ![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black) |
| Lombok | ![Lombok](https://img.shields.io/badge/Lombok-CA4245?style=for-the-badge) |
| Apache Maven | ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) |
| Logger (SLF4J/Logback) | ![Logger](https://img.shields.io/badge/Logger-SLF4J%2FLogback-blue?style=for-the-badge) |
| Java Mail | ![Java Mail](https://img.shields.io/badge/Spring%20Mail-FF6F00?style=for-the-badge) |

---

## 📦 Modules
- **Doctors Management**
- **Patients Management**
- **Staff Management**
- **Appointment Management**
- **Room Management**
- **Beds Management**
- **Billing & Reports**
- **Authentication & Notifications**

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository
```bash
git clone https://github.com/muchurammahesh/Hospital-Management.git
cd Hospital-Management

2️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Build & Run

mvn clean install
mvn spring-boot:run

4️⃣ Access API Docs

Swagger UI will be available at:

http://localhost:8080/swagger-ui/index.html


---

📂 Folder Structure

Hospital-Management/
│── src/main/java/com/hospital/
│   ├── controller/        # REST Controllers
│   ├── service/           # Service Interfaces
│   ├── service/impl/      # Service Implementations
│   ├── dao/               # Data Access Layer
│   ├── dto/               # Data Transfer Objects
│   ├── model/             # Entity Models
│   ├── exception/         # Exception Handling
│   ├── config/            # Security & App Config
│   └── util/              # Builders, Helpers
│
│── src/main/resources/
│   ├── application.properties
│   ├── static/
│   └── templates/
│
└── pom.xml



👨‍💻 Author

Muchuram Mahesh
