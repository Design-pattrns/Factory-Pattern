public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");



        Computer pc = Factory.getFactory("pc","2 GB","500 GB","2.4 GHz");
        Computer server = Factory.getFactory("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
