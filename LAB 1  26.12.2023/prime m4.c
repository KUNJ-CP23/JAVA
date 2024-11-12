//prime m1
#include<stdio.h>
void main(){
	int i,n;
	printf("Enter the number = ");
	scanf("%d",&n);
	for(i=2;i<n;i++){
		if(n%i==0){
			printf("Composite number");
			return 0;
		}
	}
	printf("Prime Number");
}
