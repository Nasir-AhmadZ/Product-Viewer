package ie.atu.productv3;

public class Music extends Product{

    private String Artist;
    private String Label;

    public Music(){
        super();
        Artist = "";
        Label = "";
        count++;
    }

    public void setArtist(String artist) {
        this.Artist = artist;
    }
    public String getArtist() {
        return Artist;
    }


    public void setLabel(String label) {
        this.Label = label;
    }

    public String getLabel() {
        return Label;
    }



    @Override
    public String toString() {
        return super.toString() + " by " + Artist +"\nPart of " + Label;
    }
}
