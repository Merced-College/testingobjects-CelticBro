public class ObjectTester {
   public static void main(String[] args) {  
    //make a dog
    Dog dog1 = new Dog();
    System.out.println(dog1);

    //make a dog - use non default 
    Dog dog2 = new Dog("Hank", 3, "Lab");
    System.out.println(dog2);

    dog2.setName("Paul");
    System.out.println(dog2);

    //only print dog name
    System.out.println(dog2.getName());
    }//end main

}//end class