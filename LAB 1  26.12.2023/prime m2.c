//prime m2
#include<stdio.h>
void main(){
	int i,n,count=0;
	printf("Enter the number = ");
	scanf("%d",&n);
	for(i=2;i<=(n/2);i++){   //7/2=3
		if(n%i==0){
			count=count+1;
		}
		else{
			i++;
		}
	}
	if(count==0){
		printf("Prime Number");
	}
	else{
		printf("Composite Number");
	}
}
