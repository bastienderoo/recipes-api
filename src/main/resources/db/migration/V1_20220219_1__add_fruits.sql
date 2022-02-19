INSERT INTO ingredient_type(id, name, vege)
VALUES (1, 'Fruit', 0);

INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Abricot', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Apricot_and_cross_section.jpg/440px-Apricot_and_cross_section.jpg',
        48);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Airelle', 1, 'https://upload.wikimedia.org/wikipedia/commons/f/f1/Vaccinium_vitis-idaea_20060824_003.jpg', 25);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Amande', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Almond_2.JPG/440px-Almond_2.JPG', 600);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Ananas', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/Ananas_comosus_Victoria_P1190421.jpg/340px-Ananas_comosus_Victoria_P1190421.jpg',
        50);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Avocat', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Avocado_Hass_-_single_and_halved.jpg/440px-Avocado_Hass_-_single_and_halved.jpg',
        205);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Banane', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/440px-Bananas_white_background_DS.jpg',
        89);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Cassis', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Une_grappe_de_cassis.JPG/440px-Une_grappe_de_cassis.JPG',
        71);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Cerise', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Bing_Cherries_%28USDA_ARS%29.jpg/340px-Bing_Cherries_%28USDA_ARS%29.jpg',
        50);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Châtaigne', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Chestnut.jpg/440px-Chestnut.jpg',
        144);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Citron', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Lemon.jpg/440px-Lemon.jpg', 29);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Clémentine', 1,
        'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Oh_my_darling.jpg/580px-Oh_my_darling.jpg', 47);
INSERT INTO ingredient(name, ingredient_type_id, picture, calories)
VALUES ('Coing', 1, 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Quince.jpg/340px-Quince.jpg', 58);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Datte', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Figue fraîche', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Fraise', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Fraise des bois', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Framboise', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Fruit de la passion', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Grenade', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Groseille', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Groseille à maquereau', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Kaki', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Kiwi', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Kumquat', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Litchi', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Mandarine', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Mangue', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Marron', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Melon', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Mirabelle', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Mûre', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Myrtille', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Nectarine', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Noisette', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Noix', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Orange', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Orange sanguine', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Pamplemousse', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Papaye', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Pastèque', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Pêche', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Poire', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Pomme', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Prune', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Quetsche', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Raisin', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Reine-claude', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Tomate', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Tomate charnue', 1);
INSERT INTO ingredient(name, ingredient_type_id)
VALUES ('Tomate Peretti', 1);


INSERT INTO recipe(name, picture)
VALUES ('Salade de fruits', 'https://assets.afcdn.com/recipe/20121128/4729_w128h128c1cx256cy192.webp');

INSERT INTO recipe_ingredient(quantity, unit, ingredient_id, recipe_id)
VALUES (4, 0, 6, 1);
INSERT INTO recipe_ingredient(quantity, unit, ingredient_id, recipe_id)
VALUES (250, 1, 15, 1);
INSERT INTO recipe_ingredient(quantity, unit, ingredient_id, recipe_id)
VALUES (2, 0, 36, 1);
INSERT INTO recipe_ingredient(quantity, unit, ingredient_id, recipe_id)
VALUES (3, 0, 47, 1);
