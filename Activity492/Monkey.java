/*
 * Activity 4.9.2
 */

public class Monkey extends Primate
{

  public Monkey(String f, boolean n, double a) {
    super(f, n, a);
  }

  public void climb()
  {
    System.out.println("The monkey climbs.");
  }
  
  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public void howl()
  {
    System.out.println("The monkey howls.");
  }
  public void speak(){
    hoot();
    howl();
  }
}