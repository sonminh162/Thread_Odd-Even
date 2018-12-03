public class test {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        Thread oddThread = new Thread(odd);
        Thread evenThread = new Thread(even);
        oddThread.start();
        evenThread.start();
    }
}
