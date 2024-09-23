package com.werewolf.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import io.github.cdimascio.dotenv.Dotenv;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        // Load .env file
        Dotenv dotenv = Dotenv.load();


        JDA jda = JDABuilder.createDefault(dotenv.get("DISCORD_TOKEN")).build();


    }

}