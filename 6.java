//INTRODUCTION TO ARRAY LISTS

import java.util.*;
class students {
    public int ID;
    public String name;
}
class smsmss {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amna");
        names.add("Maryam Kazi");
        names.add("Abid Ali"); 
        System.out.println("Array List size: "+names.size());
        System.out.println("printing the array elements using loop:");
        for (String i : names) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("directly printing the array:");
        System.out.println(names);
    }
}