package Challange1Pets;

import java.util.*;

public class Test {

 //gets random string from array (what im having issues with)
   //fixed the errors but might still be issues as output is null

// same as above method


//   public void displayCounts(){
//      int catCount = 0;
//      int dogCount = 0;
//
//      for(Pet pet: pets)
//   }

    public static void main (String[] args) {
//        Pet p1 = new Pet();
//        Pet p2 = new Pet("teddy", 9);
//        Pet p3 = new Pet("Mereidith", 4);
//
//        p1.setName("luna");
//        p1.setAge(7);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        Cat c1 = new Cat();
//        Cat c2 = new Cat("Abby", 6, "Siamese");
//
//        c1.setName("Jax");
//        c1.setAge(3);
//        c1.setBreed("Tuxedo");
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        Dog d1 = new Dog();
//        Dog d2 = new Dog("George", 6, "yorkie");
//
//        d1.setName("alfie");
//        d1.setAge(6);
//        d1.setBreed("terrior");
//
//        System.out.println(d1);
//        System.out.println(d2);
//
//        System.out.println(c1.getBreed());
//        System.out.println(d1.getBreed());

       //cat and dog array (need to fix)
       //user should only inout 5 pets, different type of array?? one array?cat
          //changed to one array
          ArrayOfPets MyArray = new ArrayOfPets();
          Scanner input = new Scanner(System.in);
          //variables
          String name, species;
          int age;
          String breed;

          //for loop to iterate over inside code x5(thats how many times the user needs to input a pet for the arrays)
          for(int i = 0; i < 5; i++){
             //prompts for what species theyd like to enter, stores in variable 'species'
              System.out.println("Would you like add a cat or dog?");
              species = input.next();
              //prompts for pet name, stores in variable 'name'
              System.out.println("What is the pets name?");
              name = input.next();

              //if species is cat
              if(species.equals("cat")){
                 //calls random value method, generates and stores in age
                 age = UtilityMethods.getRandomValue(1, 14);
                 //calls random string, generates and stores in breed (maybe issues)
                 breed = Cat.getRandomBreed();
                 //adds attributes into array
                 Pet petNew = new Cat(name, age, breed);
                 MyArray.insert(petNew);


               //if dog
              }else if(species.equals("dog")){
                 //calls random value method, generates and stores in age
                 age = UtilityMethods.getRandomValue(1, 14);
                 //calls random string, generates and stores in breed (maybe issues)
                 breed = Arrays.toString(Dog.getRandomStringDog());
                 //adds attributes into array (possible issues as outputting null)
                 Pet petNew = new Dog(name, age, breed);
                 MyArray.insert(petNew);

              }

          }


         System.out.println("Number of cats entered: " + Cat.getNumCats());
         System.out.println("Number of dogs entered: " + Dog.getNumDogs());
         String name2 = "";
         do{
            System.out.println("Please enter the name of your pet: ");
            name2 = input.next();

            Pet foundPet = MyArray.findPetByName(name2);
            if (foundPet != null) {
               System.out.println(foundPet.speak());
            }else{
               System.out.println("No pet exists with this name");
            }
         }while(!name2.equals("exit"));








    }
}
