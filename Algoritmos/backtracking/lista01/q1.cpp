#include <iostream>

bool backtrack(int grid[6][6], int linha, int coluna, int l, int c){
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
    const int linha = 5, coluna = 6;

    int grid_a[linha][coluna] = {
    {0, 1, 1, 0, 0, 0},
    {0, 1, 0, 0, 1, 0},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 1, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    int grid_b[linha][coluna] = {
    {0, 1, 0, 0, 0, 0},
    {0, 0, 0, 1, 1, 1},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 1, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    std::cout << "grid a: " << backtrack(grid_a, linha, coluna, 0, 0) << std::endl;
    std::cout << "grid b: " << backtrack(grid_b, linha, coluna, 0, 0) << std::endl;

    return 0;
}