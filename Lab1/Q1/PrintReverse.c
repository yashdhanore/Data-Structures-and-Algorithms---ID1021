/*
    In C implement a recursive and an iterative version of a function which reads characters from stdin until 
    a newline character is read and then prints them on stdout in reverse order. 
    Hint: use getchar(), putchar() (or getc(), putc()). 
    For the iterative version you may assume a fixed max length of the input.
    Author: Yash Dhanore
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void PrintRevRecursive(){  /*calling PrintRevRecursive until end of file is reached, this stacks up all the requests
                            of printing. When EOF is reached the function doesnt call itself and ends the process.
                            After that printing is done --- n(n+1) time complexity*/
    char current;           /*char represents 256 values but getchar returns 257 values(includes EOF) so to avoid 
                             //information lost we use int*/
    if((current = getchar()) != EOF){
        PrintRevRecursive();
    }
    putchar(current);
    return;
}

void PrintRevIterative(){
    int current = 0;
    char reverse[1001];
    int i = 0;
    while((current = getchar()) != EOF && i < 1001){
        reverse[i] = current;
        ++i;
    }
    for(int j = i-1; j >= 0; j-- ){
        putchar(reverse[j]);
    }
    putchar('\n');
}
void PrintRevIterative_cmd(int size,char *current[]){
    char rev[1001];
    int len = 0;
    for(int i = 1; i < size; i++ ){
        char *word = current[i];
        for(int j = 0; j < strlen(word) ; j++){
            rev[len] = *(word+j);
            ++len;
        }
        rev[len] = ' ';
        ++len;
    }
    for(int j = len-2; j >= 0; j-- ){
        printf("%c",rev[j]);
    }
}

int main(){
        PrintRevRecursive();
        //PrintRevIterative();
   return 0;
}



