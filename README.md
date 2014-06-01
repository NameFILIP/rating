## Описание API

### Review

GET     /products/{id}/reviews - Получить отзывы для продукта
POST    /products/{id}/reviews - Добавить отзыв к продукту
GET     /reviews/{id} - Получить отзыв по идентификатору
PUT     /reviews/{id} - Изменить отзыв
DELETE  /reviews/{id} - Удалить отзыв

### Comment

GET     /reviews/{id}/comments - Получить комментарии к отзыву
POST    /reviews/{id}/comments - Добавить комментарий к отзыву
POST    /comments/{id}/comments - Добавить комментарий к комментарию
GET     /comments/{id} - Получить комментарий по идентификатору
PUT     /comments/{id} - Изменить комментарий
DELETE  /comments/{id} - Удалить комментарий (только текст)

### Product

GET     /products/{id}/rating - Получить рейтинг товара
