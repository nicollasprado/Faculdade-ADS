.text
main: addi $2, $0, 5
      syscall
      add $8, $2, $0
      syscall
      add $9, $2 , $0
      
      # Print do primeiro valor
      add $4, $0, $8
      addi $2, $0, 1
      syscall
      
      # Se forem iguais vá para "equals"
      beq $8, $9, equals
      add $4, $0, '%'
      # vá para print
      j print
      
equals: add $4, $0, '='

print: addi $2, $0, 11
       syscall
       
       add $4, $0, $9
       addi $2, $0, 1
       syscall