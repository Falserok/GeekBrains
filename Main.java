public class Main {

    public static void main(String[] args) {

        Sotrudniki[] persArray = new Sotrudniki[5];
        persArray[0] = new Sotrudniki("Ivanov Ivan", "Engineer", "ukjhfjk@mailbox.com", "8678678", 465456, 12);
        persArray[1] = new Sotrudniki("Pavlov Vasiliy", "tester", "fhjkhjkfhjk@mailbox.com", "46864868", 3456546, 87);
        persArray[2] = new Sotrudniki("Dud' Alexandr", "Project lead", "fhjkfhyk@mailbox.com", "468468648", 346, 67);
        persArray[3] = new Sotrudniki("Yankin Timur", "User", "fhjkfhk@mailbox.com", "64784848468", 3456356, 65);
        persArray[4] = new Sotrudniki("Vahitov Oleg", "Administrator", "fhjkhfk@mailbox.com", "57895789", 3456346, 34);

        for(Sotrudniki item : persArray) {
            if(item.TakeAge() > 40) item.Show();
        }
    }
}