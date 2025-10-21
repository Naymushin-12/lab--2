public class Department { //Простой класс для представления отдела в организации
    private String title;  // Название отдела

    public Department(String title) { //Конструктор отдела
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}