class l2_src2
{
    public static int[] sum(int[] i,int[] j)
    {
        int[] temp = new int[i.length];
        for(int a=0;a<i.length;a++)
        {
            temp[a] = i[a] + j[a];
        }
        return temp;
    }
    public static void display(int []arr)
    {
        for(int i : arr)
        {
            System.out.print(" "+i);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] a = new int[]{12,25,41,74,85};
        int[] b = new int[]{25,56,85,74,56};
       
        l2_src2.display(l2_src2.sum(a,b));
       
       // for(int i : Main.sum(a,b))
       // {
       //     System.out.print(" "+i);
       // }
       // System.out.println();
        l2_src2.display(l2_src2.sum(new int[]{1,2,3,4,5,6},new int[]{4,5,7,8,9,6}));
     }
}