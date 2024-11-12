//prime m3
#include<stdio.h>
#include<math.h>
void main(){
	int i,n;
	printf("Enter the number = ");
	scanf("%d",&n);
	for(i=2;i<=sqrt(n);i++){
		if(n%i==0){
			printf("Composite Number");
			return 0;
		}
	}
	printf("Prime Number");
}
