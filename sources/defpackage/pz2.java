package defpackage;
/* compiled from: DeliveryMechanism.java */
/* renamed from: pz2  reason: default package */
/* loaded from: classes2.dex */
public enum pz2 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int a;

    pz2(int i) {
        this.a = i;
    }

    public static pz2 a(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int i() {
        return this.a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.a);
    }
}
