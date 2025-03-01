#include <iostream>
#include <vector>
#include <limits.h>

struct book {
    int price;
    int pages;
};

int backtrack(std::vector<book> books, int budget, int index, int tot_price){
    if(tot_price > budget) return INT_MIN;
    if(index >= (int) books.size()) return books[index].pages;

    int use_book = books[index].pages + backtrack(books, budget, index+1, tot_price + books[index].price);
    int skip_book = backtrack(books, budget, index+1, tot_price);

    return std::max(use_book, skip_book);
}


int main(){
    int qt_books, budget;
    std::cin >> qt_books >> budget;

    std::vector<book> books(qt_books, {0, 0});
    for(book& book : books){
        std::cin >> book.price >> book.pages;
    }

    std::cout << backtrack(books, budget, 0, 0) << std::endl;
}
