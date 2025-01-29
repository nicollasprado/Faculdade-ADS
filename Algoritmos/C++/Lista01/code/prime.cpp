#include <iostream>

bool checkPrime(int num){
    bool prime = true;
    for(int i=num-1; i<num && i>1; i--){
        if(num % i == 0){
            prime = false;
            break;
        }
    }
    return prime;
}

int main(){
    int input;
    std::cin >> input;
    std::cout << checkPrime(input) << std::endl;
    return 0;
}