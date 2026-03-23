public class SecondLargestAndSecondSmallest {
    public static void main(String[] args){
        SecondLargestAndSecondSmallest ob = new SecondLargestAndSecondSmallest();
        int arr[]={5, 2, 9, 1, 7, 6};
        ob.find(arr);
    }
    public void find(int arr[]){
        int min=Integer.MAX_VALUE;
        int sMin=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;

       
        for(int i=0; i<arr.length; i++){
          
            //second max
            if(arr[i]>max){
                sMax=max;
                max=arr[i];
            }
            else if(arr[i]>sMax && arr[i]!=max){
                sMax=arr[i];
            }

            //second min
            if(arr[i]<min){
                sMin=min;
                min=arr[i];
            }
            else if(arr[i]<sMin && arr[i]!=min){
                sMin=arr[i];
            }

          }
          System.out.println("Second Largest: "+ sMax +", Second Smallest: "+ sMin);

        }
    }

