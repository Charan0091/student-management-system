🎓 Student Management System – Backend

A clean and well-structured Spring Boot REST API for managing student records.
This project demonstrates backend fundamentals, clean architecture, and industry-standard API design.

🚀 Tech Stack

-> Java 21

-> Spring Boot 3.3.x

-> Spring Data JPA

-> MySQL

-> Maven

-> Lombok

-> Jakarta Bean Validation

-> Postman (API testing)

✨ Key Features

-> CRUD operations for student management

-> DTO-based request & response handling

-> Clean layered architecture (Controller, Service, Repository)

-> Global exception handling

-> Standardized API response wrapper

-> Input validation using Jakarta Validation

-> Enum-based course management

-> Automatic timestamps (createdAt, updatedAt)

-> Version-controlled using Git and hosted on GitHub

🏗️ Project Structure

com.studentManagement.demo
│
├── controller   → REST endpoints
├── service      → Business logic & mapping
├── repository   → Database access (JPA)
├── dto          → Request & response DTOs
├── model        → JPA entities
├── exception    → Global exception handling
├── response     → API response wrapper

📦 API Response Format

All APIs return a standard response structure:

✅ Success
{
"status": "SUCCESS",
"message": "Operation successful",
"data": { }
}

❌ Error
{
"status": "FAILURE",
"message": "Validation failed",
"data": {
"email": "Invalid email format"
}
}

📌 API Endpoints
| Method | Endpoint             | Description          |
| ------ | -------------------- | -------------------- |
| POST   | `/api/students`      | Create a new student |
| GET    | `/api/students`      | Fetch all students   |
| GET    | `/api/students/{id}` | Fetch student by ID  |
| PUT    | `/api/students/{id}` | Update student       |
| DELETE | `/api/students/{id}` | Delete student       |

🧪 Sample Request (Create Student)
{
"name": "Rahul Sharma",
"email": "rahul@gmail.com",
"course": "COMPUTER_SCIENCE",
"marks": 85,
"attendancePercentage": 92
}

⚙️ Configuration

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

▶️ How to Run

1.Clone the repository:
git clone https://github.com/your-username/student-management-system.git

2.Create database:
CREATE DATABASE student_db;

3.Run the application:
mvn spring-boot:run

4.Test APIs using Postman

🧠 Key Learnings

-> Built a RESTful backend using Spring Boot and Java 21

-> Applied DTO pattern to decouple entities from API contracts

-> Implemented global exception handling and validation

-> Designed consistent and frontend-friendly API responses

-> Gained hands-on experience debugging real Spring Boot issues

🔮 Future Enhancements

-> Pagination & sorting

-> Search and filter APIs

-> Authentication & authorization (JWT)

-> Role-based access control

👨‍💻 Author

Charan
Backend Developer | Java | Spring Boot


