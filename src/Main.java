public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var massTotal = firstBoxer+secondBoxer;
        System.out.println(massTotal);
        var massSubtraction = secondBoxer-firstBoxer;
        System.out.println(massSubtraction);

        var massDifference = secondBoxer%firstBoxer;
        System.out.println(massDifference);

        var hours = 640;
        var employee = 8;
        var totalEmployees = hours/employee;
        System.out.println("Всего работников в компании — "+ totalEmployees+" человек");

        var moreEmployees = 94;
        totalEmployees = totalEmployees+moreEmployees;
        var totalHours = employee*moreEmployees + hours;
        System.out.println("Если в компании работает "+totalEmployees+" человек, то всего "+totalHours+" часов работы может быть поделено между сотрудниками");
    }

}