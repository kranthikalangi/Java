//6.declares five integers determines and prints the  prints the largest and smallest in the g
class largest
{


    public static void main(String[] args)
    {
        int[] arr={1,2,0,8,0,6};
        int min=arr[0],max=arr[0];
        for(int i=0;i<5;i++)
        {
            if(min>arr[i])
            min=arr[i];
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("minimun="+min);
        System.out.println("maximun="+max);
    }
}