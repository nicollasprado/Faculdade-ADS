#include <iostream>
#include <vector>
#include <algorithm>

int backtrack_qt_ways(int grid[6][6], int linha, int coluna, int l, int c){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || grid[l][c] != 0) return 0;
    // chegou no final
    if(l == linha-1 && c == coluna-1) return 1;

    // marca por onde ja passou
    grid[l][c] = 9;

    // soma de todas as possibilidades
    int ans = 0;
    ans += backtrack_qt_ways(grid, linha, coluna, l, c+1);
    ans += backtrack_qt_ways(grid, linha, coluna, l+1, c);
    ans += backtrack_qt_ways(grid, linha, coluna, l-1, c);
    ans += backtrack_qt_ways(grid, linha, coluna, l, c-1);

    grid[l][c] = 0;
    return ans;
}

int backtrack_find(int grid[6][6], int linha, int coluna, int l, int c, int* count){
    // testes para ver se está no grid
    if(l < 0 || c < 0 || l >= linha || c >= coluna || grid[l][c] != 0) return 0;
    // chegou no final
    if(l == linha-1 && c == coluna-1) return 1;

    // marca por onde ja passou
    grid[l][c] = 9;

    // soma de todas as possibilidades
    *count += backtrack_find(grid, linha, coluna, l, c+1, count) ||
    backtrack_find(grid, linha, coluna, l+1, c, count) ||
    backtrack_find(grid, linha, coluna, l-1, c, count) ||
    backtrack_find(grid, linha, coluna, l, c-1, count);

    grid[l][c] = 0;
    return *count;
}


int backtrack(int grid[6][6], int linha, int coluna, int l, int c){
    std::vector<int> paths;
    int qt_ways = backtrack_qt_ways(grid, linha, coluna, 0, 0);

    int ans = -1;
    if(qt_ways > 0){
        while((int) paths.size() != qt_ways-1){
            int count = 0;
            int count_path = backtrack_find(grid, linha, coluna, 0, 0, &count);
            count = 0;
            paths.push_back(count_path);
        }

        std::sort(paths.begin(), paths.end());
        ans = paths[0];
    }

    return ans;
}




int main(){
    const int linha = 5, coluna = 6;

    int grid_a[linha][coluna] = {
    {0, 1, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 0},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 0, 0, 1},
    {0, 0, 0, 1, 0, 0}
    };

    int grid_b[linha][coluna] = {
    {0, 1, 1, 0, 0, 0},
    {0, 0, 0, 0, 0, 0},
    {0, 1, 0, 1, 0, 0},
    {0, 1, 0, 1, 1, 1},
    {0, 0, 0, 1, 0, 0}
    };

    std::cout << "grid a: " << backtrack(grid_a, linha, coluna, 0, 0) << std::endl;
    std::cout << "grid b: " << backtrack(grid_b, linha, coluna, 0, 0) << std::endl;

    return 0;
}
