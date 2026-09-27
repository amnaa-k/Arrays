//CREATING CUSTOM METHODS FOR PRINTING ARRAYS WITH DIFFERENT DATA TYPES 

class Main {
    //create a custom method for displaying arrays -> 
    //public (available for all classes/packages/files) static (objects not needed) void (no return type) display
    public static void display(int[] arr) /*declaration of an array*/ {
        for (int i : arr) {
            //i is the index which will be printed out by sequence
            //" " is to create spacing between elements of the array being printed out
            System.out.println(" " + i); 

        }
    }
    //^ Above method is to print out an integer array
    public static void display(String[] arr) {
        //same method, different data type -> method overloading
        for (String i : arr) {
            System.out.println(" " + i); //same for each loop logic used as above
        } 
    }

    //main method to create arrays for method implementation
    public static void main(String[] args) {
        //implementing (String[] arr)
        String[] name = new String[]{"Amna","Khan", "Maryam", "Kazi"};
        Main.display(name);
        String[] pets = new String[]{"Bob", "Luna", "Max"};
        Main.display(pets);
        //implementing (int[] arr)
        int[] age = new int[]{12, 55, 67, 9};
        Main.display(age);
        int[] nums = new int[10];
        //if element values are not assigned but array length is given, the elements in an intger array become 0
        //for String arrays, elements become null
        Main.display(nums);
        String[] nullelements = new String[6];
        Main.display(nullelements);
    }
}

