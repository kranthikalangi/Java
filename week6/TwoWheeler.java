/*6. Extend the above TwoWheeler class with methods getType() and getName()
which gives the information about the type and the name of the company.Create
sub-classes Geared and NonGeared with method average() to print the average of
a geared and non-geared two wheeler.   */


class TwoWheeler {
    private String type;
    private String name;

    public TwoWheeler(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

class Geared extends TwoWheeler {
    public Geared(String name) {
        super("Geared", name);
    }

    public void average() {
        System.out.println("Calculating average for Geared Two Wheeler...");
        // Add logic to calculate and print average for geared two wheeler
    }
}

class NonGeared extends TwoWheeler {
    public NonGeared(String name) {
        super("Non-Geared", name);
    }

    public void average() {
        System.out.println("Calculating average for Non-Geared Two Wheeler...");
        // Add logic to calculate and print average for non-geared two wheeler
    }
}

public class twowheeler {
    public static void main(String[] args) {
        Geared gearedBike = new Geared("GearedBike1");
        NonGeared nonGearedBike = new NonGeared("NonGearedBike1");

        System.out.println("Type of Geared Bike: " + gearedBike.getType());
        System.out.println("Name of Geared Bike: " + gearedBike.getName());
        gearedBike.average();

        System.out.println("\nType of Non-Geared Bike: " + nonGearedBike.getType());
        System.out.println("Name of Non-Geared Bike: " + nonGearedBike.getName());
        nonGearedBike.average();
    }
}

