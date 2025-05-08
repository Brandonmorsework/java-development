package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }
        public static String format(String firstName, String lastName) {
        return format( "", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {


    StringBuilder sb = new StringBuilder();

    sb.append(lastName).append(", ");

    if (!prefix.isEmpty()) {
        sb.append(prefix).append(" ");
    }

    sb.append(firstName);

    if (!middleName.isEmpty()) {
        sb.append(" ").append(middleName);
    }

    if (!suffix.isEmpty()) {
        sb.append(", ").append(suffix);
    }

    return sb.toString();
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(", ");
        String mainName = parts[0];

        String suffix;

        if (parts.length > 1) {
            suffix = parts[1];
        } else {
            suffix = "";

        }
        String[] nameParts = mainName.split(" ");

        String prefix = "", firstName = "", middleName = "", lastName = "";

        switch (nameParts.length) {
            case 4:
                prefix = nameParts[0];
                firstName = nameParts[1];
                middleName = nameParts[2];
                lastName = nameParts[3];
                break;

            case 3:
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                break;

            case 2:
                firstName = nameParts[0];
                lastName = nameParts[1];

        }

        return format(prefix, firstName, middleName, lastName, suffix);

    }


}
