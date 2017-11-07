package com.paigeruppel.interviewpractice.hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

		Map<String, String> ingredientsMap = new HashMap<>();
		for (int dish = 0; dish < dishes.length; dish++) {
			for (int ingredient = 1; ingredient < dishes[dish].length; ingredient++) {
				String currentDish = dishes[dish][0];
				String currentIngredient = dishes[dish][ingredient];
				if (repeatIngredients.contains(currentIngredient)) {
					if (ingredientsMap.containsKey(currentIngredient)) {
						String currentValue = ingredientsMap.get(currentIngredient);
						String newValue = currentValue + "," + currentDish;
						ingredientsMap.put(currentIngredient, newValue);
					} else {
						ingredientsMap.put(currentIngredient, currentDish);
					}
				}
			}
		}

		String[][] sorted = new String[repeatIngredients.size()][];
		for (int i = 0; i < repeatIngredients.size(); i++) {
			String value = ingredientsMap.get(repeatIngredients.get(i));
			String[] entry = value.split(",");
			Arrays.sort(entry);
			String[] complete = new String[entry.length + 1];
			complete[0] = repeatIngredients.get(i);
			for (int j = 1; j < complete.length; j++) {
				complete[j] = entry[j - 1];
			}
			sorted[i] = complete;
		}
		return sorted;
	}

}
