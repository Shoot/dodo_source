package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PizzeriaSuggestionInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\b\b\u0001\u0010,\u001a\u00020)¢\u0006\u0004\b3\u00104J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lm98;", "", "", "Lb68;", "n", "Lov5;", "userLocation", "", "address", "Ly98;", Image.TYPE_MEDIUM, "(Lov5;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Ls88;", "pizzeriaFilterVO", "", "k", "l", "Li98;", "a", "Li98;", "data", "Le98;", "b", "Le98;", "pizzeriaService", "Lla8;", c.a, "Lla8;", "pizzeriasFilterService", "Lx88;", DateTokenConverter.CONVERTER_KEY, "Lx88;", "pizzeriaMapper", "Lgc;", e.a, "Lgc;", "analytics", "Lhq3;", "f", "Lhq3;", "featureService", "Lkx1;", "g", "Lkx1;", "ioDispatcher", Image.TYPE_HIGH, "Ljava/util/List;", "pizzerias", "i", "Ljava/lang/String;", "lookingAddress", "<init>", "(Li98;Le98;Lla8;Lx88;Lgc;Lhq3;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m98  reason: default package */
/* loaded from: classes2.dex */
public final class m98 {
    private final i98 a;
    private final e98 b;
    private final la8 c;
    private final x88 d;
    private final gc e;
    private final hq3 f;
    private final kx1 g;
    private List<b68> h;
    private String i;

    /* compiled from: PizzeriaSuggestionInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ly98;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.pizzeriasuggestions.presentation.PizzeriaSuggestionInteractor$getPizzerias$2", f = "PizzeriaSuggestionInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: m98$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super y98>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ ov5 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ov5 ov5Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = ov5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super y98> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            List<b68> a;
            List l;
            List list;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                m98 m98Var = m98.this;
                String str = this.c;
                if (str == null) {
                    str = m98Var.i;
                }
                m98Var.i = str;
                m98 m98Var2 = m98.this;
                if (!m98Var2.h.isEmpty()) {
                    x88 x88Var = m98.this.d;
                    List<b68> list2 = m98.this.h;
                    w = lc1.w(list2, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (b68 b68Var : list2) {
                        arrayList.add(b68Var.g());
                    }
                    a = x88Var.a(arrayList, this.d, null);
                } else {
                    if (m98.this.f.a(bq3.F6)) {
                        list = m98.this.b.getPizzeriasInCountry(m98.this.a.b());
                    } else if (m98.this.a.d() == null) {
                        l = kc1.l();
                        list = l;
                    } else {
                        list = m98.this.b.c(m98.this.a.d());
                    }
                    a = m98.this.d.a(list, this.d, null);
                }
                m98Var2.h = a;
                List n = m98.this.i.length() > 0 ? m98.this.n() : m98.this.h;
                return new y98(m98.this.c.c(n), m98.this.c.e(n), m98.this.i);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m98(i98 i98Var, e98 e98Var, la8 la8Var, x88 x88Var, gc gcVar, hq3 hq3Var, kx1 kx1Var) {
        List<b68> l;
        z65.h(i98Var, "data");
        z65.h(e98Var, "pizzeriaService");
        z65.h(la8Var, "pizzeriasFilterService");
        z65.h(x88Var, "pizzeriaMapper");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = i98Var;
        this.b = e98Var;
        this.c = la8Var;
        this.d = x88Var;
        this.e = gcVar;
        this.f = hq3Var;
        this.g = kx1Var;
        l = kc1.l();
        this.h = l;
        this.i = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<b68> n() {
        boolean O;
        String lowerCase = new ec9("[, .]").i(this.i, "").toLowerCase(Locale.ROOT);
        z65.g(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.h) {
            String lowerCase2 = new ec9("[, .]").i(((b68) obj).g().q(), "").toLowerCase(Locale.ROOT);
            z65.g(lowerCase2, "toLowerCase(...)");
            O = m0b.O(lowerCase2, lowerCase, false, 2, null);
            if (O) {
                arrayList.add(obj);
            }
        }
        this.e.a(c7a.a.h(this.i, String.valueOf(arrayList.size())));
        return arrayList;
    }

    public final void k(s88 s88Var) {
        z65.h(s88Var, "pizzeriaFilterVO");
        if (s88Var.b()) {
            this.c.d(s88Var.a());
        } else {
            this.c.f(s88Var.a());
        }
    }

    public final void l() {
        this.c.b();
    }

    public final Object m(ov5 ov5Var, String str, cv1<? super y98> cv1Var) {
        return qh0.g(this.g, new a(str, ov5Var, null), cv1Var);
    }
}
