package defpackage;
/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* renamed from: tx3  reason: default package */
/* loaded from: classes2.dex */
public class tx3 implements sx3 {
    private final String a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tx3(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private String f() {
        return a().trim();
    }

    private void g() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // defpackage.sx3
    public String a() {
        if (this.b == 0) {
            return "";
        }
        g();
        return this.a;
    }

    @Override // defpackage.sx3
    public int b() {
        return this.b;
    }

    @Override // defpackage.sx3
    public long c() {
        if (this.b == 0) {
            return 0L;
        }
        String f = f();
        try {
            return Long.valueOf(f).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f, "long"), e);
        }
    }

    @Override // defpackage.sx3
    public double d() {
        if (this.b == 0) {
            return 0.0d;
        }
        String f = f();
        try {
            return Double.valueOf(f).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f, "double"), e);
        }
    }

    @Override // defpackage.sx3
    public boolean e() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String f = f();
        if (tp1.f.matcher(f).matches()) {
            return true;
        }
        if (tp1.g.matcher(f).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f, "boolean"));
    }
}
