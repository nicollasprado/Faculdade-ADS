#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

const int MAX = 100000000;

// index, available_dist -> stores min time
int table[10000][3];

int find_less_time(std::vector<int> distances, std::vector<int> times, int total_dist, int actual_dist, int available_dist, int index){
    if(actual_dist >= total_dist) return 0;
    if(available_dist <= 0) return MAX;

    if(table[index][available_dist] != 0){
        return table[index][available_dist];
    }else{
        int distance_to_next = std::abs(actual_dist - distances[index]);
        int refuel = times[index] + find_less_time(distances, times, total_dist, actual_dist + distance_to_next, 100, index+1);
        int dont_refuel = find_less_time(distances, times, total_dist, actual_dist + distance_to_next, available_dist - distance_to_next, index+1);

        return (table[index][available_dist] = std::min(refuel, dont_refuel));
    }
}

int less_time(std::vector<int> distances, std::vector<int> times, int total_dist){
    return find_less_time(distances, times, total_dist, 0, 100, 0);
}

int main(){
    int qt_fuel_stations;
    std::cout << "Qtd de postos" << std::endl;
    std::cin >> qt_fuel_stations;

    std::cout << "Distancia do inicio ao ponto final" << std::endl;
    int total_dist;
    std::cin >> total_dist;

    std::cout << "Distancias dos postos" << std::endl;
    std::vector<int> fuel_stations_distances(qt_fuel_stations, 0);
    for(auto& dist : fuel_stations_distances){
        std::cin >> dist;
    }

    std::cout << "Tempos de reabastecimentos dos postos" << std::endl;
    std::vector<int> fuel_stations_times(qt_fuel_stations, 0);
    for(auto& time : fuel_stations_times){
        std::cin >> time;
    }

    std::cout << less_time(fuel_stations_distances, fuel_stations_times, total_dist);
    return 0;
}
