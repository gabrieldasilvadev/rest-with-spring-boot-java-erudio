package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.services.MathService;
import br.com.erudio.utils.NumberConverter;
import br.com.erudio.utils.NumberValidator;

@RestController
public class MathController {

	MathService mathService = new MathService();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberValidator.isNumeric(numberOne) || !NumberValidator.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.sum(NumberConverter.convertToDouble(numberTwo), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {

		if (!NumberValidator.isNumeric(numberOne) || !NumberValidator.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.subtraction(NumberConverter.convertToDouble(numberOne),
				NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiply(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {

		if (!NumberValidator.isNumeric(numberOne) || !NumberValidator.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.multiply(NumberConverter.convertToDouble(numberOne),
				NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {

		if (!NumberValidator.isNumeric(numberOne) || !NumberValidator.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.division(NumberConverter.convertToDouble(numberOne),
				NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/average/{numberOne}/{numberTwo}/{numberThree}/{numberFour}", method = RequestMethod.GET)
	public Double average(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo,
			@PathVariable(value = "numberThree") String numberThree,
			@PathVariable(value = "numberFour") String numberFour) {

		if (!NumberValidator.isNumeric(numberOne) || !NumberValidator.isNumeric(numberTwo)
				|| !NumberValidator.isNumeric(numberThree) || !NumberValidator.isNumeric(numberFour))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.average(NumberConverter.convertToDouble(numberOne),
				NumberConverter.convertToDouble(numberTwo), NumberConverter.convertToDouble(numberThree),
				NumberConverter.convertToDouble(numberFour));
	}

	@RequestMapping(value = "/square-root/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "number") String number) {

		if (!NumberValidator.isNumeric(number))
			throw new UnsupportedMathOperationException("Please set a numeric value!");

		return mathService.squareRoot(NumberConverter.convertToDouble(number));
	}

}
