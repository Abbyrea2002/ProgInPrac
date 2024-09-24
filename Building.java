public class Building {

    private String address;
    private String owner;

    public Building(){
        this.address = "";
        this.owner = "";
    }

    public Building(String address, String owner){
        this.address = address;
        this.owner = owner;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String toString(){
        return this.address + "occupied by " + this.owner;
    }

    public static void main(String[] args){
        Building b1 = new Building();
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
        Building b3 = new Building("67 Elme Street", "Lena Rea");

        b1.setAddress("3 High Street");
        b1.setOwner("Smiths");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }


}
