package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ij6;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MultiParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0002J#\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016Ja\u0010'\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u001f\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u0010\u001f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R$\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00101R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00103R.\u0010;\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b8\u00109\"\u0004\b0\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010.R\u0016\u0010H\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010.R\u0011\u0010J\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010IR\u0013\u0010K\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b)\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006N"}, d2 = {"Lvp6;", "", "Lqm5;", "layoutDirection", "Lnr1;", "finalConstraints", "Lrp6;", "multiParagraph", "Lbcb;", "i", "(Lqm5;JLrp6;)Lbcb;", "Lsp6;", Image.TYPE_HIGH, "constraints", c.a, "(JLqm5;)Lrp6;", "", "f", "(Lbcb;JLqm5;)Z", "", e.a, DateTokenConverter.CONVERTER_KEY, "(JLqm5;)Z", "Lml;", "text", "Lrcb;", "style", "Lw24$b;", "fontFamilyResolver", "Lgcb;", "overflow", "softWrap", "", "maxLines", "minLines", "", "Lml$a;", "Ljb8;", "placeholders", "j", "(Lml;Lrcb;Lw24$b;IZIILjava/util/List;)V", "a", "Lml;", "b", "Lrcb;", "Lw24$b;", "I", "Z", "g", "Ljava/util/List;", "Lij6;", "Lij6;", "mMinLinesConstrainer", "La03;", "value", "La03;", "getDensity$foundation_release", "()La03;", "(La03;)V", "density", "k", "Lsp6;", "paragraphIntrinsics", "l", "Lqm5;", "intrinsicsLayoutDirection", Image.TYPE_MEDIUM, "Lbcb;", "layoutCache", "n", "cachedIntrinsicHeightInputWidth", "o", "cachedIntrinsicHeight", "()Lbcb;", "textLayoutResult", "layoutOrNull", "<init>", "(Lml;Lrcb;Lw24$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vp6  reason: default package */
/* loaded from: classes.dex */
public final class vp6 {
    private ml a;
    private rcb b;
    private w24.b c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private List<ml.a<jb8>> h;
    private ij6 i;
    private a03 j;
    private sp6 k;
    private qm5 l;
    private bcb m;
    private int n;
    private int o;

    public /* synthetic */ vp6(ml mlVar, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, rcbVar, bVar, i, z, i2, i3, list);
    }

    private final rp6 c(long j, qm5 qm5Var) {
        sp6 h = h(qm5Var);
        return new rp6(h, mn5.a(j, this.e, this.d, h.b()), mn5.b(this.e, this.d, this.f), gcb.e(this.d, gcb.a.b()), null);
    }

    private final void e() {
        this.k = null;
        this.m = null;
    }

    private final boolean f(bcb bcbVar, long j, qm5 qm5Var) {
        if (bcbVar == null || bcbVar.o().f().a() || qm5Var != bcbVar.g().b()) {
            return true;
        }
        if (nr1.g(j, bcbVar.g().a())) {
            return false;
        }
        if (nr1.n(j) != nr1.n(bcbVar.g().a()) || nr1.m(j) < bcbVar.o().e() || bcbVar.o().c()) {
            return true;
        }
        return false;
    }

    private final sp6 h(qm5 qm5Var) {
        sp6 sp6Var = this.k;
        if (sp6Var == null || qm5Var != this.l || sp6Var.a()) {
            this.l = qm5Var;
            ml mlVar = this.a;
            rcb c = tcb.c(this.b, qm5Var);
            a03 a03Var = this.j;
            z65.e(a03Var);
            w24.b bVar = this.c;
            List<ml.a<jb8>> list = this.h;
            if (list == null) {
                list = kc1.l();
            }
            sp6Var = new sp6(mlVar, c, list, a03Var, bVar);
        }
        this.k = sp6Var;
        return sp6Var;
    }

    private final bcb i(qm5 qm5Var, long j, rp6 rp6Var) {
        ml mlVar = this.a;
        rcb rcbVar = this.b;
        List<ml.a<jb8>> list = this.h;
        if (list == null) {
            list = kc1.l();
        }
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        a03 a03Var = this.j;
        z65.e(a03Var);
        return new bcb(new zbb(mlVar, rcbVar, list, i, z, i2, a03Var, qm5Var, this.c, j, (DefaultConstructorMarker) null), rp6Var, qr1.d(j, x55.a(nab.a(rp6Var.r()), nab.a(rp6Var.e()))), null);
    }

    public final bcb a() {
        return this.m;
    }

    public final bcb b() {
        bcb bcbVar = this.m;
        if (bcbVar != null) {
            return bcbVar;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final boolean d(long j, qm5 qm5Var) {
        z65.h(qm5Var, "layoutDirection");
        if (this.g > 1) {
            ij6.a aVar = ij6.h;
            ij6 ij6Var = this.i;
            rcb rcbVar = this.b;
            a03 a03Var = this.j;
            z65.e(a03Var);
            ij6 a = aVar.a(ij6Var, qm5Var, rcbVar, a03Var, this.c);
            this.i = a;
            j = a.c(j, this.g);
        }
        if (!f(this.m, j, qm5Var)) {
            bcb bcbVar = this.m;
            z65.e(bcbVar);
            if (nr1.g(j, bcbVar.g().a())) {
                return false;
            }
            bcb bcbVar2 = this.m;
            z65.e(bcbVar2);
            this.m = i(qm5Var, j, bcbVar2.o());
            return true;
        }
        this.m = i(qm5Var, j, c(j, qm5Var));
        return true;
    }

    public final void g(a03 a03Var) {
        a03 a03Var2 = this.j;
        if (a03Var2 == null) {
            this.j = a03Var;
        } else if (a03Var == null) {
            this.j = a03Var;
            e();
        } else if (a03Var2.getDensity() != a03Var.getDensity() || a03Var2.k0() != a03Var.k0()) {
            this.j = a03Var;
            e();
        }
    }

    public final void j(ml mlVar, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, List<ml.a<jb8>> list) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.a = mlVar;
        this.b = rcbVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        e();
    }

    private vp6(ml mlVar, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, List<ml.a<jb8>> list) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.a = mlVar;
        this.b = rcbVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = list;
        this.n = -1;
        this.o = -1;
    }
}
