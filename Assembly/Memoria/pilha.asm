.text
main: addi $2, $0, 5
      syscall
      
      add $4, $0, $2
      jal fatorial
      
      add $4, $0, $2
      addi $2, $0, 1
      syscall






#========================
# Função fatorial
# entrada: $4
# saida: $2
# reg não preservados: $8
# rotulos usados: fatorial, fimFat
fatorial: sw $31, 0($sp) # Armazena na pilha - na localização (0 + $29) - o valor de $31
          addi $sp, $sp, -4 # Atualiza o ponteiro do endereço de memoria da pilha
          
          add $15, $0, $4
          
testeFat: beq $8, $4, multiplicar # Se o contador for igual à entrada, break
         
          sub $4, $15, $8 # Pega o multiplicando atual
          addi $8, $8, 1
          
          sw $4, 0($sp) # Salva o multiplicando na pilha
          addi $sp, $sp, -4
          
          j testeFat
          
multiplicar: addi $8, $8, -1
             addi $sp, $sp, 4
             lw $4, 0($29) # Recupera o dado na pilha - na localização (0 + $29) - e coloca no $4
             beq $8, $4, fimFat
             mul $2, $2, $4
             j multiplicar
             
fimFat: addi $sp, $sp, 4
        lw $31, 0($29) # Recupera o dado na pilha - na localização (0 + $29) - e coloca no $31
        jr $31