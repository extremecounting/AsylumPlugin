package org.asylum.npc.inventoryEvents;

import org.asylum.Asylum;
import org.asylum.itemManager.FoodItemManager;
import org.asylum.itemManager.MaterialsItemManager;
import org.asylum.npc.guis.CookGUI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.List;

public class CookEvents implements Listener {
    private int amount = 1;
    private int type = 0;
    @EventHandler
    public void onClickEventCook(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getCurrentItem() == null) { return; }
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory().getHolder() instanceof CookGUI) {
            event.setCancelled(true);
            if (event.isRightClick())
                event.setCancelled(true);
            if (event.isShiftClick())
                event.setCancelled(true);
            if (event.isLeftClick()) {
                event.setCancelled(true);
                if (event.getCurrentItem() == null) {
                    event.setCancelled(true);
                    return;
                }
                if (event.getCurrentItem().getType() == Material.BARRIER) {
                    player.closeInventory();
                    return;
                }
                else if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().equals(CookGUI.plantMushrooms.getItemMeta())) {
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookGUI.inv.setItem(10, FoodItemManager.bakedPotato);
                        CookGUI.inv.setItem(11, FoodItemManager.dicedPotatoes);
                        CookGUI.inv.setItem(12, FoodItemManager.friedPotatoes);
                        CookGUI.inv.setItem(13, FoodItemManager.roastedCarrot);
                        CookGUI.inv.setItem(14, FoodItemManager.boiledSpinach);
                        CookGUI.inv.setItem(15, FoodItemManager.flour);
                        CookGUI.inv.setItem(16, FoodItemManager.noodles);
                        CookGUI.inv.setItem(19, FoodItemManager.bread);
                        CookGUI.inv.setItem(20, FoodItemManager.toast);
                        CookGUI.inv.setItem(21, FoodItemManager.roll);
                        CookGUI.inv.setItem(22, FoodItemManager.roastedBeet);
                        CookGUI.inv.setItem(23, FoodItemManager.molasses);
                        CookGUI.inv.setItem(24, FoodItemManager.sugar);
                        CookGUI.inv.setItem(25, FoodItemManager.brownSugar);
                        CookGUI.inv.setItem(28, FoodItemManager.sauteedMushroom);
                        CookGUI.inv.setItem(29, FoodItemManager.tomatoSauce);
                        CookGUI.inv.setItem(30, FoodItemManager.hotSauce);
                        CookGUI.inv.setItem(31, FoodItemManager.roastedChili);
                    }, 2L);
                }
                else if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().equals(CookGUI.cookedMeat.getItemMeta())) {
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookGUI.inv.setItem(10, FoodItemManager.cchicken);
                        CookGUI.inv.setItem(11, FoodItemManager.cchickenQT);
                        CookGUI.inv.setItem(12, FoodItemManager.cchickenBrst);
                        CookGUI.inv.setItem(13, FoodItemManager.cchickenWg);
                        CookGUI.inv.setItem(14, FoodItemManager.cookedGoatShoulder);
                        CookGUI.inv.setItem(15, FoodItemManager.cookedLoinChop);
                        CookGUI.inv.setItem(16, FoodItemManager.cookedRibs);
                        CookGUI.inv.setItem(19, FoodItemManager.cookedGoatLeg);
                        CookGUI.inv.setItem(20, FoodItemManager.cookedBacon);
                        CookGUI.inv.setItem(21, FoodItemManager.friedChickenQuarter);
                        CookGUI.inv.setItem(22, FoodItemManager.spicyChickenQuarter);
                        CookGUI.inv.setItem(23, FoodItemManager.friedChickenWing);
                        CookGUI.inv.setItem(24, FoodItemManager.spicyChickenWing);
                    }, 2L); // amount to wait in ticks , 20 ticks = 1 second

                }
                else if (event.getSlot() == 12 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.regularMealsDisplay.getItemMeta())) {
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookGUI.inv.setItem(10, FoodItemManager.alfredo);
                        CookGUI.inv.setItem(11, FoodItemManager.chickenAlfredo);
                        CookGUI.inv.setItem(12, FoodItemManager.garlicBread);
                        CookGUI.inv.setItem(13, FoodItemManager.supremeGarlicBread);
                        CookGUI.inv.setItem(14, FoodItemManager.salad);
                        CookGUI.inv.setItem(15, FoodItemManager.supremeSalad);
                        CookGUI.inv.setItem(16, FoodItemManager.BBQRibs);
                        CookGUI.inv.setItem(19, FoodItemManager.spicyRibs);
                        CookGUI.inv.setItem(20, FoodItemManager.spaghetti);
                        CookGUI.inv.setItem(21, FoodItemManager.supremeSpaghetti);
                        CookGUI.inv.setItem(22, FoodItemManager.momsSpaghetti);
                        CookGUI.inv.setItem(23, FoodItemManager.chili);
                        CookGUI.inv.setItem(24, FoodItemManager.spicyChili);
                        CookGUI.inv.setItem(25, FoodItemManager.goatStew);
                        CookGUI.inv.setItem(28, FoodItemManager.supremeGoatStew);
                        CookGUI.inv.setItem(29, FoodItemManager.mashedPotatoes);
                        CookGUI.inv.setItem(30, FoodItemManager.mashedPotatoesG);
                        CookGUI.inv.setItem(31, FoodItemManager.gravy);
                        CookGUI.inv.setItem(32, FoodItemManager.porkSteakMeal);
                    }, 2L);

                }
                else if (event.getSlot() == 13 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.breakfastMealsDisplay.getItemMeta())) {
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookGUI.inv.setItem(10, FoodItemManager.friedEgg);
                        CookGUI.inv.setItem(11, FoodItemManager.muffin);
                        CookGUI.inv.setItem(12, FoodItemManager.pancake);
                        CookGUI.inv.setItem(13, FoodItemManager.hashBrown);
                        CookGUI.inv.setItem(14, FoodItemManager.stuffedHashBrown);
                        CookGUI.inv.setItem(15, FoodItemManager.donut);
                        CookGUI.inv.setItem(16, FoodItemManager.frostedDonut);
                        CookGUI.inv.setItem(19, FoodItemManager.eggsAndBacon);
                        CookGUI.inv.setItem(20, FoodItemManager.omelette);
                        CookGUI.inv.setItem(21, FoodItemManager.supremeOmelette);
                        CookGUI.inv.setItem(22, FoodItemManager.breakfast);
                        CookGUI.inv.setItem(23, FoodItemManager.largeBreakfast);
                        CookGUI.inv.setItem(24, FoodItemManager.supremeBreakfast);
                    }, 2L);

                }

                //Cook whole chicken
                if (event.getCurrentItem().getItemMeta().equals(FoodItemManager.cchicken.getItemMeta())) {
                    amount = 1;
                    type = -1;
                    CClear();
                    CookStart();
                    ChickenCKC(amount);
                }
                //Cook quarters
                if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cchickenQT.getItemMeta())) {
                    amount = 1;
                    type = 4;
                    CClear();
                    CookStart();
                    CChickenQT(amount);
                }
                //Cook breasts
                else if (event.getSlot() == 12 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cchickenBrst.getItemMeta())) {
                    amount = 1;
                    type = 5;
                    CClear();
                    CookStart();
                    CChickenB(amount);
                }
                //Cook Wings
                else if (event.getSlot() == 13 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cchickenWg.getItemMeta())) {
                    amount = 1;
                    type = 6;
                    CClear();
                    CookStart();
                    CChickenW(amount);
                }
                //Cook goat shoulder
                else if (event.getSlot() == 14 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cookedGoatShoulder.getItemMeta())) {
                    amount = 1;
                    type = 7;
                    CClear();
                    CookStart();
                    CookGoatShoulder(amount);
                }
                //Cook loin chop
                else if (event.getSlot() == 15 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cookedLoinChop.getItemMeta())) {
                    amount = 1;
                    type = 8;
                    CClear();
                    CookStart();
                    CookLoinChop(amount);
                }
                //Cook ribs
                else if (event.getSlot() == 16 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cookedRibs.getItemMeta())) {
                    amount = 1;
                    type = 9;
                    CClear();
                    CookStart();
                    CookRibs(amount);
                }
                //Cook goat leg
                else if (event.getSlot() == 19 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cookedGoatLeg.getItemMeta())) {
                    amount = 1;
                    type = 10;
                    CClear();
                    CookStart();
                    CookGoatLeg(amount);
                }
                //Cook bacon
                else if (event.getSlot() == 20 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.cookedBacon.getItemMeta())) {
                    amount = 1;
                    type = 11;
                    CClear();
                    CookStart();
                    CookBacon(amount);
                }
                //Cook fried chicken quarter
                else if (event.getSlot() == 21 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.friedChickenQuarter.getItemMeta())) {
                    amount = 1;
                    type = 12;
                    CClear();
                    CookStart();
                    FryChickenQT(amount);
                }
                //Cook spicy chicken quarter
                else if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.spicyChickenQuarter.getItemMeta())) {
                    amount = 1;
                    type = 13;
                    CClear();
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookStart();
                        SpicyChickenQT(amount);
                    }, 2L);
                }
                //Cook fried chicken wing
                else if (event.getSlot() == 23 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.friedChickenWing.getItemMeta())) {
                    amount = 1;
                    type = 14;
                    CClear();
                    CookStart();
                    FryChickenWG(amount);
                }
                //Cook spicy chicken wing
                else if (event.getSlot() == 24 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.spicyChickenWing.getItemMeta())) {
                    amount = 1;
                    type = 15;
                    CClear();
                    CookStart();
                    SpicyChickenWG(amount);
                }
                //Bake potato
                else if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.bakedPotato.getItemMeta())) {
                    amount = 1;
                    type = 16;
                    CClear();
                    CookStart();
                    BakePotato(amount);
                }
                //Dice potato
                else if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.dicedPotatoes.getItemMeta())) {
                    amount = 1;
                    type = 17;
                    CClear();
                    CookStart();
                    DicePotato(amount);
                }
                //Fry diced potatoes
                else if (event.getSlot() == 12 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.friedPotatoes.getItemMeta())) {
                    amount = 1;
                    type = 18;
                    CClear();
                    CookStart();
                    FryPotato(amount);
                }
                //Roast carrots
                else if (event.getSlot() == 13 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.roastedCarrot.getItemMeta())) {
                    amount = 1;
                    type = 19;
                    CClear();
                    CookStart();
                    RoastCarrot(amount);
                }
                //Boil spinach
                else if (event.getSlot() == 14 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.boiledSpinach.getItemMeta())) {
                    amount = 1;
                    type = 20;
                    CClear();
                    CookStart();
                    BoilSpinach(amount);
                }
                //Grind wheat
                else if (event.getSlot() == 15 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.flour.getItemMeta())) {
                    amount = 1;
                    type = 21;
                    CClear();
                    CookStart();
                    GrindWheat(amount);
                }
                //Make noodles
                else if (event.getSlot() == 16 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.noodles.getItemMeta())) {
                    amount = 1;
                    type = 22;
                    CClear();
                    CookStart();
                    MakeNoodles(amount);
                }
                //Make bread
                else if (event.getSlot() == 19 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.bread.getItemMeta())) {
                    amount = 1;
                    type = 23;
                    CClear();
                    CookStart();
                    BakeBread(amount);
                }
                //Cook Bread into toast
                else if (event.getSlot() == 20 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.toast.getItemMeta())) {
                    amount = 1;
                    type = 24;
                    CClear();
                    CookStart();
                    CookToast(amount);
                }
                //Make rolls
                else if (event.getSlot() == 21 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.roll.getItemMeta())) {
                    amount = 1;
                    type = 25;
                    CClear();
                    CookStart();
                    BakeRoll(amount);
                }
                //Roast Beets
                else if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.roastedBeet.getItemMeta())) {
                    amount = 1;
                    type = 26;
                    CClear();
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookStart();
                        RoastBeet(amount);
                    }, 2L);

                }
                //Make molasses
                else if (event.getSlot() == 23 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.molasses.getItemMeta())) {
                    amount = 1;
                    type = 27;
                    CClear();
                    CookStart();
                    MakeMolasses(amount);
                }
                //Make sugar
                else if (event.getSlot() == 24 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.sugar.getItemMeta())) {
                    amount = 1;
                    type = 28;
                    CClear();
                    CookStart();
                    MakeSugar(amount);
                }
                //Make brown sugar
                else if (event.getSlot() == 25 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.brownSugar.getItemMeta())) {
                    amount = 1;
                    type = 29;
                    CClear();
                    CookStart();
                    MakeBrownSugar(amount);
                }
                //Saute mushrooms
                else if (event.getSlot() == 28 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.sauteedMushroom.getItemMeta())) {
                    amount = 1;
                    type = 30;
                    CClear();
                    CookStart();
                    SauteMushrooms(amount);
                }
                //Make tomato sauce
                else if (event.getSlot() == 29 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.tomatoSauce.getItemMeta())) {
                    amount = 1;
                    type = 31;
                    CClear();
                    CookStart();
                    MakeTomatoSauce(amount);
                }
                //Make hot sauce
                else if (event.getSlot() == 30 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.hotSauce.getItemMeta())) {
                    amount = 1;
                    type = 32;
                    CClear();
                    CookStart();
                    MakeHotSauce(amount);
                }
                //Roast Chili Peppers
                else if (event.getSlot() == 31 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.roastedChili.getItemMeta())) {
                    amount = 1;
                    type = 33;
                    CClear();
                    CookStart();
                    RoastChiliPeppers(amount);
                }
                //Make alfredo
                else if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.alfredo.getItemMeta())) {
                    amount = 1;
                    type = 34;
                    CClear();
                    CookStart();
                    MakeAlfredo(amount);
                }
                //Make chicken alfredo
                else if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.chickenAlfredo.getItemMeta())) {
                    amount = 1;
                    type = 35;
                    CClear();
                    CookStart();
                    MakeChickenAlfredo(amount);
                }
                //Make garlic bread
                else if (event.getSlot() == 12 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.garlicBread.getItemMeta())) {
                    amount = 1;
                    type = 36;
                    CClear();
                    CookStart();
                    CookGarlicBread(amount);
                }
                //Make supreme garlic bread
                else if (event.getSlot() == 13 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeGarlicBread.getItemMeta())) {
                    amount = 1;
                    type = 37;
                    CClear();
                    CookStart();
                    CookSupremeGarlicBread(amount);
                }
                //Make salad
                else if (event.getSlot() == 14 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.salad.getItemMeta())) {
                    amount = 1;
                    type = 38;
                    CClear();
                    CookStart();
                    MakeSalad(amount);
                }
                //Make supreme salad
                else if (event.getSlot() == 15 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeSalad.getItemMeta())) {
                    amount = 1;
                    type = 39;
                    CClear();
                    CookStart();
                    MakeSupremeSalad(amount);
                }
                //Make BBQ ribs
                else if (event.getSlot() == 16 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.BBQRibs.getItemMeta())) {
                    amount = 1;
                    type = 40;
                    CClear();
                    CookStart();
                    CookBBQRibs(amount);
                }
                //Make spicy ribs
                else if (event.getSlot() == 19 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.spicyRibs.getItemMeta())) {
                    amount = 1;
                    type = 41;
                    CClear();
                    CookStart();
                    CookSpicyRibs(amount);
                }
                //Make spaghetti
                else if (event.getSlot() == 20 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.spaghetti.getItemMeta())) {
                    amount = 1;
                    type = 42;
                    CClear();
                    CookStart();
                    CookSpaghetti(amount);
                }
                //Make supreme spaghetti
                else if (event.getSlot() == 21 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeSpaghetti.getItemMeta())) {
                    amount = 1;
                    type = 43;
                    CClear();
                    CookStart();
                    CookSupremeSpaghetti(amount);
                }
                //Make mom's spaghetti
                else if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.momsSpaghetti.getItemMeta())) {
                    amount = 1;
                    type = 44;
                    CClear();
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookStart();
                        CookMomsSpaghetti(amount);
                    }, 2L);
                }
                //Make chili
                else if (event.getSlot() == 23 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.chili.getItemMeta())) {
                    amount = 1;
                    type = 45;
                    CClear();
                    CookStart();
                    CookChili(amount);
                }
                //Make spicy chili
                else if (event.getSlot() == 24 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.spicyChili.getItemMeta())) {
                    amount = 1;
                    type = 46;
                    CClear();
                    CookStart();
                    CookSpicyChili(amount);
                }
                //Make goat stew
                else if (event.getSlot() == 25 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.goatStew.getItemMeta())) {
                    amount = 1;
                    type = 47;
                    CClear();
                    CookStart();
                    CookGoatStew(amount);
                }
                //Make supreme goat stew
                else if (event.getSlot() == 28 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeGoatStew.getItemMeta())) {
                    amount = 1;
                    type = 48;
                    CClear();
                    CookStart();
                    CookSupremeGoatStew(amount);
                }
                //Make mashed potatoes
                else if (event.getSlot() == 29 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.mashedPotatoes.getItemMeta())) {
                    amount = 1;
                    type = 49;
                    CClear();
                    CookStart();
                    CookedMashedPotatoes(amount);
                }
                //Make mashed potatoes & gravy
                else if (event.getSlot() == 30 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.mashedPotatoesG.getItemMeta())) {
                    amount = 1;
                    type = 50;
                    CClear();
                    CookStart();
                    CookedMashedPotatoesG(amount);
                }
                //Make gravy
                else if (event.getSlot() == 31 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.gravy.getItemMeta())) {
                    amount = 1;
                    type = 51;
                    CClear();
                    CookStart();
                    CookGravy(amount);
                }
                //Make pork steak meal
                else if (event.getSlot() == 32 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.porkSteakMeal.getItemMeta())) {
                    amount = 1;
                    type = 52;
                    CClear();
                    CookStart();
                    CookPorkSteakMeal(amount);
                }
                //Fry egg
                else if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.friedEgg.getItemMeta())) {
                    amount = 1;
                    type = 53;
                    CClear();
                    CookStart();
                    FryEgg(amount);
                }
                //Bake muffin
                else if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.muffin.getItemMeta())) {
                    amount = 1;
                    type = 54;
                    CClear();
                    CookStart();
                    BakeMuffin(amount);
                }
                //Cook pancake
                else if (event.getSlot() == 12 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.pancake.getItemMeta())) {
                    amount = 1;
                    type = 55;
                    CClear();
                    CookStart();
                    CookPancake(amount);
                }
                //Make hash brown
                else if (event.getSlot() == 13 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.hashBrown.getItemMeta())) {
                    amount = 1;
                    type = 56;
                    CClear();
                    CookStart();
                    FryHashBrown(amount);
                }
                //Make stuffed hash brown
                else if (event.getSlot() == 14 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.stuffedHashBrown.getItemMeta())) {
                    amount = 1;
                    type = 57;
                    CClear();
                    CookStart();
                    FryStuffedHashBrown(amount);
                }
                //Make donut
                else if (event.getSlot() == 15 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.donut.getItemMeta())) {
                    amount = 1;
                    type = 58;
                    CClear();
                    CookStart();
                    BakeDonut(amount);
                }
                //Make frosted donut
                else if (event.getSlot() == 16 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.frostedDonut.getItemMeta())) {
                    amount = 1;
                    type = 59;
                    CClear();
                    CookStart();
                    BakeFrostedDonut(amount);
                }
                //Make eggs & bacon
                else if (event.getSlot() == 19 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.eggsAndBacon.getItemMeta())) {
                    amount = 1;
                    type = 60;
                    CClear();
                    CookStart();
                    MakeEggsAndBacon(amount);
                }
                //Make omelette
                else if (event.getSlot() == 20 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.omelette.getItemMeta())) {
                    amount = 1;
                    type = 61;
                    CClear();
                    CookStart();
                    CookOmelette(amount);
                }
                //Make supreme omelette
                else if (event.getSlot() == 21 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeOmelette.getItemMeta())) {
                    amount = 1;
                    type = 62;
                    CClear();
                    CookStart();
                    CookSupremeOmelette(amount);
                }
                //Make breakfast
                else if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.breakfast.getItemMeta())) {
                    amount = 1;
                    type = 63;
                    CClear();
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        CookStart();
                        CookBreakfast(amount);
                    }, 2L);
                }
                //Make large breakfast
                else if (event.getSlot() == 23 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.largeBreakfast.getItemMeta())) {
                    amount = 1;
                    type = 64;
                    CClear();
                    CookStart();
                    CookLargeBreakfast(amount);
                }
                //Make supreme breakfast
                else if (event.getSlot() == 24 && event.getCurrentItem().getItemMeta().equals(FoodItemManager.supremeBreakfast.getItemMeta())) {
                    amount = 1;
                    type = 65;
                    CClear();
                    CookStart();
                    CookSupremeBreakfast(amount);
                }



                //Cook whole chicken
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your whole raw chicken"))) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chicken, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chicken.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cchicken.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.chicken);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cchicken);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook quarters
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your chicken quarters")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chickenQT, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chickenQT.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cchickenQT.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.chickenQT);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cchickenQT);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook breasts
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your chicken breasts")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chickenBrst, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chickenBrst.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cchickenBrst.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.chickenBrst);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cchickenBrst);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook wings
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your chicken wings")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chickenWg, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chickenWg.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cchickenWg.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.chickenWg);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cchickenWg);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Goat Shoulder
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your goat shoulder")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawGoatShoulder.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cookedGoatShoulder.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cookedGoatShoulder);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Loin Chop
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your loin chop")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawLoinChop, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawLoinChop.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cookedLoinChop.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.rawLoinChop);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cookedLoinChop);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Ribs
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your ribs")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawRibs, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawRibs.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cookedRibs.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.rawLoinChop);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cookedRibs);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Goat Leg
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your goat leg")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawGoatLeg, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawGoatLeg.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.rawGoatLeg.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.rawGoatLeg);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cookedGoatLeg);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Bacon
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook your bacon")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawBacon, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawBacon.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cookedBacon.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.rawBacon);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.cookedBacon);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Fried Chicken Quarter
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry your chicken quarter")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chickenQT, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && player.getInventory().containsAtLeast(FoodItemManager.flour, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && player.getInventory().containsAtLeast(FoodItemManager.brownSugar, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chickenQT.setAmount(amount);
                            FoodItemManager.flour.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            FoodItemManager.brownSugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.friedChickenQuarter.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.chickenQT);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.brownSugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.friedChickenQuarter);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Spicy Chicken Quarter
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry your spicy chicken quarter")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.friedChickenQuarter, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount * 4)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.friedChickenQuarter.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.spicyChickenQuarter.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.friedChickenQuarter);
                            player.getInventory().addItem(FoodItemManager.spicyChickenQuarter);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Fried Chicken Wing
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry your chicken wing")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chickenWg, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && player.getInventory().containsAtLeast(FoodItemManager.flour, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && player.getInventory().containsAtLeast(FoodItemManager.brownSugar, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chickenWg.setAmount(amount);
                            FoodItemManager.flour.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            FoodItemManager.brownSugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.friedChickenWing.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.chickenWg);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.brownSugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.friedChickenWing);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Spicy Chicken Wing
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry your spicy chicken wing")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.friedChickenWing, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount * 4)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.friedChickenWing.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.spicyChickenWing.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.friedChickenWing);
                            player.getInventory().addItem(FoodItemManager.spicyChickenWing);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Baked Potato
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake your potato")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.potato, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.potato.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.bakedPotato.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.potato);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.bakedPotato);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Diced Potatoes
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fDice your potato")) && event.getCurrentItem().getType() == Material.IRON_SWORD) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.potato, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.potato.setAmount(amount);
                            FoodItemManager.dicedPotatoes.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.potato);
                            player.getInventory().addItem(FoodItemManager.dicedPotatoes);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Fry Potatoes
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry your diced potatoes")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.dicedPotatoes, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.dicedPotatoes.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.friedPotatoes.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.dicedPotatoes);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.friedPotatoes);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Roast Carrots
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fRoast your carrot")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.carrot, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.carrot.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.roastedCarrot.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.carrot);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.roastedCarrot);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Boil Spinach
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBoil your spinach")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.spinach, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.spinach.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.boiledSpinach.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.spinach);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.boiledSpinach);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Grind Wheat Into Flour
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fGrind your wheat into flour")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.wheat, amount * 2)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.wheat.setAmount(amount * 2);
                            FoodItemManager.flour.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.wheat);
                            player.getInventory().addItem(FoodItemManager.flour);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Noodles
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook noodles")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.noodles.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().addItem(FoodItemManager.noodles);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Bake Bread
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake bread")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount) && player.getInventory().containsAtLeast(FoodItemManager.milk, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount * 2);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.milk.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.bread.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.milk);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.bread);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Toast
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fToast bread")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.bread, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.bread.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.toast.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.bread);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.toast);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Bake Rolls
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake Rolls")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount) && player.getInventory().containsAtLeast(FoodItemManager.butter, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount * 2);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.butter.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.roll.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.roll);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Roast Beets
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fRoast your beet")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.beet, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.beet.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.roastedBeet.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.beet);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.roastedBeet);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Beets Into Molasses
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCrush beets into molasses")) && event.getCurrentItem().getType() == Material.ANVIL) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.beet, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.beet.setAmount(amount);
                            FoodItemManager.molasses.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.beet);
                            player.getInventory().addItem(FoodItemManager.molasses);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Beets Into Sugar
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCrush beets into sugar")) && event.getCurrentItem().getType() == Material.ANVIL) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.beet, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.beet.setAmount(amount);
                            FoodItemManager.sugar.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.beet);
                            player.getInventory().addItem(FoodItemManager.sugar);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Brown Sugar
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake brown sugar")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.sugar, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && player.getInventory().containsAtLeast(FoodItemManager.molasses, amount * 4)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.sugar.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.molasses.setAmount(amount * 4);
                            FoodItemManager.brownSugar.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.sugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.molasses);
                            player.getInventory().addItem(FoodItemManager.brownSugar);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Mushrooms
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fSaute your mushrooms")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.mushroom, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.mushroom.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.sauteedMushroom.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.mushroom);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.sauteedMushroom);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Tomato Sauce
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook tomatoes into tomato sauce")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.tomato, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.tomato.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.tomatoSauce.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.tomato);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.tomatoSauce);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Hot Sauce
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook hot sauce")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.roastedChili.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            FoodItemManager.hotSauce.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().addItem(FoodItemManager.hotSauce);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Roast Chili Pepper
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fRoast chili peppers")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.chiliPepper, amount * 4) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.chiliPepper.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.chiliPepper);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.roastedChili);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Alfredo
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook alfredo")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.noodles, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.butter, amount) && event.getInventory().containsAtLeast(FoodItemManager.cheese, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.noodles.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.alfredo.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.noodles);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().addItem(FoodItemManager.alfredo);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Chicken Alfredo
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook chicken alfredo")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.noodles, amount * 2) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.butter, amount) && event.getInventory().containsAtLeast(FoodItemManager.cheese, amount) && event.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(FoodItemManager.cchickenBrst, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.noodles.setAmount(amount * 2);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.cchickenBrst.setAmount(amount);
                            FoodItemManager.chickenAlfredo.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.noodles);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.cchickenBrst);
                            player.getInventory().addItem(FoodItemManager.chickenAlfredo);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Garlic Bread
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook garlic bread")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.toast, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.butter, amount) && event.getInventory().containsAtLeast(FoodItemManager.garlic, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.toast.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.garlicBread.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.toast);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().addItem(FoodItemManager.garlicBread);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Supreme Garlic Bread
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook supreme garlic bread")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.toast, amount) && player.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.butter, amount) && event.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(FoodItemManager.cheese, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.toast.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.supremeGarlicBread.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.toast);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().addItem(FoodItemManager.supremeGarlicBread);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Salad
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake a salad")) && event.getCurrentItem().getType() == Material.IRON_SWORD) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.lettuce, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.tomato, amount) && event.getInventory().containsAtLeast(FoodItemManager.spinach, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.lettuce.setAmount(amount * 2);
                            FoodItemManager.tomato.setAmount(amount);
                            FoodItemManager.spinach.setAmount(amount);
                            FoodItemManager.salad.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.lettuce);
                            player.getInventory().removeItem(FoodItemManager.tomato);
                            player.getInventory().removeItem(FoodItemManager.spinach);
                            player.getInventory().addItem(FoodItemManager.salad);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Supreme Salad
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake a supreme salad")) && event.getCurrentItem().getType() == Material.IRON_SWORD) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.lettuce, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.tomato, amount) && event.getInventory().containsAtLeast(FoodItemManager.spinach, amount) && event.getInventory().containsAtLeast(FoodItemManager.cheese, amount) && event.getInventory().containsAtLeast(FoodItemManager.mushroom, amount) && event.getInventory().containsAtLeast(FoodItemManager.cchickenBrst, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.lettuce.setAmount(amount * 2);
                            FoodItemManager.tomato.setAmount(amount);
                            FoodItemManager.spinach.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.mushroom.setAmount(amount);
                            FoodItemManager.cchickenBrst.setAmount(amount);
                            FoodItemManager.supremeSalad.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.lettuce);
                            player.getInventory().removeItem(FoodItemManager.tomato);
                            player.getInventory().removeItem(FoodItemManager.spinach);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().removeItem(FoodItemManager.mushroom);
                            player.getInventory().removeItem(FoodItemManager.cchickenBrst);
                            player.getInventory().addItem(FoodItemManager.supremeSalad);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook BBQ Ribs
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook BBQ ribs")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawRibs, amount) && player.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount) && event.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && event.getInventory().containsAtLeast(FoodItemManager.brownSugar, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawRibs.setAmount(amount);
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            FoodItemManager.brownSugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.BBQRibs.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.rawRibs);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.brownSugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.BBQRibs);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Spicy Ribs
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook spicy ribs")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.BBQRibs, amount) && player.getInventory().containsAtLeast(FoodItemManager.hotSauce, amount) && event.getInventory().containsAtLeast(FoodItemManager.garlic, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.BBQRibs.setAmount(amount);
                            FoodItemManager.hotSauce.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.BBQRibs.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.BBQRibs);
                            player.getInventory().removeItem(FoodItemManager.hotSauce);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().addItem(FoodItemManager.spicyRibs);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Spaghetti
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook spaghetti")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.noodles, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.noodles.setAmount(amount * 2);
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.spaghetti.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.noodles);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.spaghetti);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Supreme Spaghetti
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook supreme spaghetti")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.noodles, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.sauteedMushroom, amount) && event.getInventory().containsAtLeast(FoodItemManager.cheese, amount) && event.getInventory().containsAtLeast(FoodItemManager.cookedGoatLeg, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.noodles.setAmount(amount * 2);
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            FoodItemManager.sauteedMushroom.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.cookedGoatLeg.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.supremeSpaghetti.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.noodles);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().removeItem(FoodItemManager.sauteedMushroom);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().removeItem(FoodItemManager.cookedGoatLeg);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.supremeSpaghetti);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Mom's Spaghetti
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook mom's spaghetti")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.supremeSpaghetti, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlicBread, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount) && event.getInventory().containsAtLeast(FoodItemManager.roastedCarrot, amount) && event.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && event.getInventory().containsAtLeast(FoodItemManager.rawLoinChop, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.supremeSpaghetti.setAmount(amount);
                            FoodItemManager.garlicBread.setAmount(amount);
                            FoodItemManager.roastedCarrot.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            FoodItemManager.rawLoinChop.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.momsSpaghetti.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.supremeSpaghetti);
                            player.getInventory().removeItem(FoodItemManager.garlicBread);
                            player.getInventory().removeItem(FoodItemManager.roastedCarrot);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.rawLoinChop);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.momsSpaghetti);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Chili
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook chili")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount) && player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            FoodItemManager.rawGoatShoulder.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.chili.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.chili);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Spicy Chili
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook spicy chili")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.tomatoSauce, amount) && player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && player.getInventory().containsAtLeast(FoodItemManager.hotSauce, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.tomatoSauce.setAmount(amount);
                            FoodItemManager.rawGoatShoulder.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount);
                            FoodItemManager.hotSauce.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.spicyChili.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.tomatoSauce);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.hotSauce);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.spicyChili);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Goat Stew
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook a goat stew")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount) && player.getInventory().containsAtLeast(FoodItemManager.dicedPotatoes, amount) && player.getInventory().containsAtLeast(FoodItemManager.carrot, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawGoatShoulder.setAmount(amount);
                            FoodItemManager.dicedPotatoes.setAmount(amount);
                            FoodItemManager.carrot.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.goatStew.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(FoodItemManager.dicedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.carrot);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.goatStew);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Supreme Goat Stew
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook a supreme goat stew")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount) && player.getInventory().containsAtLeast(FoodItemManager.dicedPotatoes, amount) && player.getInventory().containsAtLeast(FoodItemManager.carrot, amount) && player.getInventory().containsAtLeast(FoodItemManager.beet, amount) && player.getInventory().containsAtLeast(FoodItemManager.chiliPepper, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawGoatShoulder.setAmount(amount);
                            FoodItemManager.dicedPotatoes.setAmount(amount);
                            FoodItemManager.carrot.setAmount(amount);
                            FoodItemManager.beet.setAmount(amount);
                            FoodItemManager.chiliPepper.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.supremeGoatStew.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(FoodItemManager.dicedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.carrot);
                            player.getInventory().removeItem(FoodItemManager.beet);
                            player.getInventory().removeItem(FoodItemManager.chiliPepper);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.supremeGoatStew);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Mashed Potatoes
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook mashed potatoes")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.dicedPotatoes, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.butter, amount) && player.getInventory().containsAtLeast(FoodItemManager.milk, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.dicedPotatoes.setAmount(amount * 2);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.milk.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.mashedPotatoes.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.dicedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(FoodItemManager.milk);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.mashedPotatoes);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Mashed Potatoes & Gravy
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake mashed potatoes and gravy")) && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.mashedPotatoes, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.gravy, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.mashedPotatoes.setAmount(amount * 2);
                            FoodItemManager.gravy.setAmount(amount);
                            FoodItemManager.mashedPotatoesG.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.mashedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.gravy);
                            player.getInventory().addItem(FoodItemManager.mashedPotatoesG);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Gravy
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook gravy")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawGoatShoulder, amount) && player.getInventory().containsAtLeast(FoodItemManager.flour, amount) && player.getInventory().containsAtLeast(FoodItemManager.milk, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawGoatShoulder.setAmount(amount);
                            FoodItemManager.flour.setAmount(amount);
                            FoodItemManager.milk.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.gravy.setAmount(amount * 3);
                            player.getInventory().removeItem(FoodItemManager.rawGoatShoulder);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.milk);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.gravy);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Pork Steak Meal
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook pork steak meal")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.rawLoinChop, amount) && player.getInventory().containsAtLeast(FoodItemManager.sauteedMushroom, amount) && player.getInventory().containsAtLeast(FoodItemManager.mashedPotatoesG, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.rawLoinChop.setAmount(amount);
                            FoodItemManager.sauteedMushroom.setAmount(amount);
                            FoodItemManager.mashedPotatoesG.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.porkSteakMeal.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.rawLoinChop);
                            player.getInventory().removeItem(FoodItemManager.sauteedMushroom);
                            player.getInventory().removeItem(FoodItemManager.mashedPotatoesG);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.porkSteakMeal);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Fry Egg
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry egg")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.egg, amount * 4) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.egg.setAmount(amount * 4);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.friedEgg.setAmount(amount * 4);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.friedEgg);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Bake Muffin
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake muffin")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount) && player.getInventory().containsAtLeast(FoodItemManager.sugar, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount * 2);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.sugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.muffin.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.sugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.muffin);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Pancake
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook pancake")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount) && player.getInventory().containsAtLeast(FoodItemManager.milk, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount * 2);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.milk.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.pancake.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.milk);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.pancake);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Fry Hash Browns
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry hash browns")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.friedPotatoes, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.butter, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.friedPotatoes.setAmount(amount * 2);
                            FoodItemManager.butter.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.hashBrown.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.friedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.hashBrown);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Fry Stuffed Hash Browns
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fFry stuffed hash browns")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.friedPotatoes, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.butter, amount) && player.getInventory().containsAtLeast(FoodItemManager.cheese, amount) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.friedPotatoes.setAmount(amount * 2);
                            FoodItemManager.butter.setAmount(amount);
                            FoodItemManager.cheese.setAmount(amount);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.stuffedHashBrown.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.friedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.butter);
                            player.getInventory().removeItem(FoodItemManager.cheese);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.stuffedHashBrown);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Bake Donut
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake donut")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.flour, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.egg, amount) && player.getInventory().containsAtLeast(FoodItemManager.sugar, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.flour.setAmount(amount * 2);
                            FoodItemManager.egg.setAmount(amount);
                            FoodItemManager.sugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.donut.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.sugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.donut);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Bake Frosted Donut
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fBake frosted donut")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.donut, amount) && player.getInventory().containsAtLeast(FoodItemManager.milk, amount) && player.getInventory().containsAtLeast(FoodItemManager.sugar, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.donut.setAmount(amount);
                            FoodItemManager.milk.setAmount(amount);
                            FoodItemManager.sugar.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.frostedDonut.setAmount(amount * 2);
                            player.getInventory().removeItem(FoodItemManager.flour);
                            player.getInventory().removeItem(FoodItemManager.milk);
                            player.getInventory().removeItem(FoodItemManager.sugar);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.frostedDonut);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Eggs And Bacon
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake eggs and bacon")) && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.friedEgg, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.cookedBacon.setAmount(amount * 2);
                            FoodItemManager.friedEgg.setAmount(amount * 2);
                            FoodItemManager.eggsAndBacon.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.friedEgg);
                            player.getInventory().addItem(FoodItemManager.eggsAndBacon);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Omelette
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook an omelette")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.egg, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.egg.setAmount(amount * 2);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.omelette.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.omelette);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Cook Supreme Omelette
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCook a supreme omelette")) && event.getCurrentItem().getType() == Material.SMOKER) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.egg, amount * 2) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.garlic, amount) && player.getInventory().containsAtLeast(FoodItemManager.roastedChili, amount) && player.getInventory().containsAtLeast(FoodItemManager.tomato, amount) && player.getInventory().containsAtLeast(FoodItemManager.spinach, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.egg.setAmount(amount * 2);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.garlic.setAmount(amount);
                            FoodItemManager.roastedChili.setAmount(amount * 2);
                            FoodItemManager.tomato.setAmount(amount);
                            FoodItemManager.spinach.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.supremeOmelette.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.egg);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.garlic);
                            player.getInventory().removeItem(FoodItemManager.roastedChili);
                            player.getInventory().removeItem(FoodItemManager.tomato);
                            player.getInventory().removeItem(FoodItemManager.spinach);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.supremeOmelette);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Breakfast
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake a breakfast")) && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.friedEgg, amount) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.friedPotatoes, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.friedEgg.setAmount(amount);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.friedPotatoes.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.breakfast.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.friedEgg);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.friedPotatoes);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.breakfast);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Large Breakfast
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake a large breakfast")) && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.omelette, amount) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.friedPotatoes, amount)&& player.getInventory().containsAtLeast(FoodItemManager.pancake, amount)&& player.getInventory().containsAtLeast(FoodItemManager.toast, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.omelette.setAmount(amount);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.friedPotatoes.setAmount(amount);
                            FoodItemManager.pancake.setAmount(amount);
                            FoodItemManager.toast.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.largeBreakfast.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.omelette);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.friedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.pancake);
                            player.getInventory().removeItem(FoodItemManager.toast);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.largeBreakfast);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
                //Make Supreme Breakfast
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fMake a supreme breakfast")) && event.getCurrentItem().getType() == Material.CRAFTING_TABLE) {
                    if (player.getInventory().containsAtLeast(FoodItemManager.supremeOmelette, amount) && player.getInventory().containsAtLeast(FoodItemManager.cookedBacon, amount) && player.getInventory().containsAtLeast(FoodItemManager.friedPotatoes, amount)&& player.getInventory().containsAtLeast(FoodItemManager.pancake, amount) && player.getInventory().containsAtLeast(FoodItemManager.toast, amount) && player.getInventory().containsAtLeast(FoodItemManager.stuffedHashBrown, amount) && player.getInventory().containsAtLeast(FoodItemManager.muffin, amount) && player.getInventory().containsAtLeast(FoodItemManager.cookedLoinChop, amount) && player.getInventory().containsAtLeast(FoodItemManager.frostedDonut, amount) && event.getInventory().containsAtLeast(MaterialsItemManager.coal, amount)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            FoodItemManager.supremeOmelette.setAmount(amount);
                            FoodItemManager.cookedBacon.setAmount(amount);
                            FoodItemManager.friedPotatoes.setAmount(amount);
                            FoodItemManager.pancake.setAmount(amount);
                            FoodItemManager.toast.setAmount(amount);
                            FoodItemManager.stuffedHashBrown.setAmount(amount);
                            FoodItemManager.muffin.setAmount(amount);
                            FoodItemManager.cookedLoinChop.setAmount(amount);
                            FoodItemManager.frostedDonut.setAmount(amount);
                            MaterialsItemManager.coal.setAmount(amount);
                            FoodItemManager.supremeBreakfast.setAmount(amount);
                            player.getInventory().removeItem(FoodItemManager.supremeOmelette);
                            player.getInventory().removeItem(FoodItemManager.cookedBacon);
                            player.getInventory().removeItem(FoodItemManager.friedPotatoes);
                            player.getInventory().removeItem(FoodItemManager.pancake);
                            player.getInventory().removeItem(FoodItemManager.toast);
                            player.getInventory().removeItem(FoodItemManager.stuffedHashBrown);
                            player.getInventory().removeItem(FoodItemManager.muffin);
                            player.getInventory().removeItem(FoodItemManager.cookedLoinChop);
                            player.getInventory().removeItem(FoodItemManager.frostedDonut);
                            player.getInventory().removeItem(MaterialsItemManager.coal);
                            player.getInventory().addItem(FoodItemManager.supremeBreakfast);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
            }
        }
        if (event.getCurrentItem().getType() == Material.LIME_CONCRETE && amount < 55) {
            amount += 10;
            if (type == -1) {
                ChickenCKC(amount);
            } else if (type == 4) {
                CChickenQT(amount);
            } else if (type == 5) {
                CChickenB(amount);
            } else if (type == 6) {
                CChickenW(amount);
            } else if (type == 7) {
                CookGoatShoulder(amount);
            } else if (type == 8) {
                CookLoinChop(amount);
            } else if (type == 9) {
                CookRibs(amount);
            } else if (type == 10) {
                CookGoatLeg(amount);
            } else if (type == 11) {
                CookBacon(amount);
            } else if (type == 12) {
                FryChickenQT(amount);
            } else if (type == 13) {
                SpicyChickenQT(amount);
            } else if (type == 14) {
                FryChickenWG(amount);
            } else if (type == 15) {
                SpicyChickenWG(amount);
            } else if (type == 16) {
                BakePotato(amount);
            } else if (type == 17) {
                DicePotato(amount);
            } else if (type == 18) {
                FryPotato(amount);
            } else if (type == 19) {
                RoastCarrot(amount);
            } else if (type == 20) {
                BoilSpinach(amount);
            } else if (type == 21) {
                GrindWheat(amount);
            } else if (type == 22) {
                MakeNoodles(amount);
            } else if (type == 23) {
                BakeBread(amount);
            } else if (type == 24) {
                CookToast(amount);
            } else if (type == 25) {
                BakeRoll(amount);
            } else if (type == 26) {
                RoastBeet(amount);
            } else if (type == 27) {
                MakeMolasses(amount);
            } else if (type == 28) {
                MakeSugar(amount);
            } else if (type == 29) {
                MakeBrownSugar(amount);
            } else if (type == 30) {
                SauteMushrooms(amount);
            } else if (type == 31) {
                MakeTomatoSauce(amount);
            } else if (type == 32) {
                MakeHotSauce(amount);
            } else if (type == 33) {
                RoastChiliPeppers(amount);
            } else if (type == 34) {
                MakeAlfredo(amount);
            } else if (type == 35) {
                MakeChickenAlfredo(amount);
            } else if (type == 36) {
                CookGarlicBread(amount);
            } else if (type == 37) {
                CookSupremeGarlicBread(amount);
            } else if (type == 38) {
                MakeSalad(amount);
            } else if (type == 39) {
                MakeSupremeSalad(amount);
            } else if (type == 40) {
                CookBBQRibs(amount);
            } else if (type == 41) {
                CookSpicyRibs(amount);
            } else if (type == 42) {
                CookSpaghetti(amount);
            } else if (type == 43) {
                CookSupremeSpaghetti(amount);
            } else if (type == 44) {
                CookMomsSpaghetti(amount);
            } else if (type == 45) {
                CookChili(amount);
            } else if (type == 46) {
                CookSpicyChili(amount);
            } else if (type == 47) {
                CookGoatStew(amount);
            } else if (type == 48) {
                CookSupremeGoatStew(amount);
            } else if (type == 49) {
                CookedMashedPotatoes(amount);
            } else if (type == 50) {
                CookedMashedPotatoesG(amount);
            } else if (type == 51) {
                CookGravy(amount);
            } else if (type == 52) {
                CookPorkSteakMeal(amount);
            } else if (type == 53) {
                FryEgg(amount);
            } else if (type == 54) {
                BakeMuffin(amount);
            } else if (type == 55) {
                CookPancake(amount);
            } else if (type == 56) {
                FryHashBrown(amount);
            } else if (type == 57) {
                FryStuffedHashBrown(amount);
            } else if (type == 58) {
                BakeDonut(amount);
            } else if (type == 59) {
                BakeFrostedDonut(amount);
            } else if (type == 60) {
                MakeEggsAndBacon(amount);
            } else if (type == 61) {
                CookOmelette(amount);
            } else if (type == 62) {
                CookSupremeOmelette(amount);
            } else if (type == 63) {
                CookBreakfast(amount);
            } else if (type == 64) {
                CookLargeBreakfast(amount);
            } else if (type == 65) {
                CookSupremeBreakfast(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.LIME_CONCRETE_POWDER && amount < 64) {
            amount += 1;
            if (type == -1) {
                ChickenCKC(amount);
            } else if (type == 4) {
                CChickenQT(amount);
            } else if (type == 5) {
                CChickenB(amount);
            } else if (type == 6) {
                CChickenW(amount);
            } else if (type == 7) {
                CookGoatShoulder(amount);
            } else if (type == 8) {
                CookLoinChop(amount);
            } else if (type == 9) {
                CookRibs(amount);
            } else if (type == 10) {
                CookGoatLeg(amount);
            } else if (type == 11) {
                CookBacon(amount);
            } else if (type == 12) {
                FryChickenQT(amount);
            } else if (type == 13) {
                SpicyChickenQT(amount);
            } else if (type == 14) {
                FryChickenWG(amount);
            } else if (type == 15) {
                SpicyChickenWG(amount);
            } else if (type == 16) {
                BakePotato(amount);
            } else if (type == 17) {
                DicePotato(amount);
            } else if (type == 18) {
                FryPotato(amount);
            } else if (type == 19) {
                RoastCarrot(amount);
            } else if (type == 20) {
                BoilSpinach(amount);
            } else if (type == 21) {
                GrindWheat(amount);
            } else if (type == 22) {
                MakeNoodles(amount);
            } else if (type == 23) {
                BakeBread(amount);
            } else if (type == 24) {
                CookToast(amount);
            } else if (type == 25) {
                BakeRoll(amount);
            } else if (type == 26) {
                RoastBeet(amount);
            } else if (type == 27) {
                MakeMolasses(amount);
            } else if (type == 28) {
                MakeSugar(amount);
            } else if (type == 29) {
                MakeBrownSugar(amount);
            } else if (type == 30) {
                SauteMushrooms(amount);
            } else if (type == 31) {
                MakeTomatoSauce(amount);
            } else if (type == 32) {
                MakeHotSauce(amount);
            } else if (type == 33) {
                RoastChiliPeppers(amount);
            } else if (type == 34) {
                MakeAlfredo(amount);
            } else if (type == 35) {
                MakeChickenAlfredo(amount);
            } else if (type == 36) {
                CookGarlicBread(amount);
            } else if (type == 37) {
                CookSupremeGarlicBread(amount);
            } else if (type == 38) {
                MakeSalad(amount);
            } else if (type == 39) {
                MakeSupremeSalad(amount);
            } else if (type == 40) {
                CookBBQRibs(amount);
            } else if (type == 41) {
                CookSpicyRibs(amount);
            } else if (type == 42) {
                CookSpaghetti(amount);
            } else if (type == 43) {
                CookSupremeSpaghetti(amount);
            } else if (type == 44) {
                CookMomsSpaghetti(amount);
            } else if (type == 45) {
                CookChili(amount);
            } else if (type == 46) {
                CookSpicyChili(amount);
            } else if (type == 47) {
                CookGoatStew(amount);
            } else if (type == 48) {
                CookSupremeGoatStew(amount);
            } else if (type == 49) {
                CookedMashedPotatoes(amount);
            } else if (type == 50) {
                CookedMashedPotatoesG(amount);
            } else if (type == 51) {
                CookGravy(amount);
            } else if (type == 52) {
                CookPorkSteakMeal(amount);
            } else if (type == 53) {
                FryEgg(amount);
            } else if (type == 54) {
                BakeMuffin(amount);
            } else if (type == 55) {
                CookPancake(amount);
            } else if (type == 56) {
                FryHashBrown(amount);
            } else if (type == 57) {
                FryStuffedHashBrown(amount);
            } else if (type == 58) {
                BakeDonut(amount);
            } else if (type == 59) {
                BakeFrostedDonut(amount);
            } else if (type == 60) {
                MakeEggsAndBacon(amount);
            } else if (type == 61) {
                CookOmelette(amount);
            } else if (type == 62) {
                CookSupremeOmelette(amount);
            } else if (type == 63) {
                CookBreakfast(amount);
            } else if (type == 64) {
                CookLargeBreakfast(amount);
            } else if (type == 65) {
                CookSupremeBreakfast(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.RED_CONCRETE && amount > 10) {
            amount -= 10;
            if (type == -1) {
                ChickenCKC(amount);
            } else if (type == 4) {
                CChickenQT(amount);
            } else if (type == 5) {
                CChickenB(amount);
            } else if (type == 6) {
                CChickenW(amount);
            } else if (type == 7) {
                CookGoatShoulder(amount);
            } else if (type == 8) {
                CookLoinChop(amount);
            } else if (type == 9) {
                CookRibs(amount);
            } else if (type == 10) {
                CookGoatLeg(amount);
            } else if (type == 11) {
                CookBacon(amount);
            } else if (type == 12) {
                FryChickenQT(amount);
            } else if (type == 13) {
                SpicyChickenQT(amount);
            } else if (type == 14) {
                FryChickenWG(amount);
            } else if (type == 15) {
                SpicyChickenWG(amount);
            } else if (type == 16) {
                BakePotato(amount);
            } else if (type == 17) {
                DicePotato(amount);
            } else if (type == 18) {
                FryPotato(amount);
            } else if (type == 19) {
                RoastCarrot(amount);
            } else if (type == 20) {
                BoilSpinach(amount);
            } else if (type == 21) {
                GrindWheat(amount);
            } else if (type == 22) {
                MakeNoodles(amount);
            } else if (type == 23) {
                BakeBread(amount);
            } else if (type == 24) {
                CookToast(amount);
            } else if (type == 25) {
                BakeRoll(amount);
            } else if (type == 26) {
                RoastBeet(amount);
            } else if (type == 27) {
                MakeMolasses(amount);
            } else if (type == 28) {
                MakeSugar(amount);
            } else if (type == 29) {
                MakeBrownSugar(amount);
            } else if (type == 30) {
                SauteMushrooms(amount);
            } else if (type == 31) {
                MakeTomatoSauce(amount);
            } else if (type == 32) {
                MakeHotSauce(amount);
            } else if (type == 33) {
                RoastChiliPeppers(amount);
            } else if (type == 34) {
                MakeAlfredo(amount);
            } else if (type == 35) {
                MakeChickenAlfredo(amount);
            } else if (type == 36) {
                CookGarlicBread(amount);
            } else if (type == 37) {
                CookSupremeGarlicBread(amount);
            } else if (type == 38) {
                MakeSalad(amount);
            } else if (type == 39) {
                MakeSupremeSalad(amount);
            } else if (type == 40) {
                CookBBQRibs(amount);
            } else if (type == 41) {
                CookSpicyRibs(amount);
            } else if (type == 42) {
                CookSpaghetti(amount);
            } else if (type == 43) {
                CookSupremeSpaghetti(amount);
            } else if (type == 44) {
                CookMomsSpaghetti(amount);
            } else if (type == 45) {
                CookChili(amount);
            } else if (type == 46) {
                CookSpicyChili(amount);
            } else if (type == 47) {
                CookGoatStew(amount);
            } else if (type == 48) {
                CookSupremeGoatStew(amount);
            } else if (type == 49) {
                CookedMashedPotatoes(amount);
            } else if (type == 50) {
                CookedMashedPotatoesG(amount);
            } else if (type == 51) {
                CookGravy(amount);
            } else if (type == 52) {
                CookPorkSteakMeal(amount);
            } else if (type == 53) {
                FryEgg(amount);
            } else if (type == 54) {
                BakeMuffin(amount);
            } else if (type == 55) {
                CookPancake(amount);
            } else if (type == 56) {
                FryHashBrown(amount);
            } else if (type == 57) {
                FryStuffedHashBrown(amount);
            } else if (type == 58) {
                BakeDonut(amount);
            } else if (type == 59) {
                BakeFrostedDonut(amount);
            } else if (type == 60) {
                MakeEggsAndBacon(amount);
            } else if (type == 61) {
                CookOmelette(amount);
            } else if (type == 62) {
                CookSupremeOmelette(amount);
            } else if (type == 63) {
                CookBreakfast(amount);
            } else if (type == 64) {
                CookLargeBreakfast(amount);
            } else if (type == 65) {
                CookSupremeBreakfast(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.RED_CONCRETE_POWDER && amount > 1) {
            amount -= 1;
            if (type == -1) {
                ChickenCKC(amount);
            } else if (type == 4) {
                CChickenQT(amount);
            } else if (type == 5) {
                CChickenB(amount);
            } else if (type == 6) {
                CChickenW(amount);
            } else if (type == 7) {
                CookGoatShoulder(amount);
            } else if (type == 8) {
                CookLoinChop(amount);
            } else if (type == 9) {
                CookRibs(amount);
            } else if (type == 10) {
                CookGoatLeg(amount);
            } else if (type == 11) {
                CookBacon(amount);
            } else if (type == 12) {
                FryChickenQT(amount);
            } else if (type == 13) {
                SpicyChickenQT(amount);
            } else if (type == 14) {
                FryChickenWG(amount);
            } else if (type == 15) {
                SpicyChickenWG(amount);
            } else if (type == 16) {
                BakePotato(amount);
            } else if (type == 17) {
                DicePotato(amount);
            } else if (type == 18) {
                FryPotato(amount);
            } else if (type == 19) {
                RoastCarrot(amount);
            } else if (type == 20) {
                BoilSpinach(amount);
            } else if (type == 21) {
                GrindWheat(amount);
            } else if (type == 22) {
                MakeNoodles(amount);
            } else if (type == 23) {
                BakeBread(amount);
            } else if (type == 24) {
                CookToast(amount);
            } else if (type == 25) {
                BakeRoll(amount);
            } else if (type == 26) {
                RoastBeet(amount);
            } else if (type == 27) {
                MakeMolasses(amount);
            } else if (type == 28) {
                MakeSugar(amount);
            } else if (type == 29) {
                MakeBrownSugar(amount);
            } else if (type == 30) {
                SauteMushrooms(amount);
            } else if (type == 31) {
                MakeTomatoSauce(amount);
            } else if (type == 32) {
                MakeHotSauce(amount);
            } else if (type == 33) {
                RoastChiliPeppers(amount);
            } else if (type == 34) {
                MakeAlfredo(amount);
            } else if (type == 35) {
                MakeChickenAlfredo(amount);
            } else if (type == 36) {
                CookGarlicBread(amount);
            } else if (type == 37) {
                CookSupremeGarlicBread(amount);
            } else if (type == 38) {
                MakeSalad(amount);
            } else if (type == 39) {
                MakeSupremeSalad(amount);
            } else if (type == 40) {
                CookBBQRibs(amount);
            } else if (type == 41) {
                CookSpicyRibs(amount);
            } else if (type == 42) {
                CookSpaghetti(amount);
            } else if (type == 43) {
                CookSupremeSpaghetti(amount);
            } else if (type == 44) {
                CookMomsSpaghetti(amount);
            } else if (type == 45) {
                CookChili(amount);
            } else if (type == 46) {
                CookSpicyChili(amount);
            } else if (type == 47) {
                CookGoatStew(amount);
            } else if (type == 48) {
                CookSupremeGoatStew(amount);
            } else if (type == 49) {
                CookedMashedPotatoes(amount);
            } else if (type == 50) {
                CookedMashedPotatoesG(amount);
            } else if (type == 51) {
                CookGravy(amount);
            } else if (type == 52) {
                CookPorkSteakMeal(amount);
            } else if (type == 53) {
                FryEgg(amount);
            } else if (type == 54) {
                BakeMuffin(amount);
            } else if (type == 55) {
                CookPancake(amount);
            } else if (type == 56) {
                FryHashBrown(amount);
            } else if (type == 57) {
                FryStuffedHashBrown(amount);
            } else if (type == 58) {
                BakeDonut(amount);
            } else if (type == 59) {
                BakeFrostedDonut(amount);
            } else if (type == 60) {
                MakeEggsAndBacon(amount);
            } else if (type == 61) {
                CookOmelette(amount);
            } else if (type == 62) {
                CookSupremeOmelette(amount);
            } else if (type == 63) {
                CookBreakfast(amount);
            } else if (type == 64) {
                CookLargeBreakfast(amount);
            } else if (type == 65) {
                CookSupremeBreakfast(amount);
            }
        }
    }


    public void CookStart() {
        ItemStack item;
        item = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            CookGUI.inv.setItem(i, item);
            CookGUI.inv.setItem((i + 36), item);
        }
        CookGUI.inv.setItem(9, item);
        CookGUI.inv.setItem(13, item);
        CookGUI.inv.setItem(17, item);
        CookGUI.inv.setItem(18, item);
        CookGUI.inv.setItem(26, item);
        CookGUI.inv.setItem(27, item);
        CookGUI.inv.setItem(31, item);
        CookGUI.inv.setItem(35, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName("§c§lExit");
        item.setItemMeta(meta);
        CookGUI.inv.setItem(40, item);

        item = createItem("§aAdd 10 more", Material.LIME_CONCRETE, Collections.EMPTY_LIST, 1);
        CookGUI.inv.setItem(2, item);
        item = createItem("§aAdd 1 more", Material.LIME_CONCRETE_POWDER, Collections.EMPTY_LIST, 1);
        CookGUI.inv.setItem(3, item);
        item = createItem("§cSubstract 1", Material.RED_CONCRETE_POWDER, Collections.EMPTY_LIST, 1);
        CookGUI.inv.setItem(5, item);
        item = createItem("§cSubstract 10", Material.RED_CONCRETE, Collections.EMPTY_LIST, 1);
        CookGUI.inv.setItem(6, item);
    }

    public static void CClear() {
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            CookGUI.inv.setItem(i, item);
            CookGUI.inv.setItem(i + 9, item);
            CookGUI.inv.setItem(i + 18, item);
            CookGUI.inv.setItem(i + 27, item);
            CookGUI.inv.setItem((i + 36), item);
        }
    }


    private void CChickenQT(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chickenQT);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your chicken quarters"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cchickenQT);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void CChickenB(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chickenBrst);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your chicken breasts"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cchickenBrst);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void CChickenW(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chickenWg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your chicken wings"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cchickenWg);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void ChickenCKC(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chicken);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your whole raw chicken"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cchicken);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookGoatShoulder(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your goat shoulder"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cookedGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookLoinChop(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawLoinChop);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your loin chop"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cookedLoinChop);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookRibs(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your ribs"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cookedRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookGoatLeg(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawGoatLeg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your goat leg"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cookedGoatLeg);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookBacon(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook your bacon"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void FryChickenQT(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chickenQT);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.brownSugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry your chicken quarter"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.friedChickenQuarter);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void SpicyChickenQT(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.friedChickenQuarter);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry your spicy chicken quarter"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spicyChickenQuarter);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void FryChickenWG(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chickenWg);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.brownSugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry your chicken wing"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.friedChickenWing);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void SpicyChickenWG(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.friedChickenWing);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry your spicy chicken wing"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spicyChickenWing);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void BakePotato(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.potato);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fBake your potato"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.bakedPotato);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void DicePotato(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.potato);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( "§aDice", Material.IRON_SWORD, Collections.singletonList("§fDice your potato"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.dicedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void FryPotato(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.dicedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry your diced potatoes"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void RoastCarrot(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.carrot);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Roast", Material.SMOKER, Collections.singletonList("§fRoast your carrot"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.roastedCarrot);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void BoilSpinach(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.spinach);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Boil", Material.SMOKER, Collections.singletonList("§fBoil your spinach"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.boiledSpinach);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void GrindWheat(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.wheat);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Grind", Material.SMOKER, Collections.singletonList("§fGrind your wheat into flour"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void MakeNoodles(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook noodles"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.noodles);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void BakeBread(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.milk);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fBake bread"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.bread);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookToast(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.bread);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Toast", Material.SMOKER, Collections.singletonList("§fToast bread"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.toast);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void BakeRoll(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fBake Rolls"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.roll);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void RoastBeet(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.beet);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Roast", Material.SMOKER, Collections.singletonList("§fRoast your beet"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.roastedBeet);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void MakeMolasses(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.beet);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Crush", Material.ANVIL, Collections.singletonList("§fCrush beets into molasses"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.molasses);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void MakeSugar(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.beet);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Crush", Material.ANVIL, Collections.singletonList("§fCrush beets into sugar"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.sugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void MakeBrownSugar(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.sugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.molasses);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        CookGUI.inv.setItem(28, item);
        CookGUI.inv.setItem(29, item);
        CookGUI.inv.setItem(30, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fMake brown sugar"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.brownSugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void SauteMushrooms(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.mushroom);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Saute", Material.SMOKER, Collections.singletonList("§fSaute your mushrooms"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.sauteedMushroom);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void MakeTomatoSauce(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.tomato);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook tomatoes into tomato sauce"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void MakeHotSauce(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook hot sauce"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.hotSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void RoastChiliPeppers(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.chiliPepper);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Roast", Material.SMOKER, Collections.singletonList("§fRoast chili peppers"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void MakeAlfredo(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.noodles);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook alfredo"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.alfredo);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void MakeChickenAlfredo(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.noodles);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.cchickenBrst);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook chicken alfredo"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.chickenAlfredo);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookGarlicBread(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.toast);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook garlic bread"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.garlicBread);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSupremeGarlicBread(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.toast);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook supreme garlic bread"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeGarlicBread);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void MakeSalad(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.lettuce);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.tomato);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.spinach);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cut", Material.IRON_SWORD, Collections.singletonList("§fMake a salad"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.salad);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void MakeSupremeSalad(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.lettuce);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.tomato);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.spinach);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.mushroom);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(FoodItemManager.cchickenBrst);
        item.setAmount(amount);
        CookGUI.inv.setItem(22, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cut", Material.IRON_SWORD, Collections.singletonList("§fMake a supreme salad"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeSalad);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookBBQRibs(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.brownSugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook BBQ ribs"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.BBQRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSpicyRibs(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.BBQRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.hotSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook spicy ribs"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spicyRibs);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSpaghetti(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.noodles);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook spaghetti"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spaghetti);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSupremeSpaghetti(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.noodles);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.sauteedMushroom);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.cookedGoatLeg);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook supreme spaghetti"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeSpaghetti);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookMomsSpaghetti(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.supremeSpaghetti);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.garlicBread);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedCarrot);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.rawLoinChop);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook mom's spaghetti"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spaghetti);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookChili(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook chili"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.chili);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSpicyChili(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.tomatoSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.hotSauce);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook spicy chili"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.spicyChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookGoatStew(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.dicedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.carrot);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook a goat stew"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.goatStew);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSupremeGoatStew(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.dicedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.carrot);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.beet);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.chiliPepper);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook a supreme goat stew"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeGoatStew);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookedMashedPotatoes(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.dicedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.milk);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook mashed potatoes"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.mashedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookedMashedPotatoesG(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.mashedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.gravy);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Make", Material.CRAFTING_TABLE, Collections.singletonList("§fMake mashed potatoes and gravy"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.mashedPotatoesG);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookGravy(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawGoatShoulder);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.milk);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook gravy"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.gravy);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
    }

    private void CookPorkSteakMeal(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.rawLoinChop);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.sauteedMushroom);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.mashedPotatoesG);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook pork steak meal"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.porkSteakMeal);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void FryEgg(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry egg"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.friedEgg);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
        CookGUI.inv.setItem(16, item);
        CookGUI.inv.setItem(23, item);
    }

    private void BakeMuffin(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.sugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fBake muffin"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.muffin);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void CookPancake(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.milk);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fCook pancake"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.pancake);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void FryHashBrown(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry hash browns"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.hashBrown);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void FryStuffedHashBrown(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.butter);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.cheese);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Fry", Material.SMOKER, Collections.singletonList("§fFry stuffed hash browns"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.stuffedHashBrown);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }

    private void BakeDonut(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.flour);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.sugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fBake donut"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.donut);
        item.setAmount(amount);
        CookGUI.inv.setItem(14, item);
        CookGUI.inv.setItem(15, item);
    }
    private void BakeFrostedDonut(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.donut);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.sugar);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.milk);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Bake", Material.SMOKER, Collections.singletonList("§fBake frosted donut"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.frostedDonut);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void MakeEggsAndBacon(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.friedEgg);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        CookGUI.inv.setItem(19, item);
        item = createItem( "aMake", Material.CRAFTING_TABLE, Collections.singletonList("§fMake eggs and bacon"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.eggsAndBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookOmelette(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook an omelette"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.omelette);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSupremeOmelette(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.egg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.garlic);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.roastedChili);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.tomato);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(FoodItemManager.spinach);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = new ItemStack(MaterialsItemManager.coal);
        item.setAmount(amount);
        CookGUI.inv.setItem(29, item);
        item = createItem( net.md_5.bungee.api.ChatColor.of("#9a6904") + "Cook", Material.SMOKER, Collections.singletonList("§fCook a supreme omelette"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeOmelette);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookBreakfast(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.friedEgg);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = createItem( "§aMake", Material.CRAFTING_TABLE, Collections.singletonList("§fMake a breakfast"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.breakfast);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookLargeBreakfast(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.omelette);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.pancake);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.toast);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = createItem( "§aMake", Material.CRAFTING_TABLE, Collections.singletonList("§fMake a large breakfast"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.largeBreakfast);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private void CookSupremeBreakfast(int amount) {
        ItemStack item;
        item = new ItemStack(FoodItemManager.supremeOmelette);
        item.setAmount(amount);
        CookGUI.inv.setItem(10, item);
        item = new ItemStack(FoodItemManager.cookedBacon);
        item.setAmount(amount);
        CookGUI.inv.setItem(11, item);
        item = new ItemStack(FoodItemManager.friedPotatoes);
        item.setAmount(amount);
        CookGUI.inv.setItem(12, item);
        item = new ItemStack(FoodItemManager.pancake);
        item.setAmount(amount);
        CookGUI.inv.setItem(19, item);
        item = new ItemStack(FoodItemManager.toast);
        item.setAmount(amount);
        CookGUI.inv.setItem(20, item);
        item = new ItemStack(FoodItemManager.stuffedHashBrown);
        item.setAmount(amount);
        CookGUI.inv.setItem(21, item);
        item = new ItemStack(FoodItemManager.muffin);
        item.setAmount(amount);
        CookGUI.inv.setItem(28, item);
        item = new ItemStack(FoodItemManager.cookedLoinChop);
        item.setAmount(amount);
        CookGUI.inv.setItem(29, item);
        item = new ItemStack(FoodItemManager.frostedDonut);
        item.setAmount(amount);
        CookGUI.inv.setItem(30, item);
        item = createItem( "§aMake", Material.CRAFTING_TABLE, Collections.singletonList("§fMake a supreme breakfast"), 1);
        CookGUI.inv.setItem(22, item);
        item = new ItemStack(FoodItemManager.supremeBreakfast);
        item.setAmount(amount);
        CookGUI.inv.setItem(24, item);
    }

    private ItemStack createItem(String name, Material mat, List<String> lore, int amount) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
