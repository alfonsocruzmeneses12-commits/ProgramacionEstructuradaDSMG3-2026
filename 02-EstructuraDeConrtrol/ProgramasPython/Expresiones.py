""" En este part del codigo se va a
declarar varios tipos de variables
"""
#Expresiones Aritmeticas 
suma = 3 + 5  
resta = 10+15 
multi = 34*23
div = 10 /2
divEntera = 12 // 5 #Division entera
mod = 10 % 2
potencia = 4**2 #potencia

"""
salida = f"Hola soy la suma: " + str(suma)
print(salida)
salida = "Hola soy la suma:" 
print(salida, suma)
salida = 'Hola soy la "suma" + str (suma) 
print(salida)
salida = "Hola soy la 'suma': " + str(suma) 
print(salida)
"""
#Interpolacion de String

# Expresiones de boolean
valor = 4 + 5 > 23
print (valor)
salida = f"""
           ==== Expresiones Aritmeticas ====
           la suma es:  { suma }
           la resta es : { resta }
           La multiplicacion es: {multi}
           La division es : { div }
           La division Entera es : {divEntera}
           El modulo es : { mod }
           La potencia es : { potencia }
          """
print(salida)