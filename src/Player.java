/**
 * 2 Players get to setup equipment and Stats.
 * author: Karan
 */
public class Player {
    private PlayerStats playerStats;
    private MCSim playerEquipment;

    public MCSim getPlayerEquipment() {
        return playerEquipment;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public void setPlayerEquipment(MCSim playerEquipment) {
        this.playerEquipment = playerEquipment;
    }
}
