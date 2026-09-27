//TYPE CASTING AND ARITHMETIC OPERATIONS IN ARRAYS WITH DIFFERENT DATA TYPES

/*
NOTES:
performing arithmetic operations in arrays with different data types is only possible when:
type casting is done correctly, either implicit or explicit
IT IS PERFORMED BETWEEN VARIABLES WITH SIMILAR DATA TYPE COMPTABILITY       
example:
int a = 10;
double  = a -> POSSIBLE

int a = 10;
String b = a; -> NOT POSSIBLE

DSA LEC 2 ->
in an integer array 
int arr[] = new int[]{1, 2, 3, 4, 5};
if int is replaced by char, it type casts into the char's ASCII value
all the arithmetic operations are then performed with the ASCII value of the char entered into the array
refer to file --- for insertion and replacement of an element in an array 
 */

class asds {
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        Main.display(arr1);
        int[] arr2 = new int[]{1,2,'A',5,6,7};
        Main.display(arr2);
        int sum =0, max=arr2[0], min=arr2[0];
        for (int a : arr2) {
            if (max<a)
                max=a;
            if(min>a)
                min=a;

            sum+=a;
        }
        System.out.println("Maximum Value in arr2: " + max);
        System.out.println("Minimum Value in arr2: " + min);
        System.out.println("Sum of all elements in arr2: " +sum);
    }
}