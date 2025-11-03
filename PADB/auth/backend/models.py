from django.db import models
from django.contrib.auth.models import AbstractUser

# Create your models here.

class Usuario(AbstractUser):
    bio = models.TextField()
    data_cadastro = models.DateTimeField(auto_now_add=True)

class Projeto(models.Model):
    nome = models.CharField(max_length=200)
    descricao = models.TextField()
    usuario = models.ForeignKey(Usuario, related_name="projetos", on_delete=models.CASCADE)
    data_criacao = models.DateTimeField(auto_now_add=True)
    data_atualizacao = models.DateTimeField(auto_now=True)
    status = models.CharField(choices=(('Planejamento', 'Planejamento'), ('Em Andamento', 'Em Andamento'), ('Concluído', 'Concluído')))

class Tarefa(models.Model):
    titulo = models.CharField(max_length=200)
    descricao = models.TextField()
    projeto = models.ForeignKey(Projeto, related_name="tarefas", on_delete=models.CASCADE)
    concluida = models.BooleanField(default=False)
    prioriddade = models.CharField(choices=(('Baixa', 'Baixa'), ('Média', 'Média'), ('Alta', 'Alta')))
    data_criacao = models.DateTimeField(auto_now_add=True)
    data_conclusao = models.DateTimeField(null=True, blank=True)