package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotServise {
    public SendMessage sendMessage(long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        sendMessage.setText("Servise");
    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    KeyboardRow row = new KeyboardRow();
    List<KeyboardRow> rows = new ArrayList<>();
    KeyboardButton button = new KeyboardButton();
        button.setText("Buyurtma berish");
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

//dasuuhdousehfoiusf
    }
    public static  SendPhoto sendPhoto(long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/bnFfEe9D6Rca7DFM7"));
        return sendPhoto;

    }
//    SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId(chatId);
//        sendMessage.setText("Servise");
//    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//    KeyboardRow row = new KeyboardRow();
//    List<KeyboardRow> rows = new ArrayList<>();
//    KeyboardButton button = new KeyboardButton();
//        button.setText("Buyurtma berish");
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        sendMessage.setReplyMarkup(replyKeyboardMarkup);
//        return sendMessage;




}
