#include <iostream>
#include <vector>


class Solution {
public:
    std::string longestCommonPrefix(std::vector<std::string>& strs) {
        std::string solution = "";
        std::vector<std::string> commonPrefixes;
        int smallestStringIndex = smallestString(strs);
        std::string smallestString = strs[smallestStringIndex];

        if(strs.size() == 1){
            solution = strs[0];
        }else{
            for(int i = 0; i < smallestString.size(); i++){ // Loops through the smallestString to get the prefix
                std::string prefix = getPrefix(smallestString, i+1, 0);
                int counterCommonPrefixCounter = 1;

                for(int j = 0; j < strs.size(); j++){ // Loops through the strings in vector strs
                    if(j == smallestStringIndex){
                        continue;
                    }else{
                        if(checkPrefixMatch(strs[j], prefix)){
                            counterCommonPrefixCounter++;
                        }

                        if(counterCommonPrefixCounter == strs.size()){
                            commonPrefixes.push_back(prefix);
                       }
                    }
                }
            }

            if(commonPrefixes.size() > 0){
                if(commonPrefixes.size() > 1){
                    int longestCommonPrefix = 0;
                    for(int k = 1; k < commonPrefixes.size(); k++){
                        if(commonPrefixes[k].size() > commonPrefixes[longestCommonPrefix].size()){
                            longestCommonPrefix = k;
                        }
                    }
                    solution = commonPrefixes[longestCommonPrefix];
                }else{
                    solution = commonPrefixes[0];
                }
            }
        }

        return solution;
    }
private:
    int smallestString(std::vector<std::string>& strs){
        int smallestStringIndex = 0;
        for(int i = 1; i < strs.size(); i++){
            if(strs[smallestStringIndex].size() > strs[i].size()){
                smallestStringIndex = i;
            }
        }
        return smallestStringIndex;
    }

    std::string getPrefix(std::string str, int prefixSize, int start){
        std::string finalPrefix = "";
        for(int i = start; i < prefixSize; i++){
            finalPrefix += str[i];
        }

        return finalPrefix;
    }

    bool checkPrefixMatch(std::string toCheckStr, std::string prefix){
        for(int i = 0; i < toCheckStr.size(); i += prefix.size()){
            std::string toCheckStrPrefix = getPrefix(toCheckStr, prefix.size(), i);

            if(toCheckStrPrefix == prefix){
                return true;
            }

            if(i + prefix.size() > toCheckStr.size()){
                break;
            }
        }
        return false;
    }
};

int main(){
    std::vector<std::string> strs = {"ab", "a"};
    Solution s;
    std::string returno = s.longestCommonPrefix(strs);

    std::cout << returno << std::endl;
    return 0;
}
