package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

/**
 * Represents a (trapped) chest
 */
public class Chest extends DirectionalContainer {

    public Chest() {
        this(false);
    }

    public Chest(boolean isTrapped) {
        super(isTrapped ? Material.TRAPPED_CHEST : Material.CHEST);
    }

    /**
     * Instantiate a chest facing in a particular direction.
     *
     * @param direction the direction the chest's lit opens towards
     */
    public Chest(BlockFace direction) {
        this();
        setFacingDirection(direction);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Chest(final int type) {
        super(type);
    }

    public Chest(final Material type) {
        super(type);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Chest(final int type, final byte data) {
        super(type, data);
    }

    /**
     *
     * @deprecated Magic value
     */
    @Deprecated
    public Chest(final Material type, final byte data) {
        super(type, data);
    }

    public boolean isTrappedChest() {
        return this.getItemType() == Material.TRAPPED_CHEST;
    }

    @Override
    public Chest clone() {
        return (Chest) super.clone();
    }
}
