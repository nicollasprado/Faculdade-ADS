.text
main: addi $8, $0, 11
      addi $9, $0, 1

test: beq $8, $9, ffor
      
      add $4, $0, $9
      add $2, $0, 1
      syscall
      
      jal printQL
      
      addi $9, $9, 1
      j test
      
ffor: addi $2, $0, 10
      syscall
      
#===================================================

# Funcao printQL para quebra de linha
# entrada: void
# saida: quebra de linha no terminal
# regs sujos: $2, $4

printQL: add $4, $0, '\n'
         add $2, $0, 11
         syscall
         jr $31