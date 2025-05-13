import java.util.Arrays;

public class checkrev {
	public static boolean issortedas(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean issortedd(int arr[]) {
		if(arr.length==0) {
			return false;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean check_rev(int arr[]) {
		int first = 0;
		int sec =0;
		//	int arr[]= {1,2,7,12,9,6,13,14};
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					first =i;
					for(int j=first+1;j<arr.length-1;j++) {
					if(arr[j]<arr[j+1]) {
						sec =j;
						break;
				}
					i++;

		}

	}
			}
			
			int fir[]=Arrays.copyOfRange(arr, 0, first);
			int mid[]=Arrays.copyOfRange(arr, first, sec+1);
			int las[]=Arrays.copyOfRange(arr, sec+1, arr.length);
			if(issortedd(mid)&& issortedas(fir)&&issortedas(las)) {
				if(arr[first-1]<arr[sec]) {
					if(arr[first]<arr[sec+1]) {
						return true;
					}
				}
			}
			return false;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,7,10,13,14};
		System.out.println(check_rev(arr));
		
		}
}
