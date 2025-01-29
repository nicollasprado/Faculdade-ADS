.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      slt $10, $8, $9
      beq $10, $0, menor9
      sub $10, $9, $8
      add $11, $0, $9
      j print
      
menor9: sub $10, $8, $9
        add $11, $0, $8
        j print
        
print: add $4, $0, 'M'
       addi $2, $0, 11
       syscall
       add $4, $0, ' '
       syscall
       
       add $4, $0, $11
       addi $2, $0, 1
       syscall
       add $4, $0, '\n'
       addi $2, $0, 11
       syscall
       
       add $4, $0, 'D'
       addi $2, $0, 11
       syscall
       add $4, $0, ' '
       syscall
       
       add $4, $0, $10
       addi $2, $0, 1
       syscall
       j end
       
end: addi $2, $0, 10
     syscall