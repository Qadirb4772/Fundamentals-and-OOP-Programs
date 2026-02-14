#include <iostream>
using namespace std;
int main(){
    int num ;
    cout<<"Enter A Number = ";
    cin >> num;

    int digits = 0, Sum = 0;
    int i = num;
    while( i != 0){
        i /= 10;
        digits++;
    }

    for(int i = num; i != 0; i /= 10){
        int digit = i % 10;
        int exponent = 1;
        for(int j = digits; j > 0; j--){
            exponent *= digit;
        }
        Sum += exponent;
    }
    if(Sum == num){
        cout<<"The Number is an Armstrong Number!!!";
    }
    else{
        cout<<"The Number is not an Armstrong Number!!!";
    }

    return 0;
}
