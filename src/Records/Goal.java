package Records;

import control.TypeRecord;

/**
 * Класс цели
 * @author Andrew
 * @version 0.1
 */
public class Goal implements Record {

    /** Поле Название цели */
    String name;

    /** Описание цели */
    String description;

    /** Важность цели */
    int importance;

    /** Процент выполнения цели */
    int fulfillment;

    /** Тип записи */
    TypeRecord typeRecord;

    /**
     * Конструктор
     * @param name - название цели
     * @param description - Описание цели
     * @param importance - Важность цели
     */
    Goal(String name, String description, int importance){

        this.description = description;
        this.name = name;
        this.importance = importance;
    }

    /**
     * Процедура передачи имени
     * @param name - Имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Процедура передачи описания цели
     * @param description - Описание цели
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Процедура передачи важности цели
     * @param importance - Важность цели
     */
    public void setImportance(int importance) {
        this.importance = importance;
    }

    /**
     * Процедура передачи процента заполнения
     * @param fulfillment - Процент заполнения
     */
    public void setFulfillment(int fulfillment) {
        this.fulfillment = fulfillment;
    }

    /**
     * Процедура визуализации цели
     */
    @Override
    public void print() {

        System.out.print(name);

    }

    /**
     * Функция получения типа цели
     */
    @Override
    public TypeRecord getType(){
        return this.typeRecord;
    }
}
