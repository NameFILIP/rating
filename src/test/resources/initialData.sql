-- Brand
INSERT INTO Brand (id, name) VALUES (1, 'Acer');
INSERT INTO Brand (id, name) VALUES (2, 'Alcatel');
INSERT INTO Brand (id, name) VALUES (3, 'Apple');
INSERT INTO Brand (id, name) VALUES (4, 'ASUS');
INSERT INTO Brand (id, name) VALUES (5, 'Blackberry');
INSERT INTO Brand (id, name) VALUES (6, 'Fly');
INSERT INTO Brand (id, name) VALUES (7, 'Gigabyte');
INSERT INTO Brand (id, name) VALUES (8, 'HTC');
INSERT INTO Brand (id, name) VALUES (9, 'Huawei');
INSERT INTO Brand (id, name) VALUES (10, 'Lenovo');
INSERT INTO Brand (id, name) VALUES (11, 'LG');
INSERT INTO Brand (id, name) VALUES (12, 'Nokia');
INSERT INTO Brand (id, name) VALUES (13, 'Philips');
INSERT INTO Brand (id, name) VALUES (14, 'Samsung');
INSERT INTO Brand (id, name) VALUES (15, 'Sony');
INSERT INTO Brand (id, name) VALUES (16, 'SonyEricsson');

-- User
INSERT INTO User (id, first_name, last_name, birth_date, email, password) VALUES (1, 'Ivan', 'Ivanov', CURDATE(), 'reviewer@rating.com', 'reviewer');
INSERT INTO User (id, first_name, last_name, birth_date, email, password) VALUES (2, 'Admin', 'Adminov', CURDATE(), 'admin@rating.com', 'admin');

-- Category
-- 1st level
INSERT INTO Category (id, name) VALUES (1, 'Ноутбуки');
INSERT INTO Category (id, name) VALUES (2, 'Планшеты и электронные книги');
INSERT INTO Category (id, name) VALUES (3, 'Компьютеры');
INSERT INTO Category (id, name) VALUES (4, 'Программное обеспечение');
INSERT INTO Category (id, name) VALUES (5, 'Оргтехника');
INSERT INTO Category (id, name) VALUES (6, 'Телефоны');
INSERT INTO Category (id, name) VALUES (7, 'Фото и видео');

-- 2nd level

