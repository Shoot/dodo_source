package defpackage;

import defpackage.qg5;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: CryptoFormat.java */
/* renamed from: x22  reason: default package */
/* loaded from: classes2.dex */
public final class x22 {
    public static final byte[] a = new byte[0];

    /* compiled from: CryptoFormat.java */
    /* renamed from: x22$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mm7.values().length];
            a = iArr;
            try {
                iArr[mm7.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mm7.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mm7.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mm7.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(qg5.c cVar) throws GeneralSecurityException {
        int i = a.a[cVar.S().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.R()).array();
        }
        return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.R()).array();
    }
}
