package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class FoodItemManager {

    public static ItemStack chicken;
    public static ItemStack chickenQT;
    public static ItemStack chickenBrst;
    public static ItemStack chickenWg;
    public static ItemStack cchicken;
    public static ItemStack cchickenQT;
    public static ItemStack cchickenBrst;
    public static ItemStack cchickenWg;
    public static ItemStack lettuce;
    public static ItemStack potato;
    public static ItemStack bakedPotato;
    public static ItemStack dicedPotatoes;
    public static ItemStack friedPotatoes;
    public static ItemStack carrot;
    public static ItemStack roastedCarrot;
    public static ItemStack spinach;
    public static ItemStack boiledSpinach;
    public static ItemStack wheat;
    public static ItemStack flour;
    public static ItemStack noodles;
    public static ItemStack bread;
    public static ItemStack toast;
    public static ItemStack roll;
    public static ItemStack beet;
    public static ItemStack roastedBeet;
    public static ItemStack molasses;
    public static ItemStack sugar;
    public static ItemStack brownSugar;
    public static ItemStack mushroom;
    public static ItemStack sauteedMushroom;
    public static ItemStack tomato;
    public static ItemStack tomatoSauce;
    public static ItemStack chiliPepper;
    public static ItemStack roastedChili;
    public static ItemStack garlic;
    public static ItemStack goatMeat;
    public static ItemStack rawGoatShoulder;
    public static ItemStack cookedGoatShoulder;
    public static ItemStack rawLoinChop;
    public static ItemStack cookedLoinChop;
    public static ItemStack rawBacon;
    public static ItemStack cookedBacon;
    public static ItemStack rawRibs;
    public static ItemStack cookedRibs;
    public static ItemStack rawGoatLeg;
    public static ItemStack cookedGoatLeg;
    public static ItemStack milk;
    public static ItemStack butter;
    public static ItemStack cheese;
    public static ItemStack egg;
    public static ItemStack friedEgg;
    public static ItemStack alfredo;
    public static ItemStack chickenAlfredo;
    public static ItemStack garlicBread;
    public static ItemStack supremeGarlicBread;
    public static ItemStack salad;
    public static ItemStack supremeSalad;
    public static ItemStack BBQRibs;
    public static ItemStack spicyRibs;
    public static ItemStack spaghetti;
    public static ItemStack supremeSpaghetti;
    public static ItemStack momsSpaghetti;
    public static ItemStack chili;
    public static ItemStack spicyChili;
    public static ItemStack hotSauce;
    public static ItemStack friedChickenQuarter;
    public static ItemStack spicyChickenQuarter;
    public static ItemStack goatStew;
    public static ItemStack supremeGoatStew;
    public static ItemStack mashedPotatoes;
    public static ItemStack mashedPotatoesG;
    public static ItemStack gravy;
    public static ItemStack friedChickenWing;
    public static ItemStack spicyChickenWing;
    public static ItemStack porkSteakMeal;
    public static ItemStack muffin;
    public static ItemStack pancake;
    public static ItemStack eggsAndBacon;
    public static ItemStack omelette;
    public static ItemStack supremeOmelette;
    public static ItemStack breakfast;
    public static ItemStack largeBreakfast;
    public static ItemStack supremeBreakfast;
    public static ItemStack hashBrown;
    public static ItemStack stuffedHashBrown;
    public static ItemStack donut;
    public static ItemStack frostedDonut;
    public static ItemStack regularMealsDisplay;
    public static ItemStack breakfastMealsDisplay;

    public static void init() {
        createChicken();
        createChickenQT();
        createChickenBrst();
        createChickenWg();
        createCChicken();
        createCChickenQT();
        createCChickenBrst();
        createCChickenWg();
        createLettuce();
        createPotatoes();
        createBakedPotatoes();
        createDicedPotatoes();
        createFriedPotatoes();
        createCarrot();
        createRoastedCarrot();
        createSpinach();
        createBoiledSpinach();
        createWheat();
        createFlour();
        createBread();
        createNoodles();
        createToast();
        createRoll();
        createBeet();
        createRoastedBeet();
        createMolasses();
        createSugar();
        createBrownSugar();
        createMushroom();
        createSauteedMushroom();
        createTomato();
        createTomatoSauce();
        createChiliPepper();
        createRoastedChili();
        createGarlic();
        createGoatMeat();
        createRawGoatShoulder();
        createCookedGoatShoulder();
        createRawLoinChop();
        createCookedLoinChop();
        createRawBacon();
        createCookedBacon();
        createRawRibs();
        createCookedRibs();
        createRawGoatLeg();
        createCookedGoatLeg();
        createMilk();
        createButter();
        createCheese();
        createEgg();
        createFriedEgg();
        createAlfredo();
        createChickenAlfredo();
        createGarlicBread();
        createSupremeGarlicBread();
        createSalad();
        createSupremeSalad();
        createBBQRibs();
        createSpicyRibs();
        createSpaghetti();
        createSupremeSpaghetti();
        createMomsSpaghetti();
        createChili();
        createSpicyChili();
        createHotSauce();
        createFriedChickenQuarter();
        createSpicyChickenQuarter();
        createGoatStew();
        createSupremeGoatStew();
        createMashedPotatoes();
        createMashedPotatoesG();
        createGravy();
        createFriedChickenWing();
        createSpicyChickenWing();
        createPorkSteakMeal();
        createMuffin();
        createPancake();
        createEggsAndBacon();
        createOmelette();
        createSupremeOmelette();
        createBreakfast();
        createLargeBreakfast();
        createSupremeBreakfast();
        createHashBrown();
        createStuffedHashBrown();
        createDonut();
        createFrostedDonut();
        createBreakfastMealsDisplay();
        createRegularMealsDisplay();
    }


    private static void createChicken() {
        ItemStack item = new ItemStack(Material.CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aWhole Raw Chicken");
        meta.setCustomModelData(200000);
        item.setItemMeta(meta);
        chicken = item;
    }

    private static void createCChicken() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aWhole Cooked Chicken");
        meta.setCustomModelData(300000);
        item.setItemMeta(meta);
        cchicken = item;
    }

    private static void createChickenQT() {
        ItemStack item = new ItemStack(Material.CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aChicken Quarter");
        meta.setCustomModelData(400000);
        item.setItemMeta(meta);
        chickenQT = item;
    }

    private static void createCChickenQT() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Chicken Quarter");
        meta.setCustomModelData(500000);
        item.setItemMeta(meta);
        cchickenQT = item;
    }

    private static void createChickenBrst() {
        ItemStack item = new ItemStack(Material.CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aChicken Breast");
        meta.setCustomModelData(600000);
        item.setItemMeta(meta);
        chickenBrst = item;
    }

    private static void createCChickenBrst() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Chicken Breast");
        meta.setCustomModelData(700000);
        item.setItemMeta(meta);
        cchickenBrst = item;
    }

    private static void createChickenWg() {
        ItemStack item = new ItemStack(Material.CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aChicken Wing");
        meta.setCustomModelData(800000);
        item.setItemMeta(meta);
        chickenWg = item;
    }

    private static void createCChickenWg() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fCooked Chicken Wing");
        meta.setCustomModelData(900000);
        item.setItemMeta(meta);
        cchickenWg = item;
    }

    private static void createLettuce() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aLettuce");
        meta.setCustomModelData(111111);
        item.setItemMeta(meta);
        lettuce = item;
    }

    private static void createPotatoes() {
        ItemStack item = new ItemStack(Material.POTATO);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fPotato");
        item.setItemMeta(meta);
        potato = item;
    }

    private static void createBakedPotatoes() {
        ItemStack item = new ItemStack(Material.BAKED_POTATO);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eBaked Potato");
        item.setItemMeta(meta);
        bakedPotato = item;
    }

    private static void createDicedPotatoes() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eDiced Potatoes");
        meta.setCustomModelData(110000);
        item.setItemMeta(meta);
        dicedPotatoes = item;
    }

    private static void createFriedPotatoes() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Fried Potatoes");
        meta.setCustomModelData(120000);
        item.setItemMeta(meta);
        friedPotatoes = item;
    }

    private static void createCarrot() {
        ItemStack item = new ItemStack(Material.CARROT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Carrot");
        item.setItemMeta(meta);
        carrot = item;
    }

    private static void createRoastedCarrot() {
        ItemStack item = new ItemStack(Material.CARROT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Roasted Carrots");
        meta.setCustomModelData(130000);
        item.setItemMeta(meta);
        roastedCarrot = item;
    }

    private static void createSpinach() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Spinach");
        meta.setCustomModelData(140000);
        item.setItemMeta(meta);
        spinach = item;
    }

    private static void createBoiledSpinach() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Boiled Spinach");
        meta.setCustomModelData(150000);
        item.setItemMeta(meta);
        boiledSpinach = item;
    }

    private static void createWheat() {
        ItemStack item = new ItemStack(Material.WHEAT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eWheat");
        item.setItemMeta(meta);
        wheat = item;
    }

    private static void createFlour() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fFlour");
        meta.setCustomModelData(160000);
        item.setItemMeta(meta);
        flour = item;
    }

    private static void createNoodles() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fNoodles");
        meta.setCustomModelData(170000);
        item.setItemMeta(meta);
        noodles = item;
    }

    private static void createBread() {
        ItemStack item = new ItemStack(Material.BREAD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eBread");
        item.setItemMeta(meta);
        bread = item;
    }

    private static void createToast() {
        ItemStack item = new ItemStack(Material.BREAD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eToast");
        meta.setCustomModelData(180000);
        item.setItemMeta(meta);
        toast = item;
    }

    private static void createRoll() {
        ItemStack item = new ItemStack(Material.BREAD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRoll");
        meta.setCustomModelData(190000);
        item.setItemMeta(meta);
        roll = item;
    }

    private static void createBeet() {
        ItemStack item = new ItemStack(Material.BEETROOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cBeet");
        item.setItemMeta(meta);
        beet = item;
    }

    private static void createRoastedBeet() {
        ItemStack item = new ItemStack(Material.BEETROOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cRoasted Beet");
        meta.setCustomModelData(20000);
        item.setItemMeta(meta);
        roastedBeet = item;
    }

    private static void createMolasses() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Molasses");
        meta.setCustomModelData(210000);
        item.setItemMeta(meta);
        molasses = item;
    }

    private static void createSugar() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fSugar");
        meta.setCustomModelData(221111);
        item.setItemMeta(meta);
        sugar = item;
    }

    private static void createBrownSugar() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eBrown Sugar");
        meta.setCustomModelData(230000);
        item.setItemMeta(meta);
        brownSugar = item;
    }

    private static void createMushroom() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eMushroom");
        meta.setCustomModelData(240000);
        item.setItemMeta(meta);
        mushroom = item;
    }

    private static void createSauteedMushroom() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eSauteed Mushroom");
        meta.setCustomModelData(250000);
        item.setItemMeta(meta);
        sauteedMushroom = item;
    }

    private static void createTomato() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cTomato");
        meta.setCustomModelData(260000);
        item.setItemMeta(meta);
        tomato = item;
    }

    private static void createTomatoSauce() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cTomato Sauce");
        meta.setCustomModelData(270000);
        item.setItemMeta(meta);
        tomatoSauce = item;
    }

    private static void createChiliPepper() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpicy Pepper");
        meta.setCustomModelData(280000);
        item.setItemMeta(meta);
        chiliPepper = item;
    }

    private static void createRoastedChili() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cRoasted Pepper");
        meta.setCustomModelData(290000);
        item.setItemMeta(meta);
        roastedChili = item;
    }

    private static void createGarlic() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fGarlic");
        meta.setCustomModelData(131111);
        item.setItemMeta(meta);
        garlic = item;
    }

    private static void createGoatMeat() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eGoat Meat");
        meta.setCustomModelData(310000);
        item.setItemMeta(meta);
        goatMeat = item;
    }

    private static void createRawGoatShoulder() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRaw Goat Shoulder");
        meta.setCustomModelData(320000);
        item.setItemMeta(meta);
        rawGoatShoulder = item;
    }

    private static void createCookedGoatShoulder() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Goat Shoulder");
        meta.setCustomModelData(330000);
        item.setItemMeta(meta);
        cookedGoatShoulder = item;
    }

    private static void createRawLoinChop() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRaw Loin Chop");
        meta.setCustomModelData(340000);
        item.setItemMeta(meta);
        rawLoinChop = item;
    }

    private static void createCookedLoinChop() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Loin Chop");
        meta.setCustomModelData(350000);
        item.setItemMeta(meta);
        cookedLoinChop = item;
    }

    private static void createRawBacon() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRaw Bacon");
        meta.setCustomModelData(360000);
        item.setItemMeta(meta);
        rawBacon = item;
    }

    private static void createCookedBacon() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Bacon");
        meta.setCustomModelData(370000);
        item.setItemMeta(meta);
        cookedBacon = item;
    }

    private static void createRawRibs() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRaw Ribs");
        meta.setCustomModelData(380000);
        item.setItemMeta(meta);
        rawRibs = item;
    }

    private static void createCookedRibs() {
        ItemStack item = new ItemStack(Material.COOKED_BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Ribs");
        meta.setCustomModelData(390000);
        item.setItemMeta(meta);
        cookedRibs = item;
    }

    private static void createRawGoatLeg() {
        ItemStack item = new ItemStack(Material.BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRaw Goat Leg");
        meta.setCustomModelData(040000);
        item.setItemMeta(meta);
        rawGoatLeg = item;
    }

    private static void createCookedGoatLeg() {
        ItemStack item = new ItemStack(Material.COOKED_BEEF);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCooked Goat Leg");
        meta.setCustomModelData(410000);
        item.setItemMeta(meta);
        cookedGoatLeg = item;
    }

    private static void createMilk() {
        ItemStack item = new ItemStack(Material.MILK_BUCKET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fMilk");
        meta.setCustomModelData(420000);
        item.setItemMeta(meta);
        milk = item;
    }

    private static void createButter() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eButter");
        meta.setCustomModelData(430000);
        item.setItemMeta(meta);
        butter = item;
    }

    private static void createCheese() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCheese");
        meta.setCustomModelData(440000);
        item.setItemMeta(meta);
        cheese = item;
    }

    private static void createEgg() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fEgg");
        meta.setCustomModelData(450000);
        item.setItemMeta(meta);
        egg = item;
    }

    private static void createFriedEgg() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eFried Egg");
        meta.setCustomModelData(460000);
        item.setItemMeta(meta);
        friedEgg = item;
    }

    private static void createAlfredo() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eAlfredo");
        meta.setCustomModelData(470000);
        item.setItemMeta(meta);
        alfredo = item;
    }

    private static void createChickenAlfredo() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eChicken Alfredo");
        meta.setCustomModelData(480000);
        item.setItemMeta(meta);
        chickenAlfredo = item;
    }

    private static void createGarlicBread() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eGarlic Bread");
        meta.setCustomModelData(490000);
        item.setItemMeta(meta);
        garlicBread = item;
    }

    private static void createSupremeGarlicBread() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eSupreme Garlic Bread");
        meta.setCustomModelData(050000);
        item.setItemMeta(meta);
        supremeGarlicBread = item;
    }

    private static void createSalad() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aSalad");
        meta.setCustomModelData(510000);
        item.setItemMeta(meta);
        salad = item;
    }

    private static void createSupremeSalad() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aSupreme Salad");
        meta.setCustomModelData(520000);
        item.setItemMeta(meta);
        supremeSalad = item;
    }

    private static void createBBQRibs() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cBBQ Ribs");
        meta.setCustomModelData(530000);
        item.setItemMeta(meta);
        BBQRibs = item;
    }

    private static void createSpicyRibs() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpicy Ribs");
        meta.setCustomModelData(540000);
        item.setItemMeta(meta);
        spicyRibs = item;
    }

    private static void createSpaghetti() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpaghetti");
        meta.setCustomModelData(550000);
        item.setItemMeta(meta);
        spaghetti = item;
    }

    private static void createSupremeSpaghetti() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSupreme Spaghetti");
        meta.setCustomModelData(560000);
        item.setItemMeta(meta);
        supremeSpaghetti = item;
    }

    private static void createMomsSpaghetti() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cMom's Spaghetti");
        meta.setCustomModelData(570000);
        item.setItemMeta(meta);
        momsSpaghetti = item;
    }

    private static void createChili() {
        ItemStack item = new ItemStack(Material.MUSHROOM_STEM);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cChili");
        meta.setCustomModelData(580000);
        item.setItemMeta(meta);
        chili = item;
    }

    private static void createSpicyChili() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpicy Chili");
        meta.setCustomModelData(590000);
        item.setItemMeta(meta);
        spicyChili = item;
    }

    private static void createHotSauce() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cHot Sauce");
        meta.setCustomModelData(060000);
        item.setItemMeta(meta);
        hotSauce = item;
    }

    private static void createFriedChickenQuarter() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eFried Chicken Quarter");
        meta.setCustomModelData(610000);
        item.setItemMeta(meta);
        friedChickenQuarter = item;
    }

    private static void createSpicyChickenQuarter() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpicy Chicken Quarter");
        meta.setCustomModelData(620000);
        item.setItemMeta(meta);
        spicyChickenQuarter = item;
    }

    private static void createGoatStew() {
        ItemStack item = new ItemStack(Material.RABBIT_STEW);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aGoat Stew");
        meta.setCustomModelData(630000);
        item.setItemMeta(meta);
        goatStew = item;
    }

    private static void createSupremeGoatStew() {
        ItemStack item = new ItemStack(Material.RABBIT_STEW);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aSupreme Goat Stew");
        meta.setCustomModelData(640000);
        item.setItemMeta(meta);
        supremeGoatStew = item;
    }

    private static void createMashedPotatoes() {
        ItemStack item = new ItemStack(Material.BAKED_POTATO);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eMashed Potatoes");
        meta.setCustomModelData(650000);
        item.setItemMeta(meta);
        mashedPotatoes = item;
    }

    private static void createMashedPotatoesG() {
        ItemStack item = new ItemStack(Material.BAKED_POTATO);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eMashed Potatoes & Gravy");
        meta.setCustomModelData(660000);
        item.setItemMeta(meta);
        mashedPotatoesG = item;
    }

    private static void createGravy() {
        ItemStack item = new ItemStack(Material.MILK_BUCKET);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aGravy");
        meta.setCustomModelData(670000);
        item.setItemMeta(meta);
        gravy = item;
    }

    private static void createFriedChickenWing() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eFried Chicken Wing");
        meta.setCustomModelData(680000);
        item.setItemMeta(meta);
        friedChickenWing = item;
    }

    private static void createSpicyChickenWing() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSpicy Chicken Wing");
        meta.setCustomModelData(690000);
        item.setItemMeta(meta);
        spicyChickenWing = item;
    }

    private static void createPorkSteakMeal() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aPork Steak Meal");
        meta.setCustomModelData(070000);
        item.setItemMeta(meta);
        porkSteakMeal = item;
    }

    private static void createMuffin() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aMuffin");
        meta.setCustomModelData(710000);
        item.setItemMeta(meta);
        muffin = item;
    }

    private static void createPancake() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§ePancake");
        meta.setCustomModelData(720000);
        item.setItemMeta(meta);
        pancake = item;
    }

    private static void createEggsAndBacon() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aEggs And Bacon");
        meta.setCustomModelData(730000);
        item.setItemMeta(meta);
        eggsAndBacon = item;
    }

    private static void createOmelette() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eOmelette");
        meta.setCustomModelData(740000);
        item.setItemMeta(meta);
        omelette = item;
    }

    private static void createSupremeOmelette() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eSupreme Omelette");
        meta.setCustomModelData(750000);
        item.setItemMeta(meta);
        supremeOmelette = item;
    }

    private static void createBreakfast() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aBreakfast");
        meta.setCustomModelData(760000);
        item.setItemMeta(meta);
        breakfast = item;
    }

    private static void createLargeBreakfast() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aLarge Breakfast");
        meta.setCustomModelData(770000);
        item.setItemMeta(meta);
        largeBreakfast = item;
    }

    private static void createSupremeBreakfast() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aSupreme Breakfast");
        meta.setCustomModelData(780000);
        item.setItemMeta(meta);
        supremeBreakfast = item;
    }

    private static void createHashBrown() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eHash Brown");
        meta.setCustomModelData(790000);
        item.setItemMeta(meta);
        hashBrown = item;
    }

    private static void createStuffedHashBrown() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eStuffed Hash Brown");
        meta.setCustomModelData(800000);
        item.setItemMeta(meta);
        stuffedHashBrown = item;
    }

    private static void createDonut() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eDonut");
        meta.setCustomModelData(880000);
        item.setItemMeta(meta);
        donut = item;
    }

    private static void createFrostedDonut() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eFrosted Donut");
        meta.setCustomModelData(880000);
        item.setItemMeta(meta);
        frostedDonut = item;
    }

    private static void createBreakfastMealsDisplay() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eBreakfast Meals");
        meta.setLore(Collections.singletonList("§aCooked breakfast foods here"));
        meta.setCustomModelData(890000);
        item.setItemMeta(meta);
        breakfastMealsDisplay = item;
    }

    private static void createRegularMealsDisplay() {
        ItemStack item = new ItemStack(Material.APPLE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eRegular Meals");
        meta.setLore(Collections.singletonList("§aCooked breakfast foods here"));
        meta.setCustomModelData(900000);
        item.setItemMeta(meta);
        regularMealsDisplay = item;
    }
}
