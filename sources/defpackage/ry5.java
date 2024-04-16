package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: LayoutNodeAlignmentLines.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J!\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lry5;", "Ljb;", "Loz6;", "Lhb;", "alignmentLine", "", "i", "Ls67;", "position", DateTokenConverter.CONVERTER_KEY, "(Loz6;J)J", "", e.a, "(Loz6;)Ljava/util/Map;", "alignmentLinesMap", "Lkb;", "alignmentLinesOwner", "<init>", "(Lkb;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ry5  reason: default package */
/* loaded from: classes.dex */
public final class ry5 extends jb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry5(kb kbVar) {
        super(kbVar, null);
        z65.h(kbVar, "alignmentLinesOwner");
    }

    @Override // defpackage.jb
    protected long d(oz6 oz6Var, long j) {
        z65.h(oz6Var, "$this$calculatePositionInParent");
        ty5 v1 = oz6Var.v1();
        z65.e(v1);
        long O0 = v1.O0();
        return s67.q(x67.a(s55.h(O0), s55.i(O0)), j);
    }

    @Override // defpackage.jb
    protected Map<hb, Integer> e(oz6 oz6Var) {
        z65.h(oz6Var, "<this>");
        ty5 v1 = oz6Var.v1();
        z65.e(v1);
        return v1.M0().d();
    }

    @Override // defpackage.jb
    protected int i(oz6 oz6Var, hb hbVar) {
        z65.h(oz6Var, "<this>");
        z65.h(hbVar, "alignmentLine");
        ty5 v1 = oz6Var.v1();
        z65.e(v1);
        return v1.H0(hbVar);
    }
}
