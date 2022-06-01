class Testbean{
        double total,percentage;
        private int physics;
        private int chemistry;
        private int biology;
        private int math;
        private int english;

        public void setPhysics(int physics){
        this.physics=physics;
	}
        public int getPhysics(){

        return physics;
	}
        
	public void setChemistry(int chemistry){
        this.chemistry=chemistry;	
	
} 
        public int getChemistry (){
        return chemistry;
}
        public void setBiology(int biology){
        this.biology=biology;
}
        public int getBiology(){

        return biology;
}
        public void setMath(int math){
        this.math=math;
}
        public int getMath(){
        return math;
}
        public void setEnglish(int english){
        this.english=english;
}
        public int getEnglish(){
        return english;
}
        public void add(){
        total=physics+chemistry+biology+math+english;
        percentage=total/5;
        }
        public void display(){
        System.out.println(physics);
        System.out.println(chemistry);
        System.out.println(biology);
        System.out.println(math);
        System.out.println(english);
        System.out.println("Total=" +total);
        System.out.println("Percentage=" +percentage);
}
 
}
class Output1{
       public static void main(String[] args){

      
       Testbean tb=new Testbean();
       tb.setPhysics(88);
       tb.getPhysics();
       tb.setChemistry(77);
       tb.getChemistry();
       tb.setBiology(55);
       tb.getBiology();
       tb.setMath(77);
       tb.getMath();
       tb.setEnglish(88);
       tb.getEnglish();
       tb.add();
       tb.display();
       
}
}