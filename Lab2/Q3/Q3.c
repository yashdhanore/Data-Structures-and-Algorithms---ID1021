#include <stdio.h>
#include <stdlib.h>

void swap(int *from, int fromIndex, int toIndex){
    int temp = *(from+fromIndex);
    *(from+fromIndex) = *(from + toIndex);
    *(from+toIndex) = temp;
}

void MoveNegative(int a[],int len){
    int SwapIndex;
    for(int i = 0; i < len; i++){
       SwapIndex = 0;
       while(a[i] < 0 && SwapIndex < len){
           if(a[SwapIndex] > 0){
               swap(a,SwapIndex,i);
           }
           SwapIndex++;
           }
       }
}

int main(){
   int arr[] = {1 , -2, 3, -1, -5, 6};
    MoveNegative(arr,sizeof(arr)/sizeof(int));
   for(int l = 0; l < sizeof(arr)/sizeof(int); l++){
       printf("%d",*(arr+l));
       printf(" ");
   }
   return 0;
}