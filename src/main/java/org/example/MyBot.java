package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private MyBotServise myBotServise = new MyBotServise();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String textMessage = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            if (textMessage.equals("aaz")){
                try {
                    execute(myBotServise.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (textMessage.equals("Menu")) {
                try {
                    execute(myBotServise.inlineMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



        }
        else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            System.out.println(data);
            long chatId = callbackQuery.getMessage().getChatId();
            if (data.equals("OrderId")) {
                try {
                    execute(myBotServise.menu(chatId));
                } catch (TelegramApiException e) {

                  }
            }
        }

    }

        @Override
        public String getBotUsername() {
            return "azimnewbot";
        }

        @Override
        public String getBotToken() {
            return "6788870200:AAHT92QfkOwWzQEW3uNtkmccTPd3fcqcVaQ";
        }
}
