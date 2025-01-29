.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5 # codigo para ler inteiro
      syscall
      add $9, $0, $2

      addi $8, $0, 7 # 8 <= $0 + 7
      addi $9, $0, 5 # $9 <= $0 + 5
      add $10, $8, $9 # $10 <= $8 + $9
      sub $11, $8, $9 # $11 <= $8 - $9
      mul $12, $8, $9 # $12 <= $8 * $9
      div $8, $9 # Hi <= $8 % $9
      		 # Lo <= $8 // $9
      mflo $13
      mfhi $14
      
      
      # atividade
      addi $15, $8, 2
      addi $15, $15, 3
      sub $16, $15, 5
      sub $16, $16, 8
      mul $17, $16, $15
      mul $17, $17, 2
      div $18, $17, $14
      div $18, $18, 2
      
      add $4, $0, $18
      addi $2, $0, 1 # codigo de printar um inteiro
      syscall
      
      add $4, $0, '\n'
      addi $2, $0, 11 # codigo de printar caracter
      syscall
      
      add $4, $0, $17
      addi $2, $0, 1
      syscall
      
      sll $19, $18, 2 # desloca para esquerda
      srl $20, $18, 2 # desloca para direita
      sra $21, $18, 2 # desloca para direita preservando o sinal (aritmetico)
