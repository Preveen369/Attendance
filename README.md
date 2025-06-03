# 📅 Smart Attendance App

![Platform](https://img.shields.io/badge/Platform-Android-blue.svg)
![Tech](https://img.shields.io/badge/Backend-Local%20Storage-lightgrey.svg)
![Language](https://img.shields.io/badge/Language-Java-yellow.svg)
![UI](https://img.shields.io/badge/UI-XML-green.svg)
![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)

**Smart Attendance App** is a simple yet efficient Android-based mobile application designed to manage and track student attendance digitally. Developed using Java and XML, this app demonstrates fundamental Android development practices including user authentication, activity navigation, and list-based data display.

Ideal for beginners and students, this project serves as a **starter template** for building apps with login/register systems and custom user dashboards.

---

## 🚀 Features  

### 🔐 User Authentication
- Secure **Login and Registration** flow using local validation.
- Email and password format validation with input error prompts.
- Seamless redirection to Home upon successful login or signup.

### 🏠 Dashboard (Home)
- Clean and simple **welcome screen** after login.
- Easy access to attendance and logout functionality.

### 📋 Attendance Viewer
- View pre-recorded attendance entries in a scrollable list.
- Extendable structure for integration with backend databases.

### 🔁 Session & Navigation
- Prevents back navigation to login after logging in (secure session control).
- Logout functionality to safely return to login screen.

---

## 🛠️ Tech Stack  

- **Frontend**: Java, XML  
- **Backend**: Firebase (Authentication, Realtime Database)
- **Tools**: Android Studio  
- **Target SDK:** 24+

---

## 📂 Project Structure

```
AttendanceApp/
└── app/
    └── src/
        └── main/
            ├── java/
            │   └── com/example/attendance/
            │       ├── MainActivity.java       # Entry point for Login screen
            │       ├── Register.java           # User registration screen
            │       ├── Home.java               # Logged-in home screen
            │       ├── ViewAttendance.java     # List view of attendance
            └── res/
                ├── layout/                     # XML UI layouts
                │   ├── activity_main.xml
                │   ├── activity_register.xml
                │   ├── activity_home.xml
                │   └── activity_view_attendance.xml
                └── values/
                    └── strings.xml, styles.xml
```

---

## 📲 Installation & Setup

### 📋 Prerequisites
- Android Studio installed
- Firebase project setup

### 🧑‍💻 Steps to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/attendance-app.git
   ```
2. **Open in Android Studio** and sync dependencies.
3. **Configure Firebase**:
   - Add `google-services.json` to `app/` directory.
   - Enable Firebase Authentication & Realtime Database.
3. **Run the app** on an emulator or a physical device.

---

## 🧩 Future Enhancements
- 🔄 Firebase or SQLite database integration
- 📅 Attendance marking by user input
- 📈 Graphical attendance analytics
- 📤 Export attendance to Excel/PDF

---

## 🤝 Contributing
Contributions are welcome! 🚀 If you have ideas or improvements, follow these steps:

1. Fork the repository
2. Create a new branch
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes
   ```bash
   git commit -m "Add: Your feature description"
   ```
4. Push to GitHub
   ```bash
   git push origin feature-name
   ```
5. Create a pull request

---

## 📧 Contact
For any queries or collaboration:

- 📬 **Email:** spreveen123@gmail.com
- 🌐 **LinkedIn:** [Preveen S](https://linkedin.com/in/preveen-s)

---

## 🌟 Show Your Support
If you found this project useful, do leave a ⭐ on the repository. Your support inspires more improvements!

---

## 📄 License
This project is licensed under the MIT License.
