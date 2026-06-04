class CopyS {
    int id;
    String name;

    // Parameterized constructor
    CopyS(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    CopyS(CopyS s) {
        this.id = s.id;
        this.name = s.name;
    }



    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        CopyS s1 = new CopyS(101, "Manni");
        CopyS s2 = new CopyS(s1); // copy constructor

        s1.display();
        s2.display();
    }
}