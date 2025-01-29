#include <iostream>

int backtrack(int grid[6][6], int linha, int coluna, int l, int c){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || grid[l][c] != 0) return 0;
    // chegou no final
    if(l == linha-1 && c == coluna-1) return 1;

    // marca por onde ja passou
    grid[l][c] = 9;

    // soma de todas as possibilidades
    int ans = 0;
    ans += backtrack(grid, linha, coluna, l, c+1);
    ans += backtrack(grid, linha, coluna, l+1, c);
    ans += backtrack(grid, linha, coluna, l-1, c);
    ans += backtrack(grid, linha, coluna, l, c-1);

    grid[l][c] = 0;
    return ans;
}


int main(){
    const int linha = 5, coluna = 6;

    int grid_a[linha][coluna] = {
    {0, 1, 1, 0, 0, 0},
    {0, 0, 0, 0, 1, 0},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 0, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    int grid_b[linha][coluna] = {
    {0, 1, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 0},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 0, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    int grid_c[linha][coluna] = {
    {0, 1, 0, 0, 0, 0},
    {0, 0, 0, 1, 1, 1},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 1, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    std::cout << "grid a: " << backtrack(grid_a, linha, coluna, 0, 0) << std::endl;
    std::cout << "grid b: " << backtrack(grid_b, linha, coluna, 0, 0) << std::endl;
    std::cout << "grid c: " << backtrack(grid_c, linha, coluna, 0, 0) << std::endl;

    return 0;
}
