#include <iostream>
#include <vector>
#include <limits.h>

struct book {
    int price;
    int pages;
};

// index, tot_price
int table[10000][10000];

int dinamic(std::vector<book> books, int budget, int index, int tot_price){
    if(tot_price > budget) return INT_MIN;
    if(index >= (int) books.size()) return books[index].pages;

    if(table[index][tot_price] != 0){
        return table[index][tot_price];
    }else{
        int use_book = books[index].pages + dinamic(books, budget, index+1, tot_price + books[index].price);
        int skip_book = dinamic(books, budget, index+1, tot_price);

        return (table[index][tot_price] = std::max(use_book, skip_book));
    }
}


int main(){
    int qt_books, budget;
    std::cin >> qt_books >> budget;

    std::vector<book> books(qt_books, {0, 0});
    for(book& book : books){
        std::cin >> book.price >> book.pages;
    }

    std::cout << dinamic(books, budget, 0, 0) << std::endl;
}
