package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lsm6;", "Li73;", "start", "top", "end", "bottom", com.huawei.hms.opendevice.c.a, "(Lsm6;FFFF)Lsm6;", "horizontal", "vertical", "a", "(Lsm6;FF)Lsm6;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f, float f2, float f3, float f4) {
            super(1);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$$receiver");
            t45Var.b("padding");
            t45Var.a().b("start", i73.h(this.a));
            t45Var.a().b("top", i73.h(this.b));
            t45Var.a().b("end", i73.h(this.c));
            t45Var.a().b("bottom", i73.h(this.d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017b extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0017b(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$$receiver");
            t45Var.b("padding");
            t45Var.a().b("horizontal", i73.h(this.a));
            t45Var.a().b("vertical", i73.h(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    public static final sm6 a(sm6 sm6Var, float f, float f2) {
        z65.h(sm6Var, "$this$padding");
        return sm6Var.f(new PaddingElement(f, f2, f, f2, true, new C0017b(f, f2), null));
    }

    public static /* synthetic */ sm6 b(sm6 sm6Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = i73.o(0);
        }
        if ((i & 2) != 0) {
            f2 = i73.o(0);
        }
        return a(sm6Var, f, f2);
    }

    public static final sm6 c(sm6 sm6Var, float f, float f2, float f3, float f4) {
        z65.h(sm6Var, "$this$padding");
        return sm6Var.f(new PaddingElement(f, f2, f3, f4, true, new a(f, f2, f3, f4), null));
    }

    public static /* synthetic */ sm6 d(sm6 sm6Var, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = i73.o(0);
        }
        if ((i & 2) != 0) {
            f2 = i73.o(0);
        }
        if ((i & 4) != 0) {
            f3 = i73.o(0);
        }
        if ((i & 8) != 0) {
            f4 = i73.o(0);
        }
        return c(sm6Var, f, f2, f3, f4);
    }
}
