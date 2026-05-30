# The Way To(o) Late

Java Swing 2D game project.

## Project Structure

```text
src/main/java/          Java source code
  main/                 Window, game loop, input, UI, sound
  entity/               Player, NPC, cars
  object/               Game objects and items
  tile/                 Tile and map loading

src/main/resources/     Game assets loaded with getResource(...)
  font/
  maps/
  npc/
  objects/
  player/
  sound/
  tiles/
```

## Required Sound Files

Place these files in `src/main/resources/sound/`:

```text
song.wav
goal.wav
```

## Run With Maven

Install Maven first, then run:

```powershell
mvn compile
mvn exec:java
```

## Manual Run Without Maven

```powershell
New-Item -ItemType Directory -Force out
$files = Get-ChildItem src/main/java -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -encoding UTF-8 -d out $files
java -cp "out;src/main/resources" main.Main
```
