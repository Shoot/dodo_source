package defpackage;

import defpackage.jm7;
import kotlin.Metadata;
/* compiled from: RectangleShape.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0006\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0007"}, d2 = {"Ltga;", "a", "Ltga;", "()Ltga;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: s99  reason: default package */
/* loaded from: classes.dex */
public final class s99 {
    private static final tga a = new a();

    /* compiled from: RectangleShape.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"s99$a", "Ltga;", "Lcna;", "size", "Lqm5;", "layoutDirection", "La03;", "density", "Ljm7$b;", "b", "(JLqm5;La03;)Ljm7$b;", "", "toString", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: s99$a */
    /* loaded from: classes.dex */
    public static final class a implements tga {
        a() {
        }

        @Override // defpackage.tga
        /* renamed from: b */
        public jm7.b a(long j, qm5 qm5Var, a03 a03Var) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(a03Var, "density");
            return new jm7.b(ina.c(j));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final tga a() {
        return a;
    }
}
