# 🏦 Bank Account Simulation System (Java Console App)

A console-based Java application that simulates basic bank operations using **Object-Oriented Programming**. Perform essential tasks like **account creation**, **deposit**, **withdrawal**, **balance check**, and **viewing all accounts**.

---

## 🚀 Features

- 🏁 Create new bank accounts
- 💸 Deposit funds
- 🏧 Withdraw money
- 💰 Check account balance
- 📋 View all bank accounts
- ❌ Handle invalid operations gracefully

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- OOP (Encapsulation, Classes & Objects)
- ArrayList for storing accounts
- Scanner for console input

---

## 📂 Project Structure

```
📁 BankAccountSimulation/
├── BankAccount.java       // Model class for account
├── BankOperations.java    // Core banking logic (CRUD)
└── Main.java              // Entry point with user menu
```

---

## ⚙️ How to Run

### ✅ Prerequisites

- Java Development Kit (JDK 8 or higher)
- IDE (e.g., IntelliJ, Eclipse) or terminal with `javac` and `java`

### ▶️ Steps

1. **Compile the Java files:**

```bash
javac BankAccount.java BankOperations.java Main.java
```

2. **Run the program:**

```bash
java Main
```

3. **Follow the on-screen menu:**

```
===== Bank Menu =====
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. View All Accounts
6. Exit
```

---

## 💡 Example Output

```
Enter choice: 1
Enter Account Number: 1001
Enter Account Holder Name: John
Enter Initial Balance: ₹5000
✅ Account created successfully!

Enter choice: 2
Enter Account Number: 1001
Enter amount to deposit: ₹1500
✅ Deposited: ₹1500
```

---

## 📌 Resume Description

> Developed a Java console-based Bank Account Simulation using OOP principles to perform basic banking operations like deposit, withdrawal, and balance inquiry.

---

## 📬 Contributing

Contributions are welcome! If you want to enhance this project (e.g., file storage, transaction history), feel free to fork and submit a pull request.

---

## 📃 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
