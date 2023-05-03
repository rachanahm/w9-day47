//Write a JAVA program to find second largest element in an array. 
class Program3{
  public static void main(String args[]){
    int arr[]={3,2,6,8,4,5,9};
    int max=arr[0];
    int secondMax=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        secondMax=max;
         max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: "+secondMax);
    }
      }
    
  
