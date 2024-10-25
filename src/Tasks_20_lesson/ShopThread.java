package Tasks_20_lesson;

public class ShopThread {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Customer customer = new Customer(shop);
        Producer producer = new Producer(shop);

        Thread customerThread = new Thread(customer);
        Thread producerThread = new Thread(producer);

        customerThread.start();
        producerThread.start();
    }
}

class Shop {

    private int countOfBread = 0;

    public synchronized void putBread(){
        while(countOfBread >= 3){
            try {
                System.out.println("Waiting customer....");
                wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }

        countOfBread++;
        System.out.println("Producer add one bread...");
        System.out.println("Amount of bread now: " + countOfBread);
        notify();
    }

    public synchronized void getBread(){
        while(countOfBread < 1 ){
            try {
                System.out.println("Waiting producer....");
                wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }

        countOfBread--;
        System.out.println("Customer buy one bread...");
        System.out.println("Amount of bread now: " + countOfBread);
        notify();
    }

}

class Customer implements Runnable{
    Shop shop;

    Customer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            shop.getBread();
        }
    }
}

class Producer implements Runnable{
    Shop shop;

    Producer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            shop.putBread();
        }
    }
}