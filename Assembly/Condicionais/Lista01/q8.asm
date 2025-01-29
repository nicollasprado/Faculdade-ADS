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
      
      # Testes rapidos
      addi $25, $0, 12
      slt $15, $9, $25
      beq $15, $0, notValid
      slt $15, $0, $9
      beq $15, $0, notValid
      
      slt $15, $0, $8
      beq $15, $0, notValid

      slt $15, $0, $10
      beq $15, $0, notValid
      
      
      addi $25, $0, 2
      bne $9, $15, testBissexto
      
      addi $25, $0, 30
      slt $15, $0, $8
      beq $15, $0, notValid
      j valid
      
      
              # Checa se o ano é bissexto
testBissexto: addi $25, $0, 100
              div $10, $25
              mfhi $25
              beq $25, $0, final00
      
              addi $25, $0, 4
              div $10, $25
              mfhi $25
              beq $25, $0, bissexto
              j notBissexto

final00: addi $25, $0, 400
         div $10, $25
         mfhi $25
         beq $25, $0, divisible400
         j notBissexto
      
divisible400: div $10, $24
              mfhi $8
              beq $8, $0, bissexto
              j notBissexto
              
bissexto: addi $15, $0, 30
          slt $25, $8, $15
          beq $25, $0, notValid
          j valid
          
notBissexto: addi $15, $0, 29
             slt $25, $8, $15
             beq $25, $0, notValid
             j valid

valid: add $4, $0, 'V'
       addi $2, $0, 11
       syscall
       j end
       
notValid: add $4, $0, 'F'
          addi $2, $0, 11
          syscall
          j end
    
end: addi $2, $0, 10
     syscall