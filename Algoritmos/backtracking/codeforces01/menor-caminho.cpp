#include <iostream>
#include <vector>
#include <algorithm>

int backtrack_find(std::vector<std::vector<int>> &grid, int linha, int coluna, int l, int c){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || grid[l][c] != 0) return 1000;
    // chegou no final
    if(l == linha-1 && c == coluna-1) return 1;

    // marca por onde ja passou
    grid[l][c] = 9;

    // soma de todas as possibilidades
    int way_right = backtrack_find(grid, linha, coluna, l, c+1);
    int way_down  = backtrack_find(grid, linha, coluna, l+1, c);
    int way_up    = backtrack_find(grid, linha, coluna, l-1, c);
    int way_left  = backtrack_find(grid, linha, coluna, l, c-1);
    grid[l][c] = 0;

    int min_way = std::min({way_right, way_up, way_down, way_left});
    return (min_way == 1000) ? 1000 : min_way + 1;
}

int backtrack(std::vector<std::vector<int>> grid, int linha, int coluna, int l, int c){
    int result = backtrack_find(grid, linha, coluna, l, c);
    return (result >= 1000) ? -1 : result;
}



int main(){
    int linha, coluna;
    std::cin >> linha >> coluna;

    std::vector<std::vector<int>> grid(linha, std::vector<int>(coluna, 0));

    for(auto& row : grid){
        for(auto& column : row){
            std::cin >> column;
        }
    }

    std::cout << backtrack(grid, linha, coluna, 0, 0) << std::endl;

    return 0;
}
