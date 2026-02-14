#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter A Number=";
    cin >> num;

    cout<<"The Sum of Natural Numbers upto "<<num<<" is: ";
    int sum = 0;
    for(int i = 1; i <= num; i++){
        sum += i;
    }
    cout<<sum;
    return 0;
}
