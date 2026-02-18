package rosinnii.code;

public enum ProgramLanguages {
    java("Java"),
    net(".NET"),
    php("PHP"),
    python("Python"),
    go ("GO");

    private final String displayName;

    ProgramLanguages(String displayName) {
        this.displayName = displayName;
    }

    public static ProgramLanguages getProgramLanguagesById(Integer index) {
        if (index >= ProgramLanguages.values().length) {
            return ProgramLanguages.values()[0];
        } else {
            return ProgramLanguages.values()[index];
        }
    }

    public String getDisplayName() {
        return displayName;
    }

    public static String[] getProgLangs() {
        ProgramLanguages[] pl = values();
        String[] plNames = new String[pl.length];
        for (int i = 0; i < pl.length; i++) {
            plNames[i] = pl[i].getDisplayName();
        }
        return plNames;
    }

    public static int getEnumIndex(String value) {
        int index = -1;
        ProgramLanguages[] pl = values();
        for (ProgramLanguages lang: pl) {
            index++;
            if (lang.getDisplayName().equals(value)) {
                break;
            }
        }
        return index;
    }

    // For read value of language from combobox
    public static ProgramLanguages getProgramLanguagesByName(String namePL) {
        int index = -1;
        ProgramLanguages[] plValues = values();
        boolean flFound = false;
        while (!flFound && index<plValues.length-1) {
            index++;
            if (plValues[index].getDisplayName().equals(namePL)) {
                flFound = true;
            }
        }
        ProgramLanguages pl = null;
        if (!flFound) {
            pl = ProgramLanguages.values()[0];
        } else {
            pl = ProgramLanguages.values()[index];
        }
        return pl;
    }

    // For creating items list in combobox
    public static String[]  getProgramLanguages() {
        ProgramLanguages[] pl = values();
        String[] plNames = new String[pl.length];
        for (int i = 0; i < pl.length; i++) {
            plNames[i] = pl[i].getDisplayName();
        }
        return plNames;
    }

}
