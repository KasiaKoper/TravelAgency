package BiuroPodrozy;

public class TripOffer {

    private float price;
    private int noOfNights;
    private Continent continent;
    private boolean isDog;


    public TripOffer(float price, int noOfNights, Continent continent,boolean isDog){
        this.price=price;
        this.noOfNights=noOfNights;
        this.continent=continent;
        this.isDog=isDog;
    }


//    @Override
//    public String toString() {
//        return "(" +
//                price + "*"+
//                noOfNights +
//                ", " + continent +
//                ", " + isDog +
//                ")";
//    }

    @Override
    public String toString() {
        return String.format("(%.2f * %d, %s, %b)", price, noOfNights, continent.name(), isDog);
    }

    //gettery & settery
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(int noOfNights) {
        this.noOfNights = noOfNights;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public boolean isDog() {
        return isDog;
    }

    public void setDog(boolean dog) {
        isDog = dog;
    }
}
