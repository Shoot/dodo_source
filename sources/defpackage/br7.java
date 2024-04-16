package defpackage;
/* compiled from: ParseSettings.java */
/* renamed from: br7  reason: default package */
/* loaded from: classes3.dex */
public class br7 {
    public static final br7 c = new br7(false, false);
    public static final br7 d = new br7(true, true);
    private final boolean a;
    private final boolean b;

    public br7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return h07.a(str.trim());
    }

    public String b(String str) {
        String trim = str.trim();
        if (!this.b) {
            return h07.a(trim);
        }
        return trim;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hz c(hz hzVar) {
        if (hzVar != null && !this.b) {
            hzVar.R();
        }
        return hzVar;
    }

    public String d(String str) {
        String trim = str.trim();
        if (!this.a) {
            return h07.a(trim);
        }
        return trim;
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return this.a;
    }
}
