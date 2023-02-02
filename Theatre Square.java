import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
   long n=input.nextLong();
   long m=input.nextLong();
   long a=input.nextLong();
    long countn=n/a;long countm=m/a;
   if(n%a!=0) countn++;
    if(m%a!=0) countm++;
    System.out.println(countn*countm);
    }
    }
