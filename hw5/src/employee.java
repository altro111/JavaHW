public class employee {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;


    public employee(String name, String post, String email, String phone, int salary,int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
       }

    public int getAge() {
        return age;
    }

    void outInfo(){
        System.out.println("Сотрудник: " + name + " Должность: " + post + " Email: " + email + " Телефон: " + phone
                + " Заработная плата: " + salary + " Возраст: " + age);
    }
}


//    На JAVA НЕ!!!! ПИШУТ на русском языке *
//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.