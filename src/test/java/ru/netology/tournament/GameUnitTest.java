package ru.netology.tournament;

import org.junit.jupiter.api.Test;
import ru.netology.tournament.domain.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GameUnitTest {

    @Test
    void shouldWinFirst() {
        var game = new Game();
        var player1 = new Player("test", "Vanya", 5);
        var player2 = new Player("test", "Vasya", 2);
        game.register(player1);
        game.register(player2);

        assertEquals(game.round(player1.getName(), player2.getName()), 1);
    }

    @Test
    void shouldWinSecond() {
        var game = new Game();
        var player1 = new Player("test", "Vanya", 2);
        var player2 = new Player("test", "Vasya", 5);
        game.register(player1);
        game.register(player2);

        assertEquals(game.round(player1.getName(), player2.getName()), 2);
    }

    @Test
    void shouldWinNoOne() {
        var game = new Game();
        var player1 = new Player("test", "Vanya", 2);
        var player2 = new Player("test", "Vasya", 2);
        game.register(player1);
        game.register(player2);

        assertEquals(game.round(player1.getName(), player2.getName()), 0);
    }

    @Test
    void shouldThrowUnknownForPlayer() {
        var game = new Game();

        assertThrows(NotRegisteredException.class, () -> game.round("TEST", "TEST"), "Player TEST is not registered");
    }

}