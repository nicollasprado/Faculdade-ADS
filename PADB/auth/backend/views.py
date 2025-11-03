from rest_framework import viewsets
from .models import Usuario, Projeto, Tarefa
from .serializers import UsuarioSerializer, ProjetoSerializer, TarefaSerializer, AuthSerializer
from rest_framework.decorators import action, authentication_classes, permission_classes
from rest_framework.permissions import IsAuthenticated, AllowAny
from rest_framework.authentication import SessionAuthentication
from rest_framework_simplejwt.authentication import JWTAuthentication
from rest_framework_simplejwt.tokens import RefreshToken
from django.shortcuts import get_object_or_404
from rest_framework.response import Response
from rest_framework import status
from drf_yasg.utils import swagger_auto_schema
from django.utils import timezone

class UsuarioViewSet(viewsets.ModelViewSet):
    queryset = Usuario.objects.all()
    serializer_class = UsuarioSerializer

class ProjetoViewSet(viewsets.ModelViewSet):
    queryset = Projeto.objects.all()
    serializer_class = ProjetoSerializer

class TarefaViewSet(viewsets.ModelViewSet):
    queryset = Tarefa.objects.all()
    serializer_class = TarefaSerializer

    @swagger_auto_schema(methods=['PATCH'], request_body=None)
    @action(detail=True, methods=["PATCH"])
    def concluir(self, request, pk=None):
        tarefa = get_object_or_404(Tarefa, pk=pk)

        if(not tarefa.concluida):
            tarefa.concluida = True
            tarefa.data_conclusao = timezone.now()
            tarefa.save()

        return Response(status=status.HTTP_200_OK)

class AuthViewSet(viewsets.ViewSet):
    serializer_class = AuthSerializer

    @swagger_auto_schema(request_body=AuthSerializer, responses={200: AuthSerializer})
    @action(detail=False, methods=['POST'], permission_classes=[AllowAny])
    def login(self, request):
        usuario = get_object_or_404(Usuario, username=request.data['username'])
        if(not usuario.check_password(request.data['password'])):
            return Response({"message": "Usuário ou senha incorretos"}, status = status.HTTP_400_BAD_REQUEST)
        
        refresh = RefreshToken.for_user(usuario)
        serializer = AuthSerializer(instance=usuario)
        return Response({"token": str(refresh.access_token), "usuario": serializer.data})
    
    @swagger_auto_schema(request_body=AuthSerializer)
    @action(detail=False, methods=["POST"], permission_classes=[AllowAny])
    def registrar(self, request):
        serializer = AuthSerializer(data=request.data)

        if(serializer.is_valid()):
            serializer.save()
            usuario = Usuario.objects.get(username=request.data["username"])
            usuario.set_password(request.data["password"])
            usuario.save()
            refresh = RefreshToken.for_user(usuario)
            return Response({"token": str(refresh.access_token), "usuario": serializer.data})
        
        return Response(serializer.errors, status = status.HTTP_400_BAD_REQUEST)
    
    @action(detail=False, methods=["GET"])
    @authentication_classes([JWTAuthentication, SessionAuthentication])
    @permission_classes([IsAuthenticated])
    def test_token(self, request):
        return Response("passou para {}".format(request.user.username))