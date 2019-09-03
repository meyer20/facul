randomArray = (length, max) => [...new Array(length)]
    .map(() => Math.round(Math.random() * max));

var list = randomArray(1000, 10000);

function bubbleSort(lista) {
    var loopTime = 1;
    for (let i = 0; i < lista.length; i++) {
      for (let y = 0; y < lista.length - 1; y++) {
        if (lista[i] < lista[y]) {
          let aux1 = lista[i];
          let aux2 = lista[y];
          lista[i] = aux2;
          lista[y] = aux1;
          loopTime++;
        }
      }
		  loopTime++;
    }
    console.log(lista);
    console.log("Passei " + loopTime + " vezes.");
}

function bubbleSort1(lista) {
    var loopTime = 1;
    for (let i = 0; i < lista.length; i++) {
      for (let y = 0; y < lista.length - 1; y++) {
        if (lista[y] > lista[y + 1]) {
          let aux1 = lista[y];
          lista[y] = lista[y + 1];
          lista[y + 1] = aux1;
          loopTime++;
        }
      }
		  loopTime++;
    }
    console.log(lista);
    console.log("Passei " + loopTime + " vezes.");
}
