package defpackage;

import java.util.EnumMap;
import java.util.EnumSet;
/* compiled from: ClassNameIdResolver.java */
/* renamed from: l81  reason: default package */
/* loaded from: classes2.dex */
public class l81 extends tnb {
    protected final se8 c;

    public l81(y85 y85Var, rnb rnbVar, se8 se8Var) {
        super(y85Var, rnbVar);
        this.c = se8Var;
    }

    public static l81 e(y85 y85Var, w76<?> w76Var, se8 se8Var) {
        return new l81(y85Var, w76Var.M(), se8Var);
    }

    @Override // defpackage.snb
    public String a(Object obj) {
        return d(obj, obj.getClass(), this.a);
    }

    @Override // defpackage.snb
    public String c(Object obj, Class<?> cls) {
        return d(obj, cls, this.a);
    }

    protected String d(Object obj, Class<?> cls, rnb rnbVar) {
        if (q81.H(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return rnbVar.H(EnumSet.class, q81.t((EnumSet) obj)).e();
            }
            if (obj instanceof EnumMap) {
                return rnbVar.M(EnumMap.class, q81.s((EnumMap) obj), Object.class).e();
            }
            return name;
        } else if (name.indexOf(36) >= 0 && q81.B(cls) != null && q81.B(this.b.u()) == null) {
            return this.b.u().getName();
        } else {
            return name;
        }
    }
}
