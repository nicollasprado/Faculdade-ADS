#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

int MAX = 100000000;

int find_less_time(std::vector<int> distances, std::vector<int> times, int total_dist, int actual_dist, int available_dist, int index){
    if(actual_dist >= total_dist) return 0;
    if(available_dist <= 0) return MAX;

    int distance_to_next = std::abs(actual_dist - distances[index]);
    int refuel = times[index] + find_less_time(distances, times, total_dist, actual_dist + distance_to_next, 100, index+1);
    int dont_refuel = find_less_time(distances, times, total_dist, actual_dist + distance_to_next, available_dist - distance_to_next, index+1);

    return std::min(refuel, dont_refuel);
}

int less_time(std::vector<int> distances, std::vector<int> times){
    return find_less_time(distances, times, distances[distances.size()-1], 0, 100, 0);
}

int main(){
    int qt_fuel_stations;
    std::cout << "Qtd de postos" << std::endl;
    std::cin >> qt_fuel_stations;

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

    std::cout << less_time(fuel_stations_distances, fuel_stations_times);
    return 0;
}
