package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
/* compiled from: KeyTemplate.java */
/* renamed from: uf5  reason: default package */
/* loaded from: classes2.dex */
public final class uf5 {
    private final vf5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyTemplate.java */
    /* renamed from: uf5$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[mm7.values().length];
            a = iArr2;
            try {
                iArr2[mm7.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[mm7.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[mm7.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[mm7.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: KeyTemplate.java */
    /* renamed from: uf5$b */
    /* loaded from: classes2.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private uf5(vf5 vf5Var) {
        this.a = vf5Var;
    }

    public static uf5 a(String str, byte[] bArr, b bVar) {
        return new uf5(vf5.T().z(str).A(h.u(bArr)).y(c(bVar)).a());
    }

    static mm7 c(b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return mm7.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return mm7.RAW;
            }
            return mm7.LEGACY;
        }
        return mm7.TINK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vf5 b() {
        return this.a;
    }
}
