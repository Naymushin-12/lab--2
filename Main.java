import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Человек");
            System.out.println("2. Имена");
            System.out.println("3. Сотрудники и отделы");
            System.out.println("4. Сотрудники и отделы(изменённое)");
            System.out.println("5. Создаем Имена");
            System.out.println("6. Пистолет стреляет");
            System.out.println("0 - Выход");
            System.out.print("Выберите задачу: ");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    scanner.nextLine();
                    System.out.println("1. Человек.");
                    Person cleopatra = new Person("Клеопатра", 152);
                    Person pushkin = new Person();
                    pushkin.setName("Пушкин");
                    pushkin.setHeight(167);
                    Person mayakovskiy = new Person(cleopatra);
                    mayakovskiy.setName("Владимир");
                    mayakovskiy.setHeight(189);
                    System.out.println(cleopatra);
                    System.out.println(pushkin);
                    System.out.println(mayakovskiy);
                    break;

                case "2":
                    scanner.nextLine();
                    System.out.println("2. Имена.");
                    Names cleopatra2 = new Names("Клеопатра");
                    Names pushkin2 = new Names("Пушкин", "Александр", "Сергеевич");
                    Names mayakovskiy2 = new Names("Маяковский", "Владимир");
                    System.out.println(cleopatra2);
                    System.out.println(pushkin2);
                    System.out.println(mayakovskiy2);
                    break;

                case "3":
                    scanner.nextLine();
                    // Создаем отдел
                    Department itDepartment = new Department("IT");

                    // Создаем сотрудников
                    Employees ivanov = new Employees("Иванов", itDepartment);
                    Employees petrov = new Employees("Петров", itDepartment, true);
                    Employees vasilev = new Employees("Васильев", itDepartment);

                    // Выводим информацию
                    System.out.println(ivanov);
                    System.out.println(petrov);
                    System.out.println(vasilev);
                    break;

                case "4":
                    scanner.nextLine();
                    System.out.println("3. Сотрудники и отделы. (c дополнением)");

                    // отдел
                    Department2 itDepartment2 = new Department2("IT");
                    // сотрудники
                    Employees2 ivanov2 = new Employees2("Иванов", itDepartment2);
                    Employees2 petrov2 = new Employees2("Петров", itDepartment2, true); // начальник
                    Employees2 vasilev2 = new Employees2("Васильев", itDepartment2);

                    // Связываем сотрудников в список
                    itDepartment2.setFirstEmployee(ivanov2);
                    petrov2.nextEmployee = petrov2;
                    vasilev2.nextEmployee = vasilev2;

                    System.out.println("Представление сотрудников:");
                    System.out.println(ivanov2);
                    System.out.println(petrov2);
                    System.out.println(vasilev2);

                    System.out.println("\nСписок сотрудников через Петрова");
                    ivanov2.printDepartmentEmployees();
                    System.out.println("\nСписок сотрудников через Козлова");
                    petrov2.printDepartmentEmployees();
                    System.out.println("\nСписок сотрудников через Сидорова");
                    vasilev2.printDepartmentEmployees();
                    break;

                case "5":
                    scanner.nextLine();
                    System.out.println("4. Создаем Имена.");
                    CreatingName cleopatra3 = new CreatingName("Клеопатра");
                    CreatingName pushkin3 = new CreatingName("Александр", "Пушкин", "Сергеевич");
                    CreatingName mayakovskiy3 = new CreatingName("Владимир", "Маяковский");
                    CreatingName hristofor3 = new CreatingName("Христофор", "Бонифатьевич");

                    System.out.println(cleopatra3);
                    System.out.println(pushkin3);
                    System.out.println(mayakovskiy3);
                    System.out.println(hristofor3);
                    break;

                case "6":
                    scanner.nextLine();
                    System.out.println("5. Пистолет стреляет");
                    // Создаем пистолет с тремя патронами
                    Gun gun = new Gun(3);
                    System.out.println("Создан " + gun);

                    // Стреляем 5 раз
                    System.out.println("\nСтреляем 5 раз:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Выстрел " + i + ": ");
                        gun.shoot();
                    }

                    System.out.println("\nПосле стрельбы: " + gun);

                    // по умолчанию
                    Gun defaultGun = new Gun();
                    System.out.println("Создан " + defaultGun);

                    System.out.println("\nСтреляем 7 раз:");
                    for (int i = 1; i <= 7; i++) {
                        System.out.print("Выстрел " + i + ": ");
                        defaultGun.shoot();
                    }

                    System.out.println("\nПосле стрельбы: " + defaultGun);
                    break;


                case "0":
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            System.out.println("\nНажмите 'Enter' чтобы снова выбрать номер задачи");
            scanner.nextLine();

        }
    }
}
