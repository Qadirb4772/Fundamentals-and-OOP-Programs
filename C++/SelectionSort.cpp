#include <iostream>
using namespace std;
int main(){
    int arr[] = {12, 24, 10, 2, 7, 11, 8};
    int size = sizeof(arr)/sizeof(arr[0]);
    cout<<"Unsorted array:\n{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}\n";
    for(int i = 0; i < size-1; i++){
        int minIndex = i;
        for(int j = i+1; j < size; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        swap(arr[i], arr[minIndex]);
    }
    cout<<"Sorted array:\n{";

    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}\n";
    return 0;
}
