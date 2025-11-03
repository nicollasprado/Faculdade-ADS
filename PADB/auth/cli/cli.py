import argparse
from api_client import ApiClient
import sys

def main():
    apiClient = ApiClient()

    parser = argparse.ArgumentParser(description="CLi para consumir api")
    subparsers = parser.add_subparsers(dest="cadastrar")
    subparsers = parser.add_subparsers(dest="")

    cadastrar = subparsers.add_parser("cadastrar", help="Cadastrar usuário")
    cadastrar.add_argument("--username", required=True, type=str, help="Nome de usuario")
    cadastrar.add_argument("--password", required=True, type=str, help="Senha")
    cadastrar.set_defaults(func=lambda ns: apiClient.register(ns.username, ns.password))

    args = parser.parse_args()
    args.func(args)
    sys.exit(0)

if __name__ == "__main__":
    main()