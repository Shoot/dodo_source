package defpackage;

import com.huawei.hms.push.e;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LoyaltyMissionDetailsInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lo16;", "Lox1;", "", "missionId", "userAnswer", "Lwx;", "Lwl6;", e.a, "a", "Lx26;", "Lx26;", "loyaltyService", "Lgc;", "b", "Lgc;", "analytics", "<init>", "(Lx26;Lgc;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o16  reason: default package */
/* loaded from: classes2.dex */
public final class o16 implements ox1 {
    private final x26 a;
    private final gc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lwl6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsInteractor$acceptMission$1", f = "LoyaltyMissionDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: o16$a */
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function1<cv1<? super wl6>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super wl6> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                o16.this.b.a(new p26(this.c, u26.f));
                x06 c = o16.this.a.c(this.c);
                if (c != null) {
                    return c.e();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyMissionDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lwl6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.missions.LoyaltyMissionDetailsInteractor$sendUserAnswer$1", f = "LoyaltyMissionDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: o16$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function1<cv1<? super wl6>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super wl6> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                x06 g = o16.this.a.g(this.c, this.d);
                o16.this.b.a(new v26(this.c));
                if (g != null) {
                    return g.e();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public o16(x26 x26Var, gc gcVar) {
        z65.h(x26Var, "loyaltyService");
        z65.h(gcVar, "analytics");
        this.a = x26Var;
        this.b = gcVar;
    }

    public final wx<wl6> a(String str) {
        z65.h(str, "missionId");
        return d(new a(str, null));
    }

    public <T> wx<T> d(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<wl6> e(String str, String str2) {
        z65.h(str, "missionId");
        z65.h(str2, "userAnswer");
        return d(new b(str, str2, null));
    }
}
