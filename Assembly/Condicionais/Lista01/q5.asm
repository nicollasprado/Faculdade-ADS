.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      addi $2, $0, 5
      syscall
      add $10, $0, $2
      
      addi $13, $0, 1
      addi $14, $0, 2
      addi $15, $0, 3
      
      mul $8, $8, $13
      mul $9, $9, $14
      mul $10, $10, $15
      
      add $11, $8, $9
      add $11, $11, $10
      
      addi $24, $0, 6
      div $11, $24
      mflo $12
      
      addi $25, $0, 60
      slt $13, $12 $25
      beq $13, $0, approved
      add $4, $0, 'R'
      addi $2, $0, 11
      syscall
      add $4, $0, ' '
      syscall
      add $4, $0, $12
      addi $2, $0, 1
      syscall
      j end
      
approved: add $4, $0, 'A'
          addi $2, $0, 11
          syscall
          add $4, $0, ' '
          syscall
          add $4, $0, $12
          addi $2, $0, 1
          syscall
          j end
      
end: addi $2, $0, 10
     syscall