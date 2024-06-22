package ru.progwards.java1.lessons.tokenizer;

public class JsonFormatter1 {
    public static String format(String json) {
        StringBuilder formattedJson = new StringBuilder();
        int indentLevel = 0;
        boolean Quotes = false;
        boolean Escape = false;

        for (char charFromJson : json.toCharArray()) {
            switch (charFromJson) {
                case '"':
                    if (!Escape) {
                        Quotes = !Quotes;
                    }
                    formattedJson.append(charFromJson);
                    break;
                case '\\':
                    Escape = !Escape;
                    formattedJson.append(charFromJson);
                    break;
                case '{':
                case '[':
                    formattedJson.append(charFromJson);
                    if (!Quotes) {
                        formattedJson.append('\n');
                        indentLevel++;
                        appendIndentation(formattedJson, indentLevel);
                    }
                    break;
                case '}':
                case ']':
                    if (!Quotes) {
                        formattedJson.append('\n');
                        indentLevel--;
                        appendIndentation(formattedJson, indentLevel);
                        formattedJson.append(charFromJson);
                    } else {
                        formattedJson.append(charFromJson);
                    }
                    break;
                case ',':
                    formattedJson.append(charFromJson);
                    if (!Quotes) {
                        formattedJson.append('\n');
                        appendIndentation(formattedJson, indentLevel);
                    }
                    break;
                case ':':
                    if (Quotes) {
                        formattedJson.append(charFromJson);
                    } else {
                        formattedJson.append(": ");
                    }
                    break;
                default:
                    formattedJson.append(charFromJson);
                    break;
            }
            if (charFromJson != '\\') {
                Escape = false;
            }
        }

        return formattedJson.toString();
    }

    private static void appendIndentation(StringBuilder sb, int level) {
        for (int i = 0; i < level; i++) {
            sb.append("  "); // 2 spaces for each level
        }
    }

    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30, \"cars\":[\"Ford\", \"BMW\", \"Fiat\"]}";
        String formattedJson = JsonFormatter.format(json);
        System.out.println(formattedJson);
    }
}
