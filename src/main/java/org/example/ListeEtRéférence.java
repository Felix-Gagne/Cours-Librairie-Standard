package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListeEtRéférence {
    public static void main(String[] args)
    {
        Truc a = new Truc();
        Truc b = new Truc();
        Truc c = new Truc();
        List<Truc> liste1 = new ArrayList<Truc>();
        List<Truc> liste2 = new ArrayList<Truc>();
        liste1.add(a);
        liste1.add(b);
        liste1.add(c);
        liste2.add(b);
        liste2.add(c);
        liste2.add(a);

    }
}
