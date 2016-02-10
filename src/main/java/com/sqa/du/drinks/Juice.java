package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Juice extends Drinks {
	private boolean vegetableBased;

	private boolean fruitBased;

	/**
	 * @param vegetableBased
	 * @param fruitBased
	 */
	public Juice() {
		super();
		this.vegetableBased = RequestInput.getBoolean("Was " + this.getBrand() + " made from vegetables ?");
		this.fruitBased = RequestInput.getBoolean("Was " + this.getBrand() + " made from fruites ?");
	}

	/**
	 * @param vegetableBased
	 * @param fruitBased
	 */
	public Juice(boolean vegetableBased, boolean fruitBased) {
		super();
		this.vegetableBased = vegetableBased;
		this.fruitBased = fruitBased;
	}

	/**
	 * @param vegetableBased
	 * @param fruitBased
	 */
	public Juice(String brand) {
		this(RequestInput.getBoolean("Was " + brand + " made from vegetables ?"),
				RequestInput.getBoolean("Was " + brand + " made from fruites ?"));
	}

	public boolean isFruitBased() {
		return fruitBased;
	}

	public boolean isVegetableBased() {
		return vegetableBased;
	}

	public void setFruitBased(boolean fruitBased) {
		this.fruitBased = fruitBased;
	}

	public void setVegetableBased(boolean vegetableBased) {
		this.vegetableBased = vegetableBased;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", vegetableBased=");
		builder.append(vegetableBased);
		builder.append(", fruitBased=");
		builder.append(fruitBased);
		builder.append("]");
		return builder.toString();
	}

}
