package ru.progwards.java1.lessons.TelegramBot;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

class Fil_Main extends ProgwardsTelegramBot {

    @Override
    public String processMessage(String text) {
        checkTags(text);
        String menu = "У нас есть пицца напиток и десерт";
        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Приветствую тебя, о мой повелитель!\n Что желаешь? " + menu;
            if (checkLastFound("конец"))
                return "Спасибо за заказ.";
            if (checkLastFound("дурак"))
                return "Не надоругаться. Я не волшебник, я только учусь";

            return "Отлично, добавляю в заказ " + getLastFound() + " Желаешь что-то еще?";
        }

        if (foundCount() > 1)
            return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в заказ.";
        return "Я не понял, возможно у нас этого нет, попробуй сказать по другому. " + menu;
    }

    public static void main(String[] args) {
        System.out.print("Добро пожаловать, name, в нашего бота!");

        ApiContextInitializer.init();

        Fil_Main bot = new Fil_Main();
        bot.username = "f1lmer_bot";
        bot.token = "6473427672:AAEthP9r41iO7EG0mVPSjUCcEV0PN71ClnA";

        bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");
        bot.addTags("конец", "конец, все, стоп, нет");
        bot.addTags("дурак", "дурак, придурок, идиот, тупой");

        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");

        bot.addTags("Торт тирамису", "десерт, кофе, маскарпоне, бисквит");
        bot.addTags("Торт медовик", "десерт, мед, бисквит");
        bot.addTags("Эклеры", "десерт, заварной, крем, тесто");

        bot.addTags("Кола", "напит, пить, кола");
        bot.addTags("Холодный чай", "напит, пить, чай, липтон, лимон");
        bot.addTags("Сок", "напит, пить, сок, апельсиноый, яблочный, вишневый");

        bot.start();


    }
}