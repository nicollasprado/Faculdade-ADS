.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $10, $0, 10
      
      # Printando invertido
      div $8, $10
      mflo $14
      mfhi $15
      add $4, $0, $15
      addi $2, $0, 1
      syscall
      
      div $14, $10
      mflo $14
      mfhi $15
      add $4, $0, $15
      addi $2, $0, 1
      syscall
      
      div $14, $10
      mflo $14
      mfhi $15
      add $4, $0, $15
      addi $2, $0, 1
      syscall
      
      