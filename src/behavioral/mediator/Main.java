package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        // Create chat room
        ChatMediator chatRoom = new ChatRoom();
        
        // Create users
        User Shresty = new ChatUser(chatRoom, "Shresty");
        User Priyansh = new ChatUser(chatRoom, "Priyansh");
        User Sangeeta = new ChatUser(chatRoom, "Sangeeta");
        User Mukesh = new ChatUser(chatRoom, "Mukesh");
        
        // Add users to chat room
        chatRoom.addUser(Shresty);
        chatRoom.addUser(Priyansh);
        chatRoom.addUser(Sangeeta);
        chatRoom.addUser(Mukesh);
        
        // Send messages
        System.out.println("Chat Room\n");
        Shresty.send("Hello everyone!");
        Priyansh.send("Hi Shresty!");
        Sangeeta.send("Good morning!");
        Mukesh.send("Good morning!");
    }
} 