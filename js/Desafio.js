
//Lê os valores de entrada
//const valorSalario = parseFloat(getValues())
//const valorBeneficios = parseFloat(getValues())
valorSalario = parseFloat(prompt("Informe o valor do salário"))
valorBeneficios = parseFloat(prompt("Informe o valor do beneficio"))

//calcula o imposto através da função "calculaImposto"
const valorImposto = calculaImposto(valorSalario);
const saida = valorSalario - valorImposto + valorBeneficios;
//print(saida.toFixed(2))
//print(saida)
console.log(saida)


function calculaImposto() {
    let aliquota;
    if (valorSalario >= 0 && valorSalario <= 1100) {
        aliquota = 0.05;
    } else if (valorSalario > 1100 && valorSalario <= 2500) {
        aliquota = 0.10;
    } else {
        aliquota = 0.15;
    }
    return aliquota * valorSalario;
}


function getValues() {
  
       
        

    

    
}




