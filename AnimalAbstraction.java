abstract class Animal {
 abstract void animalType();
 abstract void animalSound();
 void sleep() {
  System.out.println("Zzz");
 }
 Animal(){
 System.out.println("In constructor");
 }
 Animal(String name){
  System.out.println("Animal Name is "+name);
 }
}

class Dog extends Animal {
  void animalType() {
   System.out.println("The Dog is a: omnivores animal");
  }
  void animalSound() {
   System.out.println("The Dog says: bow bow");
  }
}

class Cat extends Animal {
  Cat(){
   super("cat");
  }
  void animalType() {
   System.out.println("The Cat is a: omnivores animal");
  }
  void animalSound() {
   System.out.println("The Cat says: meow meow");
  }
}

class AnimalAbstraction {
  public static void main(String[] args) {
    Animal pet = new Dog();
    pet.animalType();
    pet.animalSound();
    pet.sleep();
    pet = new Cat();
    pet.animalType();
    pet.animalSound();
    pet.sleep();
  }
}