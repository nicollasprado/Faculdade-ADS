.text
main: addi $2, $0, 12
      syscall
      add $8, $0, $2
      
      # Conversão
      subi $9, $8, 32
      
      add $4, $0, '\n'
      addi $2, $0, 11
      syscall
      
      add $4, $0, $9
      addi $2, $0, 11
      syscall