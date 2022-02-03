public class hw5 {
    public static void main(String[] args) {
        employee[] emplArray = new employee[5];
        emplArray[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        emplArray[1] = new employee("Petrov Petr", "Senior Engineer", "petrovp@mailbox.com",
                "322-223-322", 130000, 39);
        emplArray[2] = new employee("Sidorov Sidor", "Worker", "sidorovs@mailbox.com",
                "123-456-789", 50000, 40);
        emplArray[3] = new employee("Makhamedjanov-Stalnoy Bachtiyar", "Director", "Bachtiyarsb@mailbox.com",
                "111-222-111", 500000, 41);
        emplArray[4] = new employee("Grib Grigiry", "Huntsman", "gribg@mailbox.com",
                "202-303-444", 150000, 56);
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() > 40)
            {emplArray[i].outInfo();
                System.out.println();
            }
        }
    }


}
