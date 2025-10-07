from django.urls import path
from rest_framework import routers
from .views import AutorViewSet, LivroViewSet, UsuarioViewSet, EmprestimoViewSet, ReservaViewSet, MultaViewSet, CategoriaViewSet, EditoraViewSet

router = routers.DefaultRouter()

router.register(r'autor', AutorViewSet)
router.register(r'livro', LivroViewSet)
router.register(r'usuario', UsuarioViewSet)
router.register(r'emprestimo', EmprestimoViewSet)
router.register(r'reserva', ReservaViewSet)
router.register(r'multa', MultaViewSet)
router.register(r'categoria', CategoriaViewSet)
router.register(r'editora', EditoraViewSet)