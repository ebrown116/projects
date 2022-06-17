#Class for making plant object, printing, adding water and fertilizer to plant, seeing if a plant will survive as days pass
class Plant:
    def __init__(self, name = 'Plant', water = 0, fert = 0, breed = 'no', status = 'dead'):
        self.name = name
        self.water = water
        self.fert = fert
        if breed == 'no':
            self.breed = 'unable'
        elif breed == 'yes':
            self.breed = 'able'
        if water <= 0:
            self.status = 'dead'
        else:
            self.status = status

    def __str__(self):
        return '{self.name}\'s water level is {self.water}, with a fertilizer level of {self.fert}. It is {self.breed} to breed and is {self.status}'.format(self=self)
    def watering(self, lost):
        if not lost.isdigit():
            raise ValueError('Water changes must be a number')
        else:
            self.water = self.water + int(lost)
        if self.water < 0:
            self.water = 0
        elif self.water > 100:
            self.water = 100
        print('The new amount of water for', self.name, 'is', self.water)
        if self.water == 0:
            self.status = 'dead'
            print('Your', self.name, 'is', self.status)
    def ferting(self, lost):
        if not lost.isdigit():
            raise ValueError('Fertilizer changes must be a number')
        else:
            self.fert = self.fert + int(lost)
        if self.fert < 0:
            self.fert = 0
        elif self.fert > 100:
            self.fert = 100
        print('The new amount of fertilizer for', self.name, 'is', self.fert)
        if self.fert == 0:
            print('Your', self.name, 'has no fertilizer, water level will go down more when testing your plant!')
    def calcstat(self):
        days = input('Enter how many days will go by: ')
        if not days.isdigit():
            raise ValueError('Days passed must be a number')
        else:
            days = int(days)
        for i in range(days):    
            if self.fert <= 0:
                self.water = self.water - 15
                self.fert = 0
            else:
                self.water = self.water - 10
                self.fert = self.fert - 20
            if self.water <= 0:
                self.water = 0
                print('Your', self.name, 'has died!')
                self.status = 'dead'
            if self.status == 'dead':
                print('Your', self.name, 'has died!')
                if self.fert < 0:
                    self.fert = 0
                break
            else:
                print('Your', self.name, 'has survived day', i + 1)
        if self.status == 'alive':
            print('Your', self.name, 'made it through!')
                
mylist = []
#functions to add a plant, remove a plant, breed plants, search if plant is in garden, and print all plants in garder
def add():
    print('Please enter the name of your plant: ')
    name = input()
    name = name.capitalize()
    print('Enter the water level (0-100): ')
    water = input()
    if not water.isdigit():
        raise ValueError('Water level must be a  positive number')
    else:
        water = int(water)
    if water > 100 or water < 0:
        raise ValueError('Water level must be between 0-100')
    print('Enter the fertilizer level (0-100): ')
    fert = input()
    if not fert.isdigit():
        raise ValueError('Fertilizer level must be a positive number')
    else:
        fert = int(fert)
    if fert > 100 or fert < 0:
        raise ValueError('Fertilizer level must be between 0-100')
    print('Is your plant able to crossbreed? ')
    breed = input()
    breed = breed.lower()
    if not (breed == 'yes' or breed == 'no'):
        raise ValueError('Only "Yes" or "No" are valid inputs')
    print('Is your plant still alive? ')
    status = input()
    status = status.lower()
    if not (status == 'yes' or status == 'no'):
        raise ValueError('Only "Yes" or "No" are valid options')
    if status == 'yes':
        status = 'alive'
    elif status == 'no':
        status = 'dead'
    name = Plant(name, water, fert, breed, status)
    mylist.append(name)
    
def rem():
    name = input('Enter plant you would like to remove: ')
    name = name.capitalize()
    for i in mylist:
        if i.name == name:
            mylist.remove(i)
