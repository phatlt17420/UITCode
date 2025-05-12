package model;

public class MiniCalculatorModel {
	private double firstValue, secondValue, result;

	public MiniCalculatorModel() {

	}

	public double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void add() {
		this.result = this.firstValue + this.secondValue;

	}

	public void subtract() {
		this.result = this.firstValue - this.secondValue;

	}

	public void multiply() {
		this.result = this.firstValue * this.secondValue;

	}

	public void devide() {
		this.result = this.firstValue / this.secondValue;

	}

	public void mod() {
		this.result = this.firstValue % this.secondValue;

	}

	public void pow() {
		this.result = Math.pow(firstValue, secondValue);

	}
}
