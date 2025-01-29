def totalFuelRequired(fuel_consumption, distance):
    totalRequiredFuel = distance / fuel_consumption
    return totalRequiredFuel

def realFuelRequired(total_required_fuel, current_fuel):
    realRequiredFuel = total_required_fuel - current_fuel
    if (current_fuel >= total_required_fuel):
        return '0.0'
    else:
        realRequiredFuel = '{:.1f}'.format(realRequiredFuel)    
        return realRequiredFuel

consumption = int(input()) # KM/L
airportDistance = int(input()) # Kilometer
currentFuel = int(input()) # Liter

print(realFuelRequired(totalFuelRequired(consumption, airportDistance), currentFuel))