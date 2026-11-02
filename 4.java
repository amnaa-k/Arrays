//ADDITION OF TWO ARRAYS INDEX BASED

/*
NOTES:
two arrays i and j will be created, with index a
addition will be based index by index for both arrays
an array temp[] will be created to store the result of both arrays added  
ADDITION OF ARRAYS IS ONLY POSSIBLE if the arrays are of same size
 */

class skks {
    //custom function for adding the elements of both arrays
    public static int[] sum(int[] i, int[] j) {
        int[] temp = new int[i.length]; //or [j.length] -> array element based addition, array length must be same
        for(int a=0; a < i.length; a++) {
            //^ a is the index representation, starting from 0, less than i.length and increments by 1
            temp[a] = i[a] + j[a];
        }
        return temp;
    }
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9,0};
        skks.display(skks.sum(arr1, arr2)); //adding declared and assigned arrays
        skks.display(skks.sum(new int[]{2,4,6,8}, new int[]{1,3,5,7}));
    }
}


class example {
    public static int[] sum(int[] arr1, int[] arr2) {
        int temp[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i] + arr2[i];
        }
        return temp;
    }
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{5,2,4,6};
        int[] arr2 = new int[]{2,3,4,5,1};

        example.display(example.sum(arr1, arr2));
    }
}