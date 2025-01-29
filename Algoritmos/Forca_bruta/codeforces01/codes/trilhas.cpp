#include <iostream>
#include <vector>



int main(){
    int qtTrails;
    std::cin >> qtTrails;
    std::vector<std::vector<int>> trails;
    for(int i=0; i < qtTrails; i++){ // Iterates the trails
        int qtHeights;
        std::cin >> qtHeights;
        std::vector<int> buffer;
        for(int j=0; j <= qtHeights; j++){ // Iterates the heights of each trail
            if(j == 0){
                buffer.push_back(qtHeights);
            }else{
                int buff;
                std::cin >> buff;
                buffer.push_back(buff);
            }
        }
        trails.push_back(buffer);
    }

    // Checking the trails heights differences
    int requiredEffort = 0;
    std::vector<int> trailsEfforts;
    for(int k=0; k < qtTrails; k++){ // Iterates the trails
        int qtHeights = trails[k][0];
        for(int z=1; z < qtHeights; z++){ // Iterates the heights of each trail ; trail[k][0] is the heights quantity of each trail
            int nextIndex = z+1;
            if(trails[k][z] < trails[k][nextIndex]){
                requiredEffort += (trails[k][nextIndex] - trails[k][z]);
            }
        }
        trailsEfforts.push_back(requiredEffort);
        requiredEffort = 0;
    }

    // Checking the trails heights differences backwards
    requiredEffort = 0;
    std::vector<int> trailsEffortsBackwards;
    for(int a = 0; a < qtTrails; a++){
        for(int b = trails[a][0]; b > 1; b--){
            int nextIndex = b-1;
            if(trails[a][b] < trails[a][nextIndex]){
                requiredEffort += (trails[a][nextIndex] - trails[a][b]);
            }
        }
        trailsEffortsBackwards.push_back(requiredEffort);
        requiredEffort = 0;
    }

    // Checking which of the normal way or backwards is the smallest
    std::vector<int> finalTrailsEfforts;
    for(int q = 0; q < qtTrails; q++){
        if(trailsEfforts[q] > trailsEffortsBackwards[q]){
            finalTrailsEfforts.push_back(trailsEffortsBackwards[q]);
        }else{
            finalTrailsEfforts.push_back(trailsEfforts[q]);
        }
    }

    // Checking which trails efforts is the smallest
    int easiestTrail = 1;
    int easiestTrailIndex;
    for(int w = 1; w < qtTrails; w++){
        easiestTrailIndex = easiestTrail - 1;
        if(finalTrailsEfforts[easiestTrailIndex] > finalTrailsEfforts[w]){
            easiestTrail = w+1;
        }
    }

    std::cout << easiestTrail << std::endl;
    return 0;
}
