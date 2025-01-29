.text
main: lui $t0, 0x1001
      addi $t1, $0, 512 # Exemplo em 16x16
      
      ori $a1, $0, 0xffff # $5 = 0x0000ffff  ->  Limitador dos numeros aleatorios para gerar cores validas
      sll $a1, $a1, 8      # sll $5 8 -> 0xffff00 ; range de 0 - 0xffff00
      
scenario: beq $t1, $0, fimScr

	  addi $v0, $0, 42 # Gera��o de numeros aleatorios; $5 fica o limite superior da fun��o 42
	  syscall
	  # $4 ($a0) � o retorno da fun��o 42
	  sw $a0, 0($t0) # Gera��o do cen�rio
	  sw $a0, 2048($t0) # Gera��o da c�pia
	  
	  addi $t0, $t0, 4 # Proximo registrador

	  addi $t1, $t1, -1
	  j scenario
	  
fimScr:

	  lui $t0, 0x1001
	  ori $s1, 0xffffff # Ori so aceita 16 bits no immediato entretanto ele dar� um jeito
	  addi $t2, $0, 512
animationFor: beq $t2, $0, animationEnd	

	  sw $s1, 0($t0)    # Sobrescri��o do ponto branco na primeira unidade gr�fica
	  sw $s1, 4($t0)    # Sobrescri��o do ponto branco na pr�xima unidade gr�fica
	  lw $t1, 2048($t0) # Recupera o valor do cenario armazenado
	  sw $t1, 0($t0)    # Sobrescri��o do cenario inicial na primeira unidade gr�fica
	  jal timer
	  
	  addi $t0, $t0, 4
	  addi $t2, $t2, -1
	  j animationFor
	  
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
