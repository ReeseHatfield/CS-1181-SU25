# Midterm Review
The midterm will be held on Tuesday, June 24th. The exam is 80 minutes. The exam will be a paper exam, so a writing utensil is required. The exam is individual and talking will not be tolerated. On the day of your exam, please wait outside the classroom as I will be seating you for the midterm.

Majority of questions are multiple choices, some short answer, a couple matching, and a few fill in the blank

## OOP Review, Abstract Classes, Interfaces
You will need to understand the following concepts.

Topics include:
- Inheritance
- Abstract Classes
- Interfaces
- Dynamic Dispatch
- Implementation Separation
- Data Modeling
- Type Composition
- Casting
- Comparable/ator sorting
- Copy Constructors
- Checked/Unchecked Exceptions
- try/catch/finally
- Swing
- JButtons, Input methods
- ActionListener
- Event Dispatch Thread
- Layout Managers
- JPanels as containers
- Custom graphics (paintComponent() method)
- Separation of Concern


## Debugging

The questions will cover topics like:
* Errors vs Exceptions
* How to write your own Exceptions
* Checked Exceptions
* Unchecked Exceptions
* When to use the `throws` keyword
* When to use the `throw` keyword
* Instantiation of an Exception

## GUIS

The questions will cover topics like:
* JFrame, what it is and how it works
* JPanel, what it is and what it is used for
* Basic Java Swing components (e.g. JButtons, JLabels, etc)
* The differences and benefits of using different ways to implement an ActionListener
* Basic LayoutManagers
  - GridLayout
  - FlowLayout
  - BoxLayout
  - BorderLayout


## Example Review Questions
- This will not be on your exam, but provide an example for what questions could look like

1. Swing component commonly used as a container object
    - JPanel

2. Swing component representing the window
    - JFrame

3. What kind of copy is being made in this example
    ```java
        public class Container {

            private ArrayList<Item> contents;

            public Container(ArrayList<Item> initial){
                this.contents = initial; // this line
            }
        }
    ```
    - Shallow Copy

4. Since java doesn't have multi-inheritance, we often use _____ instead
    - Interfaces

5. Most concise way to add an ActionListener
    - Lambda Expression

6. What type of copy is being made in this example
    ```java
    public class Container {

        private ArrayList<Item> contents;

        public Container(ArrayList<Item> initial){
            for(Item i : initial){
                this.contents.add(new Item(i)); // this line
            }
        }
    }
    ```
    - Deep Copy

7. When adding an ActionListener, use this so action is encapsulated in a separate pre-existing component (i.e. not accessible by a different component)
    - Top Level Concrete Class


8. Method that was no body
    - Abstract Method

9. Handles an exception when it is thrown
    - Catch Block

10. Denotes that a class should inherit from a parent class
    - extends

11. Which of the following will print LAST?
    ```java
        public static void doThing(){
            try {
                System.out.println("One");
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("Two");
                return;
            }
            finally {
                System.out.println("Three");
            }
        }
    ```
    - "Three"

12. What base class do we extend when we want to define our own error types?
    - Exception

13. What interface do we use when we want sort our own custom classes in a natural order?
    - Comparable

14. Copies an object's reference without copying the underlying data
    - Shallow Copy

15. Constructor that takes in an instance of the same object
    - Copy Constructor
