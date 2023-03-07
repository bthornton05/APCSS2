/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    public Boot(){
        super.setCost(0);
    }
    public String say()
    {
      return "You now have a Boot!";
    }
    public boolean wasCaught(Hook h)
  {
    // an object in a lake is caught if the hook is strong enough
      return true;
  }
  }
