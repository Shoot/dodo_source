package defpackage;
/* compiled from: DefaultMetadataDependenciesProvider.java */
/* renamed from: uq2  reason: default package */
/* loaded from: classes.dex */
public final class uq2 {
    private static final uq2 i = new uq2();
    private final ti6 a;
    private final si6 b;
    private final x28 c;
    private final ui6 d;
    private final x28 e;
    private final ic9 f;
    private final x28 g;
    private final p54 h;

    private uq2() {
        ti6 c = ti6.c();
        this.a = c;
        m81 m81Var = new m81();
        this.b = m81Var;
        kp6 kp6Var = new kp6("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        this.c = kp6Var;
        this.d = new vi6(kp6Var, m81Var, c);
        kp6 kp6Var2 = new kp6("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        this.e = kp6Var2;
        this.f = new jc9(kp6Var2, m81Var, c);
        kp6 kp6Var3 = new kp6("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        this.g = kp6Var3;
        this.h = new q54(kp6Var3, m81Var, c);
    }

    public static uq2 a() {
        return i;
    }

    public si6 b() {
        return this.b;
    }

    public ti6 c() {
        return this.a;
    }

    public x28 d() {
        return this.c;
    }
}
