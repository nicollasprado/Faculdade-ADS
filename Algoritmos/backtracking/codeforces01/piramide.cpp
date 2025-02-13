#include <iostream>
#include <vector>
#include <algorithm>

// incompleto


int backtrack_find(std::vector<std::vector<int>>& grid, int size, int r, int c, int counter_row, int counter_column){
    if(counter_row+1 == counter_column+1 && counter_column+1 == 1) return grid[c][r];

    if(counter_row+1 == counter_column+1) counter_row = 0;

    if(c < 0 || r < 0 || r >= size || c >= size) return 10000;

}

int backtracking(std::vector<std::vector<int>>& grid, int size){
}



int main(){
    int size;
    std::cin >> size;

    std::vector<std::vector<int>> grid(n, std::vector<int>(size, 0));

    for(auto& row : grid){
        for(auto& column : row){
            std::cin >> column;
        }
    }

    return 0;
}
