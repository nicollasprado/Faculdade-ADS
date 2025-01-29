#include <iostream>
#include <iomanip>

float piF = 3.14159;
double piD = 3.14159;

float getAreaFloat(float diameter){
    return (piF * (diameter * diameter));
}

double getAreaDouble(double diameter){
    return (piD * (diameter * diameter));
}

int main(){
    double diameter;
    std::cin >> diameter;
    double radius = diameter / 2;
    std::cout << std::fixed << std::setprecision(5) << getAreaDouble(radius) << std::endl;
    std::cout << std::fixed << std::setprecision(5) << getAreaFloat((float)radius) << std::endl;
    return 0;
}