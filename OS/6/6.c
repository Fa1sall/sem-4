#include<stdio.h>
#include<stdlib.h>

int mutex=1;
int empty=10;
int full=0;
int x=0;


void producer(){
    --mutex;
    ++full;
    --empty;
    x++;
    printf("\n Producer prodcues item %d",x);

    ++mutex;
}

void consumer(){
    --mutex;
    --full;
    ++empty;
    printf("\n Consumer consumes item %d",x);
    x--;

    ++mutex;
}

int main(){
    int n,i;

    printf("Enter choice: \n");

    for(int i=1;i>0;i++){
        printf("Enter");
        scanf("%d",&n);

        switch (n){
            case 1:
            if((mutex==1) && (empty!=0)){
                producer();
            }
            else{
                printf("Buffer is full");
            }
            break;

            case 2:
            if((mutex==1) && (full!=0)){
                consumer();
            }
            else{
                printf("Buffer is empty!");
            }
            break;

            case 3:
            exit(0);
            break;

            default:
            printf("Enter a valid choice");
    }
    }
}