package com.werewolf.bot;

import com.werewolf.bot.commands.create;
import com.werewolf.bot.commands.join;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        // Load .env file
        Dotenv dotenv = Dotenv.load();


        JDA jda = JDABuilder.createDefault(dotenv.get("DISCORD_TOKEN")).build();

        // Used to set the status of the Bot.
        jda.getPresence().setActivity(Activity.customStatus("Ready to play Werewolf!"));

        jda.addEventListener(new Listeners());
        jda.addEventListener(new create(jda));

        // TODO: Check if a game is created before allowing users to join
        jda.addEventListener(new join());



    }

}
