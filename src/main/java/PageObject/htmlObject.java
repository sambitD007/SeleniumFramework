package PageObject;

import BaseClasses.ElementType;

public enum htmlObject {
    ;

    private final String webElement;
    private final ElementType type;

    htmlObject(String webElement, ElementType type) {
        this.webElement = webElement;
        this.type = type;
    }

    public String getWebElement() {
        return webElement;
    }

    public ElementType getType() {
        return type;
    }
}
