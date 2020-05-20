package br.com.sunny.day.cadastro.entrega.domain.enumerable;

public enum GenderEnum {
    MALE("M"),
    FEMALE("F"),
    UNINFORMED("X");

    private String value;

    GenderEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static GenderEnum fromValue(String text) {
        for (GenderEnum gender : GenderEnum.values()) {
            if(String.valueOf(gender.value).equalsIgnoreCase(text)) {
                return gender;
            }
        }

        return UNINFORMED;
    }

}
