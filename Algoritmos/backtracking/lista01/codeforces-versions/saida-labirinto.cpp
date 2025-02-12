#include <iostream>

bool backtrack(int *grid, int linha, int coluna, int l, int c){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || *grid+l*c != 0) return false;
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

    int grid[linha][coluna];

    for(int i=0; i < linha; i++){
        for(int j=0; j < coluna; j++){
            std::cin >> grid[i][j];
        }
    }

    std::cout << backtrack(grid, linha, coluna, 0, 0) << std::endl;

    return 0;
}
