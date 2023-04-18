import java.util.List;

public class Toys {
    private Integer idToy;
    private String name;
    private Integer chance;
    public static int idCount = 1;

    public Toys(String name, Integer chance) {
        this.idToy = Toys.idCount++;
        this.name = name;
        this.chance = chance;
    }

    @Override
    public String toString()
    {
        return String.format(new StringBuilder().append("\tID: %d; ")
            .append("chance: %d; ")
            .append("name: %s")
            .toString(), idToy, chance, name);
    }

    public int getchances(List<Toys> toys) {
        return this.chance;
    }

    public Integer getchanceToy() {
        return this.chance;
    }

    public int getID() {
        return this.idToy;
    }

    public boolean containsID(Integer value) {
        if (Toys.this.idToy == value) return true;
        else return false;
    }

    public void setchance(int value) {
        this.chance = value;
    }
}