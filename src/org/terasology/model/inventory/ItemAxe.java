/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.model.inventory;

import org.terasology.logic.characters.Player;
import org.terasology.model.blocks.management.BlockManager;

/**
 * @author Benjamin 'begla' Glatzel <benjamin.glatzel@me.com>
 */
public class ItemAxe extends VoxelItem {
    public ItemAxe(Player parent) {
        super(parent);

        setIconWithAtlasPos(1, 7);
        _toolId = (byte) 1;
        _stackSize = 8;

        setExtractionAmountForBlock(BlockManager.getInstance().getBlock("BirkTrunk"), (byte) 2);
        setExtractionAmountForBlock(BlockManager.getInstance().getBlock("OakTrunk"), (byte) 2);
        setExtractionAmountForBlock(BlockManager.getInstance().getBlock("PineTrunk"), (byte) 2);
    }
}