INSERT INTO Category (id, name, category_id) VALUES (8, 'Ноутбуки', 1);
INSERT INTO Category (id, name, category_id) VALUES (9, 'Мыши для ноутбуков', 1);
INSERT INTO Category (id, name, category_id) VALUES (10, 'Аккумуляторы для ноутбуков', 1);
INSERT INTO Category (id, name, category_id) VALUES (11, 'БП для ноутбуков', 1);
INSERT INTO Category (id, name, category_id) VALUES (12, 'SSD-накопители', 1);
INSERT INTO Category (id, name, category_id) VALUES (13, 'Внешние HDD', 1);
INSERT INTO Category (id, name, category_id) VALUES (14, 'Аксессуары', 1);
INSERT INTO Category (id, name, category_id) VALUES (15, 'Веб-камеры', 1);
INSERT INTO Category (id, name, category_id) VALUES (16, 'Планшеты', 2);
INSERT INTO Category (id, name, category_id) VALUES (17, 'Аксессуары для планшетов и электронных книг', 2);
INSERT INTO Category (id, name, category_id) VALUES (18, 'Защитные пленки', 2);
INSERT INTO Category (id, name, category_id) VALUES (19, 'Карты памяти', 2);
INSERT INTO Category (id, name, category_id) VALUES (20, 'Наушники', 2);
INSERT INTO Category (id, name, category_id) VALUES (21, 'Bluetooth-гарнитуры', 2);
INSERT INTO Category (id, name, category_id) VALUES (22, 'Портативная акустика', 2);
INSERT INTO Category (id, name, category_id) VALUES (23, 'Зарядные устройства', 2);
INSERT INTO Category (id, name, category_id) VALUES (24, 'Универсальные мобильные батареи', 2);
INSERT INTO Category (id, name, category_id) VALUES (25, 'Автомобильные держатели и комплекты', 2);
INSERT INTO Category (id, name, category_id) VALUES (26, 'Стилусы', 2);
INSERT INTO Category (id, name, category_id) VALUES (27, 'Док-станции', 2);
INSERT INTO Category (id, name, category_id) VALUES (28, 'Кабели синхронизации', 2);
INSERT INTO Category (id, name, category_id) VALUES (29, 'Электронные книги', 2);
INSERT INTO Category (id, name, category_id) VALUES (30, 'Чехлы и обложки', 2);
INSERT INTO Category (id, name, category_id) VALUES (31, 'Фонарики', 2);
INSERT INTO Category (id, name, category_id) VALUES (32, 'Зарядные устройства', 2);
INSERT INTO Category (id, name, category_id) VALUES (33, 'Персональные компьютеры', 3);
INSERT INTO Category (id, name, category_id) VALUES (34, 'Неттопы и моноблоки', 3);
INSERT INTO Category (id, name, category_id) VALUES (35, 'Мониторы', 3);
INSERT INTO Category (id, name, category_id) VALUES (36, 'Комплектующие', 3);
INSERT INTO Category (id, name, category_id) VALUES (37, 'ПО', 3);
INSERT INTO Category (id, name, category_id) VALUES (38, 'Сетевое оборудование', 3);
INSERT INTO Category (id, name, category_id) VALUES (39, 'ИБП', 3);
INSERT INTO Category (id, name, category_id) VALUES (40, 'Стабилизаторы напряжения', 3);
INSERT INTO Category (id, name, category_id) VALUES (41, 'Сетевые фильтры ', 3);
INSERT INTO Category (id, name, category_id) VALUES (42, 'Графические планшеты ', 3);
INSERT INTO Category (id, name, category_id) VALUES (43, 'Аксессуары для ПК', 3);
INSERT INTO Category (id, name, category_id) VALUES (44, 'Игры', 4);
INSERT INTO Category (id, name, category_id) VALUES (45, 'Операционные ', 4);
INSERT INTO Category (id, name, category_id) VALUES (46, 'системы', 4);
INSERT INTO Category (id, name, category_id) VALUES (47, 'Офисные приложения', 4);
INSERT INTO Category (id, name, category_id) VALUES (48, 'Антивирусы', 4);
INSERT INTO Category (id, name, category_id) VALUES (49, 'Распознавание текста', 4);
INSERT INTO Category (id, name, category_id) VALUES (50, 'Переводчики и словари', 4);
INSERT INTO Category (id, name, category_id) VALUES (51, 'Архиваторы', 4);
INSERT INTO Category (id, name, category_id) VALUES (52, 'Системные утилиты', 4);
INSERT INTO Category (id, name, category_id) VALUES (53, 'Серверное ', 4);
INSERT INTO Category (id, name, category_id) VALUES (54, 'ПО', 4);
INSERT INTO Category (id, name, category_id) VALUES (55, 'CMS', 4);
INSERT INTO Category (id, name, category_id) VALUES (56, 'САПР', 4);
INSERT INTO Category (id, name, category_id) VALUES (57, 'СУБД (системы управления базами данных)', 4);
INSERT INTO Category (id, name, category_id) VALUES (58, 'ПО для мобильных устройств', 4);
INSERT INTO Category (id, name, category_id) VALUES (59, 'Принтеры и МФУ', 5);
INSERT INTO Category (id, name, category_id) VALUES (60, 'Оригинальные расходные материалы', 5);
INSERT INTO Category (id, name, category_id) VALUES (61, 'Совместимые расходные материалы', 5);
INSERT INTO Category (id, name, category_id) VALUES (62, 'Сканеры', 5);
INSERT INTO Category (id, name, category_id) VALUES (63, 'Проводные телефоны', 5);
INSERT INTO Category (id, name, category_id) VALUES (64, 'Радиотелефоны', 5);
INSERT INTO Category (id, name, category_id) VALUES (65, 'Факсы', 5);
INSERT INTO Category (id, name, category_id) VALUES (66, 'Шредеры', 5);
INSERT INTO Category (id, name, category_id) VALUES (67, 'Ламинаторы', 5);
INSERT INTO Category (id, name, category_id) VALUES (68, 'Биндеры (брошюровщики)', 5);
INSERT INTO Category (id, name, category_id) VALUES (69, 'Проекторы', 5);
INSERT INTO Category (id, name, category_id) VALUES (70, 'Экраны', 5);
INSERT INTO Category (id, name, category_id) VALUES (71, 'Аксессуары для проекторов', 5);
INSERT INTO Category (id, name, category_id) VALUES (72, 'Чистящие средства', 5);
INSERT INTO Category (id, name, category_id) VALUES (73, 'Смартфоны', 6);
INSERT INTO Category (id, name, category_id) VALUES (74, 'Мобильные телефоны', 6);
INSERT INTO Category (id, name, category_id) VALUES (75, 'Офисные телефоны', 6);
INSERT INTO Category (id, name, category_id) VALUES (76, 'Bluetooth- и проводные гарнитуры', 6);
INSERT INTO Category (id, name, category_id) VALUES (77, 'Умные часы и браслеты', 6);
INSERT INTO Category (id, name, category_id) VALUES (78, 'Фотоаппараты', 7);
INSERT INTO Category (id, name, category_id) VALUES (79, 'Видеокамеры', 7);
INSERT INTO Category (id, name, category_id) VALUES (80, 'Экшн-камеры', 7);
INSERT INTO Category (id, name, category_id) VALUES (81, 'Объективы', 7);
INSERT INTO Category (id, name, category_id) VALUES (82, 'Вспышки', 7);
INSERT INTO Category (id, name, category_id) VALUES (83, 'Штативы', 7);
INSERT INTO Category (id, name, category_id) VALUES (84, 'Сумки и чехлы', 7);
INSERT INTO Category (id, name, category_id) VALUES (85, 'Аккумуляторы для фото- и видеокамер', 7);
INSERT INTO Category (id, name, category_id) VALUES (86, 'Зарядные устройства', 7);
INSERT INTO Category (id, name, category_id) VALUES (87, 'Цифровые фоторамки', 7);
INSERT INTO Category (id, name, category_id) VALUES (88, 'Фотопринтеры', 7);
INSERT INTO Category (id, name, category_id) VALUES (89, 'Карты памяти', 7);
INSERT INTO Category (id, name, category_id) VALUES (90, 'Чистящие средства', 7);
INSERT INTO Category (id, name, category_id) VALUES (91, 'Аксессуары для фото/видео', 7);
INSERT INTO Category (id, name, category_id) VALUES (92, 'Аксессуары для экшн-камер', 7);
INSERT INTO Category (id, name, category_id) VALUES (93, 'Аккумуляторы и батарейки', 7);


