/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    public int getCost(){
        return super.getCost()*super.getWeight();
    }
    public String say()
    {
      return "You now have a small child!";
    }
}