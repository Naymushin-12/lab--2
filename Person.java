public class Person {

    private String name;
    private int height;

    // Конструктор по умолчанию - создает объект с значениями по умолчанию
    public Person() {
        this.name = "Иван";
        this.height = 170;
    }

    // Конструктор копирования - создает копию существующего объекта
    public Person(Person person) {
        this.name = person.name;
        this.height = person.height;
    }

    // Конструктор с параметрами - принимает имя и рост(записываем)
    public Person(String name, int height) {
        setName(name);
        setHeight(height);
    }

    // Геттер для имени(принимаем)
    public String getName() {
        return name;
    }

    // Геттер для роста
    public int getHeight() {
        return height;
    }

    // Сеттер для имени с валидацией
    public void setName(String name) {
        String error = Validation.getNameErrorMessage(name); // Проверяем валидность
        if (error != null) {
            System.out.println("Ошибка имени: " + error);
            this.name = "Иван"; // Значение по умолчанию при ошибке
        } else {
            this.name = name; // если всё круто устанавлием новое значение
        }
    }

    // Сеттер для роста с валидацией
    public void setHeight(int height) {
        String error = Validation.getHeightErrorMessage(height); // Проверяем валидность
        if (error != null) {
            System.out.println("Ошибка роста: " + error);
            this.height = 170; // Значение по умолчанию при ошибке
        } else {
            this.height = height; // Устанавливаем валидное значение
        }
    }

    @Override // для безопасного переопределения метода
    public String toString() {
        return name + " рост: " + height + " см";
    }
}
