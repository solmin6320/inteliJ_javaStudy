package Pro;

public class Character {
    String name;
    String job;
    int level;
    boolean hasBuff;

    public Character (String name, String job, int level, boolean hasBuff) {
            this.name = name;
            this.job = job;
            this.level = level;
            this.hasBuff = hasBuff;
    }
    public Character(String name, String job, int level) {
            this(name,job,level,false);
    }
    public int getBaseDamage() {
        if (job.equals("전사") ) {
            return 100 * level;
        } else if (job.equals("궁수")) {
            return 120 * level;
        } else if(job.equals("마법사")) {
            return 150 * level;
        } else {
            return 0;
        }

    }
    public int getBonusDamage() {
        if (hasBuff && job.equals("마법사")) {
            return (int) (getBaseDamage() * 0.5);
        } else if (hasBuff && !job.equals("마법사")) {
            return (int) (getBaseDamage() * 0.2);
            } else if(level >= 50) {
            return  500;
        } else {
            return 0;
        }

    }
    public int getTotalDamage() {
        return getBaseDamage() + getBonusDamage();
    }
    public String getRnak() {
        return "dd";
    }
}
