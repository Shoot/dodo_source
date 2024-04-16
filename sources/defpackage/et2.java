package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeferredTimeInteractor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\b\b\u0002\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Let2;", "Lox1;", "Ldt2;", "", "isCarryoutOrRestaurant", "Los2;", "a", "(ZLcv1;)Ljava/lang/Object;", "Lnt2;", "Lnt2;", "deferredTimeService", "Lvs2;", "b", "Lvs2;", "deferredTimeFormatter", "Lpt2;", c.a, "Lpt2;", "selectedDeferredTimeState", "", DateTokenConverter.CONVERTER_KEY, "I", "expectedMinutesToReceiveForASAP", "Lhq3;", e.a, "Lhq3;", "featureService", "Lx51;", "f", "Lx51;", "checkoutService", "Lf8c;", "g", "Lf8c;", "workflowIdProvider", "Lps2;", Image.TYPE_HIGH, "Lps2;", "deferredIntervalsVoConverter", "Lkx1;", "i", "Lkx1;", "ioDispatcher", "<init>", "(Lnt2;Lvs2;Lpt2;ILhq3;Lx51;Lf8c;Lps2;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: et2  reason: default package */
/* loaded from: classes4.dex */
public final class et2 implements ox1, dt2 {
    private final nt2 a;
    private final vs2 b;
    private final pt2 c;
    private final int d;
    private final hq3 e;
    private final x51 f;
    private final f8c g;
    private final ps2 h;
    private final kx1 i;

    /* compiled from: DeferredTimeInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Los2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.deferredtime.DeferredTimeInteractorImpl$loadDeferredIntervals$2", f = "DeferredTimeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: et2$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super os2>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super os2> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                os2 a = et2.this.h.a(et2.this.f.e(et2.this.g.b(), this.c).b());
                List<ms2> d = a.d();
                et2 et2Var = et2.this;
                w = lc1.w(d, 10);
                ArrayList arrayList = new ArrayList(w);
                for (ms2 ms2Var : d) {
                    arrayList.add(ms2.b(ms2Var, null, null, null, false, false, z65.c(ms2Var.d(), et2Var.c.a()), 31, null));
                }
                return os2.b(a, null, arrayList, 1, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public et2(nt2 nt2Var, vs2 vs2Var, pt2 pt2Var, int i, hq3 hq3Var, x51 x51Var, f8c f8cVar, ps2 ps2Var, kx1 kx1Var) {
        z65.h(nt2Var, "deferredTimeService");
        z65.h(vs2Var, "deferredTimeFormatter");
        z65.h(pt2Var, "selectedDeferredTimeState");
        z65.h(hq3Var, "featureService");
        z65.h(x51Var, "checkoutService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(ps2Var, "deferredIntervalsVoConverter");
        z65.h(kx1Var, "ioDispatcher");
        this.a = nt2Var;
        this.b = vs2Var;
        this.c = pt2Var;
        this.d = i;
        this.e = hq3Var;
        this.f = x51Var;
        this.g = f8cVar;
        this.h = ps2Var;
        this.i = kx1Var;
    }

    @Override // defpackage.dt2
    public Object a(boolean z, cv1<? super os2> cv1Var) {
        return qh0.g(this.i, new a(z, null), cv1Var);
    }

    public /* synthetic */ et2(nt2 nt2Var, vs2 vs2Var, pt2 pt2Var, int i, hq3 hq3Var, x51 x51Var, f8c f8cVar, ps2 ps2Var, kx1 kx1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nt2Var, vs2Var, pt2Var, i, hq3Var, x51Var, f8cVar, ps2Var, (i2 & 256) != 0 ? v33.b() : kx1Var);
    }
}
