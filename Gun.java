public class Gun { //Класс для представления пистолета с функцией стрельбы
    private int bulletCount;  //Текущее количество патронов

    public Gun() { //Конструктор по умолчанию - создает пистолет с 5 патронами
        this.bulletCount = 5;
    }

    public Gun(int initialBullets) { //Конструктор с указанием начального количества патронов
        String error = Validation.getBulletCountErrorMessage(initialBullets);
        if (error != null) {
            System.out.println("Ошибка создания пистолета: " + error);
            this.bulletCount = 5; // Значение по умолчанию при ошибке
        } else {
            this.bulletCount = initialBullets;
        }
    }

    public void shoot() { //Метод стрельбы - уменьшает количество патронов на 1
        if (bulletCount > 0) {
            System.out.println("Бах!");
            bulletCount--;
        } else {
            System.out.println("Клац!"); // Звук при отсутствии патронов
        }
    }

    public int getBulletCount() {
        return bulletCount;
    }

    public void setBulletCount(int bulletCount) { //Сеттер для количества патронов с валидацией
        String error = Validation.getBulletCountErrorMessage(bulletCount);
        if (error != null) {
            System.out.println("Ошибка установки патронов: " + error);
            this.bulletCount = 5; // Значение по умолчанию при ошибке
        } else {
            this.bulletCount = bulletCount;
        }
    }

    @Override
    public String toString() { //Преобразование объекта в строку
        return "Пистолет (патронов: " + bulletCount + ")";
    }
}