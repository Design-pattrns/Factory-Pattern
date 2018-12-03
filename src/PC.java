public class PC extends Computer {
    String HDD,CPU,RAM;
    PC(String HDD,String CPU, String RAM){
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
