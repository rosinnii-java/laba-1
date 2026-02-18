# Laboratory Work #1: Setting Up Web Development Environment and Creating a Basic Java Web Application

**Student:** Osinnii Roman Maksymovych  
**Group:** KN223L  
**Specialty:** 121 Software Engineering  
**University:** National Technical University "Kharkiv Polytechnic Institute"

---

## 1. Environment Setup

### 1.1. JDK Installation

For this project, **JDK 17** was selected as the recommended stable version for web development tasks.

**Installation Path:** `C:\Program Files\Java\jdk-17`

**Verification:**

```bash
java -version
```

---

### 1.2. IDE Installation

**IntelliJ IDEA Ultimate Edition** was installed.  
This version is preferred for web development as it provides built-in tools for Jakarta EE projects and application server management.

---

### 1.3. Apache Tomcat 10.1 Configuration

**Apache Tomcat 10.1.x** was chosen as the servlet container to support Jakarta EE 9/10 (Servlet API 6.0).

- **Port Configuration:** Changed to **9026** to avoid conflicts with other services.
- **Server Name:** Configured according to project requirements.
- **JDK Integration:** Installer was pointed to the JDK 17 directory to ensure correct runtime.

---

## 2. Project Creation and Structure

### 2.1. Project Initialization

The project was created using the Jakarta EE wizard in IntelliJ IDEA with the following parameters:

| Parameter          | Value                          |
|-------------------|--------------------------------|
| Project Name       | OSINNII_KN223L_WEBJava26_Lab1   |
| Build System       | Maven                          |
| Group ID           | rosinnii.code                  |
| Artifact ID        | Lab1                           |
| Jakarta EE Version | Jakarta EE 10                  |

---

### 2.2. Dependency Management (`pom.xml`)

Servlet API **6.0.0** was used for compatibility with Tomcat 10.1:

```xml
<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.0.0</version>
    <scope>provided</scope>
</dependency>
```

---

## 3. Implementation

### 3.1. Main Page Development (`index.jsp`)

A Java Server Page (JSP) was created to display the required information using UTF‑8 encoding.

```jsp
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lab 1 - WebWorld Greeting</title>
</head>
<body>
    <h1>Hello, WebWorld!!!</h1>
    <hr>
    <p><b>Student Name:</b> Osinnii Roman Maksymovych</p>
    <p><b>Group:</b> KN223L</p>
    <p><b>Position in List:</b> 8</p>
</body>
</html>
```

---

## 4. Deployment and Execution

### 4.1. Server Run Configuration

| Parameter           | Value              |
|--------------------|--------------------|
| Application Server  | Apache Tomcat 10.1 |
| Artifact            | Lab1:war exploded  |
| Application Context | `/Lab1`            |

Application available at:

```text
http://localhost:9026/code_war_exploded/
```

---

### 4.2. Results

After running the project:

- Tomcat successfully deployed the application.
- The browser displayed the greeting message and student information.

**Application Screenshot:**

![Start Page](screenshots/start-page.png)

---

## 5. Deployment Instructions (Self‑Guide)

To run the project on another machine:

1. Install **JDK 17** and configure it in the IDE.
2. Install **Apache Tomcat 10.1** and ensure it uses port **9026**.
3. Import the project as a **Maven project**.
4. Ensure dependencies use the `jakarta.*` namespace (not `javax.*`).
5. Run the Tomcat configuration from the IDE.

---

## Conclusion

During this laboratory work:

- A complete Java web development environment was installed.
- Apache Tomcat 10.1 was configured and integrated with IntelliJ IDEA.
- A Jakarta EE web application was created using Maven.
- The application was successfully deployed and executed.

This confirms the correct setup of the Java Jakarta EE development stack.
