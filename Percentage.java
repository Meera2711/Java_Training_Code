/*Write a program to calculate the percentage of your marks.
Take any 5 subjects out of too*/


import java.io.*;
class Percentage{
      public static void main(String[] args){
             int chemistry=78;
             int math=88;
             int biology=67;
             int physics=66;
             int english=88;
             double percentage;
             double total;
             total= chemistry+math+biology+physics+english;
           
             System.out.println("Total marks is:" +total); 
             percentage=(total/5);
             System.out.println("Percentage is:" +percentage);
}

}