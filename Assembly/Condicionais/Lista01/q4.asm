.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      slt $10, $8, $9
      slt $11, $9, $8
      beq $10, $11, equals
      
      beq $10, $0, lesser9
      add $4, $0, $8
      addi $2, $0, 1
      syscall
      add $4, $0, '<'
      addi $2, $0, 11
      syscall
      add $4, $0, $9
      addi $2, $0, 1
      syscall
      j end
      
lesser9: add $4, $0, $8
         addi $2, $0, 1
         syscall
         add $4, $0, '>'
         addi $2, $0, 11
         syscall
         add $4, $0, $9
         addi $2, $0, 1
         syscall
         j end
      
equals: add $4, $0, $8
        addi $2, $0, 1
        syscall
        add $4, $0, '='
        add $2, $0, 11
        syscall
        add $4, $0, $9
        addi $2, $0, 1
        syscall
        j end
        
end: addi $2, $0, 10
     syscall