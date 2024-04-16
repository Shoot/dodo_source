package defpackage;
/* renamed from: f47  reason: default package */
/* loaded from: classes3.dex */
public class f47 {
    private String a;
    private int b = 0;

    public f47(String str) {
        this.a = str;
    }

    public boolean a() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public String b() {
        int i = this.b;
        if (i == -1) {
            return null;
        }
        int indexOf = this.a.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.a.substring(this.b);
            this.b = -1;
            return substring;
        }
        String substring2 = this.a.substring(this.b, indexOf);
        this.b = indexOf + 1;
        return substring2;
    }
}
