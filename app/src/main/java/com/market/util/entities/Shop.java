package com.market.util.entities;

import android.content.Context;
import android.content.SharedPreferences;

import com.market.util.App;
import com.market.util.R;

import java.util.Arrays;
import java.util.List;

public class Shop {
    private static final String STORAGE = "shop";

    public static Shop get() {
        return new Shop();
    }

    private SharedPreferences storage;

    private Shop() {
        storage = App.getInstance().getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
    }

    public List<Item> getData() {
        return Arrays.asList(
                new Item(1,
                        "Chicken Curry",
                        "Serves: 3",
                        "11⁄2 lbs. chicken, chopped into serving pieces\n" +
                                "1 medium potato, peeled and diced\n" +
                                "3⁄4 cups frozen green peas\n" +
                                "2 cups coconut milk\n" +
                                "11⁄4 tablespoons curry powder\n" +
                                "2 teaspoons turmeric powder\n" +
                                "11⁄2 teaspoons ginger powder\n" +
                                "1 medium tomato, chopped\n" +
                                "1 medium yellow onion, chopped\n" +
                                "3 cloves garlic, minced\n" +
                                "a dash of cayenne pepper powder\n" +
                                "3 tablespoons cooking oil\n" +
                                "Salt to taste",
                        "1. Combine ginger powder, turmeric powder, and 11⁄2 teaspoons salt in a bowl. Mix well.\n" +
                                "2. Rub the mixture all over the chopped chicken pieces. Let it stay for 15 minutes.\n" +
                                "3. Heat the cooking oil in a cooking pot.\n" +
                                "4. Once the oil is hot, pan fry the chicken for about 2 minutes per side.\n" +
                                "5. Remove the chicken and temporarily place in a plate.\n" +
                                "6. Meanwhile, saute the onion, tomato, and garlic in the remaining cooking oil.\n" +
                                "7. Put the chicken back in the cooking pot when the onion becomes soft. Cook for 3 minutes.\n" +
                                "8. Pour-in the coconut milk. Bring to a boil. Add the curry powder. Cover and simmer for 25 minutes (add a little water if needed).\n" +
                                "9. Add a dash of cayenne pepper. Put-in the diced potato, cook for 10 minutes. Make sure to stir once in a while.\n" +
                                "10. Add the green peas. Cook for 5 minutes.\n" +
                                "11. Add salt to taste. Stir.\n" +
                                "12. Transfer to a serving plate. Serve over white rice.\n" +
                                "13. Share and enjoy!",
                        R.drawable.shop1),
                new Item(2,
                        "Chopsuey",
                        "Serves: 5",
                        "1⁄4 lb. pork shoulder, thinly sliced\n" +
                                "1 head cauliflower, cut into florets\n" +
                                "1 medium carrot, sliced crosswise\n" +
                                "1 medium green bell pepper, chopped\n" +
                                "1 medium red bell pepper, chopped\n" +
                                "1⁄2 small cabbage, chopped into large pieces\n" +
                                "8 to 12 pieces boiled quail eggs\n" +
                                "1 medium yellow onion, sliced\n" +
                                "4 cloves garlic, crushed and chopped\n" +
                                "1 shrimp cube\n" +
                                "2 tablespoons oyster sauce\n" +
                                "1-tablespoon cornstarch\n" +
                                "1-cup water\n" +
                                "3 tablespoons cooking oil\n" +
                                "Salt and pepper to taste",
                        "1. Heat oil in a pan. Sauté the garlic and onion\n" +
                                "2. Once the onion gets soft, continue to sauté until the pork turns light brown.\n" +
                                "3. Pour the oyster sauce. Stir-fry for 3 minutes.\n" +
                                "4. Add the shrimp cube. Pour-in water. Let boil. Cover and cook until the water reduces to half.\n" +
                                "5. Add the cauliflower florets. Stir and add the carrot slices. Gently stir until the ingredients are well blended.\n" +
                                "6. Add the bell peppers and cabbage. Stir-fry for 3 to 5 minutes.\n" +
                                "7. Sprinkle some salt and pepper. Stir and cook for 3 minutes.\n" +
                                "8. Combine the cornstarch with 1⁄2 cup water. Stir until the cornstarch is diluted. Pour on the pan. Continue to cook while stirring until the texture of the sauce thickens.\n" +
                                "9. Add the quail eggs. Transfer to a serving plate.\n" +
                                "10. Serve. Share and enjoy!",
                        R.drawable.shop2),
                new Item(3,
                        "Pork Kaldereta",
                        "Serves: 5",
                        "2 lbs. Pork, cubed\n" +
                                "1 (15 oz.) can tomato sauce\n" +
                                "3⁄4 cup green olives\n" +
                                "1 medium red bell pepper, sliced\n" +
                                "1 medium green bell pepper, sliced\n" +
                                "2 medium baking potatoes, cut into large cubes\n" +
                                "2 medium carrots, sliced diagonally\n" +
                                "1 medium yellow onion, sliced\n" +
                                "2 teaspoons minced garlic\n" +
                                "32 oz. beef broth\n" +
                                "1⁄2 cup liver spread\n" +
                                "3 tablespoons cooking oil\n" +
                                "Salt and pepper to taste",
                        "1. Heat the oil in a cooking pot.\n" +
                                "2. Once the oil is hot, saute the garlic and onion.\n" +
                                "3. Add the pork. Stir and cook for for 5 minutes or until the color turns light to medium brown.\n" + "" +
                                "4. Pour-in the tomato sauce and beef broth. Let boil. Cover and simmer for 60 minutes.\n" +
                                "5. Add the liver spread. Stir and cook for 3 minutes.\n" +
                                "6. Put-in the carrots and potatoes. Cover and cook for 8 to 10 minutes.\n" +
                                "7. Add the olives and bell peppers. Cook covered for 8 minutes.\n" +
                                "8. Add salt and pepper to taste.\n" +
                                "9. Turn-off the heat. Transfer to a serving plate.\n" +
                                "10. Serve. Share and enjoy!",
                        R.drawable.shop3),
                new Item(4,
                        "Pork Nilaga",
                        "Serves: 6",
                        "1 slab (3 to 4 lbs.) baby back ribs, sliced\n" +
                                "3 medium potato, peeled and sliced\n" +
                                "1⁄2 small cabbage, sliced\n" +
                                "3 bunches of baby bok choy\n" +
                                "8 to 10 cups water\n" +
                                "1 large yellow onion, chopped\n" +
                                "1⁄2 teaspoon garlic powder\n" +
                                "1⁄4 teaspoon ground black pepper\n" +
                                "3 tablespoons fish sauce (patis)\n" +
                                "2 stalks celery, chopped",
                        "1. Pour the water in a soup pot. Let boil.\n" +
                                "2. Add the chopped onion, celery, ground black pepper, and garlic powder. Cover and boil in medium heat for 30 minutes.\n" +
                                "3. Add the pork baby back ribs. Cover and simmer for 60 to 90 minutes. (note: you can cook faster by boiling for 45 minutes, but simmering will make the meat more tender and will bring out the flavor). Add more water as needed.\n" +
                                "4. Put the potato and cabbage in the soup pot. Stir. Cover and boil for 5 minutes.\n" +
                                "5. Add the baby bok choy and stir-in the fish sauce. Cook for 1 minute.\n" +
                                "6. Transfer to a serving plate. Serve.\n" +
                                "7. Share and enjoy",
                        R.drawable.shop4),
                new Item(5,
                        "Chicken Barbecue",
                        "Serves: 4",
                        "11⁄2 to 2 lbs chicken, cut into serving pieces\n" +
                                "1 recipe of chicken barbecue marinade basting sauce\n" +
                                "1⁄4 cup barbecue sauce\n" +
                                "1 tablespoon soy sauce\n" +
                                "1 teaspoon lemon juice\n" +
                                "1⁄4 cup lemon lime soda",
                        "1. Make the basting sauce by combining barbecue sauce, soy sauce, lemon juice, and lemon lime soda in a bowl. Mix well. Set aside.\n" +
                                "2. Arrange the chicken in a large bowl. Pour-in the chicken barbecue marinade. Make sure that all the chicken slices are coated with the marinade. Cover the bowl with a cling wrap. Refrigerate for at least 1 hour (the longer, the better).\n" +
                                "3. Heat-up your grill (around 320F). If you are using a charcoal grill, limit the charcoal in the two sides leaving an opening on the middle. If you are using a gas grill, only activate all the burner except the one in the middle (I am referring to the grill burners, not the one on the side, if your grill has one).\n" +
                                "4. Skewer at least 2 chicken slices in bamboo or metal skewers. Arrange the chicken in the middle of the grill wherein there is no direct heat in the bottom. The heat should be coming from the sides. This will take sometime to cook the chicken, but it prevents the skin from burning.\n" +
                                "5. Cover the grill (if applicable), and barbecue the chicken for 12 to 15 minutes.\n" +
                                "6. Turn the chicken over to barbecue the other side. Baste the top of the chicken with the basting sauce. Barbecue for another 12 to 15 minutes.\n" +
                                "7. Flip the chicken once more and baste the top part. Continue to barbecue for 12 to 15 minutes.\n" +
                                "8. Turn the chicken over for the last time and brush some basting sauce on the top part. Continue to barbecue for 12 to 15 minutes.\n" +
                                "9. Using a meat thermometer, measure the internal temperature of the chicken. A safe temperature for poultry is 165F. If the temperature of your chicken barbecue is 160F and above, this means you are done; otherwise, continue to barbecue the chicken until the desired internal temperature is achieved.\n" +
                                "10. Transfer to a serving plate.\n" +
                                "11. Serve. share and enjoy!",
                        R.drawable.shop5),
                new Item(6,
                        "Crab Legs",
                        "Serves: 3",
                        "2 lbs snow crab legs, cleaned\n" +
                                "rind from 1 lemon\n" +
                                "1 tablespoon\n" +
                                "6 cups water\n" +
                                "1⁄2 cup apple cider or white vinegar\n" +
                                "4 to 6 pieces crushed garlic",
                        "1. Pour water on a tall steamer. Let boil.\n" +
                                "2. Using a grater, grate the skin of the lemon to produce lemon rinds and then add these in boiling water.\n" +
                                "3. Arrange the crab legs in the steamer. Steam for 4 to 5 minutes.\n" +
                                "4. Prepare the vinegar dip by combining vinegar and crushed garlic in a small bowl.\n" +
                                "5. Arrange the snow crab legs in a plate and serve with vinegar dip.\n" +
                                "6. Share and enjoy!",
                        R.drawable.shop6));
    }

    public boolean isRated(int itemId) {
        return storage.getBoolean(String.valueOf(itemId), false);
    }

    public void setRated(int itemId, boolean isRated) {
        storage.edit().putBoolean(String.valueOf(itemId), isRated).apply();
    }
}