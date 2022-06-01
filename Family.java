class Information{

    String firstname;
    String middlename;
    String lastname;
    int age;
    String occupation;
    String mobile_no;

    Information(){
          System.out.println("The General Information of Family Members are:");
  }
    Information(String firstname, String middlename, String lastname){

          this.firstname=firstname;
          this.middlename=middlename;
          this.lastname=lastname;
          
  } 
   Information(int age){
          this.age=age;

  }

   Information(String occupation, String mobile_no){
          this.occupation=occupation;
          this.mobile_no=mobile_no;

  }
 
   /*Information(String mobile_no){
          this.mobile_no=mobile_no;

  }
  /* void display(){

        System.out.println("The Firstname is: "+firstname +" The Middlename is: "+middlename+" The Lastname is: "+lastname+" The age is: "+age+ " "
	+" The Occupation is: "+occupation+" The Mobile Number is: "+mobile_no); 
  } 
*/
}

class Family{

    public static void main(String args[]){
    Information i4=new Information();
    Information i1=new Information("Meera", "Sudhakar", "Kulkarni");
    Information i2=new Information(23);
    Information i3=new Information("Student", "8080326695");
    //Information i4=new Information("8080326695");

    
    //i1.display();

    System.out.println("The Firstname is: "+i1.firstname +" The Middlename is: "+i1.middlename+" The Lastname is: "+i1.lastname+" The age is: "+i2.age+ " "
	+" The Occupation is: "+i3.occupation+" The Mobile Number is: "+i3.mobile_no);
 
  }
}
