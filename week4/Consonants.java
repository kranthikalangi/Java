//5.write a java program to print all vowels in given string and count numbers of vowels and consonants present in given string
import java.util.Scanner;
class consonants
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        int vowels=0,consonants=0;
        char ch;
        str=str.toLowerCase();
        for(int i=0;i<str.length();++i)
        char ch=str.charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            ++vowels;
            System.out.println(ch+"is vowel");
        }
        else
        {
            ++consonants;
            System.out.println(ch+"is consonant:");

        }
    System.out.println("number of vowels present in given string is"+vowels);
    System.out.println("number of cosonants present in given string is"+consonants);
    }
}