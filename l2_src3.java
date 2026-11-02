import java.util.*;
class Student
{
    public int ID;
    public String Name;
}
class Main
{
 
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<>();
        Name.add("Ali");
        Name.add("Ali");
        Name.add("Ali");
        Name.add("Ali");
        Name.add("Ali");
        System.out.println(Name.size());
       
        for(String n : Name)
        {
            System.out.print(" "+n);
        }
        System.out.println();
       
        System.out.println(Name);
       
     }
}