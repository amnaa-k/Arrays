class arithemticOperations {
    public static void addition(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
    public static void subtraction(int[] arr) {
        int diff = arr[0];
        for (int i : arr) {
            diff -= i;
        }
        System.out.println("Difference: " + diff);
    }
    public static void multiplication(int[] arr) {
        int prod = 1;
        for (int i : arr) {
            prod *= i;
        } 
        System.out.println("Product: " + prod);
    }
    public static void found_MaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (max < i) 
                max = i;
            
            if (min > i) 
                min = i;
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
class Main {
    public static void main(String[] args) {
        int[] array = new int[]{70, 50, 40, 30};
        arithemticOperations.addition(array);
        arithemticOperations.subtraction(array);
        arithemticOperations.multiplication(array);
        arithemticOperations.found_MaxMin(array);
        //double[] arr = new double[]{80, 40, 20, 10};
        //arithemticOperations.division(arr);
    }
}