package behavioral.memento;

public class TextEditor {
    private String text = "";
    
    public void write(String newText) {
        text += newText;
        System.out.println("Text: " + text);
    }
    
    public TextMemento save() {
        return new TextMemento(text);
    }
    
    public void restore(TextMemento memento) {
        text = memento.getText();
        System.out.println("Restored text: " + text);
    }
} 