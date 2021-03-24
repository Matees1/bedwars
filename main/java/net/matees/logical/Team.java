package net.matees.logical;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Team {
    private Location genLocation;
    private Location shopkeeperLocation;
    private Location upgradesLocation;
    private Location spawnLocation;

    private Teams teamColor;

    private ItemStack helmet;
    private ItemStack chestplate;
    private ItemStack leggings;
    private ItemStack boots;

    private ItemStack wool;

    private Player teamMember;

    private Block bed;

    public Team() { }

    public Team(Location spawnLocation, Location genLocation, Location shopkeeperLocation, Location upgradesLocation, Teams teamColor, ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots, ItemStack wool, Player teamMember, Block bed) {
        this.genLocation = genLocation;
        this.shopkeeperLocation = shopkeeperLocation;
        this.upgradesLocation = upgradesLocation;
        this.spawnLocation = spawnLocation;

        this.teamColor = teamColor;
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;

        switch (teamColor) {
            case RED:
                this.wool = new ItemStack(Material.RED_WOOL);

                break;

            case BLUE:
                this.wool = new ItemStack(Material.BLUE_WOOL);
                break;

            case GREEN:
                this.wool = new ItemStack(Material.GREEN_WOOL);
                break;

            case YELLOW:
                this.wool = new ItemStack(Material.YELLOW_WOOL);
                break;

            case AQUA:
                this.wool = new ItemStack(Material.LIGHT_BLUE_WOOL);
                break;

            case WHITE:
                this.wool = new ItemStack(Material.WHITE_WOOL);
                break;

            case PINK:
                this.wool = new ItemStack(Material.PINK_WOOL);
                break;

            case GRAY:
                this.wool = new ItemStack(Material.LIGHT_GRAY_WOOL);
                break;

            default:
                this.wool = wool;
                break;
        }
        this.teamMember = teamMember;
        this.bed = bed;
    }

    public void setGenLocation(Location genLocation) {
        this.genLocation = genLocation;
    }

    public void setShopkeeperLocation(Location shopkeeperLocation) {
        this.shopkeeperLocation = shopkeeperLocation;
    }

    public void setUpgradesLocation(Location upgradesLocation) {
        this.upgradesLocation = upgradesLocation;
    }

    public void setTeamColor(Teams teamColor) {
        this.teamColor = teamColor;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public void setChestplate(ItemStack chestplate) {
        this.chestplate = chestplate;
    }

    public void setLeggings(ItemStack leggings) {
        this.leggings = leggings;
    }

    public void setBoots(ItemStack boots) {
        this.boots = boots;
    }

    public void setWool(ItemStack wool) {
        this.wool = wool;
    }

    public void setTeamMember(Player teamMember) {
        this.teamMember = teamMember;
    }

    public void setBed(Block bed) {
        this.bed = bed;
    }

    public Location getGenLocation() {
        return genLocation;
    }

    public Location getShopkeeperLocation() {
        return shopkeeperLocation;
    }

    public Location getUpgradesLocation() {
        return upgradesLocation;
    }

    public Teams getTeamColor() {
        return teamColor;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public ItemStack getChestplate() {
        return chestplate;
    }

    public ItemStack getLeggings() {
        return leggings;
    }

    public ItemStack getBoots() {
        return boots;
    }

    public ItemStack getWool() {
        return wool;
    }

    public Player getTeamMember() {
        return teamMember;
    }

    public Block getBed() {
        return bed;
    }
}
