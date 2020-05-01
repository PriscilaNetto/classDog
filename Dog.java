public class Dog {
  String breed;
  boolean hasOwner;
  int age;

  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }

  public static void main(String[] args) {

    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4);
    Dog luna = new Dog("shiba inu", true, 8);

    boolean isFidoOlder = fido.age > luna.age;
    int totalDogYears = luna.age + fido.age;

    System.out.println("Two dogs created: a " + fido.breed + " and a " + luna.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");

  }

}