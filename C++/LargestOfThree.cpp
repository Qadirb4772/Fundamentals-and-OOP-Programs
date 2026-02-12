#include <iostream>
using namespace std;
int main(){
    int num1, num2, num3;
    cout<<"Enter first number = ";
    cin >> num1;
    cout<<"Enter second number = ";
    cin >> num2;
    cout<<"Enter third number = ";
    cin >> num3;
    if(num1 > num2 && num1 > num3){
        cout<<"The Largest number is: "<<num1<<endl;
        if(num2 > num3){
            cout<<"The Second Largest number is: "<<num2<<endl;
            cout<<"The Third Largest number is: "<<num3<<endl;
        }
        else{
            cout<<"The Second Largest number is: "<<num3<<endl;
            cout<<"The Third Largest number is: "<<num2<<endl;
        }
    }
    else if(num2 > num3){
        cout<<"The Largest number is: "<<num2<<endl;
        if(num3 > num1){
            cout<<"The Second largest number is: "<<num3<<endl;
            cout<<"The Third largest Number is: "<<num1<<endl;
        }
        else{
            cout<<"The Second largest number is: "<<num1<<endl;
            cout<<"The Third Largest Number is: "<<num3<<endl;
        }
    }
    else{
        cout<<"The Largest number is: "<<num3<<endl;
        if(num1 > num2){
            cout<<"The Second largest Number is: " <<num1<<endl;
            cout<<"The Third largest Number is: "<<num2<<endl;
        }
        else{
            cout<<"The Second largest Number is: "<<num2<<endl;
            cout<<"The Third largest number is: "<<num1<<endl;
        }
    }


    return 0;
}
