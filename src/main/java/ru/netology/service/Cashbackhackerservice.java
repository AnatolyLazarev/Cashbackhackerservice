package ru.netology.service;

public class Cashbackhackerservice {
    private final int boundary = 1000;

    public int remain(int amount) {

        return boundary - amount % boundary;
    }
}