package Design_Patterns;

class ChatRoom {

    void sendMessage(String msg, Users user) {
        System.out.println(user.name + ": " + msg); // central mediator
    }
}

class Users {
    String name;
    ChatRoom room;

    Users(String name, ChatRoom room) {
        this.name = name;
        this.room = room;
    }

    void send(String msg) {
        room.sendMessage(msg, this); // communicate via mediator
    }
}

class MediatorDemo {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        Users u1 = new Users("A", room);
        u1.send("Hello");
    }
}