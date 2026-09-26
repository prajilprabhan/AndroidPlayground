# 📱 Android Playground & Lab Demonstrations

A comprehensive Android application built using Java and Android SDK showcasing essential Android development concepts, UI components, intents, menus, lifecycle management, and persistent storage.

---

## 📑 Table of Contents

- [About the Project](#-about-the-project)
- [✨ Key Features](#-key-features)
- [📂 Project Architecture](#-project-architecture)
- [🛠️ Tech Stack & Requirements](#️-tech-stack--requirements)
- [🚀 Getting Started](#-getting-started)
- [📖 Feature Breakdown](#-feature-breakdown)
- [👤 Author](#-author)

---

## 📖 About the Project

**Android Playground** serves as a modular collection of Android labs and practical examples. The app features a central launcher menu ([`MainActivity`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java)) with direct navigation to various independent demo activities, making it an ideal reference for Android fundamentals.

---

## ✨ Key Features

| Feature | Description | Main Class |
| :--- | :--- | :--- |
| **👋 Hello World** | Basic Android activity demonstrating UI layout rendering and text view. | [`HelloWorld.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/HelloWorld.java) |
| **👤 Profile & Info** | Personal student/user detail card with formatted layout styling. | [`MainActivity2.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/MainActivity2.java) |
| **❓ Quiz / Q&A** | Interactive question-and-answer interface with answer evaluation. | [`QuestionandAnswer.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/QuestionandAnswer.java) |
| **🍞 Toast Notifications** | Standard and customized toast feedback messages. | [`ToastActivity.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ToastActivity.java) |
| **🔢 Calculator** | Arithmetic operations (addition, subtraction, multiplication, division). | [`Calculator.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/Calculator.java) |
| **📅 Date & Time Picker** | Native dialog pickers for selecting dates and times dynamically. | [`Dateandtime.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/Dateandtime.java) |
| **🔄 Activity Lifecycle** | Visual & console logging of Android lifecycle callbacks (`onCreate`, `onResume`, etc.). | [`LifecycleActivity.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/LifecycleActivity.java) |
| **🌐 Implicit Intent** | Launching external actions (opening web browsers, dialing phone numbers). | [`ImplicitActivity.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ImplicitActivity.java) |
| **🔀 Explicit Intent** | Direct navigation between application activities. | [`ExplicitActivity.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ExplicitActivity.java) |
| **📦 Data Passing Intent** | Passing payloads and receiving data across activities via Intent Extras. | [`Data_passing_intent.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/Data_passing_intent.java) |
| **📋 Menus (Options & Context)** | App bar Options Menu and floating Context Menu triggered on view long-press. | [`ContextOptionMenu.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/ContextOptionMenu.java) |
| **⚠️ Alert Dialog** | Modal confirmation dialogs with positive/negative action handlers. | [`AlertMsg.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/AlertMsg.java) |
| **💾 Shared Preferences** | Local persistent key-value storage for saving and retrieving user input. | [`SharedPrefence.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/SharedPrefence.java) |

---

## 📂 Project Architecture

```plaintext
app/src/main/
├── AndroidManifest.xml
├── java/com/example/myapplication/
│   ├── AlertMsg.java               # Alert dialog confirmation
│   ├── Calculator.java             # Arithmetic calculator
│   ├── ContextOptionMenu.java      # Options & Context Menu demonstration
│   ├── Data_passing_intent.java    # Intent extra sender
│   ├── Dateandtime.java            # Date & Time Pickers
│   ├── ExplicitActivity.java       # Explicit navigation demo
│   ├── HelloWorld.java             # Starter activity
│   ├── ImplicitActivity.java       # Web / Dial implicit actions
│   ├── LifecycleActivity.java      # Lifecycle callback monitor
│   ├── MainActivity.java           # Central hub / Dashboard
│   ├── MainActivity2.java          # Student profile view
│   ├── Main_datapassing_intent.java# Intent extra receiver
│   ├── QuestionandAnswer.java      # Interactive Q&A quiz
│   ├── SharedPrefence.java         # Key-value persistent storage
│   └── ToastActivity.java          # Toast messages demo
└── res/
    ├── layout/                     # XML UI Layouts for all activities
    ├── menu/                       # XML Menu definitions (options_menu.xml)
    └── values/                     # Colors, strings, themes
```

---

## 🛠️ Tech Stack & Requirements

- **Language:** Java 8+
- **Min SDK:** `23` (Android 6.0 Marshmallow)
- **Target SDK:** `32` (Android 12L)
- **UI Architecture:** Android XML Views, ConstraintLayout, CardView, Material Components
- **Build System:** Gradle

---

## 🚀 Getting Started

### Prerequisites
- [Android Studio](https://developer.android.com/studio) (Chipmunk / Flamingo / Electric Eel or newer)
- Android SDK (API 23 to 32)
- JDK 11 or JDK 17

### Installation & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/prajilprabhan/AndroidPlayground.git
   ```

2. **Open in Android Studio:**
   - Launch Android Studio.
   - Select **Open** and choose the `AndroidPlayground` (or `MyApplication`) root folder.

3. **Sync Gradle:**
   - Allow Android Studio to sync dependencies and build the project indexing.

4. **Run on Emulator / Device:**
   - Connect an Android device with USB Debugging enabled or start an Android Virtual Device (AVD).
   - Click the green **Run (Shift + F10)** button.

---

## 📖 Feature Breakdown

### 1. Central Navigation Dashboard
[`MainActivity.java`](file:///c:/Users/praji/AndroidStudioProjects/MyApplication/app/src/main/java/com/example/myapplication/MainActivity.java) provides a scrollable menu containing direct navigation buttons to every experiment and feature implemented in the app.

### 2. Intents & Communication
- **Explicit Intent:** Demonstrates starting a known target activity directly within the application package.
- **Implicit Intent:** Uses system action filters (`Intent.ACTION_VIEW`) to open URLs in the user's default browser or dialer.
- **Data Passing:** Uses `intent.putExtra("key", value)` and `getIntent().getStringExtra("key")` to safely transfer data between distinct activities.

### 3. Menus & Dialogs
- **Options Menu:** Inflated using `onCreateOptionsMenu()` from `res/menu/options_menu.xml`.
- **Context Menu:** Registered onto buttons using `registerForContextMenu()` and handled via `onContextItemSelected()`.
- **AlertDialog:** Uses `AlertDialog.Builder` to prevent accidental actions by prompting confirmation with custom positive and negative listeners.

### 4. Data Persistence
- **SharedPreferences:** Implements persistent key-value caching using `MODE_PRIVATE`, allowing user settings/credentials to survive app restarts.

---

## 👤 Author

- **Prajil** - [GitHub Profile](https://github.com/prajilprabhan)
