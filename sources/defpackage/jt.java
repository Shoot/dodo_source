package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.gu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AssistantGeneratorInteractor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0016"}, d2 = {"Ljt;", "", "Lst;", DateTokenConverter.CONVERTER_KEY, "(Lcv1;)Ljava/lang/Object;", "Let;", "a", "Let;", "data", "Leu;", "b", "Leu;", "generatorService", "Lhq3;", c.a, "Lhq3;", "featureService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Let;Leu;Lhq3;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jt  reason: default package */
/* loaded from: classes2.dex */
public final class jt {
    private final et a;
    private final eu b;
    private final hq3 c;
    private final kx1 d;

    /* compiled from: AssistantGeneratorInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lst;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorInteractor$generate$2", f = "AssistantGeneratorInteractor.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: jt$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super st>, Object> {
        Object a;
        int b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super st> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            gu guVar;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                    guVar = (gu) this.a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                gu b = jt.this.a.b();
                boolean a = jt.this.c.a(bq3.j6);
                eu euVar = jt.this.b;
                this.a = b;
                this.b = 1;
                Object a2 = euVar.a(b, a, this);
                if (a2 == d) {
                    return d;
                }
                guVar = b;
                obj = a2;
            }
            return new st(jt.this.a.b() instanceof gu.b, jt.this.a.c(), guVar.C(), jt.this.a.a(), guVar, (nt) obj);
        }
    }

    public jt(et etVar, eu euVar, hq3 hq3Var, kx1 kx1Var) {
        z65.h(etVar, "data");
        z65.h(euVar, "generatorService");
        z65.h(hq3Var, "featureService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = etVar;
        this.b = euVar;
        this.c = hq3Var;
        this.d = kx1Var;
    }

    public final Object d(cv1<? super st> cv1Var) {
        return qh0.g(this.d, new a(null), cv1Var);
    }
}
