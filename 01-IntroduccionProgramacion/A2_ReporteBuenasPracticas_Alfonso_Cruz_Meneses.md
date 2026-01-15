# Actividad 2 — Reporte de Buenas Prácticas y Documentación de Código

**Alumno:** CRUZ MENESES ALFONSO
**Grupo:** 2DSMG3
**Fecha:** 14/01/2026
**Unidad:** 1

## 1. Objetivo del reporte
- Conocer las caracterizticas y como se realizan las buenas practicas de documentacion para mejorar la experiencia en cuanto a la creacion de codigo, ademas de mejorar nuestra manera de observar y conocer la documentacion que es necesaria de realizar.


## 2. Buenas prácticas de codificación
### 2.1 Nombres de variables
- Reglas: Poner nombres adecuados a las variables es uno de los pilares del Clean Code. Como dice el autor Robert C. Martin: "El código se lee mucho más de lo que se escribe". Un buen nombre debe explicar por sí mismo por qué existe, qué hace y cómo se usa.
## Intencionalidad y Claridad
El nombre debe ser lo suficientemente descriptivo para que no necesites un comentario al lado. Evita nombres genéricos como data, info o temp.
### Ejemplo: 
- Mal: `var d` `// días transcurridos`
- Bien: `var diasTranscurridos`;

 ## Evitar la Desinformación
No incluyas el tipo de dato en el nombre  ni uses nombres que puedan confundir.
### Ejemplo:
- Mal: `listadoArray`, `usuarioString.`
- Bien: `usuarios`, `nombreUsuario`.
## Usar Nombres Pronunciables y Buscables
Si no puedes pronunciar el nombre de una variable, no podrás discutir el código con un colega. Además, las variables de una sola letra (como e) son imposibles de encontrar en archivos grandes mediante una búsqueda (Ctrl+F)
### Ejemplo:
- Mal: `const mod_ymd_hms = "2023-10-25"`;
- Bien: `const fechaModificacionActual = "2023-10-25"`;
### 2.2 Comentarios

## Cuándo comentar: 

Los comentarios deben aportar un valor que el código por sí solo no puede expresar. Úsalos en los siguientes casos:

Explicación de la Intención: Cuando hay una decisión de diseño que no es obvia.

- Ejemplo: "Se utiliza este algoritmo de ordenamiento específico porque el dataset siempre viene casi ordenado".

## Qué evitar:

### 2.3 Estructura del código
- La estructura del código es lo que separa a un programador aficionado de un profesional. Un código bien estructurado es como un libro bien organizado: tiene capítulos claros, un índice lógico y es fácil de navegar.

Aquí profundizamos en los tres pilares que mencionas para que tus entregas en esta unidad sean impecables.
## Indentación:
- La indentación no es solo estética; en lenguajes como Python es obligatoria para que el código funcione, y en lenguajes como JavaScript o C++ es vital para la legibilidad.
- Consistencia: Decide si usarás 2 espacios o 4 espacios (lo más común), pero no los mezcles.
- Jerarquía visual: Cada bloque de control (if, for, while, function) debe mover el código un nivel a la derecha.
- Herramientas: Usa formateadores automáticos como Prettier o la función "Format Document" de VS Code (Shift + Alt + F).
##  Modularidad:
La modularidad consiste en dividir un programa grande en piezas más pequeñas y manejables llamadas módulos o componentes.

