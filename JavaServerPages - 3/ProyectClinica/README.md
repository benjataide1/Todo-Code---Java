# 🦷 Dental Clinic Pro - Clinical Management System

Comprehensive management system for dental clinics built with Java EE, enabling efficient and secure administration of patients, dentists, appointments, and users.

## 🎯 Key Features

- **Patient Management**: Create, modify, view, and delete complete records including guardians and contact information.
- **Dentist Administration**: Full control over specialists, schedules, and availability.
- **Appointment System**: Scheduling and tracking of medical appointments with real-time availability validation.
- **User Management**: Role-based access control (secretaries, administrators).
- **Secure Authentication**: Login system with session validation and route protection via filters.
- **Modern Interface**: Responsive UI built with Bootstrap 5 and premium design featuring custom gradients.

## 🛠️ Tech Stack

### Backend
- **Java 21** - Core language
- **JavaServer Pages (JSP)** - Presentation layer
- **Servlets 4.0** - Controllers and business logic
- **JPA/Hibernate 5.6.15** - Data persistence and ORM
- **MySQL 8.0** - Relational database

### Frontend
- **Bootstrap 5.2.3** - Responsive CSS framework
- **Font Awesome 6.3** - Iconography
- **DataTables** - Interactive tables with search and pagination
- **Custom CSS** - Premium design with gradients and animations

### Architecture & Patterns
- **MVC** - Separation of concerns
- **DAO Pattern** - Generic and reusable data access
- **Session Management** - Authentication control with filters
- **DTO/Entity** - Object-relational mapping

## 🏗️ Project Architecture

```
ProyectClinica/
├── src/main/java/
│   ├── logic/                      # Business entities (Patient, Odontologo, Shift, User)
│   ├── persistence/                # Persistence layer
│   │   ├── ControllerPersistence   # Centralized controller
│   │   └── *JpaController          # Entity-specific DAOs
│   └── Servlets/
│       ├── Filters/                # AuthFilter - centralized security
│       ├── Login/                  # Authentication
│       ├── Patient/                # Patient CRUD
│       ├── Odontologo/             # Dentist CRUD
│       ├── Shift/                  # Appointment CRUD
│       └── User/                   # User CRUD
├── src/main/webapp/
│   ├── components/                 # Reusable components (header, sidebar, footer)
│   ├── css/                        # Custom styles
│   ├── js/                         # Scripts and DataTables
│   ├── assets/                     # Static resources
│   ├── *.jsp                       # Views (create, show, update per entity)
│   └── WEB-INF/
│       └── web.xml                 # Filter configuration and welcome files
└── src/main/resources/
    └── META-INF/
        └── persistence.xml         # JPA configuration
```

## 🔐 Security Implementation

- **AuthFilter**: Filter that intercepts all requests (`/*`) and validates session existence before allowing access to protected pages.
- **Session-based Auth**: User storage in `HttpSession` after successful login.
- **Protected Routes**: Automatic redirection to `sinLogin.jsp` for unauthenticated users.
- **Public Paths**: Whitelist of public routes (login, error pages, static resources).
- **SQL Injection Prevention**: Use of JPA/JPQL with prepared statements.

## 📊 Database

The system manages 7 main entities:
- **User**: System users with credentials
- **Secretary**: Secretary profiles
- **Patient**: Patients with medical information
- **Responsible**: Guardians for minor patients
- **Odontologo**: Dentists with specialties
- **Schedule**: Office hours
- **Shift**: Assigned appointments with date/time

Relationships:
- `Patient` ↔ `Responsible` (One-to-One)
- `Odontologo` ↔ `Schedule` (One-to-One)
- `Odontologo` ↔ `Shift` (One-to-Many)
- `Patient` ↔ `Shift` (One-to-Many)
- `User` ↔ `Secretary` (One-to-One)

## 🚀 Installation and Setup

### Prerequisites
- JDK 21+
- Apache Maven 3.8+
- MySQL 8.0+
- Apache Tomcat 9+ or compatible Servlet 4.0 server

### Steps

1. **Clone the repository**
```bash
git clone <repository-url>
cd ProyectClinica
```

2. **Configure database**
- Create a MySQL database
- Update `persistence.xml` with your credentials:
```xml
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/your_db"/>
<property name="javax.persistence.jdbc.user" value="your_user"/>
<property name="javax.persistence.jdbc.password" value="your_password"/>
```

3. **Build the project**
```bash
mvn clean package
```

4. **Deploy**
- Copy `target/ProyectClinica.war` to Tomcat's `webapps` folder
- Or configure a run configuration in your IDE

5. **Access the application**
```
http://localhost:8080/ProyectClinica/
```

## 💡 Highlighted Features

### Smart Appointment Management
- Real-time availability validation
- Double booking prevention
- Consolidated schedule view per dentist

### Premium UI/UX (AI-Assisted Design)
- Authentication pages with animated gradients
- Cards with glassmorphism and backdrop blur
- Subtle animations (float, slideUp, shake)
- Contextual error/success messages with differentiated styles
- **Modern interface enhanced with AI assistance** to achieve professional-grade visual design

### Advanced DataTables
- Instant search
- Column sorting
- Configurable pagination
- Inline actions (edit/delete)

## 🧪 Testing and Quality

- Client-side form validation
- Centralized exception handling in persistence layer
- Diagnostic logging in AuthFilter
- Optimized queries with JPQL

## 🤖 AI-Enhanced Development

This project leverages AI assistance to enhance the user interface and experience:
- **Premium UI/UX Design**: AI-powered suggestions for modern gradients, animations, and visual hierarchy
- **Code Optimization**: AI-assisted refactoring for cleaner, more maintainable code
- **Best Practices**: Implementation of enterprise patterns guided by AI recommendations

The backend architecture and business logic are entirely hand-coded, demonstrating solid Java EE expertise, while AI tools accelerated frontend polish and design implementation.

## 📝 License

This project was developed for educational and professional portfolio purposes.

## 👨‍💻 Author

**Benjamin** - Backend Developer

---

⭐ **Note**: This project demonstrates capabilities in Java EE enterprise development, MVC architecture, JPA/Hibernate persistence, web security, and backend development expertise. The modern interface design was enhanced using AI tools to achieve professional-grade UI/UX.

