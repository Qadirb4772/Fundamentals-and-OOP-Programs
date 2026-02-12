#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter A Number = ";
    cin >> num;

    if((num%5 == 0) && (num%11 == 0)){
        cout<<num<<" is Exactly divisible by both 5 and 11"<<endl;
    }
    else if((num%5 != 0) && (num%11 == 0)){
        cout<<num<<" is exactly divisible by 11 but not by 5";
    }
    else if((num%5 == 0) && (num%11 != 0)){
        cout<<num<<" is exactly divisible by 5 but not by 11";
    }
    else{
        cout<<num <<" is neither divisible by 5 nor by 11";
    }

    return 0;
}
