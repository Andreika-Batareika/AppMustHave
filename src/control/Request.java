package control;

import java.util.ArrayList;

public class Request {

    ArrayList<String> elements;

    public Request() {
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }

    public void addElement(String element) {
        elements.add(element);
    }


}
