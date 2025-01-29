.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      
      # Horas para segundos => Reg 15
      addi $14, $0, 3600
      mul $15, $8, $14
      
      # Minutos para segundos => Reg 16
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      addi $14, $0, 60
      mul $16, $9, $14
      
      addi $2, $0, 5
      syscall
      add $10, $0, $2
      # Soma total
      add $17, $10, $15
      add $17, $17, $16
      
      add $4, $0, $17
      addi $2, $0, 1
      syscall