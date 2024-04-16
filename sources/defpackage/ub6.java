package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.gb8;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: MeasureScope.kt */
/* renamed from: ub6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ub6 {

    /* compiled from: MeasureScope.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"ub6$a", "Ltb6;", "", "a", "", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lhb;", c.a, "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "alignmentLines", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ub6$a */
    /* loaded from: classes.dex */
    public static final class a implements tb6 {
        private final int a;
        private final int b;
        private final Map<hb, Integer> c;
        final /* synthetic */ int d;
        final /* synthetic */ vb6 e;
        final /* synthetic */ Function1<gb8.a, Unit> f;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i, int i2, Map<hb, Integer> map, vb6 vb6Var, Function1<? super gb8.a, Unit> function1) {
            this.d = i;
            this.e = vb6Var;
            this.f = function1;
            this.a = i;
            this.b = i2;
            this.c = map;
        }

        @Override // defpackage.tb6
        public void a() {
            sy5 sy5Var;
            om5 om5Var;
            int l;
            qm5 k;
            jn5 jn5Var;
            boolean A;
            gb8.a.C0324a c0324a = gb8.a.a;
            int i = this.d;
            qm5 layoutDirection = this.e.getLayoutDirection();
            vb6 vb6Var = this.e;
            if (vb6Var instanceof sy5) {
                sy5Var = (sy5) vb6Var;
            } else {
                sy5Var = null;
            }
            Function1<gb8.a, Unit> function1 = this.f;
            om5Var = gb8.a.d;
            l = c0324a.l();
            k = c0324a.k();
            jn5Var = gb8.a.e;
            gb8.a.c = i;
            gb8.a.b = layoutDirection;
            A = c0324a.A(sy5Var);
            function1.invoke(c0324a);
            if (sy5Var != null) {
                sy5Var.T0(A);
            }
            gb8.a.c = l;
            gb8.a.b = k;
            gb8.a.d = om5Var;
            gb8.a.e = jn5Var;
        }

        @Override // defpackage.tb6
        public Map<hb, Integer> d() {
            return this.c;
        }

        @Override // defpackage.tb6
        public int getHeight() {
            return this.b;
        }

        @Override // defpackage.tb6
        public int getWidth() {
            return this.a;
        }
    }

    public static tb6 a(vb6 vb6Var, int i, int i2, Map map, Function1 function1) {
        z65.h(map, "alignmentLines");
        z65.h(function1, "placementBlock");
        return new a(i, i2, map, vb6Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ tb6 b(vb6 vb6Var, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = g86.h();
            }
            return vb6Var.d0(i, i2, map, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }
}
