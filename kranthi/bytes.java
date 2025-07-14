class bytes
{
    public static void main(String args[])
    {
        char c[]={'j','y','o','t','h','i','k','a'};
        String str2 =new String(c,0,8);
        System.out.println(str2);
        byte b[]={65,66,67,68,69,70};
        String str3=new String(b,0,6);
        System.out.println(str3);
    }
}