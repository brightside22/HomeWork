package ru.progwards.java1.lessons.tokenizer;

public class JsonFormatter {
    public static String format(String json) {
        int indentLevel = 0;
        StringBuilder formattedJson = new StringBuilder();

        for (char ch : json.toCharArray()) {
            switch (ch) {
                case '{':
                    indentLevel++;
                    formattedJson.append("{\n").append(format(String.valueOf(indentLevel * 2)));
                    break;
                case '}':
                    indentLevel--;
                    formattedJson.append("\n").append(format(String.valueOf(indentLevel * 2))).append("}");
                    break;
                case ',':
                    formattedJson.append(",\n").append(format(String.valueOf(indentLevel * 2)));
                    break;
                default:
                    formattedJson.append(ch);
            }
        }

        return formattedJson.toString();
    }
}
