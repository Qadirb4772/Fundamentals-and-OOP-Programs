#include <iostream>
using namespace std;
int main(){
    int term1 = 0, term2 = 1, term3,  noOfTerms;
    cout<<"Enter the Number of terms of Fibonacci Sequence you want=";
    cin >> noOfTerms;
    for(int i = 0; i < noOfTerms; i++){
        cout<<term1<<"\t";
        term3 = term1 + term2;
        term1 = term2;
        term2 = term3;
    }
    return 0;
}
