#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter a Number=";
    cin >> num;

    cout<<"MULTIPLICATION TABLE OF "<<num<<endl;
    for(int i = 1; i <= 10; i++){
        cout << i <<" * " <<num <<" = " <<num*i<<endl;
    }
    return 0;
}
