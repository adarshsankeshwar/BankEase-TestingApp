# BankEase – Banking Web Application Test Automation Framework

## 📌 Project Overview

BankEase is a web application test automation framework developed using **Java, Selenium WebDriver, TestNG, and Maven**.

The project follows the **Page Object Model (POM)** design pattern to create a maintainable and reusable Selenium automation framework.

The framework currently automates important login scenarios including:

- Valid login
- Invalid login
- Login validation
- Expected result verification using assertions
- Test execution using TestNG
- Test execution through Maven

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming language |
| Selenium WebDriver 4.35.0 | Browser automation |
| TestNG 7.11.0 | Test framework |
| Maven | Build and dependency management |
| Apache POI | Excel/data handling |
| Chrome | Browser |
| Page Object Model | Framework design pattern |
| Git & GitHub | Version control |

---

## 📂 Project Structure

```text
BankEase-TestingApp/
│
├── src/
│   ├── main/
│   │
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   │
│       │   ├── pages/
│       │   │   ├── LoginPage.java
│       │   │   └── DashboardPage.java
│       │   │
│       │   ├── tests/
│       │   │   └── LoginTests.java
│       │   │
│       │   ├── listeners/
│       │   │   └── TestListener.java
│       │   │
│       │   └── utilities/
│       │       └── TestData.java
│       │
│       └── resources/
│
├── testng.xml
├── pom.xml
├── README.md
└── .gitignore
