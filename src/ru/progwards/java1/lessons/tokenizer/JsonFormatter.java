package ru.progwards.java1.lessons.tokenizer;

public class JsonFormatter {
    public static String format(String json) {
        int indentLevel = 0;
        String formattedJson = "";

        for (char ch : json.toCharArray()) {
            switch (ch) {
                case '{':
                    indentLevel++;
                    formattedJson += "{\n" + format(String.valueOf(indentLevel * 2));
                    break;
                case '}':
                    indentLevel--;
                    formattedJson += "\n" + format(String.valueOf(indentLevel * 2)) + "}";
                    break;
                case ',':
                    formattedJson += ",\n" + format(String.valueOf(indentLevel * 2));
                    break;
                default:
                    formattedJson += ch;
            }
        }

        return formattedJson;
    }
}
