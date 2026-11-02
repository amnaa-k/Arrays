//SUBTRACTION, MULTIPLICATION, DIVISION AND REMAINDER OF TWO ARRAYS (INDEX BASED)

class subtraction { 
    public static int[] sub(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i] - arr2[i]; //or arr2[i] - arr1[i] depending on condition
        }
        return temp;
    }
    public static void display(int[] arr) {
        System.out.println("Array Subtraction:\n");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,20,30,40};
        int[] arr2 = new int[]{2,3,4,6};

        subtraction.display(subtraction.sub(arr1, arr2));
    }
}

class multiplication {
    public static int[] prod(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i] * arr2[i];
        }
        return temp;
    }
    public static void display(int[] arr) {
        System.out.println("Array Multiplication:\n");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,5,6};
        int[] arr2 = new int[]{5,6,6,5};

        multiplication.display(multiplication.prod(arr1, arr2));
    }
}

class division { //better ver. with float as a data type
    public static int[] div(int[] arr1, int[] arr2) {
        int[] temp=new int[arr1.length];
        for (int i =0; i< arr1.length;i++) {
            temp[i] = arr1[i]/arr2[i];
        }
        return temp;
    }
    public static void display(int[] arr) {
        System.out.println("Array Divison:\n");
        for (int i:arr) {
            System.out.print(" " +i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{10,40,15,66};
        int[] arr2 = new int[]{5,4,3,11};

        division.display(division.div(arr1, arr2));        
    }
}


class division2 { //better ver. with float as a data type
    public static float[] div(float[] arr1, float[] arr2) {
        float[] temp=new float[arr1.length];
        for (int i =0; i< arr1.length;i++) {
            temp[i] = arr1[i]/arr2[i];
        }
        return temp;
    }
    public static void display(float[] arr) {
        System.out.println("Array Divison:\n");
        for (float i:arr) {
            System.out.print(" " +i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        float[] arr1 = new float[]{120,403,125,616};
        float[] arr2 = new float[]{51,42,231,111};

        division2.display(division2.div(arr1, arr2));        
    }
}

class remainder {
    public static float[] rem(float[] arr1, float[] arr2) {
        float[] temp = new float[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i] % arr2[i]; 
        }
        return temp;
    }
    public static void display(float[] arr) {
        System.out.println("Array Remainder:\n");
        for (float i : arr) {
            System.out.print(" " +i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        float[] arr1 = new float[]{34,5,56,6};
        float[] arr2 = new float[]{233,44,667,6};

        remainder.display(remainder.rem(arr1, arr2));
    }
}