package br.edu.ifb.java_web_dev.model;

public class CalculadoraService {
 public static double somar (double a, double b) {
	 return a + b;
 }
 public static double subtrair (double a, double b) {
	 return a - b;
 }
 public static double multiplicar (double a, double b) {
	 return a * b;
}
 public static double dividir (double a, double b) throws IllegalArgumentException {
	if (b==0) {
		throw new  IllegalArgumentException("Denominador não pode ser zero.");
	}
	return a / b;
 } }
