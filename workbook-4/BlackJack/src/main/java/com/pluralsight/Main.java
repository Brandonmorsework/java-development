package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1's name: ");
        String playerA = scanner.nextLine();
        System.out.println("Enter Player 2's name: ");
        String playerB = scanner.nextLine();

        Deck deck1 = new Deck();
        deck1.shuffle();
        Hand player1Hand = new Hand();
        Hand player2Hand = new Hand();

        player1Hand.deal(deck1.deal());
        player1Hand.deal(deck1.deal());

        player2Hand.deal(deck1.deal());
        player2Hand.deal(deck1.deal());
    }

}
