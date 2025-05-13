import java.util.Arrays;

public class arrayredu {
	public static int redarr(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1] && arr[i]!=0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int j[]= {5,7,3,8,10};
	System.out.println("Number of steps required to reduce the arr to zero :-  "+redarr(j));
	}

}
