package br.com.erudio.services;

public class MathService {

	public Double sum(Double numberOne, Double numberTwo) {

		return numberOne + numberTwo;
	}

	public Double subtraction(Double numberOne, Double numberTwo) {

		return numberOne - numberTwo;
	}

	public Double multiply(Double numberOne, Double numberTwo) {

		return numberOne * numberTwo;
	}

	public Double division(Double numberOne, Double numberTwo) {

		return numberOne / numberTwo;
	}

	public Double average(Double numberOne, Double numberTwo, Double numberThree, Double numberFour) {

		Double average = (numberOne + numberTwo + numberThree + numberFour) / 4;

		return average;
	}

	public Double squareRoot(Double number) {

		return Math.sqrt(number);
	}
}
