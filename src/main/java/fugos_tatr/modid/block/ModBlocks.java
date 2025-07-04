package fugos_tatr.modid.block;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.custom.BlueBerryBush;
import fugos_tatr.modid.block.custom.ModSaplingBlock;
import fugos_tatr.modid.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block PEAR_SAPLING = registerBlockAlt("pear_sapling", properties -> new ModSaplingBlock(ModSaplingGenerators.PEAR, properties.mapColor(MapColor.WHITE)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.GRASS_BLOCK));

    public static final Block PEAR_LEAVES = registerBlock("pear_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES));

    public static final Block PEAR_LOG = registerBlock("pear_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_LOG));
    public static final Block STRIPPED_PEAR_LOG = registerBlock("stripped_pear_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG));
    public static final Block PEAR_WOOD = registerBlock("pear_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD));
    public static final Block STRIPPED_PEAR_WOOD = registerBlock("stripped_pear_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD));

    public static final Block PEAR_PLANKS = registerBlock("pear_planks", Block::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS));

    public static final Block PEAR_STAIRS = registerBlock("pear_stairs", settings -> new StairsBlock(ModBlocks.PEAR_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BIRCH_STAIRS));
    public static final Block PEAR_SLAB = registerBlock("pear_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_SLAB));

    public static final Block PEAR_BUTTON = registerBlockAlt("pear_button", settings -> new ButtonBlock(BlockSetType.BIRCH, 20, settings));
    public static final Block PEAR_PRESSURE_PLATE = registerBlock("pear_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_PRESSURE_PLATE));

    public static final Block PEAR_FENCE = registerBlock("pear_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_FENCE));
    public static final Block PEAR_FENCE_GATE = registerBlock("pear_fence_gate", settings -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_FENCE_GATE));

    public static final Block PEAR_DOOR = registerBlock("pear_door", settings -> new DoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_DOOR));
    public static final Block PEAR_TRAPDOOR = registerBlock("pear_trapdoor", settings -> new TrapdoorBlock(BlockSetType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_TRAPDOOR));



    public static final Block CHESTNUT_SAPLING = registerBlockAlt("chestnut_sapling", properties -> new ModSaplingBlock(ModSaplingGenerators.CHESTNUT, properties.mapColor(MapColor.GREEN)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.GRASS_BLOCK));

    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES));

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks", Block::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS));

    public static final Block CHESTNUT_STAIRS = registerBlock("chestnut_stairs", settings -> new StairsBlock(ModBlocks.CHESTNUT_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_STAIRS));
    public static final Block CHESTNUT_SLAB = registerBlock("chestnut_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB));

    public static final Block CHESTNUT_BUTTON = registerBlockAlt("chestnut_button", settings -> new ButtonBlock(BlockSetType.MANGROVE, 20, settings));
    public static final Block CHESTNUT_PRESSURE_PLATE = registerBlock("chestnut_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE));

    public static final Block CHESTNUT_FENCE = registerBlock("chestnut_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE));
    public static final Block CHESTNUT_FENCE_GATE = registerBlock("chestnut_fence_gate", settings -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE));

    public static final Block CHESTNUT_DOOR = registerBlock("chestnut_door", settings -> new DoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_DOOR));
    public static final Block CHESTNUT_TRAPDOOR = registerBlock("chestnut_trapdoor", settings -> new TrapdoorBlock(BlockSetType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR));

    public static final Block MAPLE_SAPLING = registerBlockAlt("maple_sapling", properties -> new ModSaplingBlock(ModSaplingGenerators.MAPLE, properties.mapColor(MapColor.RED)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.GRASS_BLOCK));

    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static final Block MAPLE_LOG = registerBlock("maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", settings -> new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB));

    public static final Block MAPLE_BUTTON = registerBlockAlt("maple_button", settings -> new ButtonBlock(BlockSetType.OAK, 20, settings));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));

    public static final Block MAPLE_FENCE = registerBlock("maple_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", settings -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));

    public static final Block MAPLE_DOOR = registerBlock("maple_door", settings -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_DOOR));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", settings -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));



    public static final Block PINE_SAPLING = registerBlockAlt("pine_sapling", properties -> new ModSaplingBlock(ModSaplingGenerators.PINE, properties.mapColor(MapColor.GREEN)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.GRASS_BLOCK));

    public static final Block PINE_LEAVES = registerBlock("pine_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES));

    public static final Block PINE_LOG = registerBlock("pine_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG));
    public static final Block PINE_WOOD = registerBlock("pine_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD));

    public static final Block PINE_PLANKS = registerBlock("pine_planks", Block::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS));

    public static final Block PINE_STAIRS = registerBlock("pine_stairs", settings -> new StairsBlock(ModBlocks.PINE_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_STAIRS));
    public static final Block PINE_SLAB = registerBlock("pine_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_SLAB));

    public static final Block PINE_BUTTON = registerBlockAlt("pine_button", settings -> new ButtonBlock(BlockSetType.SPRUCE, 20, settings));
    public static final Block PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_PRESSURE_PLATE));

    public static final Block PINE_FENCE = registerBlock("pine_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_FENCE));
    public static final Block PINE_FENCE_GATE = registerBlock("pine_fence_gate", settings -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_FENCE_GATE));

    public static final Block PINE_DOOR = registerBlock("pine_door", settings -> new DoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_DOOR));
    public static final Block PINE_TRAPDOOR = registerBlock("pine_trapdoor", settings -> new TrapdoorBlock(BlockSetType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_TRAPDOOR));

    public static final Block BLUE_BERRY_BUSH = registerBlock("blue_berry_bush", BlueBerryBush::new, AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return block;
    }

    private static Block registerBlockAlt(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering ModBlocks for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
