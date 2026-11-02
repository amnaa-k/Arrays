class Display {
    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    //method overlaoding
    public static void displayArray(String[] arr) {
        for (String i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }}
class Calculate {
    int size  = 0;
    int arr[];
    public static int arraySize(int[] arr) {
        int count = 0;
        for (int i : arr) {
            count++;
        }
        System.out.println("Size: " + count);
        return count;
    }
    public static void calculateSum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
            sum += i;
        }
        System.out.println("Largest in Array: " + max);
        System.out.println("Smallest in Array: " + min);
        System.out.println("Sum = " + sum);
    }
    public static void calculateAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum/arraySize(arr);
        System.out.println("Average = " + average);
    }}
class Main {
    public static void main(String[] args) {
        String[] name = new String[]{"Amna","Ahmed","Maria","Sara"};
        int[] ages= new int[]{12,17,33,2, 44,55,44};
        Display.displayArray(ages);
        Display.displayArray(name);
        Calculate.calculateSum(ages);
        Calculate.calculateAverage(ages);
        Calculate.arraySize(ages);
    }}