#include<stdio.h>
#include<stdlib.h>

int main(){

    int n,head,total_movement=0;

    printf("Enter the number of disk requests: ");
    scanf("%d",&n);

    int requests[n];

    printf("Enter the disk requests: ");
    for(int i=0;i<n;i++){
        scanf("%d",&requests[i]);
    }

    for(int i=0;i<n;i++){
        total_movement += abs(head-requests[i]);
        head=requests[i];
    }

    printf("Total head movement : %d",total_movement);
    return 0;
}