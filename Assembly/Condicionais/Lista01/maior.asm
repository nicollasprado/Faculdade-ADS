.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      slt $10, $8, $9
      beq $10, $0, maior8
      add $4, $0, $9
      j print
      
maior8: add $4, $0, $8
        j print
        
print: addi $2, $0, 1
       syscall
       j end
       
end: addi $2, $0, 10
     syscall