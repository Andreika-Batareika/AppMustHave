package goals;

public class GoalBase implements Goals{

    String name;           // Название цели
    String description;    // Описание цели
    int importance;        // Важность цели
    int fulfillment;       // Процент выполнения цели

    GoalBase(String name, String description, int importance){

        this.description = description;
        this.name = name;
        this.importance = importance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setFulfillment(int fulfillment) {
        this.fulfillment = fulfillment;
    }

    @Override
    public void print() {

        System.out.print(name);

    }
}
