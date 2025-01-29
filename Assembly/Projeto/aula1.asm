.text
main: lui $8, 0x1001 # Endereço inicial
      ori $9, $0, 0xff00 # Salva a cor no reg $9
      
      # Loop de 32 iterações
      addi $20, $0, 78
test: beq $20, $0, fiml
      addi $10, $0, 47
      addi $11, $0, 32
      
      slt $10, $20, $10 # testa se $20 está abaixo da iteração 97
      slt $11, $11, $20 # Testa se $20 está acima da iteração 32
      slt $10, $0, $10 # Testa se os slt resultaram 0
      slt $11, $0, $11
      beq $10, $11, column
      
      sw $9, 0($8)
      addi $8, $8, 4
      
      addi $20, $20, -1
      j test
      
column: sw $9, 0($8)
        addi $8, $8, 124
        sw $9, 0($8)
        addi $8, $8, 4
      
        addi $20, $20, -1
        j test
      
fiml: addi $2, $0, 10
      syscall
