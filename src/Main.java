public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        //Задача 3
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var weightOfFirstBoxer = 78.2;
        var weightOfSecondBoxer = 82.7;
        var summWeight = weightOfFirstBoxer + weightOfSecondBoxer;
        System.out.println(summWeight);
        var diffOfWeight = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println(diffOfWeight);
        //Задача 7
        var remainWeight = weightOfSecondBoxer % weightOfFirstBoxer;
        System.out.println(remainWeight);
        //Задача 8
        var numberHoursOfWork = 640;
        var timeOfWorkOneEmployee = 8;
        var numberEmployees = numberHoursOfWork / timeOfWorkOneEmployee;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек");

        numberEmployees = numberEmployees + 94;
        numberHoursOfWork = numberEmployees * 8;
        System.out.println("Если в компании работает "+ numberEmployees + " человека,то всего " + numberHoursOfWork
        + " часов работы может быть поделено между сотрудниками");


    }

}

