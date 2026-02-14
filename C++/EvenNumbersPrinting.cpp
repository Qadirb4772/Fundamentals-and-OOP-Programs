#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter A Number=";
    cin >> num;
    for(int i = 0; i <= num; i++){
        if(i%2 == 0){
        cout<<i<<"\t";
        }
    }
    return 0;
}
