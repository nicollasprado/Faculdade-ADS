.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      # checks if person are 65 years old
      addi $25, $0, 65
      slt $24, $8, $25
      beq $24, $0, able
      
      # checks if person worked for at least 40 years
      addi $25, $0, 40
      slt $24, $9, $25
      beq $24, $0, able
      
      # Checks if person are at least 60 years old
      addi $25, $0, 59
      slt $24, $8, $25
      beq $24, $0, plus60
      
      j notAble
      
        # Checks if person worked at least 35 years
plus60: addi $25, $0, 35
        slt $24, $9, $25
        beq $24, $0, able
        j notAble
   
able: add $4, $0, 'S'
      addi $2, $0, 11
      syscall
      j end 

notAble: add $4, $0, 'N'
         addi $2, $0, 11
         syscall
         j end
         
end: addi $2, $0, 10
     syscall