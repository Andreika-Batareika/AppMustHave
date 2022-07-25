package goals;

import java.util.ArrayList;

public class ArrayGoalsStandard implements ArrayGoals{

    ArrayList<Goals> goals;

    @Override
    public ArrayList<Goals> printGoals() {
        return goals;
    }

    @Override
    public void deleteGoal(Goals goal) {
        goals.remove(goal);
    }

    @Override
    public void addGoal(Goals goal) {
        goals.add(goal);
    }
}
