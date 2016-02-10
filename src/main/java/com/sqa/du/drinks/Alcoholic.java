package com.sqa.du.drinks;

import com.sqa.du.util.helper.RequestInput;

public class Alcoholic extends Drinks {
	private boolean alcoholic;

	private int minAgePurchase;

	/**
	 * @param alcoholic
	 * @param minAgePurchase
	 */
	public Alcoholic() {
		super();
		this.alcoholic = RequestInput.getBoolean("Is it alcoholic drink? ");
		this.minAgePurchase = RequestInput.getInt("What age I should be to legally buy the drink? ");
	}

	/**
	 * @param alcoholic
	 * @param minAgePurchase
	 */
	public Alcoholic(boolean alcoholic, int minAgePurchase) {
		super();
		this.alcoholic = alcoholic;
		this.minAgePurchase = minAgePurchase;
	}

	/**
	 * @param alcoholic
	 * @param minAgePurchase
	 */
	public Alcoholic(String brand) {
		this(RequestInput.getBoolean("Is " + brand + " alcoholic drink? "),
				RequestInput.getInt("What age I should be to legally buy a " + brand + "? "));
	}

	public int getMinAgePurchase() {
		return minAgePurchase;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}

	public void isAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}

	public void setMinAgePurchase(int minAgePurchase) {
		this.minAgePurchase = minAgePurchase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(", alcoholic=");
		builder.append(alcoholic);
		builder.append(", minAgePurchase=");
		builder.append(minAgePurchase);
		builder.append("]");
		return builder.toString();
	}

}
