package Design_Patterns;

class User {

    private String name;
    private int age;

    private User(Builder b) {
        this.name = b.name;
        this.age = b.age;
    }

    static class Builder {
        private String name;
        private int age;

        Builder setName(String name) {
            this.name = name;
            return this;   // chaining
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        User build() {
            return new User(this);   // build object
        }
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

class BuilderDemo {
    public static void main(String[] args) {
        User u = new User.Builder().setName("Nandha").setAge(22).build();
        u.show();
    }
}