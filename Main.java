import java.util.*;
class Solution{
    // Q1 finding the no of Unique element and comparing to m
    void Answer1(int[] arr,int n, int m){
        Arrays.sort(arr);
        int Count_Of_Unique_Elements=0;
        for(int i=0;i< arr.length;i++){
            Count_Of_Unique_Elements++;
            while(i<n-1&&arr[i+1]==arr[i]){
                i++;
            }
        }
        if(Count_Of_Unique_Elements>=m) {
            System.out.println("True");
        }
            else{
                System.out.println("False");
            }
        }
        //Q2 find no. of Sequenced sub arrays with odd sum.
    void Answer2(int arr[],int n){
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int ans[]=new int[n];
                int k=0;
                for(int l=i;l<=j;l++){
                    ans[k]=arr[l];
                    k++;
                }
                int sum=0;
                for(int m=0;m<ans.length;m++){
                    sum+=ans[m];
                }
             if(sum%2==1){
                 c++;
             }
            }
        }
        System.out.println("the total no. of subarrays with odd sum are "+c);
    }
    //Q3  Conatainer with most volume
    void Answer3(int []arr,int n){
        int l=0;int w=0;int area=0;int Max_Area=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                l=Math.min(arr[i],arr[j]);
                w=j-i;
                area=l*w;
                Max_Area=Math.max(Max_Area,area);
            }
        }
        System.out.println("Maximum water in container "+Max_Area);
    }
    //Q4 target sum
    void Answer4(int [] arr,int n,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.print(i+1+" ");
                    System.out.println(j+1);
                }
            }
        }
    }
//  Q5 return aquare of arrays in sorted order
    void Answer5(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the value of n");//q1,q2,q4,q5
        int n=sc.nextInt();
        int arr[]=new int[n];
       // System.out.println("enter value of m");//q1
        //int m=sc.nextInt();//q1
        System.out.println("enter n integers");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("enter target");//q4
       // int x=sc.nextInt();//q4
        Solution obj =new Solution();
       // obj.Answer1(arr,m,n);
        //obj.Answer2(arr,n);
        //obj.Answer3(arr,n);
        //obj.Answer4(arr,n,x);
        obj.Answer5(arr,n);
    }
}