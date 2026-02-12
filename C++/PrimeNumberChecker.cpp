#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter a number=";
    cin >> num;
    bool isPrime = true;
    if(num <= 1){
    cout<<num <<" is not a Prime!!";
    }
    else if(num == 2){
        cout << num <<" is A Prime Number!!!";
    }

    else{

    for(int i = 2; i < num; i++){
        if(num % i == 0){
        isPrime = false;
        break;
        }
    }
    if(isPrime){
        cout << num<<" is A Prime Number!!!";
    }
    else{
        cout << num <<" is not a Prime Number!!";
    }
    }
    return 0;
}
