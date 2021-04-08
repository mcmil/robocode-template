# Robocode Robot Template

This is a template project for developing your own robots for [Robocode](https://robocode.sourceforge.io/).

This template uses the [robocode-gradle-plugin](https://github.com/bnorm/) to bootstrap the classpath and download the robocode environment. 
 Refer to the plugin's documentation in order to get more information.

The project contains the following robots scaffolding that you can use to build your own ones: 
* JavaBot (java/pl/cmil/template/JavaBot.java) 
* template.KotlinBot (kotlin/pl/cmil/template/KotlinBot.kt)

Robot naming convention is `{package}.{robotName}`. _Warning_: Don't use _robocode_ in your package name. 
Additionally every robot has to be registered in the `build.gradle` file:
```groovy
robocode {
    robots {
        register("KotlinBot") {
            classPath = "pl.cmil.template.KotlinBot"
            version = "1.0"
            description = "Kotlin robot Example"
        }
        register("JavaBot") {
            classPath = "pl.cmil.template.JavaBot"
            version = "1.0"
            description = "Java robot Example"
        }
    }
}
```

## Usage

Download (or fork) this template to your local computer. Execute a gradle task to download and install robocode before importing the project to your IDE:
```shell
./gradlew robocodeDownload
```

Import the template project to your IDE. You can build to robots using:
```shell
./gradlew robotBin
```
This will rebuild the robots, without packaging them.

To start the app use:
```shell
./gradlew robocodeRun
```

Now when you should be able to add 
your robots to a battle (they should have an asterisk near their name - this indicates that they are in development mode, and are read 
directly from the class files on the disk, not from a jar). _Warning_: If you have some problems with installing your robots on Windows add the dev path property manually in `Options->Preferences->Development Options`

You can also run the build in continuous mode, the classes will be rebuild after every change, and the robot will be refreshed after every battle:
```shell
./gradlew robotBin --continuous
```

You can package the robots to a jar using:
```shell
./gradlew robotJars
```
The result should be available in `build/robocode/robots`.




