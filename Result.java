import java.io.*;
class Testbin{
      private String name;
      public void setName(String name){

      this.name =name;
}

     public String getName(){

     return name;
}
     public void display(){
     System.out.println(name);
}
}
class Result{
    public static void main(String[] args){ 
           Testbin tb=new Testbin();
           tb.setName("Meera Kulkarni");
           tb.getName();
           tb.display(); 
}
}