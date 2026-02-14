#include <iostream>
using namespace std;
int main(){
    int arr[] = {56, 98, 53, 99, 12, 50};
    int size = sizeof(arr)/sizeof(arr[0]);
    //finding largest element
    int max = arr[0];
    for(int i = 0; i < size; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    cout<<"The Largest Element in The Array is: "<<max<<endl;
    //finding smallest element
    int min = arr[0];
    for(int i = 0; i < size; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    cout<<"The Smallest Element in The Array is: "<<min<<endl;
    return 0;
}
