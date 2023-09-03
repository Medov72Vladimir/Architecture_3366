package Rewards.Diamond;

import Abstractions.ItemGenerator;
import Abstractions.IGameItem;

public class DiamondGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new DiamondRewards();
    }
}
