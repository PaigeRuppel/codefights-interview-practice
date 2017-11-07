package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeBook {

	public String[][] groupingDishes(String[][] dishes) {
		Set<String> uniqueIngredients = new HashSet<>();
		List<String> repeatIngredients = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		
		for (int dish = 0; dish < dishes.length; dish++) {
			for (int ingredient = 1; ingredient < dishes[dish].length; ingredient++) {
				String currentIngredient = dishes[dish][ingredient];
				if (uniqueIngredients.contains(currentIngredient) && !repeatIngredients.contains(currentIngredient)) {
					repeatIngredients.add(currentIngredient);
					temp.add(currentIngredient);
				}
				uniqueIngredients.add(currentIngredient);
			}
		}

		Collections.sort(repeatIngredients);
		Collections.sort(temp);

		for (int dish = 0; dish < dishes.length; dish++) {
			for (int ingredient = 1; ingredient < dishes[dish].length; ingredient++) {
				String currentDish = dishes[dish][0];
				String currentIngredient = dishes[dish][ingredient];
				if (repeatIngredients.contains(currentIngredient)) {
					int index = repeatIngredients.indexOf(currentIngredient);
					String currentEntry = temp.get(index);
					String newEntry = currentEntry + "," + currentDish;
					temp.remove(index);
					temp.add(index, newEntry);
				}
			}
		}

		String[][] sorted = new String[repeatIngredients.size()][];
		for (int i = 0 ; i < temp.size(); i ++) {
			String[] entry = temp.get(i).split(",");
			String[] recipes = new String[entry.length - 1];
			for (int k = 0; k < recipes.length; k++) {
				recipes[k] = entry[k + 1];
			}
			Arrays.sort(recipes);
			for (int j = 1; j < entry.length; j++) {
				entry[j] = recipes[j - 1];
			}
			sorted[i] = entry;
		}
		
		return sorted;
	}

}
