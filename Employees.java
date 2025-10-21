public class Employees { //Класс для представления сотрудника в организации
    // Поля класса
    private String name;           // Имя сотрудника
    private Department department; // Отдел сотрудника
    private boolean isManager;     // Флаг является ли сотрудник менеджером

    public Employees(String name, Department department) { //Конструктор для обычного сотрудника (не менеджера)
        this.name = name;
        this.department = department;
        this.isManager = false; // По умолчанию не менеджер
    }

    public Employees(String name, Department department, boolean isManager) { //Конструктор с указанием роли сотрудника
        this.name = name;
        this.department = department;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    @Override
    public String toString() { //Преобразование объекта в строку
        if (isManager) {
            return name + " начальник отдела " + department.getTitle();
        } else {
            return name + " работает в отделе " + department.getTitle();
        }
    }
}