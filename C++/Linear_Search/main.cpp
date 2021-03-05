#include <iostream>
using namespace std;

int search(int arr[], int sizeArray, int element)
{
    int index;
    for (index = 0; index < sizeArray; index++)
        if (arr[index] == element)
            return index;
    return -1;
}

// Driver code
int main(void)
{
    int arr[] = { 2, 3, 4, 10, 40 };
    int element = 0;
    cout<<"Enter the Element you want to search for it :: ";
    cin>>element;
    int sizeArray = sizeof(arr) / sizeof(arr[0]);

    // Function call
    int result = search(arr, sizeArray, element);
    if(result == -1){
        cout << "Element is not present in array...";
    }
    else{
        cout << "Yes it Here :) Element is present at index : " << result<<"...";
    }
    return 0;
}
