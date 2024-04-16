package defpackage;

import defpackage.kl8;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SpecialOfferDialogInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lkra;", "Ljra;", "Lox1;", "", "menuItemId", "Lwx;", "Lqd6;", "a", "categoryId", "", "b", "Lah6;", "Lah6;", "menuService", "<init>", "(Lah6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kra  reason: default package */
/* loaded from: classes2.dex */
public final class kra implements jra, ox1 {
    private final ah6 a;

    /* compiled from: SpecialOfferDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lqd6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.SpecialOfferDialogInteractorImpl$findMenuItem$1", f = "SpecialOfferDialogInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kra$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super qd6>, Object> {
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
        public final Object invoke(cv1<? super qd6> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return kra.this.a.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SpecialOfferDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.SpecialOfferDialogInteractorImpl$isCategoryAvailable$1", f = "SpecialOfferDialogInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kra$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ kra c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kra kraVar, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.b = str;
            this.c = kraVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(this.c.a.l().contains(kl8.a.a.b(this.b)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public kra(ah6 ah6Var) {
        z65.h(ah6Var, "menuService");
        this.a = ah6Var;
    }

    @Override // defpackage.jra
    public wx<qd6> a(String str) {
        z65.h(str, "menuItemId");
        return d(new a(str, null));
    }

    @Override // defpackage.jra
    public wx<Boolean> b(String str) {
        z65.h(str, "categoryId");
        return d(new b(str, this, null));
    }

    public <T> wx<T> d(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
