package dechmods.calculatorcommand;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import dechmods.calculatorcommand.commands.Commands;

@Mod(modid = "calcmod", name = "Calculator Mod", version = "1.0b")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CalculatorMod
{
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        Commands.initCommands(event);
    }
}