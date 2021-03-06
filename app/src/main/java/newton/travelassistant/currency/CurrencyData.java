package newton.travelassistant.currency;

public class CurrencyData {
    private String imgUrl, currencyName, currencyValue, currencyFullName;


    public CurrencyData(String imgUrl, String currencyName, String currencyFullName) {
        this.imgUrl = imgUrl;
        this.currencyName = currencyName;
        this.currencyFullName = currencyFullName;
    }

    public CurrencyData() {
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getCurrencyFullName() {
        return currencyFullName;
    }

    public void setCurrencyFullName(String currencyFullName) {
        this.currencyFullName = currencyFullName;
    }
}
