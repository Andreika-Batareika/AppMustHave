package Records;

import java.util.List;

import control.Instruction;

/**
 * Класс сохранения записи в SQL.
 * @author Andrew
 * @version 0.1
 */
public class SaverRecordSQL implements SaverRecord {

    /**
     * Конструктор
     */
    public SaverRecordSQL() {
    }

    /**
     * Процедура сохранения записей
     * @param listRecords - Список запией для сохранения
     */
    @Override
    public void saveRecords(List<Record> listRecords){

    }

    /**
     * Процедура Соединения с БД
     * @param instruction - Инструкция команд
     */
    private void connectSQL(Instruction instruction){

    }
}
