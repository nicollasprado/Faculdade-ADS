#include <iostream>
#include <vector>

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

    for(auto& grid_row : grid){
        for(auto& grid_column : grid_row){
            std::cin >> grid_column;
        }
    }

    for(auto& grid_row : grid){
        std::cout << "\n";
        for(auto& grid_column : grid_row){
            std::cout << grid_column << " ";
        }
    }
}