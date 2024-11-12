//prime m1
#include<stdio.h>
void main(){
	int i,n,count=0;
	printf("Enter the number = ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		if(n%i==0){
			count++;
		}
	}
	if(count==2){
		printf("Prime Number");
	}
	else{
		printf("Composite Number");
	}
}
