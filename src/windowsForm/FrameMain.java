package windowsForm;


import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame {

    public FrameMain(){
        setSize(260, 150);
        Box vbox = Box.createVerticalBox();
        Box horisontalBox = Box.createHorizontalBox();
        horisontalBox.add(new JLabel("Задачи на сегодня"));
        horisontalBox.add(new Button("Раскрыть"));
        vbox.add(horisontalBox);
        JPanel container = new WindowEditGoal();
        JPanel container1 = new WindowsEditNote();

        JTabbedPane tabPane = new JTabbedPane();

        tabPane.add(container);
        tabPane.add(container1);
        vbox.add(tabPane);
        add(vbox);
        removeAll();
//add your elements
        revalidate();
        repaint();


        setVisible(true);

    }

}
