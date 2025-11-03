import requests
import os

class ApiClient():
    API_URL = "http://localhost:8000/api/"

    def saveToken(token: str):
        try:
            file = os.remove(".token")
        except:
            pass
        file = open(".token", "x")
        file.write(str(token))

    def getToken() -> str:
        try:
            file = open(".token")
            return file.read()
        except:
            raise Exception("'.token' file not found")

    # Auth
    def register(self, username: str, password: str):
        print(username, password)
        res = requests.post(self.API_URL + "auth/registrar/", data={"username": username, "password": password})

        body = res.json()
        if(res.status_code != 200):
            print("Erro no cadastro: ", body)
            return

        token = body["token"]
        self.saveToken(token)
        print("Usuário cadastrado com sucesso")

    def login(self, username: str, password: str):
        res = requests.post(self.API_URL + "auth/login", data={username, password})

        body = res.json()
        if(res.status_code != 200):
            print("Erro no login: ", body.errors)
            return
        
        token = body["token"]
        self.saveToken(token)
        print("Usuário logado com sucesso")

    def logout(self):
        try:
            os.remove(".token")
        except:
            pass

    # Usuarios
    def listUsers(self):
        res = requests.get(self.API_URL + "usuarios")
        body = res.json()
        if(res.status_code != 200):
            print("Erro no login: ", body.errors)
        print(body)