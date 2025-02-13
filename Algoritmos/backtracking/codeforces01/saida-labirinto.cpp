#include <iostream>
#include <vector>

bool backtrack(std::vector<std::vector<int>> &grid, int linha, int coluna, int l, int c){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || grid[l][c] != 0) return false;
    // chegou no final
    if(l == linha-1 && c == coluna-1) return true;

    // marca por onde ja passou
    grid[l][c] = 9;

    // para evitar loops verificamos fazemos essa verificação
    bool ans =
    backtrack(grid, linha, coluna, l, c+1) ||
    backtrack(grid, linha, coluna, l+1, c) ||
    backtrack(grid, linha, coluna, l-1, c) ||
    backtrack(grid, linha, coluna, l, c-1);

    // retorna o valor inicial do grid
    grid[l][c] = 0;
    return ans;
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
