package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes.dex */
public class Token {
    String payload;
    Type type;
    public static final Token START_TOKEN = new Token(Type.START, null);
    public static final Token CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
    public static final Token CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
    public static final Token DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);

    /* loaded from: classes.dex */
    public enum Type {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public Token(Type type, String str) {
        this.type = type;
        this.payload = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (this.type != token.type) {
            return false;
        }
        String str = this.payload;
        String str2 = token.payload;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Type type = this.type;
        int i2 = 0;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.payload;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        String str = "Token{type=" + this.type;
        if (this.payload != null) {
            str = str + ", payload='" + this.payload + CoreConstants.SINGLE_QUOTE_CHAR;
        }
        return str + CoreConstants.CURLY_RIGHT;
    }
}
