plugins {
    id("java")
}

group = "com.werewolf.bot"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.dv8tion:JDA:5.1.1")
    implementation("io.github.cdimascio:dotenv-java:3.0.0")
}