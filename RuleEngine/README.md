# Rule Engine Application

## Overview

This project implements a 3-tier rule engine application using Java. The application processes user data based on attributes such as age, department, salary, and experience. It utilizes an Abstract Syntax Tree (AST) to represent and evaluate rules dynamically. The system includes a command-line interface (CLI) for interaction, an API layer for rule management, and backend logic for rule evaluation.

## Project Structure

- **`src/main/java/com/example/`**
    - `Node.java` - Defines the structure and behavior of an AST node used for rule representation.
    - `Parser.java` - Parses rule strings into AST nodes and manages rule combinations.
    - `Evaluator.java` - Evaluates the rules against provided user data to determine eligibility.
    - `Storage.java` - Manages the storage and retrieval of rules.
    - `RuleEngineFile.java` - The main class demonstrating the rule parsing, combination, and evaluation processes.

- **`src/test/java/com/example/`**
    - `NodeTest.java` - Tests the functionality of the `ASTNode` class.
    - `ParserTest.java` - Tests the `RuleParser` class for correct rule parsing and combination.
    - `EvaluatorTest.java` - Tests the `RuleEvaluator` class for accurate rule evaluation.
    - `StorageTest.java` - Tests the `RuleStorage` class for proper rule storage and retrieval.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven (for building the project)

### Building the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/Rule_Engine.git
   cd Rule_Engine
   
2. **Build the project using Maven:**
   ```bash
   mvn clean install

3. **Running the Application** \
   The RuleEngine class contains the main method, which demonstrates the rule engine functionality. To run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.RuleEngine"