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

    //Book testing - default book
   Book book1 = new Book();
   System.out.println(book1);

   //non default book 
   Book book2 = new Book ("American Gods", "Neil Gaimen", "4/5")
   System.out.println(book2)

   book2.setScore("5/5");
   System.out.println(book2);

   //print specific parts of the whole
   System.out.println(book2.getAuthor());
   
    }//end main

}//end class
