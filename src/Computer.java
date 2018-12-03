public abstract class Computer {
    public abstract String getHard();
    public abstract String getCPU();
    public abstract String getRAM();


    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHard()+", CPU="+this.getCPU();
    }
}
