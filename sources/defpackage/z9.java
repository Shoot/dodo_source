package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.o;
import defpackage.mf5;
import defpackage.mq7;
import defpackage.nq7;
import defpackage.rf5;
import defpackage.t9;
import java.security.GeneralSecurityException;
/* compiled from: AesCmacProtoSerialization.java */
/* renamed from: z9  reason: default package */
/* loaded from: classes2.dex */
final class z9 {
    private static final mk0 a;
    private static final nq7<t9, lr8> b;
    private static final mq7<lr8> c;
    private static final rf5<q9, kr8> d;
    private static final mf5<kr8> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AesCmacProtoSerialization.java */
    /* renamed from: z9$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mm7.values().length];
            a = iArr;
            try {
                iArr[mm7.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mm7.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mm7.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mm7.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        mk0 d2 = xub.d("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = d2;
        b = nq7.a(new nq7.b() { // from class: v9
        }, t9.class, lr8.class);
        c = mq7.a(new mq7.b() { // from class: w9
        }, d2, lr8.class);
        d = rf5.a(new rf5.b() { // from class: x9
        }, q9.class, kr8.class);
        e = mf5.a(new mf5.b() { // from class: y9
            @Override // defpackage.mf5.b
            public final te5 a(oca ocaVar, q2a q2aVar) {
                q9 b2;
                b2 = z9.b((kr8) ocaVar, q2aVar);
                return b2;
            }
        }, d2, kr8.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q9 b(kr8 kr8Var, q2a q2aVar) throws GeneralSecurityException {
        if (kr8Var.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                p9 T = p9.T(kr8Var.g(), o.b());
                if (T.R() == 0) {
                    return q9.d(c(T.Q(), kr8Var.e()), o2a.a(T.P().h0(), q2a.b(q2aVar)), kr8Var.c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    private static t9 c(u9 u9Var, mm7 mm7Var) throws GeneralSecurityException {
        return t9.a(u9Var.O(), f(mm7Var));
    }

    public static void d() throws GeneralSecurityException {
        e(br6.a());
    }

    public static void e(br6 br6Var) throws GeneralSecurityException {
        br6Var.g(b);
        br6Var.f(c);
        br6Var.e(d);
        br6Var.d(e);
    }

    private static t9.a f(mm7 mm7Var) throws GeneralSecurityException {
        int i = a.a[mm7Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return t9.a.e;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + mm7Var.e());
                }
                return t9.a.d;
            }
            return t9.a.c;
        }
        return t9.a.b;
    }
}
