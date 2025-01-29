.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $9, $0, 10
      
      div $8, $9
      mflo $15
      mfhi $16
      add $10, $0, $16
      
      div $15, $9
      mflo $15
      mfhi $16
      add $10, $10, $16
      
      div $15, $9
      mflo $15
      mfhi $16
      add $10, $10, $16
      
      div $15, $9
      mflo $15
      mfhi $16
      add $10, $10, $16
      
      add $4, $0, $10
      addi $2, $0, 1
      syscall
      