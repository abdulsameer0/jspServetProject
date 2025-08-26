package Day1;

public class Student {
   public void run() {
	   System.out.println("this is a first method!! run");
   }
   public void show() {
	   this.run();
   }
   
   public static void main(String[] args) {
	Student student = new Student();
	student.show();
}
}
