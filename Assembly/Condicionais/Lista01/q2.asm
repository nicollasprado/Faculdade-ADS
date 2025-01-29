.text
main: addi $2, $0, 5
      syscall
      
      slt $8, $2, $0
      beq $8, $0, positive
      mul $9, $2, $2
      j print
      
positive: add $9, $2, $2
          j print
          
print: add $4, $0, $9
       addi $2, $0, 1
       syscall
       j end
       
end: addi $2, $0, 10
     syscall