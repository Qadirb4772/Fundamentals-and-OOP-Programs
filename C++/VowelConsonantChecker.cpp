#include <iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter a character/letter = ";
    cin >> ch;
    bool isSmallVowel = ((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u'));
    bool isCapVowel = ((ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U'));
    if((isSmallVowel)){
        cout << ch <<" is a vowel";
    }
    else if(isCapVowel){
        cout << ch << " is a Vowel";
    }
    else{
        cout << ch <<" is a consonant!!";
    }
    return 0;
}
