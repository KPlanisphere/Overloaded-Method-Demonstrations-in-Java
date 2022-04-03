# Overloaded Method Demonstrations in Java

This repository contains a Java project that demonstrates the use of overloaded methods. The project includes classes for handling various types of input, performing calculations, and displaying results using methods with the same name but different parameters.

## Features

- **Method Overloading**: Demonstrates the concept of method overloading with multiple methods having the same name but different parameter lists.
- **User Interaction**: Handles user input to demonstrate different overloaded methods.
- **Result Display**: Outputs the results of the operations performed by the overloaded methods.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes the overloaded methods.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Impresiones impresiones = new Impresiones();

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        impresiones.print(intValue);

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        impresiones.print(doubleValue);

        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline
        String stringValue = scanner.nextLine();
        impresiones.print(stringValue);
    }
}
```

#### Impresiones Class

The `Impresiones` class contains overloaded methods for printing different types of inputs.

```java
public class Impresiones {
    public void print(int value) {
        System.out.println("Integer value: " + value);
    }

    public void print(double value) {
        System.out.println("Double value: " + value);
    }

    public void print(String value) {
        System.out.println("String value: " + value);
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Follow the prompts to enter different types of input.
4.  The program will call the appropriate overloaded method and display the result.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `Impresiones`: A class containing overloaded methods for printing different types of input.
    -   `print(int value)`: Method that prints an integer value.
    -   `print(double value)`: Method that prints a double value.
    -   `print(String value)`: Method that prints a string value.