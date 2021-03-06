package fowler;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private Price price;
    private String title;
    private int priceCode;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
       setPriceCode(newpriceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }


    public String getTitle (){
        return title;
    };

    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }


    int getFrequentRenterPoints(int daysRented) {
            return price.getFrequentRenterPoints(daysRented);
        }
    }