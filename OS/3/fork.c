#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int main(){
    pid_t pid,pid1,pid2;

    pid=fork();
    if(pid==-1){
        printf("Error in process creation");
        exit(1);
    }
    if(pid!=0){
        pid1=getpid();
        printf("Parent Process ID: %d\n",pid1);
    }
    else{
        pid2=getpid();
        printf("Child Process ID: %d\n",pid2);
    }
    return 0;
}