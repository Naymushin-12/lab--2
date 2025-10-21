public class Employees2 { //Улучшенная версия класса сотрудника с поддержкой связанного списка
    // Поля класса
    private String name;           // Имя сотрудника
    private Department2 department; // Отдел сотрудника
    Employees2 nextEmployee;       // Ссылка на следующего сотрудника в отделе
    private boolean isManager;     // Флаг является ли сотрудник менеджером

    public Employees2(String name, Department2 department) { //Конструктор для обычного сотрудника
        this.name = name;
        this.department = department;
        this.isManager = false; // По умолчанию не менеджер
    }

    public Employees2(String name, Department2 department, boolean isManager) { //Конструктор с указанием роли
        this.name = name;
        this.department = department;
        this.isManager = isManager;
    }

    public String getName() {
        return name;
    }

    public Department2 getDepartment() {
        return department;
    }

    public boolean isManager() {
        return isManager;
    }


    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void printDepartmentEmployees() { //Вывод всех сотрудников отдела в консоль
        System.out.println("Все сотрудники отдела " + department.getTitle() + ":");

        // Выводим начальника первым (если он есть)
        Employees2 manager = findDepartmentManager();
        if (manager != null) {
            System.out.println(" - " + manager.getName() + " (начальник)");
        }

        // Выводим остальных сотрудников (без начальника)
        Employees2 current = department.getFirstEmployee();
        while (current != null) {
            if (!current.isManager()) { // Пропускаем менеджера (его уже вывели)
                System.out.println(" - " + current.getName());
            }
            current = current.nextEmployee; // Переход к следующему сотруднику
        }
    }

    @Override
    public String toString() { //Преобразование объекта в строку
        if (isManager) {
            return name + " начальник отдела " + department.getTitle();
        } else {
            Employees2 manager = findDepartmentManager();
            if (manager != null) {
                return name + " работает в отделе " + department.getTitle() +
                        ", начальник которого " + manager.getName();
            } else {
                return name + " работает в отделе " + department.getTitle() +
                        ", начальник не назначен";
            }
        }
    }

    private Employees2 findDepartmentManager() { //спомогательный метод для поиска менеджера в отделе
        Employees2 current = department.getFirstEmployee();
        while (current != null) {
            if (current.isManager()) {
                return current;
            }
            current = current.nextEmployee; // Переход к следующему сотруднику
        }
        return null; // Менеджер не найден
    }
}