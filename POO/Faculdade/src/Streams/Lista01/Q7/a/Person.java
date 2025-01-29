package Streams.Lista01.Q7.a;

public class Person {
    private String name;
    private Integer idade;


    public Person(Integer idade, String name) {
        this.idade = idade;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
