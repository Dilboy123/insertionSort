import java.util.Scanner;

public class insertionsort {
		public static void main(String args[]) {
		int array[]=new int[5];
		int key,j,i,m;
		Scanner obj = new Scanner(System.in);
	//Insert value to the array
		for(m=0;m<5;m++) {
			System.out.print("Element "+m+":");
			array[m]=obj.nextInt();
		}
		//Insertion sort
		for(j=1;j<5;j++) {
			key=array[j];
			i=j-1;
			while((i>=0)&&(array[i]>key)) {
				array[i+1]=array[i];
				i=i-1;
			}
			array[i+1]=key;
		}
			
		//display the sorted array	
		for(m=0;m<5;m++) {
		System.out.println("The sorted array "+m+" Element "+array[m]);
		}
		
		
	}
}