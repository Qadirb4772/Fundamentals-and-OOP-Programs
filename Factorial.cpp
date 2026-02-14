#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter a Number=";
    cin >> num;

    int factorial = 1;
    for(int i = num; i > 0; i--){
        factorial *= i;
    }

    cout<<num<<"! = "<<factorial<<endl;
    return 0;
}
