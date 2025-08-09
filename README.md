## Email-Generator - Java Console Application

### Overview

**Email-Generator** is a Java console application that helps organizations automate the creation and management of employee email accounts. It demonstrates core object-oriented programming concepts such as encapsulation, user interaction, and basic security.

### Key Features

* Automatically generates professional email IDs in the format: `firstname.lastname@department.com`
* Creates secure random passwords (8 characters long)
* Generates verification codes for secure password-related operations
* Supports department-based email sorting
* Offers a user-friendly, menu-driven console interface
* Fully extendable and modular OOP codebase ([GitHub][1])

### Usage Guide

1. **Launch the application.**

2. **Provide required inputs:**

   * First Name
   * Last Name
   * Department (choose from menu)

3. **Application outputs:**

   * Email ID (`firstname.lastname@department.com`)
   * Randomly generated, secure password
   * Verification code for password-related operations

4. **Menu Options:**

   | Option | Action                                             |
   | ------ | -------------------------------------------------- |
   | 1      | View employee information                          |
   | 2      | Change email address                               |
   | 3      | Change password (requires verification code)       |
   | 4      | View current password (requires verification code) |
   | 5      | Exit the program                                   |

### Installation & Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/VENKATESH-KATTAMURI/Email-Generator.git
   ```
2. Navigate into the project folder:

   ```bash
   cd Email-Generator
   ```
3. Compile the source files:

   ```bash
   javac *.java
   ```
4. Run the application:

   ```bash
   java EmailApp
   ```

### Code Structure

* `Email.java` — Defines the `Email` class, encapsulating fields like email ID, password, and verification code.
* `EmailApp.java` — Contains the `main()` method, handles user interaction, and ties together core functionalities like generating credentials, handling departments, and managing user commands.

### How It Works

* Inputs (first name, last name, department) drive email ID creation.
* Passwords and verification codes are randomly generated using secure logic.
* Verification codes are required to view or change personal credentials.
* OOP principles ensure modularity and scalability for future enhancements.

### Future Enhancements

* Integrate persistence (e.g., files or database) to save employee details.
* Add email validation before creation.
* Allow password length customization and enforce complexity rules.
* Build a GUI for better user interaction and usability.
* Enable SMTP integration for sending generated credentials over email.

### Contributing

Contributions are welcome! If you'd like to enhance this project, feel free to:

* Fork the repository
* Create a feature branch (`git checkout -b feature/YourFeature`)
* Commit your changes (`git commit -m 'Add new feature'`)
* Push to your branch (`git push origin feature/YourFeature`)
* Open a Pull Request


[1]: https://github.com/VENKATESH-KATTAMURI/Email-Generator "GitHub - VENKATESH-KATTAMURI/Email-Generator"
