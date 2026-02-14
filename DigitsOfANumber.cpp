#include <iostream>
using namespace std;
int main(){
    int num;
    cout << "Enter a Number = ";
    cin >> num;

    int i = num, digits = 0;
    while(i != 0){
        digits++;
        i /= 10;
    }
    cout<<"The Total Number of digits in "<<num<<" are: "<<digits<<endl;
    return 0;
}
