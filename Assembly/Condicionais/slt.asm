.text
main: addi $2, $0, 5
      syscall
      add $8, $2, $0
      syscall
      add $9, $2 , $0
      
      # Testa se são diferentes, se forem, vá para 'diff'
      bne $8, $9, diff
      add $4, $0, '='
      addi $2, $0, 11
      j print
      
      # Condicional menor que
diff: slt $10, $8, $9 # Se ($8 < $9) $10 = 1 ; se não $10 = 0
      addi $2, $0, 1
      beq $10, $0, minor9
      add $4, $0, $8
      j print
        
minor9: add $4, $0, $9
	j print

print: syscall
       j end
       
end: addi $2, $0, 10
     syscall