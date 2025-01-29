.text
main: addi $2, $0, 5
      syscall
      add $8, $0, $2
      sll $9, $8, 1
      add $4, $0, $9
      addi $2, $0, 1
      syscall