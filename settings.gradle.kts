pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "SlowPaper"

include("SlowPaper-API", "SlowPaper-Server")
