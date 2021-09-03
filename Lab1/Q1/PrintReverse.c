#include <stdio.h>
#include <stdlib.h>

void PrintRevRecursive(char current){
    if((current = getchar())!= EOF){
        PrintRevRecursive(current+1);
        putchar(current);
    }
}

void PrintRevIterative(char current){
    while((current = getchar()) != EOF){
        
    }
}

int main(){
   char ch;
   PrintRevRecursive(ch);
   return 0;
}



