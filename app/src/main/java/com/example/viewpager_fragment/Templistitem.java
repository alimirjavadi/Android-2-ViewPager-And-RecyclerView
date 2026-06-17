package com.example.viewpager_fragment;

public class Templistitem {

    private String[] name;
    private int[] avatar;

    public Templistitem(int position) {

        if (position == 0) {
            name = new String[]{"Ali", "Reza", "Sara", "Ali Reza", "Mohammad", "Omid"};
        } else if (position == 1) {
            name = new String[]{"Math", "Physics", "Chemistry", "Math", "Physics", "Chemistry"};
        } else {
            name = new String[]{"Red", "Blue", "Green", "Red", "Blue", "Green"};
        }

        avatar = new int[]{
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground
        };
    }

    public String[] getname() {
        return name;
    }

    public int[] getavatar() {
        return avatar;
    }
}
