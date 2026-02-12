#include <iostream>
using namespace std;
int main(){
    int num;
    cout << "Enter A Number = ";
    cin >> num;

    int reversedNum = 0;
    int i = num;
    while(i != 0){
        int digit = i%10;
        reversedNum = reversedNum*10 + digit;
        i /= 10;
    }
    if(reversedNum == num){
        cout << num <<" is a Palindromic Number";
    }
    else{
        cout << num <<" is not a Palindromic Number";
    }
    return 0;
}
