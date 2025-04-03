/*
 * An anonymous inner class is a class without a name, declared and instantiated in a single expression. It is used when we need a short-live class that extends another class or implements an interface without explicitly defining a new class.
 */
import java.awt.*;  
import java.awt.event.*; 

abstract class Animal {
    abstract void makeSound();
}

interface Greeting {
    void sayHello();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing an abstract class
        Animal dog = new Animal() {
            void makeSound() {
                System.out.println("Woof!! Woof!!");
            }
        };
        dog.makeSound(); // Output: Woof Woof

        // Anonymous inner class implementing an interface
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello(); // Output: Hello, World!

        //Event handling
        Frame frame = new Frame("Button Example");  
        Button button = new Button("Click Me");  

        // Anonymous inner class for event handling
        button.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                System.out.println("Button Clicked!");  
            }  
        });  

        button.setBounds(50, 100, 80, 30);  
        frame.add(button);  
        frame.setSize(300, 200);  
        frame.setLayout(null);  
        frame.setVisible(true);
    }
}
