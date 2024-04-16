package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.fda;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ReferralSystemInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, d2 = {"Lqb9;", "", "Lac9;", e.a, "(Lcv1;)Ljava/lang/Object;", "", "Lsa9;", DateTokenConverter.CONVERTER_KEY, "Lx26;", "a", "Lx26;", "loyaltyService", "Lfda;", "b", "Lfda;", "serverDateTimeParser", "Lkx1;", c.a, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lx26;Lfda;Lkx1;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qb9  reason: default package */
/* loaded from: classes2.dex */
public final class qb9 {
    private final x26 a;
    private final fda b;
    private final kx1 c;
    private final Logger d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "Lsa9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemInteractor$getReferrerHistory$2", f = "ReferralSystemInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qb9$a */
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super List<? extends sa9>>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super List<sa9>> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List<ra9> l;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    l = qb9.this.a.getReferrerHistory();
                } catch (Exception e) {
                    qb9.this.d.error("Can`t load referrer history", (Throwable) e);
                    l = kc1.l();
                }
                List<ra9> list = l;
                qb9 qb9Var = qb9.this;
                w = lc1.w(list, 10);
                ArrayList arrayList = new ArrayList(w);
                for (ra9 ra9Var : list) {
                    arrayList.add(new sa9(ra9Var.b(), fda.a.a(qb9Var.b, ra9Var.a(), null, 2, null)));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super List<? extends sa9>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super List<sa9>>) cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReferralSystemInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lac9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.referralsystem.ReferralSystemInteractor$getReferrerInfo$2", f = "ReferralSystemInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qb9$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super ac9>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ac9> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return qb9.this.a.getReferrerInfo();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public qb9(x26 x26Var, fda fdaVar, kx1 kx1Var) {
        z65.h(x26Var, "loyaltyService");
        z65.h(fdaVar, "serverDateTimeParser");
        z65.h(kx1Var, "ioDispatcher");
        this.a = x26Var;
        this.b = fdaVar;
        this.c = kx1Var;
        this.d = LoggerFactory.getLogger("ReferralSystemInteractor");
    }

    public final Object d(cv1<? super List<sa9>> cv1Var) {
        return qh0.g(this.c, new a(null), cv1Var);
    }

    public final Object e(cv1<? super ac9> cv1Var) {
        return qh0.g(this.c, new b(null), cv1Var);
    }
}
