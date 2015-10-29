package com.example;

import java.util.Scanner;

public class MyClass
{

    private String cameraName;
    private double cost;
    //public boolean waterproof = true;
    private boolean shockResistant;
    //public boolean wearableMountable = true;
    private int megapixels;
    private double fps;
    private boolean bluetoothWiFi;
    private boolean touchDisplay;
    private boolean oneTouchControls;
    private int highestResolution;
// All GoPro cameras may be worn or mounted with all GoPro mounts. All GoPro cameras are waterproof.


    public MyClass() {  }

    public MyClass(String name, double price)
    {
        cameraName = name;
        cost = price;
    }

    public MyClass(String name, double price, boolean shock, int pixels, double frames, boolean BW,
                   boolean display, boolean oneTouch, int resolution)
    {
        cameraName = name;
        cost = price;
        shockResistant = shock;
        megapixels = pixels;
        fps = frames;
        bluetoothWiFi = BW;
        touchDisplay = display;
        oneTouchControls = oneTouch;
        highestResolution = resolution;
    }

    // get functions
    public String getName() { return cameraName; }

    public double getCost() { return cost; }

    public boolean getShockResistant() { return shockResistant; }

    public int getMegapixels() { return megapixels; }

    public double getFPS() { return fps; }

    public boolean getBluetoothWiFi() { return bluetoothWiFi; }

    public boolean getTouchDisplay() { return touchDisplay; }

    public boolean getTouchControls() { return oneTouchControls; }

    public int getHighestResolution() { return highestResolution; }

    //  set functions
    public void setName(String name) { cameraName = name; }

    public void setPrice(double price) { cost = price; }

    public void setShockResistant(boolean shock) { shockResistant = shock; }

    public void setMegapixels(int pixels) { megapixels = pixels; }

    public void setFPS(double frames) { fps = frames; }

    public void setBluetoothWiFi(boolean blueWi) { bluetoothWiFi = blueWi; }

    public void setTouchDisplay(boolean display) { touchDisplay = display; }

    public void setOneTouchControls(boolean touch) { oneTouchControls = touch; }

    public void setHighestResolution(int highRes) { highestResolution = highRes; }


    public static void main(String[] args)
    {

        double cameraPrice;
        boolean fourKRes;

        MyClass[] goPro = new MyClass[6];
        goPro[0] = new MyClass("Hero", 129.99, true, 5, 5, false, false, false, 1080);
        goPro[1] = new MyClass("Hero+", 199.99, true, 8, 5, true, false, false, 1080);
        goPro[2] = new MyClass("Hero+ LCD", 299.99, true, 8, 5, true, true, false, 1080);
        goPro[3] = new MyClass("Hero4 Session", 299.99, false, 8, 10, true, false, true, 1080);
        goPro[4] = new MyClass("Hero4 Silver", 399.99, true, 12, 30, true, true, false, 1080);
        goPro[5] = new MyClass("Hero4 Black", 499.99, true, 12, 30, true, false, false, 4096);

        cameraPrice = questionPrice();

        if(cameraPrice >= goPro[5].getCost())
        {
            fourKRes = question4K();

            if(fourKRes == true)
            {
                System.out.println("The " + goPro[5].getName() + " is the only GoPro that currently "
                + "takes video in 4k resolution. Thank you for choosing GoPro!");
            }
        }

        System.out.println("The following GoPro cameras ");
        for(int i = 0; i < 6; i++)
        {
            if(goPro[i].getCost() <= cameraPrice)
            {
                System.out.println(goPro[i].getName());
            }
        }
        System.out.println("cost less than the amount you specified.");

        System.out.println("For more information about these cameras, please visit our website at ");
        System.out.println("http://shop.gopro.com/");



    }

    public static boolean question4K()
    {
        Scanner response = new Scanner(System.in);

        System.out.println("Are you interested in a GoPro that can take footage in 4K resolution;");
        System.out.println("true or false?");
        boolean answer = response.nextBoolean();

        while(answer != true && answer != false)
        {
            System.out.println("Please enter either \"true\" or \"false\".");
            answer = response.nextBoolean();
        }

        return answer;
    }

    public static double questionPrice()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the MAXIMUM amount you can spend on your new GoPro:");
        double amount = in.nextDouble();

        while(amount < 120)
        {
            System.out.println("I am sorry, but the lease expensive GoPro costs $129.99.");
            System.out.println("Please enter an amount greater than that price.");
            amount = in.nextDouble();
        }

        return amount;
    }




}
