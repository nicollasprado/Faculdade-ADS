# Projeto de Algoritmos de Ordenação
Nesse projeto implementei os algoritmos de ordenação **Selection Sort**, **Insert Sort** e **Merge Sort**. Além disso, realizei testes de desempenho com diferentes tamanhos de listas.

## Objetivo
Entender esses algoritmos e análisar o desempenho de cada um deles por meio do entendimento das especificidades de cada um.

## Como Executar

### Pré requisitos
- [Compilador G++](https://sourceforge.net/projects/mingw-w64/)

### Compilando o código
- Entre na pasta atividade:
```
cd atividade
```
- Compile o código:
```
g++ -Wall -o teste_ordenacao teste_ordenacao.cpp ordenacao.cpp
```
> [!IMPORTANT]
> **CASO ALGUM ARQUIVO SEJA ALTERADO**, será necessário re-compilar o programa.

### Executando os testes
- Selection Sort
```
./teste_ordenacao -s < /testes/caso0{numero do caso}/{nome do arquivo de teste}
```
- Insert Sort
```
./teste_ordenacao -i < /testes/caso0{numero do caso}/{nome do arquivo de teste}
```
- Merge Sort
```
./teste_ordenacao -m < /testes/caso0{numero do caso}/{nome do arquivo de teste}
```

<br>

## Selection Sort
Esse algoritmo funciona selecionando o menor número da lista e trocando ele pelo index 0 da parte não ordenada.
<br>
Exemplificando:
<br>
[3, 9, 2, 4, 1, 5] -> [3, 9, 2, 4, **1**, 5] -> [**1**, 9, 2, 4, 3, 5]
<br>
[**1**, 9, 2, 4,3, 5] -> [**1**, 9, **2**, 4,3, 5] -> [**1**, **2**, 9, 4, 3, 5]
<br>
[**1**, **2**, 9, 4, 3, 5] -> [**1**, **2**, 9, 4, **3**, 5] -> [**1**, **2**, **3**, 4, 9, 5]
<br>
[**1**, **2**, **3**, **4**, 9, 5] -> [**1**, **2**, **3**, **4**, 9, **5**] -> [**1**, **2**, **3**, **4**, **5**, **9**]
<br>

### Big-O
A complexidade desse algoritmo é **O(n!)** por se tratar de **força bruta**.

### Pontos negativos
- Tem que iterar toda lista sempre que for buscar o menor valor.
  
<br>

## Insertion Sort
Esse algoritmo funciona separando a lista em duas - apenas idealmente, pois, a gente não cria listas separadas e sim separa índices - uma ordenada e uma não ordenada. Dessa forma, pegamos o valor do primeiro índice da lista não ordenada e inserimos ela na lista ordenada.
<br>
Exemplificando:
<br>
[**3**, 9, 2, 4, 1, 5] -> [**3**, **9**, 2, 4, 1, 5]
<br>
[**3**, **9**, 2, 4, 1, 5] -> [**2**, **3**, **9**, 4, 1, 5]
<br>
[**2**, **3**, **9**, 4, 1, 5] -> [**2**, **3**, **4**, **9**, 1, 5]
<br>
[**2**, **3**, **4**, **9**, 1, 5] -> [**1**, **2**, **3**, **4**, **9**, 5]
<br>
[**1**, **2**, **3**, **4**, **9**, 5] -> [**1**, **2**, **3**, **4**, **5**, **9**]
<br>

### Big-O
A complexidade desse algoritmo é **O(n²)** pois, no pior caso, cada valor ao ser inserido tem que verificar todos os números da lista ordenada.

### Pontos negativos
- Tem que iterar toda lista sempre que for buscar o menor valor.

### Ponto positivo
- Caso a lista ja esteja ordenada é **mais eficiente que o selection sort** só terá que iterar uma vez toda a lista.

<br>

## Merge Sort
Esse algoritmo funciona separando - recursivamente - a lista na metade até que sobrem apenas 1 elemento em cada lista separada e então realiza **merge** para juntar essas listas já ordenando-as.
<br>
Exemplificando:
<br>
[3, 9, 4, 2] -> [3, 9] [4, 2]
<br>

[3, 9] -> [3] [9]  
(MERGE) => [3, 9]
<br>

[4, 2] -> [4] [2]  
(MERGE) => [2, 4]
<br>

[2, 4] [3, 9]  
(MERGE) => [2, 3, 4, 9]
<br>

### Big-O
A complexidade desse algoritmo é sempre **O(n log n)** pois a lista está sendo dividida em 2 sempre e a cada retorno é feito o merge que é O(n).

### Ponto positivo
- Nível de complexidade boa e que se mantém mesmo no pior caso.
- Muito bom tanto para listas pequenas quanto grandes.

<br>

## Estatísticas de testes
Segundo as estatísticas dos testes o **selection sort** manteve um péssimo desempenho em todos casos, isso porque em qualquer caso temos que iterar toda a lista várias vezes. Além disso, o **insertion sort** foi o que mais teve oscilação no desempenho, isso por que no pior caso ele é O(n²) e no melhor caso é O(n). E por fim, o **merge sort** se manteve ótimo em todos os casos já que em qualquer situação ele é O(n log n).

<br>

<table>
   <caption>Caso 01</caption>
   <tr>
     <th>Tamanho</th>
     <th>Seleção</th>
     <th>Inserção</th>
     <th>Merge</th>
   </tr>
   <tr>
      <td>10000</td>
      <td>23 ms</td>
      <td>6 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>20000</td>
      <td>88 ms</td>
      <td>25 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>30000</td>
      <td>200 ms</td>
      <td>60 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>40000</td>
      <td>353 ms</td>
      <td>110 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>50000</td>
      <td>552 ms</td>
      <td>170 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>60000</td>
      <td>790 ms</td>
      <td>240 ms</td>
      <td>4 ms</td>
   </tr>
   <tr>
      <td>70000</td>
      <td>1085 ms</td>
      <td>335 ms</td>
      <td>5 ms</td>
   </tr>
   <tr>
      <td>80000</td>
      <td>1420 ms</td>
      <td>432 ms</td>
      <td>5 ms</td>
   </tr>
   <tr>
      <td>90000</td>
      <td>1800 ms</td>
      <td>551 ms</td>
      <td>6 ms</td>
   </tr>
   <tr>
      <td>100000</td>
      <td>2240 ms</td>
      <td>680 ms</td>
      <td>7 ms</td>
   </tr>
</table>
<img src="https://i.imgur.com/1wVTA1o.png" width=600em/>

<br>
<br>

<table>
   <caption>Caso 02</caption>
   <tr>
     <th>Tamanho</th>
     <th>Seleção</th>
     <th>Inserção</th>
     <th>Merge</th>
   </tr>
   <tr>
      <td>10000</td>
      <td>23 ms</td>
      <td>11 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>20000</td>
      <td>88 ms</td>
      <td>44 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>30000</td>
      <td>200 ms</td>
      <td>100 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>40000</td>
      <td>353 ms</td>
      <td>179 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>50000</td>
      <td>552 ms</td>
      <td>282 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>60000</td>
      <td>790 ms</td>
      <td>404 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>70000</td>
      <td>1085 ms</td>
      <td>555 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>80000</td>
      <td>1420 ms</td>
      <td>717 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>90000</td>
      <td>1800 ms</td>
      <td>920 ms</td>
      <td>2 ms</td>
   </tr>
   <tr>
      <td>100000</td>
      <td>2240 ms</td>
      <td>1119 ms</td>
      <td>2 ms</td>
   </tr>
</table>
<img src="https://i.imgur.com/UPwPXUM.png" width=600em/>

<br>
<br>

<table>
   <caption>Caso 03</caption>
   <tr>
     <th>Tamanho</th>
     <th>Seleção</th>
     <th>Inserção</th>
     <th>Merge</th>
   </tr>
   <tr>
      <td>10000</td>
      <td>23 ms</td>
      <td>1 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>20000</td>
      <td>88 ms</td>
      <td>8 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>30000</td>
      <td>200 ms</td>
      <td>19 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>40000</td>
      <td>353 ms</td>
      <td>36 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>50000</td>
      <td>552 ms</td>
      <td>56 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>60000</td>
      <td>790 ms</td>
      <td>81 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>70000</td>
      <td>1085 ms</td>
      <td>110 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>80000</td>
      <td>1420 ms</td>
      <td>145 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>90000</td>
      <td>1800 ms</td>
      <td>183 ms</td>
      <td>2 ms</td>
   </tr>
   <tr>
      <td>100000</td>
      <td>2240 ms</td>
      <td>228 ms</td>
      <td>2 ms</td>
   </tr>
</table>
<img src="https://i.imgur.com/oUuGhcn.png" width=600em/>

<br>
<br>

<table>
   <caption>Caso 04</caption>
   <tr>
     <th>Tamanho</th>
     <th>Seleção</th>
     <th>Inserção</th>
     <th>Merge</th>
   </tr>
   <tr>
      <td>10000</td>
      <td>23 ms</td>
      <td>6 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>20000</td>
      <td>88 ms</td>
      <td>25 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>30000</td>
      <td>200 ms</td>
      <td>60 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>40000</td>
      <td>353 ms</td>
      <td>110 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>50000</td>
      <td>552 ms</td>
      <td>170 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>60000</td>
      <td>790 ms</td>
      <td>413 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>70000</td>
      <td>1085 ms</td>
      <td>555 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>80000</td>
      <td>1420 ms</td>
      <td>722 ms</td>
      <td>4 ms</td>
   </tr>
   <tr>
      <td>90000</td>
      <td>1800 ms</td>
      <td>910 ms</td>
      <td>4 ms</td>
   </tr>
   <tr>
      <td>100000</td>
      <td>2240 ms</td>
      <td>1121 ms</td>
      <td>5 ms</td>
   </tr>
</table>
<img src="https://i.imgur.com/MJ3mY0m.png" width=600em/>

<br>
<br>

<table>
   <caption>Caso 05</caption>
   <tr>
     <th>Tamanho</th>
     <th>Seleção</th>
     <th>Inserção</th>
     <th>Merge</th>
   </tr>
   <tr>
      <td>10000</td>
      <td>23 ms</td>
      <td>2 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>20000</td>
      <td>88 ms</td>
      <td>9 ms</td>
      <td>0 ms</td>
   </tr>
   <tr>
      <td>30000</td>
      <td>200 ms</td>
      <td>20 ms</td>
      <td>1 ms</td>
   </tr>
   <tr>
      <td>40000</td>
      <td>353 ms</td>
      <td>36 ms</td>
      <td>2 ms</td>
   </tr>
   <tr>
      <td>50000</td>
      <td>552 ms</td>
      <td>59 ms</td>
      <td>2 ms</td>
   </tr>
   <tr>
      <td>60000</td>
      <td>790 ms</td>
      <td>85 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>70000</td>
      <td>1085 ms</td>
      <td>111 ms</td>
      <td>3 ms</td>
   </tr>
   <tr>
      <td>80000</td>
      <td>1420 ms</td>
      <td>151 ms</td>
      <td>4 ms</td>
   </tr>
   <tr>
      <td>90000</td>
      <td>1800 ms</td>
      <td>190 ms</td>
      <td>4 ms</td>
   </tr>
   <tr>
      <td>100000</td>
      <td>2240 ms</td>
      <td>240 ms</td>
      <td>6 ms</td>
   </tr>
</table>
<img src="https://i.imgur.com/XYrovqg.png" width=600em/>
