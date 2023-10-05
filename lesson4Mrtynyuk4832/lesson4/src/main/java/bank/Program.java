package bank;

public class Program {

    public static void main(String[] args) {

        Entity entity = new Entity("ООО Рога и копыта", "10000013");
        Person person = new Person("AAA BBB CCC", "10000023");

        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity, 1500000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person, 300);

        Transaction<Account> transaction1 = new Transaction<>(debetAccount1, creditAccount1, 30000);
        transaction1.execute();

        transaction1.execute();

    }

}
