from rest_framework import serializers
from .models import Usuario, Projeto, Tarefa

class UsuarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = Usuario
        fields = '__all__'
        read_only_fields = ["id", "last_login", "is_active", "date_joined", "data_cadastro", "groups", "user_permissions"]

class ProjetoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Projeto
        fields = '__all__'

class TarefaSerializer(serializers.ModelSerializer):
    class Meta:
        model = Tarefa
        fields = '__all__'