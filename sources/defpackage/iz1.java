package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CourierTipsCardInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Liz1;", "", "", "orderId", "Lsz1;", c.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Ltz1;", "a", "Ltz1;", "courierTipsService", "Lpz1;", "b", "Lpz1;", "courierTipsFeatureState", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Ltz1;Lpz1;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iz1  reason: default package */
/* loaded from: classes.dex */
public final class iz1 {
    private final tz1 a;
    private final pz1 b;
    private final kx1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsCardInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lsz1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardInteractor$getCourierTips$2", f = "CourierTipsCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: iz1$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super sz1>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super sz1> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (qz1.a(iz1.this.b)) {
                    return iz1.this.a.a(this.c);
                }
                return sz1.f.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public iz1(tz1 tz1Var, pz1 pz1Var, kx1 kx1Var) {
        z65.h(tz1Var, "courierTipsService");
        z65.h(pz1Var, "courierTipsFeatureState");
        z65.h(kx1Var, "ioDispatcher");
        this.a = tz1Var;
        this.b = pz1Var;
        this.c = kx1Var;
    }

    public final Object c(String str, cv1<? super sz1> cv1Var) {
        return qh0.g(this.c, new a(str, null), cv1Var);
    }

    public /* synthetic */ iz1(tz1 tz1Var, pz1 pz1Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tz1Var, pz1Var, (i & 4) != 0 ? v33.b() : kx1Var);
    }
}
