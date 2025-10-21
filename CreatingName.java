public class CreatingName { //класс для представления ФИО человека с обязательным именем
    // Поля класса
    private String firstName;    // Имя (обязательное поле)
    private String lastName;     // Фамилия (может быть null)
    private String patronymic;   // Отчество (может быть null)

    public CreatingName(String firstName) { //конструктор только с именем
        // Проверяем валидность имени
        String error = Validation.getCreatingNameErrorMessage(firstName);
        if (error != null) {
            // При ошибке выводим сообщение и устанавливаем значение по умолчанию
            System.out.println("Ошибка: " + error);
            this.firstName = "Иван";
        } else {
            this.firstName = firstName;
        }
    }

    public CreatingName(String firstName, String lastName) { //конструктор с именем и фамилией
        this(firstName); // Вызываем конструктор с одним параметром
        // Фамилия устанавливается только если она не null и не пустая
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }


    public CreatingName(String firstName, String lastName, String patronymic) { //конструктор с полным ФИО
        this(firstName, lastName); // Вызываем конструктор с двумя параметрами
        // Отчество устанавливается только если оно не null и не пустое
        if (patronymic != null && !patronymic.isEmpty()) {
            this.patronymic = patronymic;
        }
    }

    //методы для получения значений полей
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    //методы для установки значений полей
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) { //сеттер для имени с валидацией
        String error = Validation.getCreatingNameErrorMessage(firstName);
        if (error != null) {
            System.out.println("Ошибка: " + error);
            this.firstName = "Иван"; // Значение по умолчанию при ошибке
        } else {
            this.firstName = firstName;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() { //преобразование объекта в строку в формате "Имя Фамилия Отчество"
        String result = firstName; // Начинаем с имени (оно всегда есть)

        // Добавляем фамилию, если она есть
        if (lastName != null && !lastName.isEmpty()) {
            result = result + " " + lastName;
        }

        // Добавляем отчество, если оно есть
        if (patronymic != null && !patronymic.isEmpty()) {
            result = result + " " + patronymic;
        }

        return result;
    }
}