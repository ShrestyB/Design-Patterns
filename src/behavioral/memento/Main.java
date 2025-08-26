package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextHistory history = new TextHistory();
        
        System.out.println("Text Editor with Undo\n");
        
        // Write some text
        editor.write("Hello");
        history.save(editor.save());
        
        editor.write(" World");
        history.save(editor.save());
        
        editor.write("!");
        history.save(editor.save());
        
        // Undo operations
        System.out.println("\nUndoing...");
        TextMemento memento = history.undo();
        if (memento != null) {
            editor.restore(memento);
        }
        
        System.out.println("\nUndoing again...");
        memento = history.undo();
        if (memento != null) {
            editor.restore(memento);
        }
    }
} 