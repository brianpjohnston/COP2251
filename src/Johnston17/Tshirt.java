package Johnston17;

/**
 * Created by tech140 on 10/24/2016.
 */
public class Tshirt {

    String text;
    String size;
    boolean gift;
    Tshirt(String inText, String inSize, boolean InGift){
        text = inText;
        size = inSize;
        gift = InGift;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }
}