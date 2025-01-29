#include <iostream>
#include <vector>

int main(){
    int qtNums;
    std::cin >> qtNums;
    std::vector<int> nums(qtNums);
    for(int i=0; i < qtNums; i++){
        std::cin >> nums[i];
    }

    std::vector<int> sequences;
    int buffer[2];
    int seqCounter = 0;
    int nextNumSelector = 0;
    for(int j=0; j < qtNums-1; j++){ // qtNums-1 bcause we need at least 2 nums to make pairs
        // after test all j we should increase the buffers and reset variables before start next check
        buffer[0] = nums[j];
        for(int r = j + 1; r < qtNums-1; r++){
            buffer[1] = nums[r];
            if(buffer[0] == buffer[1]){
                continue;
            }
            seqCounter = 0;
            nextNumSelector = 0;
            for(int k = j; k < qtNums; k++){
                if((nextNumSelector == 0 && nums[k] == buffer[0]) || (nextNumSelector == 1 && nums[k] == buffer[1])){
                    seqCounter++;
                    nextNumSelector = 1 - nextNumSelector; // intercalate between 0 and 1 to define which buffer we trying to find
                }
            }

            if(seqCounter > 0){
                sequences.push_back(seqCounter);
                continue;
            }

        }
    }

    int qtSequences = static_cast<int>(sequences.size());
    int highest = 1;
    if(qtSequences == 0){
        if(qtNums > 1){
            for(int n=0; n < qtNums-1; n++){
                if(nums[n] != nums[n+1]){
                    highest = 2;
                    break;
                }
            }
        }
    }else if(qtSequences > 1){
        highest = sequences[0];
        for(int l=1; l < qtSequences; l++){
            if(sequences[l] > highest){
                highest = sequences[l];
            }
        }
    }

    std::cout << highest << std::endl;
    return 0;
}
