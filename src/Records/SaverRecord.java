package Records;

import java.util.List;

public interface SaverRecord {


    void saveRecords(List<Record> listRecords);
    void saveRecord(Record record);
}
