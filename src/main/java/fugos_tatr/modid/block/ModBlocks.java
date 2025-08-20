package fugos_tatr.modid.block;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.custom.BlueBerryBush;
import fugos_tatr.modid.block.custom.ModSaplingBlock;
import fugos_tatr.modid.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
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

    public static final Block MAPLE_LOG = registerBlock("maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_LOG));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", Block::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS));

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", settings -> new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHERRY_STAIRS));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB));

    public static final Block MAPLE_BUTTON = registerBlockAlt("maple_button", settings -> new ButtonBlock(BlockSetType.CHERRY, 20, settings));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_PRESSURE_PLATE));

    public static final Block MAPLE_FENCE = registerBlock("maple_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE));
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", settings -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE_GATE));

    public static final Block MAPLE_DOOR = registerBlock("maple_door", settings -> new DoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", settings -> new TrapdoorBlock(BlockSetType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_TRAPDOOR));



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



    public static final Block PALM_SEED = registerBlockAlt("palm_seed", properties -> new ModSaplingBlock(ModSaplingGenerators.PALM, properties.mapColor(MapColor.LIME)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.SAND));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES));

    public static final Block PALM_LOG = registerBlock("palm_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_STEM));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM));
    public static final Block PALM_WOOD = registerBlock("palm_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_STEM));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM));

    public static final Block PALM_PLANKS = registerBlock("palm_planks", Block::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs", settings -> new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_STAIRS));
    public static final Block PALM_SLAB = registerBlock("palm_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_SLAB));

    public static final Block PALM_BUTTON = registerBlock("palm_button", settings -> new ButtonBlock(BlockSetType.WARPED, 20, settings), AbstractBlock.Settings.copy(Blocks.WARPED_BUTTON));
    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_PRESSURE_PLATE));

    public static final Block PALM_FENCE = registerBlock("palm_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_FENCE));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate", settings -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_FENCE_GATE));



    public static final Block RUBBER_PROPAGULE = registerBlockAlt("rubber_propagule", properties -> new ModSaplingBlock(ModSaplingGenerators.RUBBER, properties.mapColor(MapColor.LIME)
            .noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY), Blocks.GRASS_BLOCK));

    public static final Block RUBBER_LEAVES = registerBlock("rubber_leaves", settings -> new UntintedParticleLeavesBlock(0.00f, ParticleTypes.CHERRY_LEAVES, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES));

    public static final Block RUBBER_LOG = registerBlock("rubber_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_STEM));
    public static final Block STRIPPED_RUBBER_LOG = registerBlock("stripped_rubber_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM));
    public static final Block RUBBER_WOOD = registerBlock("rubber_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_STEM));
    public static final Block STRIPPED_RUBBER_WOOD = registerBlock("stripped_rubber_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM));

    public static final Block RUBBER_PLANKS = registerBlock("rubber_planks", Block::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS));

    public static final Block RUBBER_STAIRS = registerBlock("rubber_stairs", settings -> new StairsBlock(ModBlocks.RUBBER_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_STAIRS));
    public static final Block RUBBER_SLAB = registerBlock("rubber_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_SLAB));

    public static final Block RUBBER_BUTTON = registerBlock("rubber_button", settings -> new ButtonBlock(BlockSetType.WARPED, 20, settings), AbstractBlock.Settings.copy(Blocks.WARPED_BUTTON));
    public static final Block RUBBER_PRESSURE_PLATE = registerBlock("rubber_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_PRESSURE_PLATE));

    public static final Block RUBBER_FENCE = registerBlock("rubber_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_FENCE));
    public static final Block RUBBER_FENCE_GATE = registerBlock("rubber_fence_gate", settings -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_FENCE_GATE));



    public static final Block BLUE_BERRY_BUSH = registerBlock("blue_berry_bush", BlueBerryBush::new, AbstractBlock.Settings.create().mapColor(MapColor.LAPIS_BLUE).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY));

    public static final Block COBBLED_SALT = registerBlock("cobbled_salt", Block::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block COBBLED_SALT_STAIRS = registerBlock("cobbled_salt_stairs", settings -> new StairsBlock(ModBlocks.COBBLED_SALT.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.COBBLESTONE_STAIRS));
    public static final Block COBBLED_SALT_SLAB = registerBlock("cobbled_salt_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE_SLAB));
    public static final Block COBBLED_SALT_WALL = registerBlock("cobbled_salt_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.COBBLESTONE_WALL));

    public static final Block SALT_BLOCK = registerBlock("salt_block",Block::new, AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block SALT_BLOCK_STAIRS = registerBlock("salt_block_stairs", settings -> new StairsBlock(ModBlocks.SALT_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.GRANITE_STAIRS));
    public static final Block SALT_BLOCK_SLAB = registerBlock("salt_block_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB));
    public static final Block SALT_BLOCK_WALL = registerBlock("salt_block_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.GRANITE_WALL));

    public static final Block SALT_BRICKS = registerBlock("salt_bricks", Block::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS));
    public static final Block SALT_BRICK_STAIRS = registerBlock("salt_brick_stairs", settings -> new StairsBlock(ModBlocks.SALT_BRICKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_STAIRS));
    public static final Block SALT_BRICK_SLAB = registerBlock("salt_brick_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB));
    public static final Block SALT_BRICK_WALL = registerBlock("salt_brick_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_WALL));

    public static final Block SALT_TILES = registerBlock("salt_tiles", Block::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
    public static final Block SALT_TILE_STAIRS = registerBlock("salt_tile_stairs", settings -> new StairsBlock(ModBlocks.SALT_TILES.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_STAIRS));
    public static final Block SALT_TILE_SLAB = registerBlock("salt_tile_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB));
    public static final Block SALT_TILE_WALL = registerBlock("salt_tile_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_WALL));



    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", Block::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block TUFF_TITANIUM_ORE = registerBlock("tuff_titanium_ore", Block::new, AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore", Block::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));

    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", Block::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", Block::new, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));



    public static final Block BLUE_ROSE_BLOCK = registerBlock("blue_rose_block", settings -> new FlowerBlock(StatusEffects.NIGHT_VISION, 5.0F, settings), AbstractBlock.Settings.copy(Blocks.POPPY));
    public static final Block POTTED_BLUE_ROSE_BLOCK = registerBlock("potted_blue_rose_block", settings -> new FlowerPotBlock(ModBlocks.BLUE_ROSE_BLOCK, settings), AbstractBlock.Settings.copy(Blocks.POTTED_POPPY));

    public static final Block GARNET_CLUMP = registerBlock("garnet_clump", settings -> new AmethystClusterBlock(5, 10, settings), AbstractBlock.Settings.copy(Blocks.AMETHYST_CLUSTER));

    public static final Block DRIED_RUBBER_CLUMPS_BLOCK = registerBlock("dried_rubber_clumps_block", MultifaceBlock::new, AbstractBlock.Settings.copy(Blocks.RESIN_CLUMP));
    public static final Block RUBBER_BLOCK = registerBlock("rubber_block", Block::new, AbstractBlock.Settings.copy(Blocks.RESIN_BLOCK));

    public static final Block ESTROLITE_ORE = registerBlock("estrolite_ore", Block::new, AbstractBlock.Settings.copy(Blocks.COPPER_ORE));

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
