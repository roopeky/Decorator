public class Data implements DataStructure{
    @Override
    public void processData() {
        System.out.println("Processing data...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data successfully processed!");
    }
}
