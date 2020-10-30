class Animal {
 void animalType(){
  System.out.println("-----");
 }
 void animalSound(){
  System.out.println("-----");
 }
 void sleep() {
  System.out.println("-----");
 }
}

class Dog extends Animal {
 void animalType() {
  System.out.println("The Dog is a: omnivores animal");
 }
 void animalSound() {
  System.out.println("The Dog says: bow bow");
 }
 void sleep() {
  System.out.println("Zzz");
 }
}

class Cat extends Animal {
 void animalType() {
   System.out.println("The Cat is a: omnivores animal");
  }
 void animalSound() {
   System.out.println("The Cat says: meow meow");
  }
 void sleep() {
  System.out.println("Zzz");
 }
}

class AnimalMethodoverriding {
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