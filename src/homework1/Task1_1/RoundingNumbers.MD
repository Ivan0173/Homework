### static void roundingNumbers(double[] arrayDouble){
    System.out.format("%-14s%-10s%-10s%-10s%n", "Input number","round","floor","ceil");
    for(double number:arrayDouble){
#### Метод round - округляет до ближайшего целого числа
        int numberRound = (int)Math.round(number);
#### Метод floor - округляет до ближайшего целого вниз
        int numberFloor= (int)Math.floor(number);
#### Метод ceil - округляет до ближайшего целого числа вверх
        int numberCeil= (int)Math.ceil(number);
#### Метод rint - возвращает целое число, которое ближайшее по значению аргумента
        int numberRint = (int) Math.rint(number);
        System.out.format("%-14s%-10d%-10d%-10d%n", number, numberRound,numberFloor,numberCeil);
    }
    }