- Encapsulamiento: Cada módulo debe encargarse de una tarea específica (por ejemplo: gestión de base de datos, validación de formularios, cálculos matemáticos).
- Independencia: Si cambias algo dentro de un módulo, no debería romper el resto del sistema.
## Evitar duplicidad:
Evitar Duplicidad (Principio DRY)
El principio DRY (Don't Repeat Yourself) establece que cada pieza de conocimiento o lógica debe tener una representación única dentro del sistema.
- ¿Por qué evitarla? Si tienes la misma lógica de "cálculo de impuestos" en cinco lugares diferentes y la ley cambia, tendrás que buscar y editar los cinco lugares, aumentando el riesgo de errores.
- Solución: Si ves que estás copiando y pegando código, detente. Crea una función o una clase que centralice esa lógica.

## 3. Documentación del código
### 3.1 Estándares
- Estándar elegido:
JSDoc / Docstrings Estructurados
Este estándar permite que el código sea "autodocumentado". No es solo texto para humanos; herramientas como VS Code lo usan para mostrarte ayuda mientras escribes, y herramientas como Doxygen o Swagger lo usan para crear manuales web automáticos.
- Elementos recomendados:  Descripricion N/A	Una frase corta que explique qué hace el componente.
Parámetros	@param	Define el nombre, tipo de dato y descripción de las entradas.
Retorno	@returns	Indica qué devuelve la función y de qué tipo es.
Excepciones	@throws	Advierte sobre posibles errores que la función puede lanzar.
Ejemplo	@example	Un fragmento de código que muestre cómo usar la función.
Autor/Versión	@author	Útil en proyectos escolares o colaborativos.

### 3.2 Herramientas / enfoque
## El Archivo README (README.md)
Es la "tarjeta de presentación" de tu proyecto. Se escribe en formato Markdown y es el primer archivo que lee cualquier persona (o profesor) al abrir tu repositorio o carpeta.

Un buen README debe incluir:

Título y Descripción: ¿Qué hace el proyecto?

Instalación: ¿Cómo preparo el entorno?

Uso: Ejemplos rápidos de ejecución.

Tecnologías: Lista de lenguajes y librerías usadas.

Créditos: Quién lo desarrolló.

## Generadores de Documentación
Son herramientas que escanean tus comentarios (usando el estándar que elegimos, como JSDoc) y crean automáticamente un sitio web o un PDF profesional con toda la información técnica.

JSDoc / TypeDoc: Para JavaScript y TypeScript.

Sphinx: El estándar de oro para Python.

Swagger (OpenAPI): Especializado en documentar APIs y sus "endpoints".

Doxygen: El más potente para C++, Java y proyectos multi-lenguaje.

## Extensiones de VS Code (Tus mejores aliados)
No tienes que memorizar todas las reglas si usas las herramientas adecuadas en tu editor:

Extensión	Función
Prettier	Formatea tu código automáticamente (indentación, comillas, espacios).

ESLint / Pylint	Te avisa en tiempo real si estás rompiendo una buena práctica.

Document This	Genera automáticamente la estructura de JSDoc al presionar una tecla.

Better Comments	Te permite categorizar comentarios por colores (alertas, tareas, dudas).

Markdown All in One	Facilita la creación del archivo README con previsualización en vivo.

## Ventajas de aplicar estos estándares
Adoptar estas herramientas y archivos no es "trabajo extra", es una inversión que ofrece:

Profesionalismo: Tu trabajo destaca sobre los demás al verse como un producto de software real y no solo como un ejercicio escolar.

Mantenibilidad: Si dejas el código y vuelves a él en tres meses, entenderás qué hiciste en 5 minutos en lugar de horas.

Colaboración Eficiente: Otros programadores pueden integrarse a tu proyecto sin que tengas que explicarles línea por línea qué hace cada cosa.

## 4. Ejemplos prácticos
### 4.1 Antes / Después (Ejemplo 1)
**Antes:**
```txt 
function calc(v) {
    let d = v * 0.15; // ¿Qué es 0.15?
    let res = v - d;
    return res;
}
```

**Después**
```txt
const DESCUENTO_TEMPORADA_BAJA = 0.15;

function calcularPrecioConDescuento(precioOriginal) {
    const montoDescuento = precioOriginal * DESCUENTO_TEMPORADA_BAJA;
    const precioFinal = precioOriginal - montoDescuento;
    
    return precioFinal;
}
```

### 4.2 Antes / Después (Ejemplo 2)

**Antes:**
```txt
def registrar_usuario(usuario):
    if usuario.nombre != "":
        if usuario.edad >= 18:
            if db.guardar(usuario):
                return "Éxito"
            else:
                return "Error de base de datos"
        else:
            return "Menor de edad"
    else:
        return "Nombre vacío"
```

**Después**
```txt
def registrar_usuario(usuario):
    if not usuario.nombre:
        return "Nombre vacío"
    
    if usuario.edad < 18:
        return "Menor de edad"
    
    if not db.guardar(usuario):
        return "Error de base de datos"
        
    return "Éxito"
```

### 4.3 Ejemplo de documentación
``` 
/**
 * Calcula el interés compuesto de una inversión financiera.
 * Basado en la fórmula: $A = P(1 + \frac{r}{n})^{nt}$
 * * @param {number} principal - El monto inicial invertido (debe ser > 0).
 * @param {number} tasaAnual - Tasa de interés en formato decimal (ej. 0.05 para 5%).
 * @param {number} años - Duración de la inversión en años.
 * @returns {number} El monto total acumulado al finalizar el periodo.
 * * @example
 * const inversionFinal = calcularInteresCompuesto(1000, 0.05, 10);
 */
function calcularInteresCompuesto(principal, tasaAnual, años) {
    if (principal <= 0) throw new Error("El principal debe ser mayor a cero.");
    
    const periodoCapitalizacion = 1; // Frecuencia anual
    return principal * Math.pow((1 + tasaAnual / periodoCapitalizacion), (periodoCapitalizacion * años));
}
```

## 5. Recomendaciones finales
Para asegurar la máxima calidad, yo sugiero adoptar estos hábitos desde el primer día:

Prioriza la Legibilidad sobre la Brevedad: Es mejor una función de 10 líneas que sea fácil de entender, que una de 3 líneas que parezca un jeroglífico. El código se lee mucho más de lo que se escribe.

Adopta un "Linter" y Formateador: Configura herramientas como ESLint (JS) o Pylint (Python) en tu editor. Esto automatiza la corrección de errores de estilo y asegura que tu indentación sea siempre perfecta.

Aplica la Regla del Boy Scout: "Deja el código siempre un poco más limpio de como lo encontraste". Si ves una variable mal nombrada mientras trabajas en otra cosa, corrígela en ese momento.

Documenta el "Por qué", no el "Qué": Evita comentarios obvios como // incrementa i. Usa los comentarios para explicar decisiones de negocio o algoritmos complejos que no se explican solos.

## 6. Fuentes consultadas

1. Google Style Guides. https://google.github.io/styleguide/ (Estándares oficiales usados por Google para múltiples lenguajes).

1. MDN Web Docs. Guidelines for writing documentation. https://developer.mozilla.org/ (Referencia técnica para estándares web).
 
1. Python Software Foundation. PEP 8 – Style Guide for Python Code. https://peps.python.org/pep-0008/