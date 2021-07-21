package app.homework_9.main.model;

public enum DayOfTheWeek {
    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private final String title;

    DayOfTheWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
