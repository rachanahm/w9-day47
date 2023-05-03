//Write a JAVA program to print all negative elements in an array. 
class Program2{
  public static void main(String args[]){
    int arr[]={1,2,-4,-5,-7,3};
    System.out.println("Negative elments in array are:");
    for(int i=0;i<arr.length;i++){
      if(arr[i]<0){
        System.out.print(arr[i]+" ");
      }
    }
  }
}