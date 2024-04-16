package defpackage;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToNumberPolicy.java */
/* renamed from: rhb  reason: default package */
/* loaded from: classes2.dex */
public abstract class rhb implements shb {
    public static final rhb a;
    public static final rhb b;
    public static final rhb c;
    public static final rhb d;
    private static final /* synthetic */ rhb[] e;

    /* compiled from: ToNumberPolicy.java */
    /* renamed from: rhb$a */
    /* loaded from: classes2.dex */
    enum a extends rhb {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.shb
        /* renamed from: i */
        public Double a(yb5 yb5Var) throws IOException {
            return Double.valueOf(yb5Var.s());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        a = aVar;
        rhb rhbVar = new rhb("LAZILY_PARSED_NUMBER", 1) { // from class: rhb.b
            @Override // defpackage.shb
            public Number a(yb5 yb5Var) throws IOException {
                return new on5(yb5Var.L());
            }
        };
        b = rhbVar;
        rhb rhbVar2 = new rhb("LONG_OR_DOUBLE", 2) { // from class: rhb.c
            @Override // defpackage.shb
            public Number a(yb5 yb5Var) throws IOException, JsonParseException {
                String L = yb5Var.L();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(L));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(L);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!yb5Var.n()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + yb5Var.getPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e2) {
                    throw new JsonParseException("Cannot parse " + L + "; at path " + yb5Var.getPath(), e2);
                }
            }
        };
        c = rhbVar2;
        rhb rhbVar3 = new rhb("BIG_DECIMAL", 3) { // from class: rhb.d
            @Override // defpackage.shb
            /* renamed from: i */
            public BigDecimal a(yb5 yb5Var) throws IOException {
                String L = yb5Var.L();
                try {
                    return new BigDecimal(L);
                } catch (NumberFormatException e2) {
                    throw new JsonParseException("Cannot parse " + L + "; at path " + yb5Var.getPath(), e2);
                }
            }
        };
        d = rhbVar3;
        e = new rhb[]{aVar, rhbVar, rhbVar2, rhbVar3};
    }

    private rhb(String str, int i) {
    }

    public static rhb valueOf(String str) {
        return (rhb) Enum.valueOf(rhb.class, str);
    }

    public static rhb[] values() {
        return (rhb[]) e.clone();
    }

    /* synthetic */ rhb(String str, int i, a aVar) {
        this(str, i);
    }
}
