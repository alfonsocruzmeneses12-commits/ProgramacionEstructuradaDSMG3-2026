
## Plantilla A3 (.md)

# Actividad 3 — Configuración de un Entorno de Desarrollo Integrado (IDE)

**Alumno:** Alfonso Cruz Meneses
**Grupo:** 2DSMG3
**Fecha:** 16/01/2026
**Unidad:** 1

## 1. IDE seleccionado
- IDE: Visual Studio Code
- Versión: 1.108.1
- Sistema operativo: 
Windows 10 (64-bit) o superior, con .NET Framework 4.5.2 o superior.
macOS: 10.15 (Catalina) o posterior.
Linux: Ubuntu 20.04, Debian 10, RHEL 8, Fedora 36, SUSE (se recomienda la versión .deb o .rpm más reciente)

## 2. Justificación
- Criterio 1: De manera personal se me hace mas practica la interface de visual studio code ya que es mas intuitiva y responsiva
- Criterio 2: Mejor manera de administrar las lenguajes y administar los codigos ademas implemetacion de muchos lenguajes en un solo editor 
- Criterio 3: Extenciones disponibles para mejorar la experiencia visual y a nivel programacion debido a que permiten merjo utilizacion de los lenguajes y correcion de erros

## 3. Requisitos previos
- Requisito 1:Procesador: 1.6 GHz o más rápido.
- Requisito 2: RAM: 1 GB.
- Requisito 3: Espacio en disco: ~500 MB (puede variar).
- Requisito 4: Resolución de pantalla: 1024x768 o superio
- Permisos:

## 4. Instalación (paso a paso)
1. Ingresa al sitio oficial: code.visualstudio.com.

Verás un botón grande de descarga. El sitio detectará automáticamente si usas Windows, macOS o Linux.

Haz clic en el botón de descarga para obtener el archivo ejecutable.
 ![alt text](image.png)

2. Instalación (Windows)
Una vez que se descargue el archivo .exe, ábrelo y sigue estos puntos:
Aceptar el acuerdo: Lee (si gustas) y acepta los términos de la licencia.
Ruta de instalación: Puedes dejar la que viene por defecto.
Tareas adicionales (IMPORTANTE): Aquí verás varias casillas. Te sugiero marcar las siguientes:
- Crear un acceso directo en el escritorio.
- Agregar la acción "Abrir con Code" al menú contextual de archivos de Windows. (Esto te permite hacer clic derecho en cualquier archivo y abrirlo directo en VS Code).
- Agregar la acción "Abrir con Code" al menú contextual de directorios de Windows. (Igual que el anterior, pero para carpetas completas).
- Agregar a PATH. (Esto es vital para que puedas usar el comando code en la terminal).
- Haz clic en Instalar y espera unos segundos.

## 4.1 Verificación
### ¿Cómo comprobé que funciona?
Abre una terminal (o CMD en Windows) y escribe: **`code --version`** 
Si te aparece un número de versión

![alt text](image-1.png)

## 5. Configuración inicial
### 5.1 Ajustes básicos ###

 En la barra de búsqueda de la configuración, escribe lo siguiente y cámbialo:

- Auto Save (Guardado Automático)
 Busca: files: `auto save`
 
  Cámbialo a: `afterDelay`.

   Por qué: Olvídate de presionar Ctrl + S cada dos segundos. El programa guardará tus cambios automáticamente.

- Font Size (Tamaño de letra)
 Busca: editor: `font size`

   Ajuste: `Cámbialo a 14 o 16` (según tu comodidad visual).

 - Format On Save (Formatear al guardar)
  Busca: editor: `format on save`

    Acción: Marca la casilla.

      Por qué: Cada vez que se guarde el archivo, VS Code acomodará el código (sangrías, espacios) para que se vea ordenado.

- Word Wrap (Ajuste de línea)
    Busca: editor: `word wrap`

   Cámbialo a: `on`.

   Por qué: Evita que el código se salga de la pantalla hacia la derecha; ahora todo el texto se ajustará al ancho de tu ventana.

### 5.2 Extensiones / plugins

| Extensión/Plugin | Función | Por qué |
|---|---|---|
| Django | Tener una mejor sintaxis a la hora de escribir codigo ademas de marcar los errores del mismo |Mejorara y ahorra tiempo y mejorar la calidad visual de tu codigo |
|vscode-icons|Cambiar los icones de los lenguajes y las carpetas abiertas | Mejora el apartado visual de los icnos haciendolos mas intuitivos |
|Jinja|Agrega soporte para lenguajes en visual estudio|Mejora la experiencia de la codificacion haciendo soporte para mas lenguajes dentro del programa|


![alt text](image-2.png)

### 5.3 Herramientas adicionales (si aplica)
- Compilador/intérprete: 
- Intérprete de Python	
- JavaScript / TS
- C / C++	Compilador GCC (MinGW para Windows)
- Java	JDK (Java Development Kit)	
C# / .NET	.NET SDK
- Prueba: 

![alt text](image-3.png)

## 6. Prueba final (mini-ejercicio)
```txt
package arc.uttt.ciclos;
public class ForPares {

    public static void main(String[] args) {
        for(int i=0; i<100; i+=2){
            System.out.println(i);
        }
    }
}
```

## 7. Conclusiones

-En conclucion el progrma VS Code es uno de los mejores ecosistemas para desarrollar y editar codigo, ojo solo edicion y expresion de codigo ya que como vimos arriba se necesita un compilador para que este sea runneable sin embargo es uno de los mejores debido a todas las extensiones que este contiene que ayudan y mejoran la experiencia de realizar codigo y a aprender a progrmar
-


