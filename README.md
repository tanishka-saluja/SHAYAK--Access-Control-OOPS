
# SAHAYAK – Access Controlled Micro-Loan System 

## Problem Statement
Women entrepreneurs like Lakshmi face biased and non-transparent micro-loan approval
systems where intermediaries manipulate decisions and unauthorized individuals influence
loan outcomes.

## Solution
This project demonstrates a **role-based access control system** using pure Object-Oriented
Programming (Java) to ensure:

- Only **authorized bank verifiers** can approve or reject loans
- Any **unauthorized access attempt** is rejected and permanently logged
- Complete transparency and accountability in decision-making

## OOPS Concepts Used
- Abstraction
- Inheritance
- Encapsulation
- Polymorphism
- Single Responsibility Principle

## Key Features
- Role-based permission checks
- Clear authorization logic
- Handling and logging invalid access attempts
- Eliminates intermediary manipulation

## System Architecture
Sahayak-System/
│
├── src/
│   │
│   ├── SahayakSystem.java        → Main entry point
│   │
│   ├── User.java                 → Abstract base user
│   ├── WomanEntrepreneur.java    → Applicant entity
│   ├── UnauthorizedUser.java     → Access restriction
│   │
│   ├── Verifier.java             → Interface (Abstraction)
│   ├── BankVerifier.java         → Implements Verifier
│   ├── AccessController.java     → Controls access flow
│   │
│   ├── CreditScorer.java         → AI-style scoring engine
│   ├── EligibilityEngine.java    → Standardized threshold logic
│   ├── DecisionEngine.java       → Final approval decision
│   │
│   ├── Loan.java                 → Loan object
│   ├── LoanPolicy.java           → Interest + EMI transparency
│   │
│   ├── EducationPolicy.java      → Education weight mapping
│   │
│   ├── DigitalLedger.java        → Stores digital records
│   ├── AuditLogger.java          → Audit trail logging
│   │
│   ├── Grievance.java            → Complaint system
│   │
│   └── LanguageSupport.java      → Multi-language support
│
└── README.md                     → Project documentation


## How to Run
```bash
javac src/*.java
java src/SahayakSystem
