#include <iostream>
#include <vector>
#include <cmath>

int main(){
    int qtSquares;
    std::cin >> qtSquares;
    std::vector<int> squares;
    int buffer;
    for(int j=0; j < qtSquares; j++){
        std::cin >> buffer;
        squares.push_back(buffer);
    }

    // Checks the distance of colored squares to non colored squares in normal direction
    std::vector<int> coloredPositions;
    int coloredQuantity = 0;
    // gets the colored positions
    for(int i=0; i < qtSquares; i++){
        if(squares[i] == 0){
            coloredPositions.push_back(i);
            coloredQuantity++;
        }
    }

    // checks the others squares distance
    std::vector<int> steps;
    std::vector<int> distanceBuffer;
    for(int x=0; x < qtSquares; x++){ // Iterates the squares
        if(squares[x] == 0){
            steps.push_back(0);
            continue;
        }else{
            for(int y=0; y < coloredQuantity; y++){ // iterates the colored squares positions to get the closest distance
                distanceBuffer.push_back(static_cast<int>(abs(coloredPositions[y] - x)));
            }
            int smallest = distanceBuffer[0];
            for(int z=1; z < static_cast<int>(distanceBuffer.size()); z++){
                if(distanceBuffer[z] < smallest){
                    smallest = distanceBuffer[z];
                }
            }
            if(smallest >= 9){
                steps.push_back(9);
            }else{
                steps.push_back(smallest);
            }
        }
        distanceBuffer.clear();
    }

    for(int a=0; a < qtSquares; a++){
        if(a == qtSquares-1){
            std::cout << steps[a] << std::endl;
        }else{
            std::cout << steps[a] << " ";
        }
    }

    return 0;
}
