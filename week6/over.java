//2. Write a Java program which can give example of Method overloading and overriding.
import java.util.*;
class Add
{
  int sum(int a,int b)
  {
    return a+b;
  }
  int sum(int a,int b,int c)
  {
    return a+b+c;
  }
  float sum(float a,float b)
  {
    return a+b;
  }
  void Display()
  {
    System.out.println("Parent class");
  }
}
class B 
{
  void Display()
  {
    System.out.println("Child class");
  }
}
class over
{
  public static void main(String... args)
  {
  Add ad= new Add();
  B b= new B();
  /*Scanner sc = new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt(); */
  System.out.println("OVERLOADING");
  System.out.println(ad.sum(4,6,5));
  System.out.println(ad.sum(2,3));
  System.out.println(ad.sum(2.2f,3.2f));
  System.out.println("OVERRIDING");
  b.Display();
  ad.Display();
  }
}
  
  
  /*  class Animal {
    // Method overloading
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    // Method overriding
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Method overloading (overloaded method in the subclass)
    public void eat(String food) {
        System.out.println("Dog eats " + food);
    }
}

class Cat extends Animal {
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodExample {
    public static void main(String[] args) {
        // Example of method overriding
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Calls the overridden method in Animal class
        genericAnimal.eat();       // Calls the overridden method in Animal class

        System.out.println("-----------------------");

        // Example of method overloading and overriding in the subclass
        Dog myDog = new Dog();
        myDog.makeSound();         // Calls the overridden method in Dog class
        myDog.eat();               // Calls the overridden method in Animal class
        myDog.eat("bones");        // Calls the overloaded method in Dog class

        System.out.println("-----------------------");

        // Example of method overriding
        Cat myCat = new Cat();
        myCat.makeSound();         // Calls the overridden method in Cat class
        myCat.eat();               // Calls the overridden method in Animal class
    }
}
*/
