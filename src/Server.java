public class Server extends Computer{

    String HDD,CPU,RAM;
    Server(String HDD,String CPU, String RAM){
        this.HDD = HDD;
        this.CPU = CPU;
        this.RAM = RAM;
    }
    @Override
    public String getHard() {
        return HDD;
    }

    @Override
    public String getCPU() {
        return CPU;
    }

    @Override
    public String getRAM() {
        return RAM;
    }
}
