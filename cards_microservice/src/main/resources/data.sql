
--Informacion sobre las tarjetas
insert into card (name) values ('B Smart')
insert into card (name) values ('Afinity Card')
insert into card (name) values ('Clasica')
insert into card (name) values ('Office Depot')
insert into card (name) values ('Costco')
insert into card (name) values ('Best Buy Banamex')
insert into card (name) values ('The Home Depot')
insert into card (name) values ('Oro')
insert into card (name) values ('Platinum')
insert into card (name) values ('Citi/AAdvantage')
insert into card (name) values ('Banamex Teleton')
insert into card (name) values ('APAC')
insert into card (name) values ('Marti Clasica Citibanamex')
insert into card (name) values ('América Deporteismo')
insert into card (name) values ('Pumas Deporteismo')
insert into card (name) values ('Toluca Deporteismo')
insert into card (name) values ('La verde Deporteismo')
insert into card (name) values ('Marti Premium Citibanamex')


--Informacion sobre las pasiones

--Shopping
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',18,23,7000,14999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',24,32,7000,14999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',33,75,7000,14999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',18,23,15000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',24,32,15000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',33,75,15000,34999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',18,23,35000,49999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',24,75,35000,49999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',18,23,50000,999999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Shopping',24,75,50000,999999)




--Travels
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',18,75,12000,29999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',18,23,30000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',24,75,30000,34999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',18,23,35000,49999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',24,75,35000,49999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',18,22,50000,99999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Travels',23,75,50000,99999)

--Help
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Help',18,75,12000,99999)

--My bussiness
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My bussiness',18,75,7000,99999)

--Sports
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Sports',18,75,7000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('Sports',18,75,35000,99999)

--My style
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',18,32,7000,14999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',33,75,7000,14999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',18,23,15000,29999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',24,32,15000,29999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',33,75,15000,29999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',18,23,30000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',24,32,30000,34999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',33,75,30000,34999)

insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',18,23,35000,99999)
insert into passion (name,min_age,max_age,min_salary,max_salary) values ('My style',24,75,35000,99999)


--Informacion sobre relaciones de tarjetas
insert into passion_cards (passion_id,card_id) values (1,1)
insert into passion_cards (passion_id,card_id) values (1,2)

insert into passion_cards (passion_id,card_id) values (2,1)
insert into passion_cards (passion_id,card_id) values (2,3)
insert into passion_cards (passion_id,card_id) values (2,2)
insert into passion_cards (passion_id,card_id) values (2,4)
insert into passion_cards (passion_id,card_id) values (2,5)
insert into passion_cards (passion_id,card_id) values (2,6)
insert into passion_cards (passion_id,card_id) values (2,7)

insert into passion_cards (passion_id,card_id) values (3,3)
insert into passion_cards (passion_id,card_id) values (3,4)
insert into passion_cards (passion_id,card_id) values (3,5)
insert into passion_cards (passion_id,card_id) values (3,6)
insert into passion_cards (passion_id,card_id) values (3,7)

insert into passion_cards (passion_id,card_id) values (4,1)
insert into passion_cards (passion_id,card_id) values (4,2)




insert into passion_cards (passion_id,card_id) values (5,8)
insert into passion_cards (passion_id,card_id) values (5,2)
insert into passion_cards (passion_id,card_id) values (5,4)
insert into passion_cards (passion_id,card_id) values (5,5)
insert into passion_cards (passion_id,card_id) values (5,6)
insert into passion_cards (passion_id,card_id) values (5,7)




insert into passion_cards (passion_id,card_id) values (6,8)
insert into passion_cards (passion_id,card_id) values (6,4)
insert into passion_cards (passion_id,card_id) values (6,5)
insert into passion_cards (passion_id,card_id) values (6,6)
insert into passion_cards (passion_id,card_id) values (6,7)




insert into passion_cards (passion_id,card_id) values (7,1)
insert into passion_cards (passion_id,card_id) values (7,2)




insert into passion_cards (passion_id,card_id) values (8,9)
insert into passion_cards (passion_id,card_id) values (8,4)
insert into passion_cards (passion_id,card_id) values (8,5)
insert into passion_cards (passion_id,card_id) values (8,6)
insert into passion_cards (passion_id,card_id) values (8,7)




insert into passion_cards (passion_id,card_id) values (9,1)
insert into passion_cards (passion_id,card_id) values (9,2)




insert into passion_cards (passion_id,card_id) values (10,9)




insert into passion_cards (passion_id,card_id) values (11,10)




insert into passion_cards (passion_id,card_id) values (12,10)




insert into passion_cards (passion_id,card_id) values (13,10)
insert into passion_cards (passion_id,card_id) values (13,9)




insert into passion_cards (passion_id,card_id) values (14,10)




insert into passion_cards (passion_id,card_id) values (15,10)
insert into passion_cards (passion_id,card_id) values (15,9)




insert into passion_cards (passion_id,card_id) values (16,10)




insert into passion_cards (passion_id,card_id) values (17,9)




insert into passion_cards (passion_id,card_id) values (18,11)
insert into passion_cards (passion_id,card_id) values (18,12)




insert into passion_cards (passion_id,card_id) values (19,4)
insert into passion_cards (passion_id,card_id) values (19,5)
insert into passion_cards (passion_id,card_id) values (19,6)
insert into passion_cards (passion_id,card_id) values (19,7)




insert into passion_cards (passion_id,card_id) values (20,13)
insert into passion_cards (passion_id,card_id) values (20,14)
insert into passion_cards (passion_id,card_id) values (20,15)
insert into passion_cards (passion_id,card_id) values (20,16)
insert into passion_cards (passion_id,card_id) values (20,17)




insert into passion_cards (passion_id,card_id) values (21,18)




insert into passion_cards (passion_id,card_id) values (22,1)
insert into passion_cards (passion_id,card_id) values (22,2)




insert into passion_cards (passion_id,card_id) values (23,1)




insert into passion_cards (passion_id,card_id) values (24,1)
insert into passion_cards (passion_id,card_id) values (24,2)




insert into passion_cards (passion_id,card_id) values (25,1)
insert into passion_cards (passion_id,card_id) values (25,8)
insert into passion_cards (passion_id,card_id) values (25,2)




insert into passion_cards (passion_id,card_id) values (26,8)




insert into passion_cards (passion_id,card_id) values (27,1)
insert into passion_cards (passion_id,card_id) values (27,2)




insert into passion_cards (passion_id,card_id) values (28,1)
insert into passion_cards (passion_id,card_id) values (28,9)
insert into passion_cards (passion_id,card_id) values (28,2)




insert into passion_cards (passion_id,card_id) values (29,9)




insert into passion_cards (passion_id,card_id) values (30,1)




insert into passion_cards (passion_id,card_id) values (31,1)
insert into passion_cards (passion_id,card_id) values (31,9)