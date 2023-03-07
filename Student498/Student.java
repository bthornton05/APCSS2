/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = ""; 
  private int women;
  private int id; 
  private String year;
  private boolean b;
  // Constructor 
  Student(String inputName, int j, String y) 
  { 
    name = inputName;
    id = j;
    year = y;
  } 
  Student(int i, int w){
    i = id;
    w = women;
  }
  public String toString(){
    //return "Name: " + this.name + "| Haswomen: " + this.women + "| ID: " + this.id;
    return "Name: " + name + "| ID: " + id + "| Year: " + year;
} 
 /*  public boolean equals(String sus){
    for (int value = 0; value < sus.length(); value++)
    char fortnite = sus.charAt(value);
    char battlePass = this.name.charAt(value);
    if(fortnite!=battlePass){
      return false;
    }
    if(fortnite == battlePass){
      return true;
    }
  }*/
  public boolean equals(int fart) {
    if (id == fart){
      b = true;
    }
    if (id != fart){
      b = false;
    }
    return b;
  } 
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
}