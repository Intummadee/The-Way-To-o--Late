package main;

import entity.Entity;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Player;
import java.util.ArrayList;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

//	SCREEN SETTINGS
    final int originalTileSize = 16; // 16 * 16 tiles
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; // 48*48 tile
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    // world settings
    public final int maxWorldCol = 105;
    public final int maxWorldRow = 105;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;

    //FPS
    int FPS = 60;

    // System
    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler(this);
    Sound music = new Sound();
    Sound se = new Sound();
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public UI ui = new UI(this);
    public EventHandler eHandler = new EventHandler(this);
    Thread gameThread;

    // Entity and Object
    public Player player = new Player(this, keyH);
    public SuperObject obj[] = new SuperObject[4000];
    public Entity npc[] = new Entity[200];

    public Entity monster[] = new Entity[30];
    ArrayList<Entity> entityList = new ArrayList<Entity>();

    // Set player's position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 3;

    // Game State
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int gameOverState = 3;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    public void setupGame() {
        aSetter.setObject(); // setup stuff
        aSetter.setNPC();
        aSetter.setMonster();
        gameState = titleState;

    }

    public void retry() {

        player.setDefaultPositions();
        player.restoreLife();
        aSetter.setNPC();
        aSetter.setObject();

    }

    public void restart() {
        

        player.setDefaultPositions();
        player.restoreLife();
        aSetter.setNPC();
        aSetter.setObject();
  
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();


    }

    public void run() {
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if (timer >= 1000000000) {
//				System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }

        }
    }

    public void update() {
        if (gameState == playState) {

            player.update(); // player
            for (int i = 0; i < npc.length; i++) { // NPC_CAt
                if (npc[i] != null) {
                    npc[i].upDate();
                }
            }

            for (int i = 0; i < monster.length; i++) { // MON_Dog
                if (monster[i] != null) {
                    monster[i].upDate();
                }
            }

        }

        if (gameState == pauseState) {
            // nothing because we dont update the player 
        }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // tile
        if (gameState == titleState) {
            ui.draw(g2);

        } else {
            tileM.draw(g2);

            
            // object
            for (int i = 0; i < obj.length; i++) {
                if (obj[i] != null) {
                    obj[i].draw(g2, this);
                }
            }    
            // NFC 
            for (int i = 0; i < npc.length; i++) {
                if (npc[i] != null) {
                    npc[i].draw(g2);
                }
            }    
                

            
            // player
            player.draw(g2);

            // UI
            ui.draw(g2);

            g2.dispose();
        }

    }

    public void playMusic(int i) {
        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic() {
        music.stop();
    }

    public void playSE(int i) {
        // SE = sound effect, so it short that is why it dont call loop
        se.setFile(i);
        se.play();
    }

}
