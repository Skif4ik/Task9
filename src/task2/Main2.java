package task2;
//2. Создать класс мобильный телефон, содержащий информацию о производителе,
//количестве внутренней памяти и информации о балансе на используемой сим карте
//(закрытый внутренний класс сим карта: номер договора, баланс счета).
//Для класса мобильный телефон реализовать методы:
//- пополнить баланс
//- осуществить звонок. Если баланс положительный, то выдать сообщение «Алло, привет»,
//иначе «только 911». При успешном звонке списать с баланса 1р.
public class Main2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);


        Phone phone2 = new Phone("Samsung", 500, new Phone.SimCard());
        System.out.println(phone2);

        System.out.println("================================");
        phone2.addBalance(15);
        System.out.println(phone2);
        System.out.println("================================");
        phone2.call();
        phone1.call();



    }
}
