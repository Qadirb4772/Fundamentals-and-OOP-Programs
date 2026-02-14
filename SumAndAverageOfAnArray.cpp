#include <iostream>
using namespace std;
int main(){
    int arr[] = {12, 18, 19, 29, 10, 111, 18};
    int size = sizeof(arr)/sizeof(arr[0]);
    //finding the Sum of the array elements...
    int Sum = 0;
    for(int i = 0; i < size; i++){
        Sum += arr[i];
    }
    //finding the average of array elements...
    float avg = Sum/size;
    //printing the array
    cout<<"{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}\nThe Sum of all the elements of above given Array is: "<<Sum<<endl;
    cout<<"Their Average is: "<<avg<<endl;
    return 0;
}
