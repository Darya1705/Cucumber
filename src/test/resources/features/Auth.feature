#language:ru

Функциональность: Перевод "5000" рублей

Сценарий:Перевод денег со второй карты на первуюв размере 5000 рублей(позитивный)

Пусть у авторизованного пользователя с именем "vasya" и паролем "qwerty123" с введенным проверочным кодом 'из смс' "12345" открыта страница "http://localhost:9999"
Когда пользователь на свою первую карту c id "92df3f1c-a033-48e6-8390-206f6b1f56c0" с карты с номером "5559 0000 0000 0002" переведет 5000 рублей
Тогда происходит успешный перевод со второй карты с "92df3f1c-a033-48e6-8390-206f6b1f56c0" на первую карту денег в размере 5000 рублей,
остаток на второй карте составляет 15000 рублей, то "vasya" попадает на страницу "Ваши карты"

