public class Person { //класс для представления человека с именем и ростом
    // Поля класса
    private String name;      // Имя человека
    private int height;       // Рост в сантиметрах

    public Person() { //конструктор по умолчанию - создает объект с значениями по умолчанию
        this.name = "Иван";
        this.height = 170;
    }

    public Person(Person person) { //конструктор копирования - создает копию существующего объекта
        this.name = person.name;
        this.height = person.height;
    }

    public Person(String name, int height) { //кнструктор с параметрами
        setName(name);   // Используем сеттер для валидации
        setHeight(height); // Используем сеттер для валидации
    }


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) { //установка имени с валидацией
        String error = Validation.getNameErrorMessage(name);
        if (error != null) {
            System.out.println("Ошибка имени: " + error);
            this.name = "Иван"; // Значение по умолчанию при ошибке
        } else {
            this.name = name;
        }
    }

    public void setHeight(int height) { //установка роста с валидацией
        String error = Validation.getHeightErrorMessage(height);
        if (error != null) {
            System.out.println("Ошибка роста: " + error);
            this.height = 170; // Значение по умолчанию при ошибке
        } else {
            this.height = height;
        }
    }

    @Override
    public String toString() { //преобразование объекта в строку
        return name + " рост: " + height + " см";
    }
}