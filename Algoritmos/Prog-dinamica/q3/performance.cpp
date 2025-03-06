#include <iostream>
#include <chrono>
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

int dynamic(std::vector<book> books, int budget){
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



int backtrack(std::vector<book> books, int budget, int index, int tot_price){
    if(tot_price > budget) return INT_MIN;
    if(index >= (int) books.size()) return books[index].pages;

    int use_book = books[index].pages + backtrack(books, budget, index+1, tot_price + books[index].price);
    int skip_book = backtrack(books, budget, index+1, tot_price);

    return std::max(use_book, skip_book);
}



int main(int argc, char* argv[]){
    if(argc == 0){
        std::cout << "-d para prog dinamica e -b para backtracking" << std::endl;
        return 0;
    }else if(argc > 2){
        std::cout << "quantidade de argumentos invalido" << std::endl;
        return 0;
    }

    int qt_books, budget;
    std::cin >> qt_books >> budget;

    std::vector<book> books(qt_books, {0, 0});
    for(book& book : books){
        std::cin >> book.price >> book.pages;
    }

    auto start = std::chrono::high_resolution_clock::now();
    if(*argv[1] == 'd'){
        dynamic(books, budget);
    }else if(*argv[1] == 'b'){
        backtrack(books, budget, 0, 0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    auto timer = std::chrono::duration_cast<std::chrono::microseconds>(end - start);

    std::cout << timer.count() << std::endl;
}
