import pygame

class Player(pygame.sprite.Sprite):
    def __init__(self):
        pygame.sprite.Sprite.__init__(self)
        self.sprites = []
        self.sprites.append(pygame.image.load('socket/jogoSocket/sprites/player.png'))
        self.sprites.append(pygame.image.load('socket/jogoSocket/sprites/player-idle.png'))
        self.actual = 0
        self.image = self.sprites[int(self.actual)]
        self.image = pygame.transform.scale(self.image, (32*2, 32*2))
        self.rect = self.image.get_rect()
        self.rect.center = 50, 50
        self.speed = 1

    def walk(self):
        if(pygame.key.get_pressed()[pygame.K_a] and (self.rect.x-10)*self.speed > -10):
            self.rect.x -= 10
        if(pygame.key.get_pressed()[pygame.K_d] and (self.rect.x+10)*self.speed < 1220):
            self.rect.x += 10
        if(pygame.key.get_pressed()[pygame.K_w] and (self.rect.y-10)*self.speed > -10):
            self.rect.y -= 10
        if(pygame.key.get_pressed()[pygame.K_s] and (self.rect.y+10)*self.speed < 650):
            self.rect.y += 10

    def update(self):
        self.actual += 0.025
        if(self.actual >= len(self.sprites)):
            self.actual = 0
        if(self.actual >= 1):
            self.actual = 0
        self.image = self.sprites[int(self.actual)]
        self.image = pygame.transform.scale(self.image, (32*2, 32*2))