//PERFORMING ARITHMETIC OPERATIONS IN A SINGLE ARRAY'S ELEMENTS

/*
NOTES:
for division and subtraction, the result variable will not be intialized to zero or one
to perform logically corrext arithemtic, it shoudl be initialized to the first element of array
for an array arr, it it can be declared and initialized as:
int result = arr[0]; 
division not written for single array operations in this file
*/
class abc {
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.println(" "+i);
        }
    }
    public static void main(String[] args) {

        //addition
        int[] add = new int[]{13, 22, 35, 48, 55, 63, 71, 88, 69, 10};
        Main.display(add);
        int max = add[0], min = add[0], sum = 0;
        for (int i : add) {
            if (max < i) 
                max = i;
            if (min > i)
                min = i;

            sum += i;
        }
        System.out.println("Max. Element: " + max);
        System.out.println("Min. Element: " + min);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + (sum/add.length));

        //subtraction
        int[] sub = new int[]{100, 40, 23, 7, 8};
        Main.display(sub);
        int diff = sub[0], max2 = sub[0], min2 = sub[0];
        for (int j : sub) {
            if (max2 < j)
                max2 = j;
            if (min2 > j)
                min2 = j;

            diff -= j;
        }
        System.out.println("Max. Element: " + max2);
        System.out.println("Min. Element: " + min2);
        System.out.println("Difference: " + diff);

        //multiplication
        //QUESTION: CREATE AN ARRAY FROM NUMBERS 1 TO N AND FIND OUT ITS FACTORIAL
        int[] mult = new int[]{2, 3, 4, 5, 6};
        Main.display(mult);
        int prod = 1;
        int max3 = mult[0], min3 = mult[0];
        for (int k : mult) {
            if (max3 < k)
                max3 = k;
            if (min3 > k) 
                min3 = k;

            prod *= k;
        } 
        System.out.println("Product: " + prod);
        System.out.println("Max. Element: " + max3);
        System.out.println("Min. Element: " + min3);

    }
}