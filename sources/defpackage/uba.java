package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
/* compiled from: Separators.java */
/* renamed from: uba  reason: default package */
/* loaded from: classes2.dex */
public class uba implements Serializable {
    private final char a;
    private final char b;
    private final char c;

    public uba() {
        this(CoreConstants.COLON_CHAR, CoreConstants.COMMA_CHAR, CoreConstants.COMMA_CHAR);
    }

    public static uba a() {
        return new uba();
    }

    public char b() {
        return this.c;
    }

    public char c() {
        return this.b;
    }

    public char d() {
        return this.a;
    }

    public uba(char c, char c2, char c3) {
        this.a = c;
        this.b = c2;
        this.c = c3;
    }
}
