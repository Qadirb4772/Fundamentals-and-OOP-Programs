#include <iostream>
using namespace std;
int main(){
    int year;
    cout<<"Enter any year = ";
    cin >> year;

    if((year % 100 != 0) && (year % 4 == 0)){
        cout<<year <<" is a Leap year!!\n";
    }
    else if((year % 100 == 0) && (year % 400 == 0)){
        cout<<year<<" is a Leap Year!!!\n";
    }
    else{
        cout<<year<<" is not a Leap Year!!!\n";
    }
    return 0;
}
