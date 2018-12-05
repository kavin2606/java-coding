import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the string to test");
        String str_check = s.nextLine();
        boolean result= Palindrome(str_check);
        System.out.println(result);
    }
    public static boolean Palindrome(String str)
    {
        str=str.toLowerCase();
        System.out.println("The string to test is: "+str);
        boolean[] arr= new boolean[26];
        for(int i=0;i<str.length();i++)
        {
            int val= str.charAt(i)-'a';

            if(arr[val]==false)
            {
                arr[val]=true;
            }
            else
            {
                arr[val]=false;
            }
        }
        int truecount=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]==true)
            {
                truecount++;
            }
        }
        System.out.println(truecount);
        if(truecount>1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
