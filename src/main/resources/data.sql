# delete
# from Ingredient_Ref;
# delete
# from Taco;
# delete
# from Taco_Order;

# delete
# from Ingredient;
#
# create table if not exists taco_order_tacos
# (
#     order_id bigint not null,
#     taco_id  bigint not null
# );
#
# create table if not exists taco_ingredients
# (
#     taco_id        bigint     not null,
#     ingredients_id varchar(4) not null
# );
# insert into Ingredient (id, name, type)
# values ('FLTO', 'Flour Tortilla', 'WRAP');
# insert into Ingredient (id, name, type)
# values ('COTO', 'Corn Tortilla', 'WRAP');
# insert into Ingredient (id, name, type)
# values ('GRBF', 'Ground Beef', 'PROTEIN');
# insert into Ingredient (id, name, type)
# values ('CARN', 'Carnitas', 'PROTEIN');
# insert into Ingredient (id, name, type)
# values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
# insert into Ingredient (id, name, type)
# values ('LETC', 'Lettuce', 'VEGGIES');
# insert into Ingredient (id, name, type)
# values ('CHED', 'Cheddar', 'CHEESE');
# insert into Ingredient (id, name, type)
# values ('JACK', 'Monterrey Jack', 'CHEESE');
# insert into Ingredient (id, name, type)
# values ('SLSA', 'Salsa', 'SAUCE');
# insert into Ingredient (id, name, type)
# values ('SRCR', 'Sour Cream', 'SAUCE');
#

# gen db
# create table ingredient
# (
#     id   varchar(50) null,
#     name varchar(50) null,
#     type varchar(50) null
# );
#
# create table taco
# (
#     id            int auto_increment
#         primary key,
#     name          varchar(50) null,
#     created_at    timestamp   null,
#     taco_order_id int         null
# );
#
# create table taco_ingredients
# (
#     taco_id        bigint     not null,
#     ingredients_id varchar(4) not null
# );
#
# create table taco_order
# (
#     id              int auto_increment
#         primary key,
#     delivery_name   varchar(50) null,
#     delivery_street varchar(50) null,
#     delivery_city   varchar(50) null,
#     delivery_state  varchar(50) null,
#     delivery_zip    varchar(50) null,
#     cc_number       varchar(50) null,
#     cc_expiration   varchar(50) null,
#     cc_cvv          varchar(5)  null,
#     placed_at       timestamp   null,
#     created_at      date        null
# );
