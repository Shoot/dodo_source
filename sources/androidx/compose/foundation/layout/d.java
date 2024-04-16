package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013\"\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lsm6;", "Li73;", "width", com.huawei.hms.push.e.a, "(Lsm6;F)Lsm6;", "height", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "(Lsm6;FF)Lsm6;", "", "fraction", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "g", "WrapContentHeightTop", Image.TYPE_HIGH, "WrapContentSizeCenter", "i", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d {
    private static final FillElement a;
    private static final FillElement b;
    private static final FillElement c;
    private static final WrapContentElement d;
    private static final WrapContentElement e;
    private static final WrapContentElement f;
    private static final WrapContentElement g;
    private static final WrapContentElement h;
    private static final WrapContentElement i;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f) {
            super(1);
            this.a = f;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("height");
            t45Var.c(i73.h(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2) {
            super(1);
            this.a = f;
            this.b = f2;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("size");
            t45Var.a().b("width", i73.h(this.a));
            t45Var.a().b("height", i73.h(this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f) {
            super(1);
            this.a = f;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("width");
            t45Var.c(i73.h(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    static {
        FillElement.a aVar = FillElement.f;
        a = aVar.c(1.0f);
        b = aVar.a(1.0f);
        c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.h;
        gb.a aVar3 = gb.a;
        d = aVar2.c(aVar3.b(), false);
        e = aVar2.c(aVar3.d(), false);
        f = aVar2.a(aVar3.c(), false);
        g = aVar2.a(aVar3.e(), false);
        h = aVar2.b(aVar3.a(), false);
        i = aVar2.b(aVar3.f(), false);
    }

    public static final sm6 a(sm6 sm6Var, float f2) {
        FillElement c2;
        z65.h(sm6Var, "<this>");
        if (f2 == 1.0f) {
            c2 = a;
        } else {
            c2 = FillElement.f.c(f2);
        }
        return sm6Var.f(c2);
    }

    public static /* synthetic */ sm6 b(sm6 sm6Var, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        return a(sm6Var, f2);
    }

    public static final sm6 c(sm6 sm6Var, float f2) {
        Function1 a2;
        z65.h(sm6Var, "$this$height");
        if (r45.c()) {
            a2 = new a(f2);
        } else {
            a2 = r45.a();
        }
        return sm6Var.f(new SizeElement(0.0f, f2, 0.0f, f2, true, a2, 5, null));
    }

    public static final sm6 d(sm6 sm6Var, float f2, float f3) {
        Function1 a2;
        z65.h(sm6Var, "$this$size");
        if (r45.c()) {
            a2 = new b(f2, f3);
        } else {
            a2 = r45.a();
        }
        return sm6Var.f(new SizeElement(f2, f3, f2, f3, true, a2, null));
    }

    public static final sm6 e(sm6 sm6Var, float f2) {
        Function1 a2;
        z65.h(sm6Var, "$this$width");
        if (r45.c()) {
            a2 = new c(f2);
        } else {
            a2 = r45.a();
        }
        return sm6Var.f(new SizeElement(f2, 0.0f, f2, 0.0f, true, a2, 10, null));
    }
}
