#include <iostream>
using namespace std;
int main(){
    int arr[] = {12, 18, 19, 20, 32, 10, 9};
    int size = sizeof(arr)/sizeof(arr[0]);

    //printing the original array....
    cout<<"Original array is:\n{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }

    //Reversing the Array using the swap function...
    for(int i = 0; i <size/2; i++){
        swap(arr[i], arr[size-i-1]);
    }

    //Printing the Reversed Array...
    cout<<"}\nThe Reversed Array is:\n{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}";
    return 0;
}
