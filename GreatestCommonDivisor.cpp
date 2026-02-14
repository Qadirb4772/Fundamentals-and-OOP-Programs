#include <iostream>
using namespace std;
int main(){
    int num1, num2;
    cout<<"Enter first number = ";
    cin >> num1;
    cout<<"Enter second number = ";
    cin >> num2;
    int n1 = num1, n2 = num2;
    if(n1 > n2){
        while(n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        cout<<"The GCD of "<<num1<<" & "<<num2<<" is: "<<n1<<endl;
    }
    else{
            int n1 = num1, n2 = num2;
        while(n1 != 0){
            int rem = n2 % n1;
            n2 = n1;
            n1 = rem;
        }
        cout<<"The GCD of "<<num1<<" & "<<num2<<" is: "<<n2<<endl;
    }

    return 0;
}
