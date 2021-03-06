#language: ru
Функционал: Сбербанк

  Сценарий: Приобретение жилья

  Когда выбрана вкладка
  Когда выбран пункт Рассчитать

  Тогда заголовок соответствует

  Когда заполняются поля:
    |Цель кредита|Покупка квартиры в новостройке|
    |Стоимость недвижимости|6000000|
    |Первоначальный взнос|3000000|
    |Срок кредитования|10|
    |Страхование жизни|нет|
    |Скидка от застройщика|нет|

  Тогда поля имеют значения:
    |Сумма кредита|3 000 000|
    |Ежемесячный платеж|40 313|
    |Необходимый доход|57 590|
    |Процентная ставка|10,4|



