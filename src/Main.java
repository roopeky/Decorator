public class Main {
    public static void main (String[] args) {
        Data data = new Data();
        DataDecorator decoratedData = new DataDecorator(data, "ohtugang");

        decoratedData.processData();
    }
}
