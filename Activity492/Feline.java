public class Feline extends Animal{
    public Feline(String f, boolean n, double a){
        super(f,n,a);
    }
    public void roar(){
        System.out.println("FORTNITE");
    }
    public void growl(){
        System.out.println("Battle Pass");
    }
    public void speak(){
        roar();
        growl();
    }
}
