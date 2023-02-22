# Домашнее задание по теме «Коллекции HashSet и HashMap»

## Задача 1 (обязательная)
Перед вами [классический](https://loremipsum.io/) для графического дизайна текст Lorem Ipsum:

>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
Вам нужно определить, какая буква встречалась в нём чаще всего и какая реже всего.
Определить, является ли символ буквой можно с помощью встроенного статического метода `Character.isLetter` (поэкспериментируйте с ним, если сходу непонятно как им пользоваться или загуглите на него документацию - уже пора развивать этот навык).

Считать, конечно, нужно не руками.
Заведите в `Main` статическое текстовое поле с содержимым из текста выше, а в `main` напишите программу, решающую поставленную задачу.

### Подсказки
Заведите мапу `Map<Character, Integer>`, в которой для каждого символа будете хранить количество раз, которое вы его встретили.
Изначально мапа пустая. `Character` это ссылочный тип-обёртка для `char`, как `Integer` для `int`.

Пройдитесь циклом по символам строки. Символы можно получать по индексу с помощью метода `.charAt(ИНДЕКС)`.
Для каждого символа проверьте, есть ли он в мапе. Может быть два случая:
1. Его нет в мапе. Значит, мы встретили его в первый раз и вставляем в мапу пару где ключ это наш символ, а значение это 1 (тк встретили его всего один раз).
2. Он есть в мапе. Значит он нам уже встречался. Вынимаем текущее значение для ключа (нашего символа), увеличиваем это число на 1 и вставляем обратно в мапу.

В итоге после цикла у нас будет мапа частот с которой встречаются символы.

Всё что нам останется - пройтись по этой мапе и найти максимум и минимум.
Находить максимум в последовательности вы уже [умеете](./GIT_INTRO.md), останется только адаптировать эту логику для поиска не в массиве, а проходясь по мапе.
Поиск минимума абсолютно аналогичен (только вместо -1 возьмите `Integer.MAX_VALUE` - максимальное значение которое может быть у `int`).