-- Products
INSERT INTO Product (id, name, brand_id, category_id) VALUES (1, 'iPhone 4', 3, 73);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (2, 'Google Nexus 5 16GB ', 11, 73);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (3, 'Galaxy Note 3 Jet', 14, 73);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (4, 'MacBook Air 13"', 3, 8);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (5, 'IdeaPad S110 ', 10, 8);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (6, 'Aspire E1-572G-34014G50Mnii', 1, 8);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (7, 'Galaxy Tab Pro', 14, 16);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (8, 'Xperia Tablet Z2', 15, 16);
INSERT INTO Product (id, name, brand_id, category_id) VALUES (9, 'iPad Air', 3, 16);

-- Reviews
INSERT INTO Review (id, product_id, user_id, grade, text, pros, cons, timestamp) VALUES (1, 1, 1, 10, 'The iphone is the best of the best.', 'it is fast', 'quite expensive', CURDATE());
INSERT INTO Review (id, product_id, user_id, grade, text, pros, cons, timestamp) VALUES (2, 1, 2, 2, 'I like Google, so I bought Google Nexus', 'the screen is small', 'very expensive', CURDATE());
INSERT INTO Review (id, product_id, user_id, grade, text, pros, cons, timestamp) VALUES (3, 2, 2, 10, 'Google is awesome, and Nexus phone is awesome too!', 'the screen is big', 'sometimes, it is slow', CURDATE());

-- Comments
INSERT INTO Comment (id, review_id, comment_id, user_id, text, timestamp) VALUES (1, 1, null, 2, 'I do not like apples', curdate());
INSERT INTO Comment (id, review_id, comment_id, user_id, text, timestamp) VALUES (2, 2, null, 2, 'I recommend it to everybody', curdate());
INSERT INTO Comment (id, review_id, comment_id, user_id, text, timestamp) VALUES (3, null, 1, 1, 'Apples are cool!', curdate());
INSERT INTO Comment (id, review_id, comment_id, user_id, text, timestamp) VALUES (4, null, 3, 2, 'Noooooo', curdate());
