package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Nonalcoholic extends Drinks {
	private boolean nonAlcoholic;

	private boolean healthy;

	/**
	 * @param nonAlcoholic
	 * @param healthy
	 */
	public Nonalcoholic() {
		super();
		this.healthy = RequestInput.getBoolean("Is it healthy drink? ");
		this.nonAlcoholic = RequestInput.getBoolean("Is it nonalcoholic drink? ");
	}

	/**
	 * @param nonAlcoholic
	 * @param healthy
	 */
	public Nonalcoholic(boolean nonAlcoholic, boolean healthy) {
		super();
		this.nonAlcoholic = nonAlcoholic;
		this.healthy = healthy;
	}

	/**
	 * @param nonAlcoholic
	 * @param healthy
	 */
	public Nonalcoholic(String brand) {
		this(RequestInput.getBoolean("Is " + brand + " healthy drink? "),
				RequestInput.getBoolean("Is " + brand + " nonalcoholic drink? "));
	}

	public boolean isHealthy() {
		return healthy;
	}

	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", nonAlcoholic=");
		builder.append(nonAlcoholic);
		builder.append(", healthy=");
		builder.append(healthy);
		builder.append("]");
		return builder.toString();
	}

}
