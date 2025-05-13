import java.util.*;
public class A1Q7 {
	public static int[] create_array(int n) {
		Scanner ob = new Scanner(System.in);
		int [] array = new int [n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter element in array :- ");
			array[i]=ob.nextInt();
		}
		return array;
	}
	public static void display_array(int []array) {
		System.out.println("The array is :- ");
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("End .");
	}
	public static int max_element(int []array) {
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static int min_element(int []array) {
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	public static int occur_element(int []array,int n) {
		int count =0;
		for(int i =0;i<array.length;i++) {
			if(array[i]==n)
			count++;
		}
		return count;
	}
	public static int firstposition_occurence(int []array,int n) {
		int j =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				j=(i+1);
				break;
			}
		}
		return j;
	}
	public static int lastposition_occurence(int []array,int n) {
		int j =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==n) {
				j=(i+1);
				
			}
		}
		return j;}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter length of the array :- ");
		int f = ob.nextInt();
		int marks[]= create_array(f);
		display_array(marks);
		System.out.println("Maximum element :- "+max_element(marks)+" and occurs "+occur_element(marks,max_element(marks)));
		System.out.println("Minimum element :- "+min_element(marks)+" and occurs "+occur_element(marks,min_element(marks)));
		System.out.println("Last position of minimum element :- "+lastposition_occurence(marks,min_element(marks)));
		System.out.println("fisrt position of maximum element :- "+firstposition_occurence(marks,max_element(marks)));
		
	}

}
