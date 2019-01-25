package Week10.Exercise4;

public class Character {
    //Name;             Allegiances;    Death Year;Character of Death;Death Chapter;Character Intro Chapter;Gender;Nobility;GoT;CoK;SoS;FfC;DwD
    //Aemon Targaryen (son of Maekar I);    Night's Watch;  300;4;35;21;1;1;1;0;1;1;0
    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private Integer gender;
    private Integer nobility;
    private Integer GoT;
    private Integer CoK;
    private Integer SoS;
    private Integer FfC;
    private Integer DwD;

    public Character(String name, String allegiances, String deathYear, String bookOfDeath, String deathChapter, String bookIntroChapter, Integer gender, Integer nobility, Integer goT, Integer coK, Integer soS, Integer ffC, Integer dwD) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
        GoT = goT;
        CoK = coK;
        SoS = soS;
        FfC = ffC;
        DwD = dwD;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getNobility() {
        return nobility;
    }

    public Integer getGoT() {
        return GoT;
    }

    public Integer getCoK() {
        return CoK;
    }

    public Integer getSoS() {
        return SoS;
    }

    public Integer getFfC() {
        return FfC;
    }

    public Integer getDwD() {
        return DwD;
    }
}
