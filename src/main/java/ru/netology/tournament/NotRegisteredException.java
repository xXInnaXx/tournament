package ru.netology.tournament;

public class NotRegisteredException extends RuntimeException {

    private static final String PLAYER_IS_NOT_REGISTERED = "Player %s is not registered";

    public NotRegisteredException(String playerName) {
        super(String.format(PLAYER_IS_NOT_REGISTERED, playerName));
    }
}
