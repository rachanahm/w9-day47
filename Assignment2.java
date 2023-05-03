import java.util.Scanner;
class Assignment2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int s1=s.nextInt();
    int s2=s.nextInt();
    int s3=s.nextInt();
    int sum=s1+s2+s3;
    if(sum==180 && (s1==90 || s2==90 || s3==90)){
      System.out.println("Prize2");
    }
    else if(s1==60 && s2==60 && s3==60){
      System.out.println("Prize3");
    }
    else if(sum==180){
      System.out.println("Prize1");
    }
    else{
      System.out.println("No prize");
    }
  }
}