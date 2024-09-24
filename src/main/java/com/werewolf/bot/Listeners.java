package com.werewolf.bot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.entities.Guild; 
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Listeners extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        Dotenv dotenv = Dotenv.load();
        Guild guild = event.getJDA().getGuildById(dotenv.get("DISCORD_GUILD_ID"));

        assert guild != null;
        guild.upsertCommand("create", "Creates a game of Werewolf").queue();
        guild.upsertCommand("join", "Join a game of Werewolf").queue();

    }
}
