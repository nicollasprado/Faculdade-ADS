#include <iostream>

int main(){
    int qtTurmas, qtAlunos;
    std::cin >> qtTurmas;
    
    double maiorMedia = 0.0;
    int maiorMediaTurma;
    for(int i=1; i <= qtTurmas; i++){
        std::cout << "Digite a quantidade de alunos da turma " << i << ":" << std::endl;
        std::cin >> qtAlunos;

        double media = 0.0;
        for(int j=1; j <= qtAlunos; j++){
            double nota = 0.0;
            std::cin >> nota;
            media += nota;
        }

        media = media / qtAlunos;
        if(media > maiorMedia){
            maiorMedia = media;
            maiorMediaTurma = i;
        }
    }

    std::cout << "A turma com maior média foi: " << maiorMediaTurma << " Com a média: " << maiorMedia << std::endl;


    return 0;
}