package androidx.constraintlayout.core.parser;
/* loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String a;
    private final int b;
    private final String c;

    public String a() {
        return this.a + " (" + this.c + " at line " + this.b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
