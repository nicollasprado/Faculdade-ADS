.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      add $10, $8, $9
      addi $11, $0, 2
      div $10, $11
      mflo $12
      mfhi $13
      add $4, $0, $12
      addi $2, $0, 1
      syscall
      
      add $4, $0, '.'
      addi $2, $0, 11
      syscall
      
      #divisão do resto da primeira divisao + print do valor
      addi $14, $0, 10
      mul $15, $13, $14
      div $16, $15, $11
      mflo $17
      add $4, $0, $17
      addi $2, $0, 1
      syscall
