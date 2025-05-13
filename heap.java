import java.util.*;

public class heap {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int HEAPSIZE(int arr[]) {

    }

    public static void max_heapify(int arr[],int i){
        int l=2*i+1;
        int r = 2*i +2;
        int largest = 0;
        while(l<arr.length && r<arr.length){
            if((l<HEAPSIZE(arr)) &&(arr[i]<arr[l])){
                largest=l;
            }
            else{
                largest=r;
            }
            if((r<HEAPSIZE(arr))&&(arr[largest]<arr[r])){
                largest=r;
            }
            if(largest != i){
                swap(arr,i,largest);
                max_heapify(arr, largest);
            }
            else return;
        }

    

    public static void main(String[] args) {
        
    }
}
