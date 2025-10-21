public class Names { //альтернативная реализация класса для представления ФИО
    // Поля класса
    private String lastName;    // Фамилия
    private String firstName;   // Имя
    private String patronymic;  // Отчество

    public Names(String lastName, String firstName, String patronymic) { //основной конструктор с тремя параметрами
        // Проверяем что хотя бы одно имя не пустое
        String error = Validation.getNamesErrorMessage(lastName, firstName, patronymic);
        if (error != null) {
            System.out.println("Ошибка: " + error);
            // Устанавливаем значения по умолчанию при ошибке
            this.lastName = "Иванов";
            this.firstName = "Иван";
            this.patronymic = "Иванович";
        } else {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
        }
    }

    public Names(String firstName) { //конструктор только с именем
        this(null, firstName, null); // Вызов основного конструктора
    }

    public Names(String lastName, String firstName) { //конструктор с фамилией и именем
        this(lastName, firstName, null); // Вызов основного конструктора
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) { //сет для имени с валидацией
        String error = Validation.getNameErrorMessage(firstName);
        if (error != null) {
            System.out.println("Ошибка имени: " + error);
            this.firstName = "Иван"; // Значение по умолчанию
        } else {
            this.firstName = firstName;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() { //преобразование объекта в строку
        StringBuilder result = new StringBuilder();

        // Добавляем фамилию, если она есть (первой)
        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        // Добавляем имя, если оно есть
        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) {
                result.append(" "); // Добавляем пробел если уже есть фамилия
            }
            result.append(firstName);
        }

        // Добавляем отчество, если оно есть
        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.length() > 0) {
                result.append(" "); // Добавляем пробел если уже есть данные
            }
            result.append(patronymic);
        }

        return result.toString();
    }
}