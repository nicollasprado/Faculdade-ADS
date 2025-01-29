.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $10, $0, 10
      
      div $8, $10
      mfhi $9
      mflo $11
      add $4, $0, $9
      addi $2, $0, 1
      syscall
      
      div $11, $10
      mfhi $9
      mflo $11
      add $4, $0, $9
      addi $2, $0, 1
      syscall
      
      div $11, $10
      mfhi $9
      mflo $11
      add $4, $0, $9
      addi $2, $0, 1
      syscall
      
      div $11, $10
      mfhi $9
      mflo $11
      add $4, $0, $9
      addi $2, $0, 1
      syscall