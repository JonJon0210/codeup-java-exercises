class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName(){

        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, my name is " + this.name);
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args){
        Person bob = new Person("Bob");
        System.out.println(bob.getName());
        bob.setName("Bobby");
        bob.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}