# Ticket Sales Application

## Overview

This project is a Java Swing application for a simple ticket sales system for soccer matches. The application provides a user interface for entering customer details, selecting match details, and calculating ticket costs.

## Features

- **Customer Details Section**: Allows input of customer name, surname, and cellphone number.
- **Match Details Section**: Provides fields for home team, away team, and ticket cost.
- **Ticket Quantity Selector**: A slider to choose the number of tickets.
- **Total Amount Due**: Displays the total amount due for the tickets.
- **Buttons**:
  - **Buy**: To process the purchase.
  - **Clear**: To reset all fields.
  - **Exit**: To close the application.

## Getting Started

### Prerequisites

Ensure you have Java Development Kit (JDK) installed on your system. This application is developed using Java Swing and should be compatible with JDK 8 and later.

### Running the Application

1. **Clone the Repository**: 
   ```bash
   git clone <repository-url>
   ```

2. **Compile the Code**:
   Navigate to the directory containing the `TicketsFrame.java` file and compile it using:
   ```bash
   javac -d bin src/za/ac/tut/ui/TicketsFrame.java
   ```

3. **Run the Application**:
   ```bash
   java -cp bin za.ac.tut.ui.TicketsFrame
   ```

## Code Structure

- `TicketsFrame.java`: Contains the main application code including GUI setup and component initialization.

### Main Components

- **JFrame**: The main window of the application.
- **JPanel**: Used for grouping components and layout management.
- **JLabel**: Labels for text and instructions.
- **JTextField**: For user input fields.
- **JSlider**: To select the number of tickets.
- **JButton**: For user actions (Buy, Clear, Exit).

### Layout Details

- **Panels**:
  - `headingPnl`: Displays the title.
  - `customerDetailsPnl`: Groups customer input fields.
  - `ticketsPnl`: Contains match details and ticket information.
  - `btnsPnl`: Houses action buttons (Buy, Clear, Exit).
  - `ticketsBtnsCombinedPnl`: Combines ticket details and buttons.
  - `mainPnl`: Main panel that combines all other panels.

## Dependencies

- Java Swing (included with JDK)

## License

This project is licensed under the [MIT License](LICENSE).

## Author

- **Student**: Created as part of a coursework assignment.

## Acknowledgements

- Java Swing for GUI development.
- Various online resources for Java Swing layout management.

## Contact

For any questions or feedback, please contact [your email address].
