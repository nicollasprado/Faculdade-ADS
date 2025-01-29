.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      addi $2, $0, 5
      syscall
      add $9, $0, $2
      
      add $4, $0, $8
      add $5, $0, $9
      jal pot
      add $4, $0, $2
      addi $2, $0, 1
      syscall
      
      addi $2, $0, 10
      syscall
      
#==================================

# Funcao pot para calcular potencia
# calculo: pow($4, $5) ou $4 ^ $5
# entradas: $4 e $5
# saida: $2
# alterados: $8, $9
# rotulos: for, fimfor

pot: add $25, $0, $31
     addi $8, $0, 0x000000001 # elemento neutro da multiplicacao (1 em Hexadecimal)
     add $9, $0, $5
for: beq $9, $0, fimfor
     mul $8, $8, $4
     addi $9, $9, -1
     j for

fimfor: jal testFuncaoAninhada
        add $2, $0, $8
        add $31, $0, $25
        jr $31
        
#================================
        
testFuncaoAninhada: jr $31