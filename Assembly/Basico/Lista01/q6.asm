.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $10, $0, 10
      addi $11, $0, 100
      
      div $8, $11
      mfhi $15
      mflo $16
      add $4, $0, $16
      addi $2, $0, 1
      syscall
      
      div $15, $10
      mfhi $15
      mflo $16
      add $4, $0, $16
      addi $2, $0, 1
      syscall
      
      div $15, $10
      mfhi $15
      mflo $16
      add $4, $0, $15
      addi $2, $0, 1
      syscall