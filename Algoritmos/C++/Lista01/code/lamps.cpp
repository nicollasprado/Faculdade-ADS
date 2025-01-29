#include <iostream>

int main(){
    int roadLength, lampsGap;
    std::cin >> roadLength >> lampsGap;
    int qtLamps = (roadLength / lampsGap) + 1;
    if(roadLength % lampsGap > 0){
        qtLamps++;
    }
    std::cout << qtLamps << std::endl;
    return 0;
}