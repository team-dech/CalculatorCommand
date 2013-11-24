package dechmods.calculatorcommand.commands;

import java.util.List;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.EnumChatFormatting;

public class CommandCalculate extends CommandBase
{
    
    @Override
    public String getCommandName()
    {
        return "calc";
    }
    
    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "/calc <calculation without spaces>";
    }
    
    @Override
    public List addTabCompletionOptions(ICommandSender icommandsender, String[] command)
    {
        switch (command.length)
        {
            case 1:
                return getListOfStringsMatchingLastWord(command, new String[]
                { "calc" });
        }
        return null;
    }
    
    @Override
    public void processCommand(ICommandSender icommandsender, String[] astring)
    {
        if (astring.length == 1)
        {
            EntityPlayer player = (EntityPlayer) icommandsender;
            String toEval = astring[0];
            DoubleEvaluator de = new DoubleEvaluator();
            Double got = de.evaluate(toEval);
            
            player.sendChatToPlayer(ChatMessageComponent.createFromText(EnumChatFormatting.DARK_AQUA + "Result of " + EnumChatFormatting.RED + "" + astring[0] + EnumChatFormatting.DARK_AQUA + ": " + EnumChatFormatting.DARK_GREEN + "" + got));
        }
    }
}
