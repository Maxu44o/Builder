public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(mom);


        Person son = mom.newChildBuilder(5)
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

    }

}
