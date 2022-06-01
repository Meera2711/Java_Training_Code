class Show{
      int a;
      int b;
      int c1,c2,c3,c4;
      Show(int a, int b){
           this.a=a;
           this.b=b;
      }
      void display(){
           c1=a+b;
           c2=a-b;
           c3=a*b;
           c4=a/b;
           System.out.println("Addition is:" +c1);

           System.out.println("Subtraction is:" +c2);

           System.out.println("Multiplication is:" +c3);

           System.out.println("Division is:" +4);
      }

 }

class Resultconstructor{

     public static void main(String args[]){
          Show s1=new Show(10,20);
          Show s2=new Show(40,30);
          Show s3=new Show(40,68);
          Show s4=s3;
          s1.display();
          s2.display();
          s3.display();
          s4.display();
     }
   
 }