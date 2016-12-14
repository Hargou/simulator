import java.util.Scanner;
/*
  Gives an option to Customize his own armour or list what enchantments he currently has on his armour.
  author: Karan Srivastava
*/
class MCSim
{
    /*"Enlightened III", "Deathbringer III"
        Are common enchants in all ideal armor:
            helm
            chestplate
            leggs
            boots
            bow
            sword
            axe
    */
    //Below are armour enchantments
    private String[] helm = {"Drunk IV","Enlightened III", "Deathbringer III","Clarity III","Tank IV","Armored V","Lucky X","Smoke Bomb VIII","Implants III" };
    private String[] chestplate = {"Overload III","Enlightened III","Deathbringer III","Blood Lust VI","Leadership V","Hardened III","Tank IV","Armored V","Angelic V"};
    private String[] leggs = {"Nature Wrath IV","Enlightened III","Deathbringer III","Tank IV","Armored V","Angelic V","Lucky X","Obsidian Shield I","Cactus II"};
    private String[] boots = {"Gears III","Enlightened III","Deathbringer III","Tank IV","Armored V","Angelic V","Rocket Escape III","Springs II","Frozen III"};
    private String[] bow = {"Teleblock V","Rage VI","Sniper V","Peircing V","H-Fire V","Silence IV","Blind III","Unfocus IV","Explosive V"};
    private String[] axe = {"Rage VI","Devour IV","Barbarian IV","Blessed III","Cleave VII","Bleed VI","Pummel III", "Confuision III","Decapitation III"};
    private String[] sword = {"Divine Immolation IV","Rage VI","Lifesteal V","Inversion IV","Disarmour VIII","Blind III", "Double Strike III", "Execute VII", "Trap III"};

    public MCSim(){

    }

    public String getHelm(){
        return "Slot : " + 0 + " " + helm[0] +
                "\nSlot : " + 1 + " " + helm[1] +
                "\nSlot : " + 2 + " " + helm[2] +
                "\nSlot : " + 3 + " " + helm[3] +
                "\nSlot : " + 4 + " " + helm[4] +
                "\nSlot : " + 5 + " " + helm[5] +
                "\nSlot : " + 6 + " " + helm[6] +
                "\nSlot : " + 7 + " " + helm[7] +
                "\nSlot : " + 8 + " " + helm[8];
    }

    public String getBow(){
        return "Slot : " + 0 + " " + bow[0] +
                "\nSlot : " + 1 + " " + bow[1] +
                "\nSlot : " + 2 + " " + bow[2] +
                "\nSlot : " + 3 + " " + bow[3] +
                "\nSlot : " + 4 + " " + bow[4] +
                "\nSlot : " + 5 + " " + bow[5] +
                "\nSlot : " + 6 + " " + bow[6] +
                "\nSlot : " + 7 + " " + bow[7] +
                "\nSlot : " + 8 + " " + bow[8];
    }

    public String getChestPlate(){
        return "Slot : " + 0 + " " + chestplate[0] +
                "\nSlot : " + 1 + " " + chestplate[1] +
                "\nSlot : " + 2 + " " + chestplate[2] +
                "\nSlot : " + 3 + " " + chestplate[3] +
                "\nSlot : " + 4 + " " + chestplate[4] +
                "\nSlot : " + 5 + " " + chestplate[5] +
                "\nSlot : " + 6 + " " + chestplate[6] +
                "\nSlot : " + 7 + " " + chestplate[7] +
                "\nSlot : " + 8 + " " + chestplate[8];


    }

    public String getLeggs(){
        return "Slot : " + 0 + " " + leggs[0] +
                "\nSlot : " + 1 + " " + leggs[1] +
                "\nSlot : " + 2 + " " + leggs[2] +
                "\nSlot : " + 3 + " " + leggs[3] +
                "\nSlot : " + 4 + " " + leggs[4] +
                "\nSlot : " + 5 + " " + leggs[5] +
                "\nSlot : " + 6 + " " + leggs[6] +
                "\nSlot : " + 7 + " " + leggs[7] +
                "\nSlot : " + 8 + " " + leggs[8];
    }

