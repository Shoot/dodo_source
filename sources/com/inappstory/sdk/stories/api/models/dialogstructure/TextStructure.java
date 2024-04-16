package com.inappstory.sdk.stories.api.models.dialogstructure;
/* loaded from: classes3.dex */
public class TextStructure {
    public String align;
    public String color;
    String family;
    public float lineHeight;
    public String placeholder;
    public float size;
    String style;
    public String value;
    String weight;

    public boolean isBold() {
        String str = this.weight;
        if (str != null && str.equals("bold")) {
            return true;
        }
        return false;
    }

    public boolean isItalic() {
        String str = this.style;
        if (str != null && str.equals("italic")) {
            return true;
        }
        return false;
    }

    public boolean isSecondary() {
        String str = this.family;
        if (str != null && str.equals("InternalSecondaryFont")) {
            return true;
        }
        return false;
    }
}
