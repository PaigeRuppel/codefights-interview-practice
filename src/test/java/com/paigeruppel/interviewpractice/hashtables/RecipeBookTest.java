package com.paigeruppel.interviewpractice.hashtables;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RecipeBookTest {

	private RecipeBook underTest;
	
	@Before
	public void setup() {
		underTest = new RecipeBook();
	}
	
	@Test
	public void shouldReturnSortedByCommonIngredientsTestCase1() {
		String[][] dishes = {{"Salad","Tomato","Cucumber","Salad","Sauce"}, 
				{"Pizza","Tomato","Sausage","Sauce","Dough"}, 
				{"Quesadilla","Chicken","Cheese","Sauce"}, 
				{"Sandwich","Salad","Bread","Tomato","Cheese"}};
		String[][] sorted = {{"Cheese","Quesadilla","Sandwich"}, 
				{"Salad","Salad","Sandwich"}, 
				{"Sauce","Pizza","Quesadilla","Salad"}, 
				{"Tomato","Pizza","Salad","Sandwich"}};
		assertThat(underTest.groupingDishes(dishes), is(sorted));
	}
}
