from rest_framework import serializers
from .models import Usuario, Projeto, Tarefa

class UsuarioSerializer(serializers.ModelSerializer):
    class Meta:
        model = Usuario
        fields = '__all__'
        read_only_fields = ["id", "last_login", "is_active", "date_joined", "data_cadastro", "groups", "user_permissions"]
        extra_kwargs = {
            'password': {'write_only': True}
        }

class ProjetoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Projeto
        fields = '__all__'

class TarefaSerializer(serializers.ModelSerializer):
    class Meta:
        model = Tarefa
        fields = '__all__'

class AuthSerializer(serializers.ModelSerializer):
    class Meta:
        model = Usuario
        fields = ["username", "password"]
        extra_kwargs = {
            'password': {'write_only': True}
        }