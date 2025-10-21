public class Department2 { //Улучшенная версия класса отдела с поддержкой связанного списка сотрудников
    // Поля класса
    private String title;              // Название отдела
    private Employees2 firstEmployee;  // Первый сотрудник в отделе (начало списка)

    public Department2(String title) { //Конструктор отдела
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Employees2 getFirstEmployee() {
        return firstEmployee;
    }

    public void setFirstEmployee(Employees2 firstEmployee) {
        this.firstEmployee = firstEmployee;
    }
}