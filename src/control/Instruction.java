package control;

/**
 * Класс Запроса
 * @author Andrew
 * @version 0.1
 */
public class Instruction {

    /** Тип инструкции */
    TypeInstruction typeInstruction = TypeInstruction.EMPTY;

    /** Имя файла */
    String nameFile;

    /** Статус Инструкции */
    TypeStatus status = TypeStatus.FREE;
}
