#include<stdio.h>
int main(){
    int t1=0,t2=1,n;
    int temp=t1+t2;

    printf("Enter number of terms:");
    scanf("%d",&n);
    printf("Fibonacci Series:");
    if(n>=1){
        printf("%d",t1);
    }
    if(n>=2){
        printf("%d",t2);
    }
    if(n>=3){
        for(i=3;i<=n;i++){
            printf("%d",temp);
            t1=t2;
            t2=temp;
            temp=t1+t2;
        }
    }
    return 0;
}