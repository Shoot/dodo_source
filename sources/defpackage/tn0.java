package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls73;", "Lc83;", c.a, "La03;", "a", "La03;", "DefaultDensity", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tn0  reason: default package */
/* loaded from: classes.dex */
public final class tn0 {
    private static final a03 a = c03.a(1.0f, 1.0f);

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J%\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J-\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e"}, d2 = {"tn0$a", "Lc83;", "", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "", e.a, "Lor7;", "path", "Lp91;", "clipOp", "b", "(Lor7;I)V", "a", "scaleX", "scaleY", "Ls67;", "pivot", DateTokenConverter.CONVERTER_KEY, "(FFJ)V", "Loa6;", "matrix", c.a, "([F)V", "Lcna;", "f", "()J", "size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: tn0$a */
    /* loaded from: classes.dex */
    public static final class a implements c83 {
        final /* synthetic */ s73 a;

        a(s73 s73Var) {
            this.a = s73Var;
        }

        @Override // defpackage.c83
        public void a(float f, float f2) {
            this.a.u().a(f, f2);
        }

        @Override // defpackage.c83
        public void b(or7 or7Var, int i) {
            z65.h(or7Var, "path");
            this.a.u().b(or7Var, i);
        }

        @Override // defpackage.c83
        public void c(float[] fArr) {
            z65.h(fArr, "matrix");
            this.a.u().n(fArr);
        }

        @Override // defpackage.c83
        public void d(float f, float f2, long j) {
            qn0 u = this.a.u();
            u.a(s67.l(j), s67.m(j));
            u.c(f, f2);
            u.a(-s67.l(j), -s67.m(j));
        }

        @Override // defpackage.c83
        public void e(float f, float f2, float f3, float f4) {
            qn0 u = this.a.u();
            s73 s73Var = this.a;
            long a = ina.a(cna.i(f()) - (f3 + f), cna.g(f()) - (f4 + f2));
            if (cna.i(a) >= 0.0f && cna.g(a) >= 0.0f) {
                s73Var.v(a);
                u.a(f, f2);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        public long f() {
            return this.a.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c83 c(s73 s73Var) {
        return new a(s73Var);
    }
}
