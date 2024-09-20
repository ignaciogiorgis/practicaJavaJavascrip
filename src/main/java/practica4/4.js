//Escriba una función que verifique si dos números enteros no negativos
//forman un "par binario entrelazado".

function interlockable(a, b) {
   let numA = a.toString(2);
  let numB = b.toString(2);

  let maxLength = Math.max(numA.length, numB.length);
  numA = numA.padStart(maxLength, '0');
  numB = numB.padStart(maxLength, '0');

  // Recorre de derecha a izquierda para verificar si hay posiciones con ambos bits en '1'
  for (let i = maxLength - 1; i >= 0; i--) {
    if (numA[i] === '1' && numB[i] === '1') {
      return false; // No son interlockables si ambos tienen '1' en la misma posición
    }
  }

  return true;
}

//La función recibe una matriz cuadrada bidimensional de números enteros aleatorios.
// En la diagonal principal, todos los números enteros negativos deben
 // cambiarse a 0, mientras que los demás deben cambiarse a 1 (Nota: 0aquí se considera no
  //negativo).
function matrix(array) {
     for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (i === j) {
                array[i][j] = 0;
            } else {
                array[i][j] = 1;
            }
        }
    }
    return array;
}

