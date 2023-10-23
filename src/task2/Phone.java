package task2;

//  Создать класс мобильный телефон, содержащий информацию о производителе,
//количестве внутренней памяти и информации о балансе на используемой сим карте
public class Phone {
    private String manufacturer;
    private int memory;
    private SimCard simCard;

    public Phone() {
        simCard = new SimCard();
    }

    public Phone(String manufacturer, int memory, SimCard simCard) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.simCard = new SimCard();
    }

    public double addBalance(double amount) {
        simCard.balance = simCard.balance + amount;
        return simCard.balance;
    }

    public void call(){
        if(simCard.balance > 0){
            System.out.println("Алло, привет");
            simCard.balance = simCard.balance - 1;
        }else{
            System.out.println("«только 911»");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("manufacturer='").append(manufacturer).append('\'');
        sb.append(", memory=").append(memory);
        sb.append(", simCard=").append(simCard);
        sb.append('}');
        return sb.toString();
    }

    //(закрытый внутренний класс сим карта: номер договора, баланс счета).
    public static class SimCard {
        private long contractNumber;
        private double balance = 0;

        public SimCard() {
            this.contractNumber = 297331744;
            this.balance =0;
        }

        public SimCard(long contractNumber, double balance) {
            this.contractNumber = contractNumber;
            this.balance = balance;
        }



        public long getContractNumber() {
            return contractNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setContractNumber(long contractNumber) {
            this.contractNumber = contractNumber;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("SimCard{");
            sb.append("contractNumber=").append(contractNumber);
            sb.append(", balance=").append(balance);
            sb.append('}');
            return sb.toString();
        }
    }

}
