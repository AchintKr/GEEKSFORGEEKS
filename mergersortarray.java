import java.util.Arrays;

public class mergersortarray {
	public static int[] mergetwoarray(int a[],int b[]) {
		int me[]= new int [a.length+b.length];
		int i =0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				me[k]=b[j];
				k++;
				j++;
			}
			else {
				me[k]=a[i];
				k++;
				i++;
			}
		}
		while(i<a.length) {
			me[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			me[k]=b[j];
			k++;
			j++;
		}
		return me;	
	}

	public static void main(String[] args) {
		int j[]= {1,2,4,5};
		int j1[]= {6,6,8,9};
		System.out.println(Arrays.toString(mergetwoarray(j,j1)));
		}

	}


