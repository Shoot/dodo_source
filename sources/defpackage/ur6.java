package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MysteryShopperCardInteractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lur6;", "", "", "orderId", "Loz3;", "Las6;", "b", "Les6;", "a", "Les6;", "mysteryShopperCheckupService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Les6;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ur6  reason: default package */
/* loaded from: classes.dex */
public final class ur6 {
    private final es6 a;
    private final kx1 b;

    /* compiled from: MysteryShopperCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Las6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.mysteryshoppercard.presentation.MysteryShopperCardInteractor$observeMysteryShopperCheckup$1", f = "MysteryShopperCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ur6$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super as6>, Object> {
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
        public final Object invoke(cv1<? super as6> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return ur6.this.a.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ur6(es6 es6Var, kx1 kx1Var) {
        z65.h(es6Var, "mysteryShopperCheckupService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = es6Var;
        this.b = kx1Var;
    }

    public final oz3<as6> b(String str) {
        long j;
        z65.h(str, "orderId");
        uz3 uz3Var = uz3.a;
        j = vr6.a;
        return wz3.B(uz3Var.d(j, new a(str, null)), this.b);
    }

    public /* synthetic */ ur6(es6 es6Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(es6Var, (i & 2) != 0 ? v33.b() : kx1Var);
    }
}
