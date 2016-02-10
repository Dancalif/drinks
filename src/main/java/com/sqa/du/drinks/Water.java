package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Water extends Drinks {
	private boolean clear;

	private boolean odorless;

	/**
	 * @param clear
	 * @param odorless
	 */
	public Water() {
		super();
		this.clear = RequestInput.getBoolean("Is " + this.getBrand() + " clear drink? ");
		this.odorless = RequestInput.getBoolean("Is " + this.getBrand() + " odorless drink? ");
	}

	/**
	 * @param clear
	 * @param odorless
	 */
	public Water(boolean clear, boolean odorless) {
		super();
		this.clear = clear;
		this.odorless = odorless;
	}

	/**
	 * @param clear
	 * @param odorless
	 */
	public Water(String brand) {
		this(RequestInput.getBoolean("Is " + brand + " clear drink? "),
				RequestInput.getBoolean("Is " + brand + " odorless drink? "));
	}

	public boolean isClear() {
		return clear;
	}

	public boolean isOdorless() {
		return odorless;
	}

	public void setClear(boolean clear) {
		this.clear = clear;
	}

	public void setOdorless(boolean odorless) {
		this.odorless = odorless;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", clear=");
		builder.append(clear);
		builder.append(", odorless=");
		builder.append(odorless);
		builder.append("]");
		return builder.toString();
	}

}
