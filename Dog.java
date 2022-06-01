class Dog{

         String breed="Tom";
         int age=7;
         String colour="Black";

         void bark(){
   
         System.out.println(colour+ "dog is barking and the age of this"  +colour + "dog is " +age);
 
         }
         void type(){
         
         System.out.println("The type of dog is:" +breed);
         }

         public static void main(String args[]){
         Dog d1=new Dog();
         Dog d2=new Dog();
         Dog d3=new Dog();
         d1.bark();
         d2.type();
         d2.bark();
         }
} 