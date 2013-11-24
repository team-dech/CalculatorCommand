package dechmods.calculatorcommand.commands;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class Commands
{
    public static void initCommands(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandCalculate());
    }
    
}
