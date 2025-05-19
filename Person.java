public class Person {
    String name;
    
    public Person(String name) {
        this.name = name;
    }

    public void begruessen() {
        System.out.println("Hallo, ich bin " + name);
    }

    public static void main(String[] args) {
        Person p = new Person("Jannes");
        p.begruessen();
    }
}
