package com.sqa.du.drinks;

public class DrinksTest extends Drinks {
	public void test() {
		Drinks[] drinks = new Drinks[] { new Wine(), new Vodka(), new Juice(), new Water() };

		for (int i = 0; i <= drinks.length; i++)

		{

			System.out.println("My Drink: " + (i + 1) + ": " + drinks[i]);
		}
	}
}