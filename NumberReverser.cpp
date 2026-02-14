#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter a Number=";
    cin >> num;

    int reversedNum = 0;
    for(int i = num; i != 0; i/=10){
        reversedNum = reversedNum*10 + (i%10);
    }
    cout<<"The Reversed Number is: "<<reversedNum<<endl;
    return 0;
}
