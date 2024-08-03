#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,head,total_movement=0;
    char direction;

    printf("Enter number of disk requests:");
    scanff("%d",n);

    printf("Enter the disk requests: ");
    for(int i=0;i<n;i++){
        scanf("%d",&requests[i]);
    }

    printf("Enter initial head position:");
    scanf("%d",&head);

    printf("Enter the direction (L or R):");
    scanf("%d",direction);

    //Sorting
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(requests[j]>requests[j+1]){
                int temp = requests[j];
                requests[j]=requests[j+1];
                requests[j+1]=temp;
            }
        }
    }

    if(direction == 'L' || direction == 'l'){
        for(int i=n-1;i>=0;i--){
            total_movement = abs(head-requests[i]);
            head=requests[i];
        }
    } else if (direction == 'R' || direction == 'r'){
        for(int i=0;i<n;i++){
            total_movement = abs(head-requests[i]);
            head=requests[i];
        }
    } else{
        printf("Invalid direction");
        return 1;
    }

    printf("Total head movement: %d",total_movement);
    return 0;


}