class Calculate{

       private int length;
       private int height;
       private int side;
       private int radius;
       double pi=3.142, area;
      
       Calculate(int length, int height){
                 this.length=length;
                 this.height=height;
       }
       
       Calculate(int side, int side){
                 this.side=side;
                 this.side=side;

      }
 
      void display(){
                area = length * height; 
                System.out.println(area);
       }
      
      void display1(){
                area1= side * side;
                System.out.println(area1);
}


}
 

class Rectangle{

       public static void main(String args[]){
               
               Calculate c1=new Calculate(4,5); 
               Calculate c2=new Calculate(7,9); 
               c1.display();
               c2.display1();
               
      }        
}

