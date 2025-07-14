
class Worlds {
    private String name;

    public Worlds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Country extends Worlds {
    private String countryName;

    public Country(String worldName, String countryName) {
        super(worldName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
class City extends Country {
    private String cityName;

    public City(String countryName,String worldName,String cityName) {
        super(countryName,worldName);
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
public class World
{
    public static void main(String[] args)
     {
        City city = new City("Earth", "United States", "New York");
        System.out.println("City: " + city.getCityName());
        System.out.println("Country: " + city.getCountryName());
        System.out.println("World: " + city.getName());
    }
}
