package ru.progwards.java1.lessons.tokenizer;

public class JsonFormatter {
    public static String format(String json) {
        StringBuilder formattedJson = new StringBuilder();
        int indentLevel = 0;
        boolean inString = false;
        char currentChar;

        for (int i = 0; i < json.length(); i++) {
            currentChar = json.charAt(i);

            if (currentChar == '"') {
                inString = !inString;
                formattedJson.append(currentChar);
            } else {
                if (!inString) {
                    if (currentChar == '{' || currentChar == '[') {
                        indentLevel++;
                        formattedJson.append(currentChar);
                        formattedJson.append("\n");
                        formattedJson.append(getIndent(indentLevel));
                    } else if (currentChar == '}' || currentChar == ']') {
                        indentLevel--;
                        formattedJson.append("\n");
                        formattedJson.append(getIndent(indentLevel));
                        formattedJson.append(currentChar);
                    } else if (currentChar == ',') {
                        formattedJson.append(currentChar);
                        formattedJson.append("\n");
                        formattedJson.append(getIndent(indentLevel));
                    } else {
                        formattedJson.append(currentChar);
                    }
                } else {
                    formattedJson.append(currentChar);
                }
            }
        }

        return formattedJson.toString();
    }

    private static String getIndent(int indentLevel) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            indent.append("  ");
        }
        return indent.toString();
    }
}

