/*
Dadas dos cadenas compuestas por +y -, devuelve una nueva cadena que muestra cómo las dos cadenas interactúan de la siguiente manera:

    Cuando lo positivo y lo positivo interactúan, siguen siendo positivos .
    Cuando lo negativo y lo negativo interactúan, siguen siendo negativos .
    Pero cuando los negativos y los positivos interactúan, se vuelven neutrales y se muestran como el número 0.*/

function neutralise(s1, s2) {
    let result = []
    if (s1.length == s2.length) {

        for (i = 0; i < s1.length; i++) {

            if (s1[i] !== s2[i]) {

                result[i] = '0'
            } else {

                if (s1[i] && s2[i] == "+") {
                    result[i] = "+"
                } else {
                    result[i] = "-"
                }
            }
        }

    } else {
        return "";
    }

    return result.join("")
        ;
}

//*****************************************************************************************
/*

Crea una función que siempre devuelva True/ truepara cada elemento de una lista determinada.
    Sin embargo, si un elemento es la palabra 'flick' , cambia a que siempre devuelva el valor booleano opuesto.*/

function flickSwitch(arr){
    let arrBool = []
    let logic = true
    for(i=0; i<arr.length; i++){

        if(arr[i]== "flick"){
            if(logic){
                logic=false
                arrBool[i]=logic
            }else{
                logic=true
                arrBool[i]=logic
            }

        }else{
            arrBool[i]=logic
        }
    }
    return arrBool ;
}