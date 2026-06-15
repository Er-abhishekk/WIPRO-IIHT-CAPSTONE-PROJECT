# GUI Automation Framework

## Project Overview

This project is a Selenium Test Automation Framework developed using Java, Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM) design pattern.

The framework automates various GUI components available on the Test Automation Practice website and demonstrates industry-standard automation practices including reporting, logging, screenshots, reusable components, and test execution through TestNG.

---

## Application Under Test

**Website:**

https://testautomationpractice.blogspot.com/

---

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- Apache POI
- Extent Reports
- Log4j
- Git & GitHub

---

## Framework Features

- Page Object Model Design Pattern
- TestNG Test Execution
- Maven Dependency Management
- Extent Report Generation
- Screenshot Capture on Failure
- Logging Support
- Reusable Utility Classes
- Configurable Test Data
- Cross-Browser Ready Structure

---

## Project Structure

```
src/test/java
│
├── Base
│   └── BaseTest.java
│
├── Pages
│   └── AutomationPracticePage.java
│
├── Tests
│   ├── TC01_UserinformationTest.java
│   ├── TC02_GenderSelectionTest.java
│   ├── TC03_WeekDaysSelectionTest.java
│   ├── TC04_CountryDropdownTest.java
│   ├── TC05_ColorMultiSelectTest.java
│   ├── TC06_AnimalDropdownTest.java
│   ├── TC07_DatePickerTest.java
│   ├── TC08_SimpleAlertTest.java
│   ├── TC09_ConfirmationAlertTest.java
│   ├── TC10_PromptAlertTest.java
│   ├── TC11_BrowserTabTest.java
│   ├── TC12_MouseHoverTest.java
│   ├── TC13_DoubleClickTest.java
│   ├── TC14_DragAndDropTest.java
│   ├── TC15_SingleFileUploadTest.java
│   ├── TC16_MultipleFileUploadTest.java
│   ├── TC17_SliderTest.java
│   ├── TC18_StaticTableTest.java
│   ├── TC19_DynamicTableTest.java
│   └── TC20_PaginationTableTest.java
│
├── Utilities
│   ├── ConfigReader.java
│   ├── ExtentManager.java
│   ├── LoggerUtil.java
│   └── ScreenshotUtil.java
│
└── Listeners
    └── TestListeners.java
```

---

## Test Scenarios Covered

### Form Elements
- User Information Form
- Gender Selection
- Weekday Selection
- Country Dropdown
- Color Multi-Select Dropdown
- Animal Dropdown

### Date & Alerts
- Date Picker
- Simple Alert
- Confirmation Alert
- Prompt Alert

### Browser Actions
- Browser Tab Handling
- Mouse Hover
- Double Click
- Drag and Drop

### File Operations
- Single File Upload
- Multiple File Upload

### Advanced UI Elements
- Slider
- Static Table
- Dynamic Table
- Pagination Table

---

## How to Execute the Project

### Clone Repository

```bash
git clone https://github.com/Er-abhishekk/WIPRO-IIHT-CAPSTONE-PROJECT.git
```

### Navigate to Project

```bash
cd WIPRO-IIHT-CAPSTONE-PROJECT
```

### Execute Using Maven

```bash
mvn test
```

### Execute Using TestNG

Run the following file:

```text
testng.xml
```

---

## Reports

After execution, Extent Reports and TestNG Reports are generated under:

```text
test-output/
```

---

## Author

**Abhishek Kumar**

B.Tech CSE (AIML)  
Haldia Institute of Technology

GitHub:
https://github.com/Er-abhishekk

---

## Capstone Project

Developed as part of the WIPRO-IIHT Automation Testing Training Program to demonstrate practical implementation of Selenium Automation Framework using industry-standard design patterns and best practices.
