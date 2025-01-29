import mysql.connector

dataBase = mysql.connector.connect(
    host='localhost',
    user='root',
    password='$admin',
    database='bancodedados'
)

cursor = dataBase.cursor()

# Criando o banco de dados
# cursor.execute("CREATE DATABASE bancodedados")

# Criando nova tabela
# cursor.execute('CREATE TABLE usuarios(id INT AUTO_INCREMENT PRIMARY KEY, nome text, email text, cpf int, sexo text, estado text, cidade text)')

# Adicionando informacoes
# sql = "INSERT INTO usuarios(nome, email, cpf, sexo, estado, cidade) VALUES(%s, %s, %s, %s, %s, %s)"
# dados = ("Joao", "joao@email.com", 1234567890, "M", "rn", "natal")
# cursor.execute(sql, dados)

# Enviando os dados
# dataBase.commit()

#
cursor.execute("SELECT * FROM usuarios")
print(cursor.fetchall())