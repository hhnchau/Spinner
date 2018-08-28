package info.kingpes.customspiner;

/**
 * Created by Chau Huynh on 3/20/2017.
 */

public class model {
    private int img;
    private String txt;

    public model(int img, String txt) {
        this.img = img;
        this.txt = txt;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
