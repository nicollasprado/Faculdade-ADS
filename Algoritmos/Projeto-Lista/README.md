# Projeto Lista ![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg) [![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://lbesson.mit-license.org/)
Nesse projeto criei minha própria implementação de um **Array List com alocação dinâmica** e uma **Lista Duplamente Ligada** que simulam estruturas de dados como a lista do python e arraylist do java.

## Objetivo
Projeto criado com objetivo de desenvolver minhas habilidades com estruturas de dados mais complexas, interação com a memória do computador e análise de algoritmos.

## Pré requisitos
- [Compilador G++](https://sourceforge.net/projects/mingw-w64/)

<br>

## Array List
Estrutura de dado feita com alocação dinâmica, nela temos que liberar manualmente a memória alocada e é menos eficiente que a **Linked List** nas operações de inserção e remoção em índices específicos pois temos que percorrer toda a lista para trocar as posições dos elementos.

```
void increase_capacity(){
  capacity_ = capacity_ * 2;

  // Criação do novo espaço de memória com mais capacidade
  int* new_mem_loc = new int[capacity_];

  // Loop para adicionar os itens já presentes na lista para o novo espaço de memória
  for(unsigned int i = 0; i < size_; i++){
      new_mem_loc[i] = data[i];
  }

  // Mudança do ponteiro data para o novo espaço de memória com mais capacidade
  // e liberação da memória do espaço antigo
  int* old_data = data;
  data = new_mem_loc;
  delete [] old_data;
}
```

## Linked List
Estrutura de dado feita com lista duplamente ligada, nela alocamos um **novo espaço de memória para cada nó dinamicamente** e cada nó aponta para o próximo e o anterior. Sendo assim, esta estrutura de dado é mais eficiente para operações de inserção e remoção, entretanto, quando temos que achar um valor específico temos que percorrer a lista, sendo menos eficiente que o **ArrayList**.

```
void push_back(int value){
    if(size_ == 0){
        // Criação do novo nó
        int_node* new_val = new int_node;
        new_val->value = value;

        // Como neste caso a lista está vazia, o próximo nó e o anterior seráo NULL
        new_val->next = nullptr;
        new_val->prev = nullptr;

        // Como neste caso a lista está vazia, o HEAD e o TAIL apontarão para o novo nó
        head = new_val;
        tail = new_val;
    }else{
        // Criação do novo nó
        int_node* new_val = new int_node;
        new_val->value = value;

        // Como o nó está sendo adicionado no fim, o próximo nó será NULL e o anterior será o nó apontado por TAIL
        new_val->next = nullptr;
        new_val->prev = tail;

        // Muda o ponteiro de próximo nó do ANTIGO TAIL para o novo nó
        tail->next = new_val;

        // Muda o ponteiro TAIL para o novo nó
        tail = new_val;
    }

    size_++;
}
```

<br>

## Métodos

#### Busca
- size() => Retorna a quantidade de elementos na lista;
- capacity() => Retorna a quantidade de espaços totais na lista; **Somente ArrayList**
- percent_occupied() => Retorna um double, de 0.0 a 1.0, que representa a porcentagem ocupada da lista; **Somente ArrayList**
- back() => Retorna o último elemento da lista;
- front() => Retorna o primeiro elemento da lista;
- sum() => Retorna a soma dos elementos da lista;
- count(int valor) => Retorna a quantidade de elementos encontrados na lista do valor especificado;
- find_first(int valor) => Retorna o menor index encontrado do valor especificado, caso não seja encontrado retorna -1;
- find_all(int valor) => Retorna, em forma de ArrayList, todos index do valor especificado;
- get_at(unsigned int index) => Retorna o valor do índice expecificado.

#### Adição
- push_back(int valor) => Adiciona no fim da lista o valor especificado;
- push_front(int valor) => Adiciona no index 0 o valor espeficiado;
- insert_at(unsigned int index, int valor) => Adiciona no index especificado o valor especificado.

#### Remoção
- clear() => Remove todos elementos da lista;
- pop_back() => Remove o último elemento da lista;
- pop_front() => Remove o primeiro elemento da lista;
- remove_first(int valor) => Remove o primeiro elemento encontrado do valor especificado;
- remove_quantity(int valor, unsigned int quantidade) => Remove a quantidade especificada do valor especificado;
- remove_at(unsigned int index) => Remove o elemento do index especificado.

<br>

## Testes Unitários
Para realizar os testes unitários é bem simples, basta seguir esse passo-a-passo:

- Abrir o terminal;
- Ir até o diretório de testes:
```
cd {Caminho do diretório principal}/Tests/Unit-Tests
```
- Rodar o arquivo executável:
#### ArrayList
```
./run_arraylist_tests
```
#### LinkedList
```
./run_linkedlist_tests
```

<br>

> [!IMPORTANT]
> **CASO ALGUM ARQUIVO SEJA ALTERADO**, será necessário re-compilar o arquivo de testes, basta usar o seguinte comando:
#### ArrayList
```
g++ arraylist_unit_tests.cpp -o run_arraylist_tests
```
#### LinkedList
```
g++ linkedlist_unit_tests.cpp -o run_linkedlist_tests
```

<br>

## Testes de Desempenho
Para realizar os testes de desempenho basta seguir esse passo-a-passo:

- Abrir o terminal;
- Ir até o diretório de testes:
```
cd {Caminho do diretório principal}/Tests/Performance-Tests
```
- Rodar o arquivo executável:
```
./run_performance_tests
```

<br>

> [!IMPORTANT]
> **CASO ALGUM ARQUIVO SEJA ALTERADO**, será necessário re-compilar o arquivo de testes, basta usar o seguinte comando:

```
g++ performance_tests.cpp -o run_performance_tests
```

<br>

## Resultado da Análise dos Desempenhos das Funções
Após analisar os tempos de execução das funções em ArrayList e LinkedList e também levando em consideração a forma específica de como cada lista funciona, é possível realizar as seguintes conclusões:
<br>
- **ArrayList** tem um desempenho superior nas operações de busca, por exemplo: get_at, find_first e find_all.
<div>
  <img src="https://i.imgur.com/swdrxHP.png" width=400em/>
  <img src="https://i.imgur.com/KmFk9Zj.png" width=400em/>
</div>
<br>

- **LinkedList** tem um desempenho superior nas operações de inserção e remoção, por exemplo: insert_at, pop_front e remove_at.
<div>
  <img src="https://i.imgur.com/wm51eoA.png" width=400em/>
  <img src="https://i.imgur.com/7e0rLj2.png" width=400em/>
</div>

### Explicação
<hr>
<p>Isso se deve à forma como cada lista trata seu conteúdo.</p>
<p>Em operações de busca o <b>arraylist</b> é superior pois nós <b>temos o "índice" de cada espaço na memória</b>, já na linkedlist temos que ir de nó em nó até achar o valor solicitado.</p>
<p>Agora, do ponto de vista da <b>linkedlist</b>, o fato dela ser melhor para operações de inserção e remoção se deve pela estrutura da lista duplamente ligada, onde cada nó apenas aponta para o próximo e anterior nó, sendo assim, por exemplo, quando chamamos a função <b>pop_front, somente é trocado o ponteiro "anterior" do segundo nó da lista</b> e liberar a memória do primeiro.</p>
