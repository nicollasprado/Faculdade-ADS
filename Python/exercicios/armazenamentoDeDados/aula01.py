import sqlite3

conexao = sqlite3.connect(r'C:\Users\nicol\OneDrive\Documentos\Estudos ADS\Python\exercicios\armazenamentoDeDados\aula1.db')
cursor = conexao.cursor() # permite executar requests

# cursor.execute('CREATE TABLE IF NOT EXISTS usuarios(id integer, nome text)') -> executa uma requisicao
# cursor.execute('INSERT INTO usuarios VALUES(1, "nicollas")')
# cursor.execute('INSERT INTO usuarios VALUES(2, "tauan")')
# cursor.execute('INSERT INTO usuarios VALUES(3, "rui")')
# conexao.commit() -> insere os requests no banco de dados

requisicao = 'SELECT * FROM usuarios WHERE nome = ?'
for linha in cursor.execute(requisicao, ('nicollas', )):
    print(linha)