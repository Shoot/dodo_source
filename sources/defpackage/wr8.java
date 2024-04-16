package defpackage;

import java.util.regex.Pattern;
/* compiled from: Protocol.java */
/* renamed from: wr8  reason: default package */
/* loaded from: classes3.dex */
public class wr8 implements qs4 {
    private static final Pattern b = Pattern.compile(" ");
    private static final Pattern c = Pattern.compile(",");
    private final String a;

    public wr8(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.qs4
    public qs4 a() {
        return new wr8(c());
    }

    @Override // defpackage.qs4
    public boolean b(String str) {
        if ("".equals(this.a)) {
            return true;
        }
        for (String str2 : c.split(b.matcher(str).replaceAll(""))) {
            if (this.a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qs4
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((wr8) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.qs4
    public String toString() {
        return c();
    }
}
