#include <iostream>
using namespace std;
int main(){
    int marks;
    cout << "Enter Your Marks = ";
    cin >> marks;

    if(marks >= 90 && marks <= 100){
    cout<<"Your Grade is: A"<<endl;
    }
    else if(marks >= 80 && marks <= 89){
    cout<<"Your Grade is: B"<<endl;
    }
    else if(marks >= 70 && marks <= 79){
    cout<<"Your Grade is: C"<<endl;
    }
    else if(marks >= 60 && marks <= 69){
    cout<<"Your Grade is: D"<<endl;
    }
    else{
    cout<<"Your Grade is: F\nYou're Fail"<<endl;
    }
    return 0;
}
