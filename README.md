# 🧮 String Calculator - TDD Kata

This project implements a **String Calculator** in Java using **Test-Driven Development (TDD)**. The code is built incrementally using the Red-Green-Refactor TDD cycle, with a focus on writing clean, tested, and maintainable code.

---

## ✅ Features Implemented

| Input Format                     | Description                                            | Output     |
|----------------------------------|--------------------------------------------------------|------------|
| `""`                             | Empty string                                           | `0`        |
| `"5"`                            | Single number                                          | `5`        |
| `"1,2"`                          | Comma-separated numbers                                | `3`        |
| `"1\n2,3"`                       | Supports newline (`\n`) as delimiter                   | `6`        |
| `"//;\n1;2"`                     | Custom single-character delimiter                      | `3`        |
| `"//[***]\n1***2***3"`           | Custom multi-character delimiter                       | `6`        |
| `"1,-2,3"`                       | Negative numbers throw an exception                    | ❌ Exception |

---

## 📦 Clone the Repo

```bash
git clone https://github.com/harmit-patel/Incubyte_String_Calculator_TDD.git
cd Incubyte_String_Calculator_TDD
🧪 Run Tests
🖥️ Via IntelliJ IDEA
Open the project in IntelliJ IDEA

Navigate to:
src/test/java/calculator/StringCalculatorTest.java

Right-click → Run to execute the tests

⚙️ Via Maven (Optional)
Make sure Maven is installed, then run:

mvn test

📁 Project Structure

Incubyte_String_Calculator_TDD/
├── README.md
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── calculator
    │           └── StringCalculator.java
    └── test
        └── java
            └── calculator
                └── StringCalculatorTest.java

🔁 Commit History (TDD Style)
Each feature is developed using the Red-Green-Refactor approach:

Stage	Commit Message Example
🔴	TEST: return 0 for empty string input
🟢	FIX: handle empty string and return 0
🔴	TEST: support custom delimiter like //;\n1;2
🟢	FIX: parse and use custom delimiter in calculation
🔴	TEST: throw error for negative numbers
🟢	FIX: throw exception listing all negative numbers

⚙️ Tech Stack
Java 17+

JUnit 5

IntelliJ IDEA (recommended)

Maven (optional)

🧠 TDD Concepts Demonstrated
✅ Red-Green-Refactor Cycle
✅ Unit Testing with JUnit
✅ Clean Code Practices
✅ String Parsing & Regex
✅ Defensive Programming (e.g., negative number handling)

✍️ Author
Harmit Patel
GitHub: @harmit-patel

📜 License
This project is licensed under the MIT License.
