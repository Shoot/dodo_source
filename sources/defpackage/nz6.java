package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.i;
/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u000f\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a$\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsm6$b;", StatisticManager.PREV, StatisticManager.NEXT, "", DateTokenConverter.CONVERTER_KEY, "Lsm6$c;", "T", "Lfn6;", "node", "", "f", "Lsm6;", "Lgr6;", "result", e.a, "nz6$a", "a", "Lnz6$a;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: nz6 */
/* loaded from: classes.dex */
public final class nz6 {
    private static final a a;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"nz6$a", "Lsm6$c;", "", "toString", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: nz6$a */
    /* loaded from: classes.dex */
    public static final class a extends sm6.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsm6$b;", "it", "", "a", "(Lsm6$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: nz6$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<sm6.b, Boolean> {
        final /* synthetic */ gr6<sm6.b> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gr6<sm6.b> gr6Var) {
            super(1);
            this.a = gr6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(sm6.b bVar) {
            z65.h(bVar, "it");
            this.a.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.V0(-1);
        a = aVar;
    }

    public static final /* synthetic */ gr6 a(sm6 sm6Var, gr6 gr6Var) {
        return e(sm6Var, gr6Var);
    }

    public static final /* synthetic */ a b() {
        return a;
    }

    public static final /* synthetic */ void c(fn6 fn6Var, sm6.c cVar) {
        f(fn6Var, cVar);
    }

    public static final int d(sm6.b bVar, sm6.b bVar2) {
        z65.h(bVar, StatisticManager.PREV);
        z65.h(bVar2, StatisticManager.NEXT);
        if (z65.c(bVar, bVar2)) {
            return 2;
        }
        if (g6.a(bVar, bVar2)) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gr6<sm6.b> e(sm6 sm6Var, gr6<sm6.b> gr6Var) {
        int e;
        e = i.e(gr6Var.s(), 16);
        gr6 gr6Var2 = new gr6(new sm6[e], 0);
        gr6Var2.b(sm6Var);
        while (gr6Var2.v()) {
            sm6 sm6Var2 = (sm6) gr6Var2.z(gr6Var2.s() - 1);
            if (sm6Var2 instanceof wf1) {
                wf1 wf1Var = (wf1) sm6Var2;
                gr6Var2.b(wf1Var.o());
                gr6Var2.b(wf1Var.s());
            } else if (sm6Var2 instanceof sm6.b) {
                gr6Var.b(sm6Var2);
            } else {
                sm6Var2.i(new b(gr6Var));
            }
        }
        return gr6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends sm6.c> void f(fn6<T> fn6Var, sm6.c cVar) {
        z65.f(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        fn6Var.s(cVar);
    }
}
