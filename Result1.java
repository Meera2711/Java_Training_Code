//Display firstname,lastname,age,gender,address with the help of setter and getter method

import java.io.*;
class Testbean{

        private String firstname;
        private String lastname;
        private int age;
        private String gender;
        private String address;

        public void setFirstname(String firstname){
        this.firstname=firstname;
	}
        public String getFirstname(){

        return firstname;
	}
        
	public void setLastname(String lastname){
        this.lastname=lastname;	
	
} 
        public String getLastname(){
        return lastname;
}
        public void setAge(int age){
        this.age=age;
}
        public int getAge(){

        return age;
}
        public void setGender(String gender){
        this.gender=gender;
}
        public String getGender(){
        return gender;
}
        public void setAddress(String address){
        this.address=address;
}
        public String getAddress(){
        return address;
}
        public void display(){
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
}
 
}
class Result1{
       public static void main(String[] args){
       Testbean tb=new Testbean();
       tb.setFirstname("Meera");
       tb.getFirstname();
       tb.setLastname("Kulkarni");
       tb.getLastname();
       tb.setAge(23);
       tb.getAge();
       tb.setGender("F");
       tb.getGender();
       tb.setAddress("Aurangabad");
       tb.getAddress();
       tb.display();
       
}
}