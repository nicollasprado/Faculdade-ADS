.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      addi $2, $0, 5
      syscall
      add $10, $0, $2
      
      # Nota * Peso
      sll $24, $8, 1
      add $8, $24, $8
      sll $24, $9, 3
      add $9, $24, $9
      sll $24, $10, 4
      sub $10, $24, $10
      
      # Soma das três notas multiplicadas
      add $11, $8, $9
      add $11, $11, $10
      
      # divisão pela soma dos pesos
      addi $12, $0, 27
      div $11, $12
      mflo $13
      mfhi $14
      
      # calculo do valor depois da virgula
      sll $14, $14, 3
      div $14, $12
      mflo $15
      
      add $4, $0, $13
      addi $2, $0, 1
      syscall
      
      add $4, $0, '.'
      addi $2, $0, 11
      syscall
      
      add $4, $0, $15
      addi $2, $0, 1
      syscall