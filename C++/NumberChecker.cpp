#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter A Number=";
    cin >> num;

    if(num == 0){
        cout<<"You Entered "<<num;
    }
    else if(num > 0){
        cout<<num <<" is positive!!";
    }
    else{
        cout<<num<<" is negative!!";
    }
    return 0;
}
