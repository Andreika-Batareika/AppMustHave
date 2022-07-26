package Records;

import java.util.ArrayList;

public class ArrayGoalsStandard implements ArrayGoals{

    ArrayList<Record> goals;

    @Override
    public ArrayList<Record> printGoals() {
        return goals;
    }

    @Override
    public void deleteGoal(Record goal) {
        goals.remove(goal);
    }

    @Override
    public void addGoal(Record goal) {
        goals.add(goal);
    }
}
