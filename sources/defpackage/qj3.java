package defpackage;

import java.io.Serializable;
/* compiled from: EnumValues.java */
/* renamed from: qj3  reason: default package */
/* loaded from: classes2.dex */
public final class qj3 implements Serializable {
    private final Class<Enum<?>> a;
    private final Enum<?>[] b;
    private final mca[] c;

    private qj3(Class<Enum<?>> cls, mca[] mcaVarArr) {
        this.a = cls;
        this.b = cls.getEnumConstants();
        this.c = mcaVarArr;
    }

    public static qj3 a(Class<Enum<?>> cls, mca[] mcaVarArr) {
        return new qj3(cls, mcaVarArr);
    }

    public static qj3 b(w76<?> w76Var, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> q = q81.q(cls);
        Enum<?>[] enumArr = (Enum[]) q.getEnumConstants();
        if (enumArr != null) {
            String[] k = w76Var.i().k(q, enumArr, new String[enumArr.length]);
            mca[] mcaVarArr = new mca[enumArr.length];
            int length = enumArr.length;
            for (int i = 0; i < length; i++) {
                Enum<?> r5 = enumArr[i];
                String str = k[i];
                if (str == null) {
                    str = r5.name();
                }
                mcaVarArr[r5.ordinal()] = w76Var.d(str);
            }
            return a(cls, mcaVarArr);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public Class<Enum<?>> c() {
        return this.a;
    }

    public mca d(Enum<?> r2) {
        return this.c[r2.ordinal()];
    }
}
