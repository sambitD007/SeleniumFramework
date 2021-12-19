package PageObject;

import BaseClasses.ElementType;

public enum htmlObject {
    Landing_Page_Customer("/html/body/div[2]/main/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[2]"
                        ,ElementType.XPATH),
    Landing_Page_Agent("/html/body/div[2]/main/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[2]/div[2]",ElementType.XPATH),
    Landing_Page_Admin("/html/body/div[2]/main/section[1]/div/div/div[4]/div/div/div[2]/div/div/div[2]/div[2]",ElementType.XPATH),
    Landing_Page_Supplier("/html/body/div[2]/main/section[1]/div/div/div[5]/div/div/div[2]/div/div/div[2]/div[2]",ElementType.XPATH);

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
