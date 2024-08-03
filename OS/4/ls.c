#include<stdio.h>
#include<stdlib.h>
#include<dirent.h>

int main(){
    char dirname[100];
    printf("Enter a directory name:");
    scanf("%d",dirname);

    Dir *dir;
    struct dirent *entry;

    dir = opendir(dirname);
    if(dir==NULL){
        printf("Error in opening directory");
        return 1;
    }
    printf("Files in directory %s:",dirname);
    while((entry==readdir(dir))!=NULL){
        printf("%s",entry->d_name);
    }
    closedir(dir);
    return 0;
}