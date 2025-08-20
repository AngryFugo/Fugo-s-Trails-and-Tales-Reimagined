package fugos_tatr.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;

public class ModFoodComponents {
    public static final  FoodComponent PEAR_JAM = new FoodComponent.Builder().nutrition(0).saturationModifier(1.0F).build();

    public static final FoodComponent BLUE_BERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final FoodComponent BLUE_BERRY_JAM = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5F).build();

    public static final FoodComponent ESTROLITE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25F).build();

    public static final FoodComponent RUBBER_GLOOP = new FoodComponent.Builder().nutrition(0).saturationModifier(0.0F).alwaysEdible().build();
}
