# YouTube App Automation

This repository contains automation scripts for testing the **YouTube mobile app** using **Appium**. The project automates key functionalities of the YouTube mobile application for Android platforms, focusing on ensuring reliability and performance across various devices.

---

## 📌 Project Overview

This project aims to automate end-to-end testing of essential features in the **YouTube mobile app**. Key functionalities tested include:

- **Add Post**: Automating the process of posting content to YouTube.
- **Shorts**: Automating the management and interaction with YouTube Shorts.
- **Subscribe/Unsubscribe**: Ensuring proper subscription management for channels.
- **Search**: Verifying the search functionality for finding content on YouTube.

These features are automated using **Appium**, **TestNG**, and **Maven**, ensuring that the tests are scalable, maintainable, and easily executable across devices. The project is designed to run on **Android** platforms, supporting various device configurations.

---

## 🛠 Technologies Used

- **Java** - Programming Language
- **Appium** - Mobile Automation Tool (for Android and iOS)
- **Selenium WebDriver** - Automation Tool (for Web-related actions, if any)
- **TestNG** - Testing Framework
- **Maven** - Build Automation Tool
- **Eclipse IDE** - Development Environment

---

## ⚙️ How to Run the Tests

To get started with the project and run the automated tests:

1. **Clone the repository:**
    ```bash
    git clone https://github.com/SaravananSiva004/YouTubeApp-Automation.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd YouTubeApp-Automation
    ```

3. **Install dependencies (if using Maven):**
    ```bash
    mvn clean install
    ```

4. **Run the tests:**
    ```bash
    mvn clean test
    ```

> 📢 **Important**: Ensure that **Appium** is installed and properly set up on your machine. You also need the necessary **mobile drivers**, **emulators**, or **simulators**. For Android, you’ll need **Android Studio** installed.

---

## 🧩 Project Structure

```bash
YouTubeApp-Automation/
├── src/                    # Source code for tests
│   ├── main/               # Main application code (if any)
│   └── test/               # Test cases for YouTube app automation
├── pom.xml                 # Maven configuration file
├── screenshots/            # Folder to store screenshots from failed tests
├── .gitignore              # Git ignore file to exclude unnecessary files
└── README.md               # Project documentation
