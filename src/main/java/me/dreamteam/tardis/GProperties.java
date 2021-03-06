package me.dreamteam.tardis;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class GProperties {

	/*
     * IMPORTANT INFORMATION:
	 * This class is for the purpose of declaring game variables to be used in the main class (or in some cases, other classes)
	 */

	/* Hardware Acceleration */

    public BufferStrategy strategy;

    public static boolean release = false;

	/* Debug */

    public static boolean debug = true;
    public static int debugHits = 0;

	/* Game Initilisation Variables */

    public boolean Running = true;
    public boolean gameStart = false;
    public long lastLoopTime;
    public Image splashbg;
    public static int wake = 0;
    public static String username;

	/* Entities */

    public Entity Background;
    public Entity Background2;
    public Entity ship;
    public static Integer shipS;

    public ArrayList entities = new ArrayList();
    public ArrayList backgroundImages = new ArrayList();
    public ArrayList removeList = new ArrayList();

    public double moveSpeed = 180;

    /* Sprites */
    public int spriteLoc;
    public int spriteLoc2;
    public int spriteLoc3;

    public int curSprite = 1;
    public double curY = 0;
    public Random rSpriteLoc = new Random();

	/* Keyboard Listeners */

    public boolean leftPressed = false;
    public boolean rightPressed = false;
    public boolean firing = false;
    
	/* Game Logic and Time */

    public boolean advanceLevel = false;
    public int level = 1;
    public long lastFrame;
    public long finalTime = 0;
    public String timeDisplay = "";
    public String livesDisplay = "";
    public boolean usedPack = false;
    public static boolean pack = false;
    public ArrayList packList = new ArrayList();
    public Entity Pack;
    public static int weapon = 1;
    public static int gameTime = 0;
    public static int gameLives = 3;
    public int timeMil;
    public long lastTime;
    public int tWait = 0;
    public long lastFire = 0;
    public long timeBetweenShots = 110;
    public long weaponLoopTime;
    public int curWeapon = 1;
    public boolean weaponPressed = false;

	/* Window Toolkit */

    public static int sX = 0;
    public static int sY = 0;
    
    /* Achievements */

    public static boolean achFalcon = false;
    public static boolean achMoth = false;
    public static int achDistance = 0;
    public static int ach1Distance = 0;
    public static int ach2Distance = 0;
    public static int ach3Distance = 0;


}
