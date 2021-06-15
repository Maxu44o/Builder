public class Person {

    private final String name;
    private final String surname;
    private Integer age;
    private String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();

    }

    public boolean hasAge() {
        return age == null ? false : true;
    }

    public boolean hasAddress() {
        return address == null ? false : true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public PersonBuilder newChildBuilder(int age) {
        return new PersonBuilder().setSurname(this.surname).setAddress(this.address).setAge(age);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + address + '\'' +
                '}';
    }
}

