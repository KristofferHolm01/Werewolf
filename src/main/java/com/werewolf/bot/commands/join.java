package com.werewolf.bot.commands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class join extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        if(!event.getName().equals("join")) return;

        Member user = event.getMember();
        assert user != null;
        String userName = user.getEffectiveName();

        int numOfPlayers = 0;
        numOfPlayers++;
        event.reply(userName + " have joined the game!\nThere's now a total of " + numOfPlayers + " players").queue();
    }
}
