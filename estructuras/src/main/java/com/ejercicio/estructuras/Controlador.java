package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero) {
		String ret = "";
		if (numero % 2 == 0) {
			ret += "<link rel=stylesheet href='estilos.css'>";
			ret += "Es par el " + numero;
		} else {
			ret += "<link rel=stylesheet href='estilos.css'>";
			ret += "Es impar el " + numero;
		}
		return "<h1>" + ret + "</h1>";
	}
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero) {
		String res = "";
		if (numero >= 1 && numero <= 10) {
			res += "<link rel=stylesheet href='estilos.css'>";
			res += "<h2>Tabla de multiplicar del " + numero + "</h2><table><tr><th>Multiplicación</th><th>Resultado</th></tr>";
					
              for (int i = 1; i <= 10; i++) {
            	  res += "<tr><td>" + numero + " x " + i + "</td><td>" + (numero * i) + "</td></tr>";
              }
              res += "</table>";
        } else {
              res = "<link rel=stylesheet href='estilos.css'><h3 style='color:red;'>Por favor, ingresa un número entre 1 y 10.</h3>";
                }
		return res;
	}
	
	@PostMapping("/promedioCalificaciones")
	public String ejercicio3(@RequestParam String calificaciones) {
		String res = "";
        String[] notas = calificaciones.split(",");  
        double suma = 0;
        int cantidad = 0;
        boolean hayErrores = false;
            
        res += "<link rel='stylesheet' href='estilos.css'>";
        res += "<h2>Cálculo de la media de los números</h2><table><tr><th>Número</th><th>Valor</th></tr>";

        for (String numeroStr : notas) {
            double numero = Double.parseDouble(numeroStr.trim());
            suma += numero;
            cantidad++;
                    
            res += "<tr><td>" + numeroStr.trim() + "</td><td>" + numero + "</td></tr>";
        }
        
        if (!hayErrores && cantidad > 0) {
            double media = suma / cantidad;
            res += "<tr><td><strong>Media:</strong></td><td>" + String.format("%.2f", media) + "</td></tr>";
        } else if (cantidad == 0) {
            res = "<h3 style='color:red;'>No se proporcionaron números válidos.</h3>";
        }
        
        res += "</table>";
        return (String) res;
	}
	
	@PostMapping("/calcularIMC")
	public String ejercicio4 (@RequestParam int peso, int altura) {
		String res = "";
		if (peso > 0 && altura > 0) {
			res += "<link rel=stylesheet href='estilos.css'>";
		}
		return res;
	}
}
