# My way to do this activity, but codeforces dont support it!

class Products():
    def __init__(self, idd, name: str, price: float):
        self.idd = idd
        self.name = name
        self.price = price
        self.type = ''

    def selectProduct(chosenID, chosenQuantity):
        # Codeforces max version is 3.8 and doesnt have match/case

        if chosenID == 1:
            cachorroQuente = Food(1, 'Cachorro-Quente', 4.0, chosenQuantity)
            return cachorroQuente
        elif chosenID == 2:
            xSalada = Food(2, 'X-Salada', 4.5, chosenQuantity)
            return xSalada
        elif chosenID == 3:
            xBacon = Food(3, 'X-Bacon', 5.0, chosenQuantity)
            return xBacon
        elif chosenID == 4:
            torradaSimples = Food(4, 'Torrada Simples', 2.0, chosenQuantity)
            return torradaSimples
        elif chosenID == 5:
            refrigerante = Drink(5, 'Refrigerante', 1.5, chosenQuantity)
            return refrigerante
        
        # match chosenID:
        #    case 1:
        #        cachorroQuente = Food(1, 'Cachorro-Quente', 4.0, chosenQuantity)
        #        return cachorroQuente
        #    case 2:
        #        xSalada = Food(2, 'X-Salada', 4.5, chosenQuantity)
        #        return xSalada
        #    case 3:
        #        xBacon = Food(3, 'X-Bacon', 5.0, chosenQuantity)
        #        return xBacon
        #    case 4:
        #        torradaSimples = Food(4, 'Torrada Simples', 2.0, chosenQuantity)
        #        return torradaSimples
        #    case 5:
        #        refrigerante = Drink(5, 'Refrigerante', 1.5, chosenQuantity)
        #        return refrigerante

    def getTotalPrice(self, quantity: int):
        totalPrice = self.price * quantity
        totalPriceFormatted = '{:.2f}'.format(totalPrice)
        return totalPriceFormatted


class Drink(Products):
    def __init__(self, idd, name: str, price: float, quantity: int):
        super().__init__(idd, name, price)
        self.type = 'Drink'

class Food(Products):
    def __init__(self, idd, name: str, price: float, quantity: int):
        super().__init__(idd, name, price)
        self.type = 'Food'


identifier = int(input())
itemQuantity = int(input())

if (identifier < 1) or (identifier > 5):
    raise Exception('Not Availabe ID, select from 1 to 5')

selectedProduct = Products.selectProduct(identifier, itemQuantity)
selectedProductPrice = Products.getTotalPrice(selectedProduct, itemQuantity)
print(f"Total: R$ {selectedProductPrice}")