#include<stdio.h>
int main(){
int i,n,flag=0;
printf("Enter a number: ");
scanf("%d",&n);
if(n<0){
    "Enter a positive number";
    return 1;
}

if(n==0 || n==1){
    flag=1;
}

else{
    for(i=2;i<=n/2;i++){
        if(n%i==0){
            flag = 1;
            break;
        }
    }
}

if(flag==0){
    "It is a prime number";
} else{
    "It is not a prime number";
}
return 0;
}