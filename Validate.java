
public class Validate {

    public static String getNameErrorMessage(String name) { //проверка корректности на имя человека
        if (name == null || name.isEmpty()) {
            return "Имя не может быть пустым";
        }
        if (name.length() < 2) {
            return "Имя должно содержать минимум 2 символа";
        }
        if (name.length() > 20) {
            return "Имя не может превышать 20 символов";
        }
        return null; // Ошибок нет
    }


    public static String getNamesErrorMessage(String lastName, String firstName, String patronymic) { //проверка что хотя бы одно из трех имен (фамилия, имя, отчество) задано
        if ((lastName == null || lastName.isEmpty()) &&
                (firstName == null || firstName.isEmpty()) &&
                (patronymic == null || patronymic.isEmpty())) {
            return "Хотя бы одно имя должно быть задано";
        }
        return null; // Ошибок нет
    }

    public static String getHeightErrorMessage(int height) { //проверка корректности роста человека
        if (height < 100) {
            return "Рост не может быть меньше 100 см";
        }
        if (height > 210) {
            return "Рост не может быть больше 210 см";
        }
        return null; // Ошибок нет
    }


    public static String getBulletCountErrorMessage(int bullets) { //проверка корректности количества патронов
        if (bullets < 0) {
            return "Количество патронов не может быть отрицательным";
        }
        return null; // Ошибок нет
    }


    public static String getCreatingNameErrorMessage(String firstName) { //специфичная проверка для класса CreatingName - проверяет только имя
        if (firstName == null || firstName.isEmpty()) {
            return "Личное имя не может быть пустым";
        }
        return null; // Ошибок нет
    }
}