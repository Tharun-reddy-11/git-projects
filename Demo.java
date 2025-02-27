import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
class Demo{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = scan.nextInt();
    if(isHappyNumber(n)){
      System.out.println("Happy Number");
    } else {
      System.out.println("Not Happy NUmber");
    }
  }
    public static boolean isHappyNumber(int n){
    Set<Integer> number = new HashSet<>();
    while(!number.contains(n)){
      number.add(n);
      n = getNumber(n);
      if(n==1){
        return true;
      }
    }
    return false;
}
  private static int getNumber(int n){
    int num = 0;
    while(n>0){
      int digit = n%10;
      num += digit*digit;
      n /= 10;
    }
    return num;
  }
}