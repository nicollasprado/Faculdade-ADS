#include <iostream>
#include <vector>
#include <limits.h>

struct book {
    int price;
    int pages;
};

int find_near(std::vector<int> table, int budget){
    for(int i = budget; i > 0; i--){
        if(table[i] != INT_MIN){
            return table[i];
        }
    }

    return -1;
}

int dinamic(std::vector<book> books, int budget){
    std::vector<int> table(budget+1, INT_MIN);
    table[0] = 0;

    for(int i = 1; i <= budget; i++){
        for(book& book : books){
            if(book.price <= i && table[i - book.price] != INT_MIN){
                table[i] = std::max(table[i], table[i - book.price] + book.pages);
            }
        }
    }

    return (table[budget] == INT_MIN ? find_near(table, budget) : table[budget]);
}

int main(){
    int qt_books, budget;
    std::cin >> qt_books >> budget;

    std::vector<book> books(qt_books, {0, 0});
    for(book& book : books){
        std::cin >> book.price >> book.pages;
    }

    std::cout << dinamic(books, budget) << std::endl;

}
