package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.ml;
import defpackage.w24;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectableTextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B²\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010!\u001a\u00020 \u0012\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0007\u0018\u00010$\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u001e\b\u0002\u0010(\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u0017\u0012\u0004\u0012\u00020\u0007\u0018\u00010$\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010+ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\f\u0010\n\u001a\u00020\u0007*\u00020\tH\u0016J)\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J©\u0001\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0007\u0018\u00010$2\u001c\u0010(\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u0017\u0012\u0004\u0012\u00020\u0007\u0018\u00010$2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Li9a;", "Lfu2;", "Lzm5;", "Lv73;", "Ljg4;", "Lom5;", MessageAttributes.COORDINATES, "", e.a, "Lit1;", "q", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lml;", "text", "Lrcb;", "style", "", "Lml$a;", "Ljb8;", "placeholders", "", "minLines", "maxLines", "", "softWrap", "Lw24$b;", "fontFamilyResolver", "Lgcb;", "overflow", "Lkotlin/Function1;", "Lbcb;", "onTextLayout", "Lk99;", "onPlaceholderLayout", "Lu9a;", "selectionController", "Lcd1;", RemoteMessageConst.Notification.COLOR, "k1", "(Lml;Lrcb;Ljava/util/List;IIZLw24$b;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lu9a;Lcd1;)V", "Lu9a;", "Leab;", "Leab;", "delegate", "overrideColor", "<init>", "(Lml;Lrcb;Lw24$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Lu9a;Lcd1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: i9a  reason: default package */
/* loaded from: classes.dex */
public final class i9a extends fu2 implements zm5, v73, jg4 {
    private final u9a p;
    private final eab q;

    public /* synthetic */ i9a(ml mlVar, rcb rcbVar, w24.b bVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, u9a u9aVar, cd1 cd1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, u9aVar, cd1Var);
    }

    @Override // defpackage.jg4
    public void e(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        u9a u9aVar = this.p;
        if (u9aVar != null) {
            u9aVar.g(om5Var);
        }
    }

    @Override // defpackage.v73
    public /* synthetic */ void i0() {
        u73.a(this);
    }

    public final void k1(ml mlVar, rcb rcbVar, List<ml.a<jb8>> list, int i, int i2, boolean z, w24.b bVar, int i3, Function1<? super bcb, Unit> function1, Function1<? super List<k99>, Unit> function12, u9a u9aVar, cd1 cd1Var) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        eab eabVar = this.q;
        eabVar.g1(eabVar.m1(cd1Var, rcbVar), this.q.o1(mlVar), this.q.n1(rcbVar, list, i, i2, z, bVar, i3), this.q.l1(function1, function12, u9aVar));
        cn5.b(this);
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        return this.q.k1(vb6Var, mb6Var, j);
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        z65.h(it1Var, "<this>");
        this.q.h1(it1Var);
    }

    private i9a(ml mlVar, rcb rcbVar, w24.b bVar, Function1<? super bcb, Unit> function1, int i, boolean z, int i2, int i3, List<ml.a<jb8>> list, Function1<? super List<k99>, Unit> function12, u9a u9aVar, cd1 cd1Var) {
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.p = u9aVar;
        this.q = (eab) f1(new eab(mlVar, rcbVar, bVar, function1, i, z, i2, i3, list, function12, u9aVar, cd1Var, null));
        if (u9aVar == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }
}
