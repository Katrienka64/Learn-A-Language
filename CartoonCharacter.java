class CartoonCharacter {

   // Properties of the class...
   private String name;
   public String favouriteColour;
   private int    favouriteNumber;
   public static int amountOfCaracters;

   // Constructor of the class...
   public CartoonCharacter(String aName, String aColour, int aNumber) {
      name            = aName;
      favouriteColour = aColour;
      favouriteNumber = aNumber;
      amountOfCaracters++;
   }

   // Methods of the class...
   public void displayMe() {
      System.out.println("Hello, my name is " + name);
      System.out.println("my favourite colour is " + favouriteColour);
      System.out.println("and my favourite number is " + favouriteNumber);

      System.out.println("Amount of Characters: " + amountOfCaracters);

   }
}
