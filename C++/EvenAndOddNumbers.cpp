#include <iostream>
using namespace std;
int main(){
    int arr[] = {11, 23, 11, 22, 28, 20, 19, 17, 18};
    int size = sizeof(arr)/sizeof(arr[0]);
    int evenCount = 0, oddCount = 0;
    //finding number of even and odd numbers in the array
    for(int i = 0; i < size; i++){
        if(arr[i] % 2 == 0)
            evenCount++;
        else
            oddCount++;
    }
     //printing the array
    cout<<"{";
    for(int i = 0; i < size; i++){
        cout<<arr[i];
        if(i < size-1){
            cout<<", ";
        }
    }
    //Printing the total number of even and odd numbers
    cout<<"}\nTotal Even Numbers in the above given array are: "<<evenCount<<endl;
    cout<<"Total Odd Numbers in the above given array are: "<<oddCount<<endl;
    return 0;
}
