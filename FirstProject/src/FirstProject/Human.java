package FirstProject;

public class Human {
  String name;
  int age;
  int height;
  
  public Human(String name, int age, int height) {
	  this.name=name;
	  this.age = age;
	  this.height = height; 
  }
  public void speak() {
	  System.out.println("Hello!! My name is "+name);
	  System.out.println("My age is "+ age);
  }
  
  public void eat() {
	  System.out.println("I am Eating...");
  }
  
  public void walk() {
	  System.out.println("I can walk...");
  }
}
