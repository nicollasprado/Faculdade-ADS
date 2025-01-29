.text
main: addi $2, $0, 5
      syscall
      
      addi $25, $0, 100
      div $2, $25
      mfhi $25
      beq $25, $0, final00
      
      addi $25, $0, 4
      div $2, $25
      mfhi $25
      beq $25, $0, bissexto
      j notBissexto

final00: addi $25, $0, 400
         div $2, $25
         mfhi $25
         beq $25, $0, divisible400
         j notBissexto
      
divisible400: div $2, $24
              mfhi $8
              beq $8, $0, bissexto
              j notBissexto
              
bissexto: add $4, $0, 'S'
          addi $2, $0, 11
          syscall
          j end
          
notBissexto: add $4, $0, 'N'
             addi $2, $0, 11
             syscall
             j end
             
end: addi $2, $0, 10
     syscall