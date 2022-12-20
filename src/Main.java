public class Main {
    public static void main(String[] args) {

        /*Task #1*/

        var dog  = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("----- Task #1 -----"); // Only for visualisation in console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); // Only for visualisation in console

        /*Task #2*/

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("----- Task #2 -----"); // Only for visualisation in console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); // Only for visualisation in console

        /*Task #3*/

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("----- Task #3 -----"); // Only for visualisation in console
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(); // Only for visualisation in console

        /*Task #4*/

        var friend = 19;

        System.out.println("----- Task #4 -----"); // Only for visualisation in console
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println(); // Only for visualisation in console

        /*Task #5*/

        var frog = 3.5;

        System.out.println("----- Task #5 -----"); // Only for visualisation in console
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println(); // Only for visualisation in console

        /*Task #6*/

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        System.out.println("----- Task #6 -----"); // Only for visualisation in console

        System.out.println("Общий вес бойцов:");
        System.out.println (firstBoxerWeight + secondBoxerWeight);

        System.out.println("Разница между весами двух бойцов:");
        System.out.println (secondBoxerWeight - firstBoxerWeight);

        System.out.println(); // Only for visualisation in console

        /*Task #7*/

        System.out.println("----- Task #7 -----"); // Only for visualisation in console

        System.out.println("Разница между весами двух бойцов:");
        System.out.println("СПОСОБ №1:");
        System.out.println (secondBoxerWeight - firstBoxerWeight);

        System.out.println("СПОСОБ №2:");
        System.out.println (secondBoxerWeight % firstBoxerWeight);

        System.out.println(); // Only for visualisation in console

        /*Task #8*/

        System.out.println("----- Task #8 -----"); // Only for visualisation in console

        var staffQty = 640 / 8;
        System.out.println("Всего работников в компании - " + staffQty + " человек");

        staffQty = staffQty + 94;
        var hours = staffQty * 8;

        System.out.println("Если в компании работает " + staffQty + " человека, то всего " + hours + " часов работы может быть поделено между сотрудниками.");
        System.out.println(); // Only for visualisation in console
    }
}