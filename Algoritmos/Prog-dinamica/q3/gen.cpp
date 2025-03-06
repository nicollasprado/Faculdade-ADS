#include <fstream>
#include <cstdlib>

using namespace std;

int main(){
    std::fstream file("input.txt");

    for(int i=0; i < 10000; i++){
        file << rand() % 101 << " " << rand() % 101 << "\n";
    }
}
