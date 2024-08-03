#include<stdio.h>
#include<dirent.h>

int main(){
    char fn[10],pat[10],output[100];
    FILE *fp;
    printf("\nEnter file name:");
    scanf("%s",fn);
    printf("Enter the pattern:\n");
    scanf("%s",pat);
    fp=open(fn,"r");
    while(!feof(fp)){
        fgets(output,sizeof(output),fp){
            if(strcmp(output,pat)){
                printf("%s",temp);
            }
        }
    }
    fclose(fp);
    return 0;
}