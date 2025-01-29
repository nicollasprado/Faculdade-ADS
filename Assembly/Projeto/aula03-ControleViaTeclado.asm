.text
main: lui $8, 0x1001
      addi $9, $0, 512 # Exemplo em 16x16
      
      ori $5, $0, 0xffff # $5 = 0x0000ffff  ->  Limitador dos numeros aleatorios para gerar cores validas
      sll $5, $5, 8      # sll $5 8 -> 0xffff00 ; range de 0 - 0xffff00
      
scenario: beq $9, $0, fimScr

	  addi $2, $0, 42 # Gera��o de numeros aleatorios; $5 fica o limite superior da fun��o 42
	  syscall
	  # $4 ($a0) � o retorno da fun��o 42
	  sw $4, 0($8) # Gera��o do cen�rio
	  sw $4, 2048($8) # Gera��o da c�pia
	  
	  addi $8, $8, 4 # Proximo registrador
          addi $9, $9, -1
	  j scenario
	  
fimScr:
	  lui $8, 0x1001
	  ori $20, 0xffffff # Ori so aceita 16 bits no immediato entretanto ele dar� um jeito
	  addi $10, $0, 512
	  
	  lui $21, 0xffff # Armazena o endere�o de memoria que armazena 1 se tiver alguma entrada do teclado e 0 se n�o
	  
	  # Constants
	  addi $t9, $0, 32 # Armazena o valor ascii do espa�o
	  addi $10, $0, 4 # Constante de deslocamento
	  addi $11, $0, 'e' # Armazena o valor ascii do e
	  addi $12, $0, 'd' # Armazena o valor ascii do d
	  
animationFor:

	  sw $s1, 0($t0)    # Sobrescri��o do ponto branco na primeira unidade gr�fica
	  jal timer
	  
	  lw $t1, 2048($t0) # Recupera o valor do cenario armazenado
	  sw $t1, 0($t0)    # Sobrescri��o do cenario inicial na primeira unidade gr�fica
	  add $t0, $t0, $t2
	  
	  lw $22, 0($21) # Le o que est� no endere�o de memoria armazenado por $s5
	  beq $22, $0, continue
	  lw $23, 4($21) # Grava no registrador $s7 qual foi a tecla pressionada
	  beq $23, $25, animationEnd # finaliza o programa se apertar espa�o
	  beq $23, $11, moveLeft
	  beq $23, $12, moveRight
	  j continue
	  
moveLeft: addi $10, $0, -4
	  j continue
	  
moveRight: addi $10, $0, 4
	   j continue
	  
	  
continue: j animationFor
	  
animationEnd: addi $2, $0, 10
	      syscall
	      
	     
#===============================================================
# Fun��o timer

timer: sw $s2, 0($sp)
       addi $sp, $sp, -4
       
       addi $s2, $0, 10000
forT:  beq $s2, $0, fimT
       nop
       nop
       addi $s2, $s2, -1
       j forT
       
fimT: addi $sp, $sp, 4
      lw $s2, 0($sp)
      jr $ra
