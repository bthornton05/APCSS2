/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public Deer(String f, boolean n, double a) {
    super(f, n, a);
  }

  public void grunt()
  {
    System.out.println("The deer grunts.");
  }
  public void speak(){
    grunt();
  }
}