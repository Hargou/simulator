import java.util.Scanner;


/*
      Tells the user the different options of what the program can do then uses the
      Keyboard input to select which option to run.
      Custom lets you customize what enchantments you want on your armor.
      List tells you the ideal set of enchantments so far.

      TODO:
      User Point Of View
        Change their equipment.
        Run simulate menu.
        Find the best set of Enchantments to use.

      Programmer Point Of View
        Contact with minecraft online(If Possible)(To get what each Enchantment does.
        Apply the chosen enchantments capabilties to each player.
        Update the outcome of our simulation based on collective set of enchantments and stats that are applied to each.

        Add Simulate option to Main Menu.
        Make simulate class and using PlayerStats and PlayerEquipment.
      1) Add simulate option to menu
      2) Simulate goes through the process of the players fight and uses all the enchants to figure out the best
      set of enchantments to use.
      author: Karan Srivastava
*/

public class MyProgram
{
    public static void main(String[] args)
    {
        // Main Menu System
        boolean running = true;
        MCSim mcsim  = new MCSim();
        Scanner user_input = new Scanner(System.in);
        String armour, userInput;

        //while (running){
        System.out.println("*** Main Menu ***" + "\n- Custom\n- List" + "\n- Type Done to Quit");
        userInput = user_input.next();

        if (userInput.equals("Custom"))  //Sets up Equipment for Player
        {
            mcsim.custom();
        }
        else if (userInput.equals("List"))
        {
            mcsim.list();
        }
        else if (userInput.equals("Done")|| userInput.compareToIgnoreCase("Stop") == 0)
        {
            running = false;
        }
        //}
    }
}