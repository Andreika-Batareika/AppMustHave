package Records;

import control.TypeRecord;

/**
 * Интерфейс записи
 * @author Andrew
 * @version 0.1
 */
public interface Record {

    /**
     * Процедура визуализации записи
     */
    void print();

    /**
     * Функция получения типа записи
     */
    TypeRecord getType();

}
