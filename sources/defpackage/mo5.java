package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import defpackage.we5;
import java.security.GeneralSecurityException;
/* compiled from: LegacyProtoKey.java */
/* renamed from: mo5  reason: default package */
/* loaded from: classes2.dex */
public final class mo5 extends te5 {
    private final kr8 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LegacyProtoKey.java */
    /* renamed from: mo5$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[we5.c.values().length];
            b = iArr;
            try {
                iArr[we5.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[we5.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[mm7.values().length];
            a = iArr2;
            try {
                iArr2[mm7.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mm7.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[mm7.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[mm7.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: LegacyProtoKey.java */
    /* renamed from: mo5$b */
    /* loaded from: classes2.dex */
    private static class b extends lq7 {
        private final String a;
        private final mm7 b;

        /* synthetic */ b(String str, mm7 mm7Var, a aVar) {
            this(str, mm7Var);
        }

        private static String a(mm7 mm7Var) {
            int i = a.a[mm7Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
                        }
                        return "CRUNCHY";
                    }
                    return "RAW";
                }
                return "LEGACY";
            }
            return "TINK";
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.a, a(this.b));
        }

        private b(String str, mm7 mm7Var) {
            this.a = str;
            this.b = mm7Var;
        }
    }

    public mo5(kr8 kr8Var, q2a q2aVar) throws GeneralSecurityException {
        b(kr8Var, q2aVar);
        this.a = kr8Var;
    }

    private static void b(kr8 kr8Var, q2a q2aVar) throws GeneralSecurityException {
        int i = a.b[kr8Var.d().ordinal()];
        if (i == 1 || i == 2) {
            q2a.b(q2aVar);
        }
    }

    @Override // defpackage.te5
    public lq7 a() {
        return new b(this.a.f(), this.a.e(), null);
    }
}
