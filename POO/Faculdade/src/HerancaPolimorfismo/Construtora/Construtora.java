package HerancaPolimorfismo.Construtora;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Construtora {
    private List<Funcionario> funcionarios = new ArrayList<>();


    public Construtora(){}

    public Construtora(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }



    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }



    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public List<Engenheiro> getEngenheiros(){
        List<Engenheiro> engenheiros = new ArrayList<>();
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Engenheiro){
                engenheiros.add((Engenheiro) funcionarios.get(i));
            }
        }
        // funcionarios.stream().filter(funcionario -> funcionario instanceof Engenheiro);
        return engenheiros;
    }

    public List<Motorista> getMotoristas(){
        List<Motorista> motoristas = new ArrayList<>();
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) instanceof Motorista){
                motoristas.add((Motorista) funcionarios.get(i));
            }
        }
        return motoristas;
    }
}
