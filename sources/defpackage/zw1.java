package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CornerBasedShape.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJE\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lzw1;", "Ltga;", "Lcna;", "size", "Lqm5;", "layoutDirection", "La03;", "density", "Ljm7;", "a", "(JLqm5;La03;)Ljm7;", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "b", "(JFFFFLqm5;)Ljm7;", "Lex1;", "Lex1;", "f", "()Lex1;", e.a, c.a, DateTokenConverter.CONVERTER_KEY, "<init>", "(Lex1;Lex1;Lex1;Lex1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zw1  reason: default package */
/* loaded from: classes.dex */
public abstract class zw1 implements tga {
    private final ex1 a;
    private final ex1 b;
    private final ex1 c;
    private final ex1 d;

    public zw1(ex1 ex1Var, ex1 ex1Var2, ex1 ex1Var3, ex1 ex1Var4) {
        z65.h(ex1Var, "topStart");
        z65.h(ex1Var2, "topEnd");
        z65.h(ex1Var3, "bottomEnd");
        z65.h(ex1Var4, "bottomStart");
        this.a = ex1Var;
        this.b = ex1Var2;
        this.c = ex1Var3;
        this.d = ex1Var4;
    }

    @Override // defpackage.tga
    public final jm7 a(long j, qm5 qm5Var, a03 a03Var) {
        z65.h(qm5Var, "layoutDirection");
        z65.h(a03Var, "density");
        float a = this.a.a(j, a03Var);
        float a2 = this.b.a(j, a03Var);
        float a3 = this.c.a(j, a03Var);
        float a4 = this.d.a(j, a03Var);
        float h = cna.h(j);
        float f = a + a4;
        if (f > h) {
            float f2 = h / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a4;
        float f4 = a2 + a3;
        if (f4 > h) {
            float f5 = h / f4;
            a2 *= f5;
            a3 *= f5;
        }
        if (a >= 0.0f && a2 >= 0.0f && a3 >= 0.0f && f3 >= 0.0f) {
            return b(j, a, a2, a3, f3, qm5Var);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    public abstract jm7 b(long j, float f, float f2, float f3, float f4, qm5 qm5Var);

    public final ex1 c() {
        return this.c;
    }

    public final ex1 d() {
        return this.d;
    }

    public final ex1 e() {
        return this.b;
    }

    public final ex1 f() {
        return this.a;
    }
}
