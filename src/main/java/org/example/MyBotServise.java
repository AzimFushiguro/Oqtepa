package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotServise {
    public SendMessage inlineMenu(long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asosiy Menu");
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            List<InlineKeyboardButton> row = new ArrayList<>();
            List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🛒Buyurtma berish");
        button.setCallbackData("OrderId");
        row.add(button);
        rows.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("ℹ️Biz haqimizda");
        button.setCallbackData("AboutId");
        row.add(button);
        rows.add(row);


        button = new InlineKeyboardButton();
        button.setText("🛍️Buyurtmalarim");
        button.setCallbackData("OrdersId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("🏠Filliallar");
        button.setCallbackData("fId");
        row.add(button);
        rows.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("✍️Fikr Bildirish");
        button.setCallbackData("FikrId");
        row.add(button);
        rows.add(row);

        button = new InlineKeyboardButton();
        button.setText("⚙️Sozlamalar");
        button.setCallbackData("SettingsId");
        row.add(button);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

//dasuuhdousehfoiusf
    }

    public static SendPhoto sendPhoto(long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/bnFfEe9D6Rca7DFM7"));
        return sendPhoto;

    }

    public SendMessage menu(long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Buyurtmani birga joylashtiramizmi");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDEF5 Eltib berish");
        row.add(button);
        rows.add(row);

        button = new KeyboardButton();
        row.add(button);
        button.setText("\uD83D\uDEB6 Borib olish");

        row = new KeyboardRow();
        button =new KeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        row.add(button);
        rows.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage BuyurtmaMenu(long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Eltib berish uchun geo-joylashuvni jo'nating yoki manzilni tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        List<KeyboardRow>rows = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        button.setText("📍Geo-Lokatsiya yuboring");
        row.add(button);
        rows.add(row);

        row  = new KeyboardRow();
        button = new KeyboardButton();
        button.setText("⬅\uFE0F Ortga");
        row.add(button);
        rows.add(row);

        row  = new KeyboardRow();
        button = new KeyboardButton();
        button.setText("Tanlash");
        row.add(button);
        rows.add(row);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage tanlash(long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Buyurtmani tanlang");
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("✅Standart");
        button.setCallbackData("StandartId");
        row.add(button);
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendLocation sendLocation(long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.222589830403756 );
        sendLocation.setLongitude(69.222763972321);
        return sendLocation;
    }
    public SendPhoto lavash(long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/6s1bfGs9hPZactVj7"));
        sendPhoto.setCaption("Sirli lavash");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("✅Standart");
        button.setCallbackData("StandartId");
        row.add(button);
        rows.add(row);

        inlineKeyboardMarkup.setKeyboard(rows);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }



}
