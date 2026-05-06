package Data_Structure_And_Algorithm.Linked_List;

import java.util.*;

class User {
    int id, age;
    String name;
    ArrayList<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        friends = new ArrayList<>();
    }
}

class SocialList {
    User head = null;

    void addUser(User u) {
        u.next = head;
        head = u;
    }

    User find(int id) {
        User t = head;
        while (t != null) {
            if (t.id == id) return t;
            t = t.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        User u1 = find(id1);
        User u2 = find(id2);
        if (u1 != null && u2 != null) {
            u1.friends.add(id2);
            u2.friends.add(id1);
        }
    }

    void removeFriend(int id1, int id2) {
        User u1 = find(id1);
        User u2 = find(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove(Integer.valueOf(id2));
            u2.friends.remove(Integer.valueOf(id1));
        }
    }

    void mutual(int id1, int id2) {
        User u1 = find(id1);
        User u2 = find(id2);

        if (u1 == null || u2 == null) return;

        for (int f : u1.friends) {
            if (u2.friends.contains(f)) {
                System.out.println("Mutual Friend ID: " + f);
            }
        }
    }

    void displayFriends(int id) {
        User u = find(id);
        if (u != null) {
            System.out.println("Friends of " + u.name + ": " + u.friends);
        }
    }

    void searchByName(String name) {
        User t = head;
        while (t != null) {
            if (t.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + t.id);
                return;
            }
            t = t.next;
        }
    }

    void countFriends() {
        User t = head;
        while (t != null) {
            System.out.println(t.name + " has " + t.friends.size() + " friends");
            t = t.next;
        }
    }
}

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SocialList s = new SocialList();

        s.addUser(new User(1, "A", 20));
        s.addUser(new User(2, "B", 21));
        s.addUser(new User(3, "C", 22));

        s.addFriend(1, 2);
        s.addFriend(1, 3);

        s.displayFriends(1);
        s.mutual(2, 3);
        s.countFriends();
    }
}