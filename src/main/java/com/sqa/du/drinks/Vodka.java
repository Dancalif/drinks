package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Vodka extends Drinks {
	private boolean wheatBased;

	private int minAlcoholPrecent;

	/**
	 * @param wheatBased
	 * @param minAlcoholPrecent
	 */
	public Vodka() {
		super();
		this.wheatBased = RequestInput.getBoolean("Is " + this.getBrand() + " made from wheat? ");
		this.minAlcoholPrecent = RequestInput
				.getInt("What is minimum alcoholic percent for the " + this.getBrand() + "? ");
	}

	/**
	 * @param wheatBased
	 * @param minAlcoholPrecent
	 */
	public Vodka(boolean wheatBased, int minAlcoholPrecent) {
		super();
		this.wheatBased = wheatBased;
		this.minAlcoholPrecent = minAlcoholPrecent;
	}

	/**
	 * @param wheatBased
	 * @param minAlcoholPrecent
	 */
	public Vodka(String brand) {
		this(RequestInput.getBoolean("Is " + brand + " made from wheat? "),
				RequestInput.getInt("What is minimum alcoholic percent for the " + brand + "? "));
	}

	public int getMinAlcoholPrecent() {
		return minAlcoholPrecent;
	}

	public boolean isWheatBased() {
		return wheatBased;
	}

	public void setMinAlcoholPrecent(int minAlcoholPrecent) {
		this.minAlcoholPrecent = minAlcoholPrecent;
	}

	public void setWheatBased(boolean wheatBased) {
		this.wheatBased = wheatBased;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", wheatBased=");
		builder.append(wheatBased);
		builder.append(", minAlcoholPrecent=");
		builder.append(minAlcoholPrecent);
		builder.append("]");
		return builder.toString();
	}
}