def breedthem():
    name1 = input('Enter the first plant you want to breed: ')
    name1 = name1.capitalize()
    mybool1 = False
    mybool2 = False
    for i in mylist:
        if i.name == name1:
            if i.breed == 'no':
                print('This plant is unable to breed, try again')
                break
            if i.status == 'dead':
                print('This plant is dead!')
                break
            else:
                mybool1 = True
            mybool2 = True
    if mybool2 == False:
        print('This plant is dead or not in your garden')
    name2 = input('Enter the plant you\'ll be breeding with: ')
    name2 = name2.capitalize()
    mybool3 = False
    mybool4 = False
    for i in mylist:
        if i.name == name2:
            if i.breed == 'no':
                print('This plant is unable to breed, try again')
                break
            if i.status == 'dead':
                print('This plant is dead!')
                break
            else:
                mybool3 = True
            mybool4 = True
    if mybool4 == False:
        print('This plant is dead or not in your garden')
    if mybool1 == True and mybool2 == True and mybool3 == True and mybool4 == True:
        for i in mylist:
            if i.name == name1:
                mylist.remove(i)
        for i in mylist:
            if i.name == name2:
                 mylist.remove(i)
        name1 = name1.lower()
        name2 = name2.lower()
        name3 = name1 + name2
        name3 = name3.capitalize()
        name = Plant(name3, 100, 100, 'no', 'alive')
        mylist.append(name)
        for i in mylist:
            if i.name == name3:
                print(i)
    else:
        print('Breeding failed!')
                    
def search():
    name = input('Enter the plant you are looking for: ')
    name = name.capitalize()
    mybool=False
    for i in mylist:
        if i.name == name:
            mybool =True
    if mybool == True:
        print(name, 'is in your garden!')
    else:
        print('This plant isn\'t in your garden')
def printinfo():
    print('Here are all the plants in your garden:')
    for i in range(len(mylist)):
        print(mylist[i].name)
    print('If you want to learn more aout a plant, please use the "Statistics (7)" choice')

print('Hello, and welcome to your garden!')
print('The object of this game is to make new plants, feed and water them, and see how long they can survive')
print('Take a look at the options below to get started, and remember, have fun!')
print('1 - Add plant')
print('2 - Remove plant')
print('3 - Show garden')
print('4 - Search for a plant')
print('5 - Change water levels')
print('6 - Change fertilizer levels')
print('7 - Show a plants statistics')
print('8 - See if a plant will survive')
print('9 - Breed plants')
print('10 - End the game')
print('Please make a selection')

choice = input()
abool = False
while abool == False:
    try:
        choice = int(choice)
        abool = True
    except:
        print('Choice must be a number')
        abool = False
        choice = input()
#calls functions given selection 

while choice != 10:
    try:
        if choice == 1:
            add()
        elif choice == 2:
            rem()
        elif choice == 3:
            printinfo()
        elif choice == 4:
            search()
        elif choice == 5:
            name1 = input('Enter the plant you are watering: ')
            name1 = name1.capitalize()
            mybool = False
            for i in mylist:
                if i.name == name1:
                    lost = input('Enter how much water was added: ')
                    i.watering(lost)
                    mybool = True
            if mybool == False:
                print('Plant is not in garden')
        elif choice == 6:
            name1 = input('Enter the plant you are fertilizing: ')
            name1 = name1.capitalize()
            mybool = False
            for i in mylist:
                if i.name == name1:
                    lost = input('Enter how much fertilizer was added: ')
                    i.ferting(lost)
                    mybool = True
            if mybool == False:
                print('Plant is not in garden')
        elif choice == 7:
            name1 = input('Enter the plant you\'d like to view: ')
            name1 = name1.capitalize()
            for i in mylist:
                if i.name == name1:
                    print(i)
        elif choice == 8:
            name1 = input('Enter the plant you\'ll be testing: ')
            name1 = name1.capitalize()
            for i in mylist:
                if i.name == name1:
                    i.calcstat()
        elif choice == 9:
            breedthem()
    except ValueError as excpt:
        print(excpt)
    choice = input('Please make another selection: ')
    abool = False
    while abool == False:
        try:
            choice = int(choice)
            abool = True
        except:
            print('Choice must be a number')
            abool = False
            choice = input()

print('Thanks for playing :)')



