### static void roundingNumbers(double[] arrayDouble){
    System.out.format("%-14s%-10s%-10s%-10s%n", "Input number","round","floor","ceil");
    for(double number:arrayDouble){
        int numberRound = (int)Math.round(number);
        int numberFloor= (int)Math.floor(number);
        int numberCeil= (int)Math.ceil(number);
        System.out.format("%-14s%-10d%-10d%-10d%n", number, numberRound,numberFloor,numberCeil);
    }
    }