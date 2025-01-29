#include <iostream>
#include <string>

class Solution {
public:
    bool isValid(std::string str) {
        bool valid = false;

        if(str.size() < 2){
            return false;
        }else if(str.size() > 2){
            char lastChar = str[(str.size() - 1)];
            if(lastChar == 40 || lastChar == 93 || lastChar == 123){
                return false;
            }else{
                char firstChar = str[0];
                if(firstChar == 41 || firstChar == 93 || firstChar == 125){
                    return false;
                }
            }
        }

        std::string buff = "";
        for(int i = 0; i < (str.size() - 1); i++){
            char checkChar = str[i];
            buff = "";

            for(int j = i + 1; j < str.size(); j++){
                if(checkChar == 40 && str[j] == 41){
                    valid = (buff != "") ? isValid(buff) : true;
                    break;
                }else if(checkChar == 91 && str[j] == 93){
                    valid = (buff != "") ? isValid(buff) : true;
                    break;
                }else if(checkChar == 123 && str[j] == 125){
                    valid = (buff != "") ? isValid(buff) : true;
                    break;
                }
                buff += str[j];
            }
        }
        return valid;
    }


};


int main(){
    std::string entry = "()";
    Solution s;
    std::cout << s.isValid(entry) << std::endl;
    return 0;
}
