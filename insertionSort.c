#include <stdio.h>
int main(){
	int A[5];
	int j,key,i,m;
	//insert value to the array
	for(m=0;m<5;m++){
		printf("Element [%d]: ",m);
		scanf("%d",&A[m]);
	}
	//insertion sort
	for (j=1;j<5;j++){
		key=A[j];
		i=j-1;
		while((i>=0)&&(A[i]>key)){
			A[i+1]=A[i];
			i=i-1;
		}
		A[i+1]=key;
	}
	//display the sorted array
	for(m=0;m<5;m++){
		printf("The sorted array");
		printf("A[%d] Element=%d\n",m,A[m]);
	}

	return 0;
	
}