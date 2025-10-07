from django.db import models

class Autor(models.Model):
    nome = models.CharField()
    data_nascimento = models.DateField()
    nacionalidade = models.CharField()

    def __str__(self):
        return self.nome

class Livro(models.Model):
    titulo = models.CharField()
    ano_publicacao = models.IntegerField()
    genero = models.CharField()
    autor_id = models.ForeignKey(Autor, related_name="autor")

    def __str__(self):
        return self.titulo
    
class Usuario(models.Model):
    nome = models.CharField()
    email = models.EmailField()
    data_registro = models.DateField(auto_created=True)

    def __str__(self):
        return self.nome
    
class Emprestimo(models.Model):
    data_emprestimo = models.DateField(auto_created=True)
    livro_id = models.ForeignKey(Livro, related_name="livro")
    usuario_id = models.ForeignKey(Usuario, related_name="usuario")

class Reserva(models.Model):
    data_reserva = models.DateField(auto_created=True)
    livro_id = models.ForeignKey(Livro, related_name="livro")
    usuario_id = models.ForeignKey(Usuario, related_name="usuario")

class Multa(models.Model):
    valor = models.IntegerField()
    data_pagamento = models.DateField(null=True)
    livro_id = models.ForeignKey(Livro, related_name="livro")
    usuario_id = models.ForeignKey(Usuario, related_name="usuario")

class Categoria(models.Model):
    nome = models.CharField()
    descricao = models.CharField()

    def __str__(self):
        return self.nome
    
class Editora(models.Model):
    nome = models.CharField()
    endereco = models.CharField()

    def __str__(self):
        return self.nome
