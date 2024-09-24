package com.werewolf.bot.commands;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class create extends ListenerAdapter {

    private final JDA jda;

    // Constructor to receive JDA
    public create(JDA jda) {
        this.jda = jda;
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if(!event.getName().equals("create")) return;
        event.reply("A game of Werewolf has been created. Join in by using /join").queue();
        jda.getPresence().setActivity(Activity.customStatus("A game of Werewolf is beginning!"));

    }

}
