class Show{

      int a;
      int b;
      int c;
      int d;
      String name;
      Show(int a, int b){
           this.a=a;
           this.b=b;
   }
      Show(int a, String name){
          this.d=a;
          this.name=name;
   }
      void add(){
          c=a+b;
          System.out.println("The Addition is:" +c);
   }  

      void display(){ 
         System.out.println(d + "   " +name);
   }
}
class Overloading{
     public static void main(String args[]){

         Show s1=new Show(10,70);
         Show s2=new Show(30, "Meera");
         s1.add();
         s2.display();
   } 
}