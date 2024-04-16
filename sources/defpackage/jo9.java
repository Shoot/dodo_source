package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.jm7;
import kotlin.Metadata;
/* compiled from: RoundedCornerShape.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0016\u0012\u0006\u0010\b\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Ljo9;", "Lzw1;", "Lcna;", "size", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Lqm5;", "layoutDirection", "Ljm7;", "b", "(JFFFFLqm5;)Ljm7;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lex1;", "<init>", "(Lex1;Lex1;Lex1;Lex1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jo9  reason: default package */
/* loaded from: classes.dex */
public final class jo9 extends zw1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo9(ex1 ex1Var, ex1 ex1Var2, ex1 ex1Var3, ex1 ex1Var4) {
        super(ex1Var, ex1Var2, ex1Var3, ex1Var4);
        z65.h(ex1Var, "topStart");
        z65.h(ex1Var2, "topEnd");
        z65.h(ex1Var3, "bottomEnd");
        z65.h(ex1Var4, "bottomStart");
    }

    @Override // defpackage.zw1
    public jm7 b(long j, float f, float f2, float f3, float f4, qm5 qm5Var) {
        float f5;
        float f6;
        float f7;
        float f8;
        z65.h(qm5Var, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            return new jm7.b(ina.c(j));
        }
        k99 c = ina.c(j);
        qm5 qm5Var2 = qm5.Ltr;
        if (qm5Var == qm5Var2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long b = cx1.b(f5, 0.0f, 2, null);
        if (qm5Var == qm5Var2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long b2 = cx1.b(f6, 0.0f, 2, null);
        if (qm5Var == qm5Var2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long b3 = cx1.b(f7, 0.0f, 2, null);
        if (qm5Var == qm5Var2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new jm7.c(ho9.b(c, b, b2, b3, cx1.b(f8, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo9)) {
            return false;
        }
        jo9 jo9Var = (jo9) obj;
        if (z65.c(f(), jo9Var.f()) && z65.c(e(), jo9Var.e()) && z65.c(c(), jo9Var.c()) && z65.c(d(), jo9Var.d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((f().hashCode() * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + d().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + f() + ", topEnd = " + e() + ", bottomEnd = " + c() + ", bottomStart = " + d() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
