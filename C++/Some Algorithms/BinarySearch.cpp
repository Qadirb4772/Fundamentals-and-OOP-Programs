#include <iostream>
using namespace std;
void BinarySearch(int arr[], int size, int key);
int main(){
    int arr[] = {12, 14, 17, 19, 23, 29, 45};
    int size = sizeof(arr)/sizeof(arr[0]);

    cout<<"Enter a Number you want to search in the following list:\n {";
    for(int i = 0; i < size; i++){
        cout << arr[i];
        if(i < size -1){
            cout << ", ";
        }
    }
    cout<<"}\n\t Enter the Number = ";
    int key;
    cin >> key;


     BinarySearch(arr, size, key);


  return 0;
}
void BinarySearch(int arr[], int size,int key){

    int left = 0, right = size - 1;
    int mid = (left + right)/2;
    bool found = false;
    while(left <= right){
        if(arr[mid] > key){
            right = mid - 1;
            mid = (left + right)/2;
        }else if(arr[mid] < key){
            left = mid + 1;
            mid = (left+right)/2;
        }else{
            found = true;
            break;
        }
    }
    if(found){
    cout << "Element found";
    }else{
    cout<<"Element not found";
    }
}
