# The Way To(o) Late

**The Way To(o) Late** is a Java 2D desktop game about rushing to an exam before time runs out. The player must cross a large tile-based map, avoid hazards, survive traffic and NPC collisions, collect helpful items, and reach the goal before it is too late.

## Game Overview

You play as a student who is late for an exam. The objective is simple:

> Reach the exam destination before the timer reaches zero.

The game uses a top-down 2D view with pixel-art assets. It is built with Java Swing/AWT and runs as a desktop application.

## Gameplay

The player starts from the title screen and selects **Play Game**. During the game, the player explores the map while avoiding obstacles and danger zones.

Main gameplay elements:

- **Timer**: The player has 90 seconds to reach the goal.
- **Life system**: The player starts with 5 hearts.
- **Cars**: Dangerous moving entities. Colliding with them can end the run.
- **NPCs**: Cats and chickens move around the map and can damage the player.
- **Hazards**: Some map positions cause the player to slip and lose health.
- **Eggs**: Restore health when collected.
- **Eunji objects**: Damage the player when touched.
- **Goal object**: Reaching it ends the game and shows the result screen.

## Controls

```text
W / Arrow Up      Move up
S / Arrow Down    Move down
A / Arrow Left    Move left
D / Arrow Right   Move right
P                 Pause / Resume
Enter             Select menu option
```

## Pause Menu

Press `P` while playing to open the pause menu.

Pause options:

```text
Resume    Continue the game
Restart   Restart the current run
Quit      Return to the title screen
```

Use `W/S` or arrow keys to move between menu options, then press `Enter` to select.

## Win And Lose Conditions

You win when you reach the goal before time runs out.

You lose when:

- the timer reaches zero, or
- the player's health reaches zero.

The result screen shows the time and score after reaching the goal.

## Tech Stack

- **Language**: Java
- **UI/Game rendering**: Java Swing and AWT
- **Build tool**: Maven
- **Map format**: text-based tile map
- **Assets**: PNG sprites, WAV sound files, TTF font

This project does not currently use a database.

## Project Structure

```text
src/main/java/
  main/                 Window, game loop, input, UI, sound, collision
  entity/               Player, NPCs, cars, shared entity behavior
  object/               Collectibles, hazards, goal, static objects
  tile/                 Tile data and map loading

src/main/resources/
  font/                 Game font
  maps/                 Tile map text files
  npc/                  NPC and car sprites
  objects/              Object and item sprites
  player/               Player sprites
  sound/                Game music and sound effects
  tiles/                Tile sprites

.vscode/                Cursor/VS Code Java project settings
pom.xml                 Maven project configuration
```

## Important Files

```text
src/main/java/main/Main.java           Application entry point
src/main/java/main/GamePanel.java      Main game loop and rendering flow
src/main/java/main/KeyHandler.java     Keyboard input and menu controls
src/main/java/main/UI.java             Title, HUD, pause, game over, result screens
src/main/java/main/Sound.java          Music and sound effect handling
src/main/java/main/AssetSetter.java    Object and NPC placement
src/main/java/tile/TileManager.java    Tile loading and map rendering
src/main/resources/maps/world01.txt    Main map data
```

## Sound Files

The game expects these files:

```text
src/main/resources/sound/song.wav
src/main/resources/sound/goal.wav
```

`song.wav` is used as background music.  
`goal.wav` is used when the player reaches the goal.

The files must be real WAV audio files. Renaming an MP3 file to `.wav` is not enough.

## Requirements

- JDK 25 or compatible Java version
- Maven or Maven Daemon, if you want to run with Maven

Check Java:

```powershell
java -version
javac -version
```

## Run With Maven

From the project root:

```powershell
mvn compile
mvn exec:java
```

If you use Maven Daemon instead of Maven:

```powershell
mvnd compile
mvnd exec:java
```

## Manual Run Without Maven

From the project root:

```powershell
New-Item -ItemType Directory -Force out
$files = Get-ChildItem src/main/java -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -encoding UTF-8 -d out $files
java -cp "out;src/main/resources" main.Main
```

## Development Notes

- Java source code lives in `src/main/java`.
- Runtime assets live in `src/main/resources`.
- Resource paths in the code use absolute classpath paths such as `/tiles/1.png` and `/maps/world01.txt`.
- Build output folders such as `out/` and `target/` should not be committed.
- The `picture/` folder is intentionally kept trackable for screenshots or project documentation images.

## Future Ideas

Possible improvements:

- high score system
- difficulty selection
- settings screen
- volume and mute controls
- save/load system
- multiple levels
- map/object data files instead of hard-coded object placement
- SQLite database for scores and save slots
