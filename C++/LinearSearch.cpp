#include <iostream>
using namespace std;
int main(){
    int arr[] = {11, 17, 19, 10, 12, 14, 16, 2, 24, 23};
    int size = sizeof(arr)/sizeof(arr[0]);
    int target;
        //printing the array
    cout<<"{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}\nEnter a number to search from the array=";
    cin>>target;
    //Searching in the array
    bool found = false;
    for(int i = 0; i < size; i++){
        if(arr[i] == target){
            found = true;
            break;}
    }
    if(found){
        cout<<"Element is present in the array!!!";
    }
    else{
        cout<<"Element is not present in the array!!!!";
    }
    return 0;
}
