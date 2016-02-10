package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Wine extends Drinks {
	private boolean grapeBased;

	private int yearsAged;

	/**
	 * @param grapeBased
	 * @param yearsAged
	 */
	public Wine() {
		super();
		this.grapeBased = RequestInput.getBoolean("Is " + this.getBrand() + " was made from grape? ");
		this.yearsAged = RequestInput.getInt("How many years is " + this.getBrand() + "? ");
	}

	/**
	 * @param grapeBased
	 * @param yearsAged
	 */
	public Wine(boolean grapeBased, int yearsAged) {
		super();
		this.grapeBased = grapeBased;
		this.yearsAged = yearsAged;
	}

	/**
	 * @param grapeBased
	 * @param yearsAged
	 */
	public Wine(String brand) {
		this(RequestInput.getBoolean("Is " + brand + " was made from grape? "),
				RequestInput.getInt("How many years is " + brand + "? "));
	}

	public int getYearsAged() {
		return yearsAged;
	}

	public boolean isGrapeBased() {
		return grapeBased;
	}

	public void setGrapeBased(boolean grapeBased) {
		this.grapeBased = grapeBased;
	}

	public void setYearsAged(int yearsAged) {
		this.yearsAged = yearsAged;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", grapeBased=");
		builder.append(grapeBased);
		builder.append(", yearsAged=");
		builder.append(yearsAged);
		builder.append("]");
		return builder.toString();
	}

}
