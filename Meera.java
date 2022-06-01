class Testbean{


         p01rivate String mobileno;
         private String email;

         public void setMobileno(String mobileno){
         this.mobileno=mobileno;
      }

         public String getMobileno(){
         return mobileno;
      }

         public void setEmail(String email){
         this.email=email;
      }

         public String getEmail(){
         return email;
      }

         public void display(){
         System.out.println("The Mobile Number is:" +mobileno);
         System.out.println("The Email Address is:" +email);
      }
  }
class Meera{
        public static void main(String args[]){
        Testbean tb= new Testbean();
        tb.setMobileno("8080326695");
        tb.getMobileno();
        tb.setEmail("kulkarni.meera@gmail.com");
        tb.getEmail();
        tb.display();
        }


  }