    public String getAxe(){
        return "Slot : " + 0 + " " + axe[0] +
                "\nSlot : " + 1 + " " + axe[1] +
                "\nSlot : " + 2 + " " + axe[2] +
                "\nSlot : " + 3 + " " + axe[3] +
                "\nSlot : " + 4 + " " + axe[4] +
                "\nSlot : " + 5 + " " + axe[5] +
                "\nSlot : " + 6 + " " + axe[6] +
                "\nSlot : " + 7 + " " + axe[7] +
                "\nSlot : " + 8 + " " + axe[8];
    }

    public String getSword(){
        return "Slot : " + 0 + " " + sword[0] +
                "\nSlot : " + 1 + " " + sword[1] +
                "\nSlot : " + 2 + " " + sword[2] +
                "\nSlot : " + 3 + " " + sword[3] +
                "\nSlot : " + 4 + " " + sword[4] +
                "\nSlot : " + 5 + " " + sword[5] +
                "\nSlot : " + 6 + " " + sword[6] +
                "\nSlot : " + 7 + " " + sword[7] +
                "\nSlot : " + 8 + " " + sword[8];
    }

    public String getBoots(){
        return "\nSlot : " + 0 + " " + boots[0] +
                "\nSlot : " + 1 + " " + boots[1] +
                "\nSlot : " + 2 + " " + boots[2] +
                "\nSlot : " + 3 + " " + boots[3] +
                "\nSlot : " + 4 + " " + boots[4] +
                "\nSlot : " + 5 + " " + boots[5] +
                "\nSlot : " + 6 + " " + boots[6] +
                "\nSlot : " + 7 + " " + boots[7] +
                "\nSlot : " + 8 + " " + boots[8];
    }

    //Shows user what enchantments are currently on armour
    public void list()
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your equipment type: ");
        String armour = user_input.next();
        if (armour.equals("Helm")){
            System.out.println("God " + armour + "\n" + (armour.equals("Helm")? getHelm():
                    armour.equals("Bow")? getBow():
                            armour.equals("Chestplate")?getChestPlate():
                                    (armour.equals("Leggs") || armour.equals("Leggings"))? getLeggs():
                                            armour.equals("Axe")?getAxe():
                                                    armour.equals("Sword")?getSword():""));
        }
    }


    // Customizes the enchantments the user wants to test out
    public void custom()
    {
        boolean Running = true;
        int customInput;
        String input, userInput;
        Scanner user_input = new Scanner(System.in);
        while (Running)
        {
            System.out.println("What equipment type do you want to edit");

            try{
                userInput = user_input.next();
                System.out.println(userInput.equals("Helm")?getHelm():
                        userInput.equals("Chestplate")?getChestPlate():
                                userInput.equals("Leggings")?getLeggs():
                                        userInput.equals("Boots")?getBoots():
                                                userInput.equals("Sword")?getSword():
                                                        userInput.equals("Axe")?getAxe():
                                                                userInput.equals("Bow")?getBow():(userInput.equals("Menu")||userInput.equals("Stop"))?"":(userInput=""));

                if (userInput.equals("")){
                    throw new Exception("Must Type one of following:\nHelm\nChestplate\nLeggings\nBoots\nAxe\nSword\nBow\nType Either Menu or Stop to Q.");
                }
                else if (userInput.equals("Menu")||userInput.equals("Stop"))
                {
                    Running = false;
                    continue;
                }
                System.out.println("\nWhat slot do you want to change");
                customInput = user_input.nextInt();
                System.out.println("What do you want it to change to");

                if (userInput.equals("Helm"))
                {
                    helm[customInput] = user_input.next();
                }
                else if (userInput.equals("Chestplate"))
                {
                    chestplate[customInput] = user_input.next();
                }
                else if (userInput.equals("Leggings"))
                {
                    leggs[customInput] = user_input.next();
                }
                else if (userInput.equals("Boots"))
                {
                    boots[customInput] = user_input.next();
                }
                else if (userInput.equals("Axe"))
                {
                    axe[customInput] = user_input.next();
                }
                else if (userInput.equals("Sword"))
                {
                    sword[customInput] = user_input.next();
                }
                else if (userInput.equals("Bow"))
                {
                    bow[customInput] = user_input.next();
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
