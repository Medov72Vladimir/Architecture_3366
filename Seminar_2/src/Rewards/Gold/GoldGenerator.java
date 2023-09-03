package Rewards.Gold;

import Abstractions.ItemGenerator;
import Abstractions.IGameItem;
public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}
