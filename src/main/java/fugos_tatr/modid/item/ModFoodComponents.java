package fugos_tatr.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;

public class ModFoodComponents {
    public static final  FoodComponent PEAR_JAM = new FoodComponent.Builder().nutrition(0).saturationModifier(1.0F).build();

    public static final FoodComponent BLUE_BERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4F).build();
    public static final FoodComponent BLUE_BERRY_JAM = FoodComponents.PORKCHOP;
}
