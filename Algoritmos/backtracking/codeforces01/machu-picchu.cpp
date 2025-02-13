#include <iostream>
#include <vector>
#include <algorithm>


int backtrack_find(std::vector<std::vector<int>>& grid, int row, int column, int r, int c){
    if(r < 0 || c < 0 || r >= row || c >= column) return 10000000;

    if(r == 0) return grid[r][c];

    int north     = backtrack_find(grid, row, column, r-1, c);
    int northeast = backtrack_find(grid, row, column, r-1, c+1);
    int northwest = backtrack_find(grid, row, column, r-1, c-1);

    int min_path = std::min({north, northeast, northwest});

    return (min_path == 10000000) ? 10000000 : min_path + grid[r][c];
}


int backtrack(std::vector<std::vector<int>>& grid, int row, int column, int r, int c){
    std::vector<int> results;

    for(int i=0; i < column; i++){
        int result = backtrack_find(grid, row, column, r, i);
        result == 10000000 ? results.push_back(-1) : results.push_back(result);
    }

    return *std::min_element(results.begin(), results.end());
}


int main(){
    int row, column;
    std::cin >> row >> column;

    std::vector<std::vector<int>> grid(row, std::vector<int>(column, 0));

    for(auto& g_row : grid){
        for(auto& g_column : g_row){
            std::cin >> g_column;
        }
    }

    std::cout << backtrack(grid, row, column, row-1, 0);
}
