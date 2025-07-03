package fugos_tatr.modid;

import fugos_tatr.modid.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class FugosTrailsAndTalesReimaginedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.PEAR_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.PEAR_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PEAR_TRAPDOOR, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_TRAPDOOR, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.PINE_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.PINE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PINE_TRAPDOOR, BlockRenderLayer.CUTOUT);



        BlockRenderLayerMap.putBlock(ModBlocks.BLUE_BERRY_BUSH, BlockRenderLayer.CUTOUT);
    }
}
