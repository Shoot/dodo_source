package defpackage;

import kotlin.Metadata;
/* compiled from: CornerSize.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\" \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Li73;", "size", "Lex1;", "b", "(F)Lex1;", "", "percent", "a", "Lex1;", "getZeroCornerSize", "()Lex1;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fx1  reason: default package */
/* loaded from: classes.dex */
public final class fx1 {
    private static final ex1 a = new a();

    /* compiled from: CornerSize.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"fx1$a", "Lex1;", "", "Lcna;", "shapeSize", "La03;", "density", "", "a", "(JLa03;)F", "", "toString", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fx1$a */
    /* loaded from: classes.dex */
    public static final class a implements ex1 {
        a() {
        }

        @Override // defpackage.ex1
        public float a(long j, a03 a03Var) {
            z65.h(a03Var, "density");
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final ex1 a(int i) {
        return new vx7(i);
    }

    public static final ex1 b(float f) {
        return new j73(f, null);
    }
}
