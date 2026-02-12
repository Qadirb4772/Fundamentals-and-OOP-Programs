#include <iostream>
using namespace std;
int main(){
    int units;
    int bill;
    cout << "Enter your consumed units = ";
    cin >> units;

    if(units <= 100){
        bill = units * 3;
    }
    else if(units <= 200){
        bill = (100 * 3) + (units - 100)*5;
    }
    else{
        bill = (100 * 3) + (200 * 5) +(units-200)*8;
    }

    cout<<"Your Total Bill is: "<<bill<<endl;
    return 0;
}
