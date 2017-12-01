package ioexamples;

/**
 *
 * @author Isaac
 */
public class Contact {
    private String name = null;
    private String streetAddress = null;
    private String cityStateZip = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }

    public void setCityStateZip(String cityStateZip) {
        this.cityStateZip = cityStateZip;
    }

    @Override
    public String toString() {
        return name + "\n" + streetAddress + "\n" + cityStateZip;
    }
}