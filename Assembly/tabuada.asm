.text
# Loop pro primeiro valor
main: addi $8, $0, 1
      addi $9, $0, 1
      addi $11, $0, 11
      addi $12, $0, 0
      addi $13, $0, 3

# $8 <- valor que est� sendo multiplicado ; $9 <- valor que multiplicar�
# $11 <- checa se os valores chegaram a 10
# $12 <- somador de qtd de linhas
# $10 <- resultado da multiplica��o

checkMultiplicando: slt $25, $8, $11
                    beq $25, $0, fimTabuada

checkMultiplicador: beq $9, $11, endActualMultiplicador
mul $10, $8, $9

add $4, $0, $8
addi $2, $0, 1
syscall
add $4, $0, 'x'
addi $2, $0, 11
syscall
add $4, $0, $9
addi $2, $0, 1
syscall

add $5, $0, $8
add $6, $0, $9
jal addEspacoAntesDoIgual

add $4, $0, '='
addi $2, $0, 11
syscall
add $4, $0, ' '
addi $2, $0, 11
syscall

add $5, $0, $10
jal addEspacoResultado

add $4, $0, $10
addi $2, $0, 1
syscall
add $4, $0, ' '
addi $2, $0, 11
syscall
add $4, $0, ' '
addi $2, $0, 11
syscall


# Checagem se o multiplicando est� no valor maximo
addi $14, $0, 10
beq $8, $14, limiteMultiplicador


# checagem se j� est� na terceira linha
addi $12, $12, 1
beq $12, $13, nextLine

returnPointNextLine: addi $8, $8, 1
beq $9, $11, addEspacosBlocos

j checkMultiplicador





#============================
# Desvios de fluxo (if elses)


limiteMultiplicador: add $4, $0, '\n'
	  	     addi $2, $0, 11
	  	     syscall
		     addi $9, $9, 1
          	     j checkMultiplicador


# Pula para a pr�xima linha caso o contador ($12) chega � 3
nextLine: add $4, $0, '\n'
	  addi $2, $0, 11
	  syscall
 	  addi $12, $0, 0
	  addi $8, $8, -3
	  addi $9, $9, 1
          j returnPointNextLine


endActualMultiplicador: addi $9, $0, 1
              		addi $8, $8, 3
              		j checkMultiplicando
              		
              		
addEspacosBlocos: add $4, $0, '\n'
		  addi $2, $0, 11
		  syscall
		  j checkMultiplicador


fimTabuada: addi $2, $0, 10
            syscall
            
            
#==================
# Funç�o addEspaco
# Testa e printa os espacos de maneira correta dependendo do resultado da multiplicacao
# Entradas: $5
# Registrador sujo: $14, $15
# Saida void
addEspacoResultado: addi $14, $0, 100
           div $5, $14
           mflo $15
           slt $15, $0, $15
           bne $15, $0, printCem
           # Testa se � divisivel por 10 caso n�o seja por 100
           addi $14, $0, 10
           div $5, $14
           mflo $15
           slt $15, $0, $15
           bne $15, $0, printDez
           add $4, $0, ' '
           addi $2, $0, 11
           syscall
           add $4, $0, ' '
           addi $2, $0, 11
           syscall
           jr $31
           
printCem: jr $31

printDez: add $4, $0, ' '
          addi $2, $0, 11
          syscall
          jr $31
          
          
#==================
# Funç�o addEspacoAntesDoIgual
# Testa e printa os espacos de maneira correta dependendo do tamanho do divisor/dividendo
# Entradas: $5, $6
# Registrador sujo: $14, $15, $16
# Saida void
addEspacoAntesDoIgual: addi $14, $0, 10
           div $5, $14
           mflo $15
           div $6, $14
           mflo $16
           beq $15, $16, tamanhosIguais
           j espacamentoDuplo
           
tamanhosIguais: beq $16, $0, espacamentoTriplo
                j espacamentoUnico
           
           
           
espacamentoUnico: add $4, $0, ' '
           	  addi $2, $0, 11
           	  syscall
           	  jr $31
           	  
espacamentoDuplo: add $4, $0, ' '
           	  addi $2, $0, 11
           	  syscall
           	  add $4, $0, ' '
           	  addi $2, $0, 11
           	  syscall
           	  jr $31
           
espacamentoTriplo: add $4, $0, ' '
           	   addi $2, $0, 11
           	   syscall
           	   add $4, $0, ' '
           	   addi $2, $0, 11
           	   syscall
           	   add $4, $0, ' '
           	   addi $2, $0, 11
           	   syscall
           	   jr $31
