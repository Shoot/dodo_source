package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* compiled from: TinkFipsUtil.java */
/* renamed from: fhb  reason: default package */
/* loaded from: classes2.dex */
public final class fhb {
    private static final Logger a = Logger.getLogger(fhb.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TinkFipsUtil.java */
    /* renamed from: fhb$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public static final b a;
        public static final b b;
        private static final /* synthetic */ b[] c;

        /* compiled from: TinkFipsUtil.java */
        /* renamed from: fhb$b$a */
        /* loaded from: classes2.dex */
        enum a extends b {
            a(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.fhb.b
            public boolean a() {
                return !fhb.c();
            }
        }

        /* compiled from: TinkFipsUtil.java */
        /* renamed from: fhb$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        enum C0313b extends b {
            C0313b(String str, int i) {
                super(str, i);
            }

            @Override // defpackage.fhb.b
            public boolean a() {
                if (fhb.c() && !fhb.b()) {
                    return false;
                }
                return true;
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            a = aVar;
            C0313b c0313b = new C0313b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            b = c0313b;
            c = new b[]{aVar, c0313b};
        }

        private b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public abstract boolean a();
    }

    private fhb() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        if (!ehb.a() && !b.get()) {
            return false;
        }
        return true;
    }
}
