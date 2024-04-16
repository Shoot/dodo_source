package defpackage;

import java.security.SecureRandom;
/* compiled from: Random.java */
/* renamed from: a49  reason: default package */
/* loaded from: classes2.dex */
public final class a49 {
    private static final ThreadLocal<SecureRandom> a = new a();

    /* compiled from: Random.java */
    /* renamed from: a49$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SecureRandom initialValue() {
            return a49.a();
        }
    }

    static /* synthetic */ SecureRandom a() {
        return b();
    }

    private static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[i];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
