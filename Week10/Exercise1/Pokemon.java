package Week10.Exercise1;

import java.security.PrivateKey;

public class Pokemon {
    //Name;         Type 1; Type 2;   Total;  HP;     Attack; Defense;  Sp. Atk;  Sp. Def;    Speed;  Generation;   Legendary
    //Bulbasaur;    Grass ;   Poison; 318;    45;     49;       49;       65;         65;     45;       1;          False
    private Integer id;
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hitPoints;
    private Integer attack;
    private Integer defense;
    private Integer speedAtk;
    private Integer speedDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;

    public Pokemon(Integer id,String name, String type1, String type2, Integer total, Integer hitPoints, Integer attack, Integer defense, Integer speedAtk, Integer speedDef, Integer speed, Integer generation, Boolean legendary) {
        this.id=id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hitPoints = hitPoints;
        this.attack = attack;
        this.defense = defense;
        this.speedAtk = speedAtk;
        this.speedDef = speedDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeedAtk() {
        return speedAtk;
    }

    public Integer getSpeedDef() {
        return speedDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", total=" + total +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speedAtk=" + speedAtk +
                ", speedDef=" + speedDef +
                ", speed=" + speed +
                ", generation=" + generation +
                ", legendary=" + legendary +
                '}';
    }
}
