class FredFlintstone {

   // Properties of the class...
   static String name            = "Fred Flintstone";
   static String favouriteColour = "blue";
   static int    favouriteNumber = 42;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class WilmaFlintstone {

   // Properties of the class...
   static String name            = "Wilma Flintstone";
   static String favouriteColour = "red";
   static int    favouriteNumber = 63;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class BarneyRubble {

   // Properties of the class...
   static String name            = "Barney Rubble";
   static String favouriteColour = "yellow";
   static int    favouriteNumber = 2;

   // Methods of the class...
   static void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);
   }
}

class CartoonTest { 

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      CartoonCharacter fred = new CartoonCharacter("Fred Flintstone", "blue", 42);
      fred.displayMe();
      CartoonCharacter wilma = new CartoonCharacter("Wilma Flintstone", "red", 63);
      wilma.displayMe();
      CartoonCharacter barney = new CartoonCharacter("Barney Rubble", "yellow", 2);
      barney.displayMe();

//      fred.displayMe();
//      wilma.displayMe();
//      barney.displayMe();

      System.out.println("My favourite colour is: " + barney.favouriteColour);

      System.out.println(Math.PI);

   }
}

