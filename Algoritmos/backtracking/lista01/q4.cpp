#include <iostream>
#include <vector>

int backtrack(std::vector<std::vector<int>> grid, int row, int column, int r, int c, int final_row, int final_column){
    if(r >= row || c >= column || grid.at(r).at(c) != 0) return 0;
   
    if(r == final_row && c == final_column) return 1;
   
    // pinta onde ja passou
    grid.at(r).at(c) = 9;
   
    int res =
        backtrack(grid, row, column, r+1, c+1, final_row, final_column) || // sudeste
        backtrack(grid, row, column, r+1, c-1, final_row, final_column) || // sudoeste
        backtrack(grid, row, column, r-1, c+1, final_row, final_column) || // nordeste
        backtrack(grid, row, column, r-1, c-1, final_row, final_column);   // noroeste
   
    grid.at(r).at(c) = 0;
   
    return res;
}


int main(){
    int row, column;
    std::cin >> row >> column;
    int start_row, start_column;
    std::cin >> start_row >> start_column;
    int final_row, final_column;
    std::cin >> final_row >> final_column;

    // std::vector<std::vector<int>>  =>  cada espaço do vetor tera um vetor de inteiros
    // (row, std::vector<int>(column, 0)  =>  o grid esta sendo inicializado com um tamanho de "row" e cada row sera preenchido com "std::vector<int>(column, 0)"
    // std::vector<int>(column, 0)  =>  para cada vetor desses ele tera um tamanho "column" e cada espaço sera preenchido com 0
    std::vector<std::vector<int>> grid(row, std::vector<int>(column, 0));

    // entrada pra preencher o grid
    for(auto& grid_row : grid){
        for(auto& grid_column : grid_row){
            std::cin >> grid_column;
        }
    }

    std::cout << backtrack(grid, row, column, start_row, start_column, final_row, final_column) << std::endl;
}