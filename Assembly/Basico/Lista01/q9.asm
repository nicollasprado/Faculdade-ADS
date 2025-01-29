.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      
      # Obter as horas
      addi $9, $0, 3600
      div $8, $9
      mflo $15
      mfhi $10
      
      # Obter os minutos
      addi $9, $0, 60
      div $10, $9
      mflo $16
      mfhi $10
      
      # Resultado
      add $4, $0, $15
      addi $2, $0, 1
      syscall
      
      add $4, $0, ':'
      addi $2, $0, 11
      syscall
      
      add $4, $0, $16
      addi $2, $0, 1
      syscall
      
      add $4, $0, ':'
      addi $2, $0, 11
      syscall
      
      add $4, $0, $10
      addi $2, $0, 1
      syscall