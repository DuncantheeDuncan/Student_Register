package temp.register;

public enum CountryCodes {

    SouthAfrica("+27 "),
    UnitedStateOfAmerica("+324 "),
    Zimbabwe("+67 ");

    private String countryCode;
    CountryCodes(String countryCode) {
        this.countryCode = countryCode;
    }


    public String getCountryCode() {

        return countryCode;
    }

}
