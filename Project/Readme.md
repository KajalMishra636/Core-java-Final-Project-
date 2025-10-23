
# Student Management System (Advanced Version)

<img width="550" height="364" alt="Screenshot 2025-10-23 142751" src="https://github.com/user-attachments/assets/c599a4cf-67b5-499c-88d9-090d30fbc6d1" />

 <!-- Replace with your own logo -->

**Author:** Kajal Mishra  
**PRs Welcome** | **License:** MIT | **Tech Stack:** Java, File Handling, OOP  

---

## 🚀 Features
- Add Undergraduate and Postgraduate Students with details.
- View all student records in a readable format.
- Search students by ID.
- Update student details (name, email, phone, etc.).
- Delete student records.
- Persist data using **file handling and serialization**.
- Exception handling for invalid inputs and data types.
- Menu-driven interface for easy navigation.
- Supports runtime polymorphism with OOP concepts.
- Separate handling for Undergraduate & Postgraduate specialization.
- User-friendly console interface.

---

## 🛠️ Tech Stack
| Layer | Technology |
|-------|------------|
| Language | Java (Core Java) |
| Concepts | OOP (Inheritance, Abstraction, Polymorphism, Encapsulation) |
| File Handling | Object Serialization (`ObjectOutputStream` / `ObjectInputStream`) |
| Exception Handling | Custom and built-in exceptions |
| Data Storage | Local file (`student_data.txt`) |
| IDE | Eclipse / IntelliJ IDEA / VS Code |

---

## 🖥️ Screenshots
Replace with your own screenshots from your program run:

- Main Menu
- Adding Student
- Viewing Student List
- Searching / Updating / Deleting Student

---

## 📂 Folder Structure
student-management-system/
│
├── src/ # Java source files
│ ├── com/kajal/Project/
│ │ ├── Student.java
│ │ ├── UndergraduateStudent.java
│ │ ├── PostgraduateStudent.java
│ │ ├── FileManager.java
│ │ ├── InvalidInputException.java
│ │ └── StudentManagement.java
├── student_data.txt # Serialized student records
├── README.md
└── .gitignore
