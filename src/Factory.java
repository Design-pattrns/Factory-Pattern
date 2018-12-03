public class Factory {

    public static Computer getFactory(String type,String HDD,String CPU, String RAM){
        if("pc".equalsIgnoreCase(type)){
            return new PC(HDD,CPU,RAM);
        }else if ("server".equalsIgnoreCase(type)){
            return new Server(HDD,CPU,RAM);
        }
        return null;
    }
}
