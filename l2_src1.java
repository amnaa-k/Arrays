class Main
{
    public static void display(int []arr) //created a custom method from scratch for d
    {
        for(int i : arr) //for each loop where ":" -> read as "in" and used as an assignment operator
        {
            System.out.print(" "+i);
        }
        System.out.println("");
    }
    public static void display(String []arr)
    {
        for(String i : arr)
        {
            System.out.print(" "+i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        String[] Name = new String[]{"Ali","Muhammad","Moiz","Abdullah"};
        Main.display(Name);
        int[] Height = new int[]{5,4,7,8,9,6,5,3,2,5};
        Main.display(Height);
        int[] Age = new int[]{14,'A',78,74,96,53,25};
        System.out.println(Age.length);
        int max = Age[0],min=Age[0],sum=0;
        for(int i : Age)
        {
            System.out.print(" "+i);
            if(max<i)
                max = i;
               
            if(min>i)
                min = i;
               
            sum += i;
        }
        System.out.println("");
        System.out.println(" "+max+" "+min+" "+sum+" "+(sum/Age.length) );
    }
}