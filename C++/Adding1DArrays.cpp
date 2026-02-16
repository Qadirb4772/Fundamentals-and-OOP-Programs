#include <iostream>
using namespace std;
int main(){
    //creating 2 arrays of the same size manually
    int arr1[] = {12, 17, 19, 18, 20, 22};
    int arr2[] = {13, 16, 18, 19, 21, 23};
    //finding their size
    int size = sizeof(arr1)/sizeof(arr1[0]);
    //array for sum
    int SumArray[size];
    //finding the sum of the 2 arrays and storing it in the 3rd one
    for(int i = 0; i < size; i++){
        SumArray[i] = arr1[i] + arr2[i];
    }
    //printing 1st Array
    cout<<"Array 1:\n {";
    for(int i = 0; i < size; i++){
        cout<<arr1[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    //Printing 2nd Array
    cout<<"}\nArray 2:\n {";
    for(int i = 0; i < size; i++){
        cout<<arr2[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    //Printing the Sum Array
    cout<<"}\nSum of the both arrays:\n {";
    for(int i = 0; i < size; i++){
        cout<<SumArray[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    cout<<"}";
    return 0;
}
