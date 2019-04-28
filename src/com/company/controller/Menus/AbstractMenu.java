package com.company.controller.Menus;

import com.company.controller.Exceptions.*;

public interface AbstractMenu
{
    void selectOptionByCommand(String command) throws WrongPassword, UserNameDidntExist, WeekPassword, UserNameAlreadyExist, InvalidDeck, DeckNameAlreadyExist, CardNotFoundInCollection, DeckNotFound, DeckIsFull, DeckHasHeroAlready, CardExistInDeckAlready, DeckHasPassiveAlready;

    String help();

    String toShowMenu();
}

