package Records;

import java.util.List;

/**
 * Интерфейс сохранения записи
 * @author Andrew
 * @version 0.1
 */
public interface SaverRecord {

    /**
     * Процедура сохранения записей
     * @param listRecords - Список запией для сохранения
     */
    void saveRecords(List<Record> listRecords);
}
