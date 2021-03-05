#include <stdio.h>
#include <stdlib.h>
int search(int arr[], int sizeArray, int element);
int main()
{
    int arr[] = { 2, 3, 4, 10, 40 };
    int element = 0;
    printf("Enter the Element you want to search for it :: ");
    scanf("%d",&element);
    int sizeArray = sizeof(arr) / sizeof(arr[0]);

    // Function call
    int result = search(arr, sizeArray, element);
    if(result == -1){
        printf("Element is not present in array...");
    }
    else{
        printf( "Yes it Here :) Element is present at index : %d  ...\n " , result);
    }
    return 0;
}
int search(int arr[], int sizeArray, int element)
{
    int index;
    for (index = 0; index < sizeArray; index++)
        if (arr[index] == element)
            return index;
    return -1;
}

