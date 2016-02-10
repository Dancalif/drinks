package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Drinks {

	private String brand;

	private boolean liquid;

	/**
	 * @param brand
	 * @param liquid
	 */
	public Drinks() {
		super();
		this.brand = RequestInput.getString("What is a brand of your drink? ");
		this.liquid = RequestInput.getBoolean("Is your drink liquid? ");
	}

	/**
	 * @param brand
	 * @param liquid
	 */
	public Drinks(String brand, boolean liquid) {
		super();
		this.brand = brand;
		this.liquid = liquid;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isLiquid() {
		return liquid;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", liquid=");
		builder.append(liquid);
		builder.append("]");
		return builder.toString();
	}

}
