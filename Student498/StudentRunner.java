/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", 10, "pp"); 
    Student t = new Student("Testname", 10, "fart");
    Student r = new Student("New Name", 12, "tree");

    // Below two statements are equivalent 
    System.out.println(s.getId());
    System.out.println(t.getId());
    System.out.println(r.getId());
    System.out.println(s.equals(t.getId())); 
    System.out.println(t.equals(r.getId())); 
  } 
} 