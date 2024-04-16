package defpackage;
/* compiled from: Marker.java */
/* renamed from: n86  reason: default package */
/* loaded from: classes.dex */
public class n86 {
    private final String a;
    public final float b;
    public final float c;

    public n86(String str, float f, float f2) {
        this.a = str;
        this.c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith("\r")) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
