#include<stdio.h>
#include<stdlib.h>

int main(int argc,char *argv[100]){
    FILE *source_file, *destination_file;
    char ch;
    if(argc!=3){
        printf("Usage: %s <source> <destination> \n",arg_v[0]);
        return 1;
    }

    source_file=fopen(arg_v[1],"r"){
        if(source_file=NULL){
            perror("Error Opening the file")
            return 1;
        }
    }

    destination_file=fopen(arg_v[2],"w"){
        if(source_file=NULL){
            perror("Error Opening the file")
            fclose(source_file);
            return 1;
        }
        while(ch=fgetc(source_file)!=EOF){
            fputc(ch,destination_file);
        }
        fclose(source_file);fclose(destination_file);
        printf("File successfully copied!");
        return 0;
    }
    

}