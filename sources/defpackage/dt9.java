package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SaveAddressInteractor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ldt9;", "Lox1;", "Lw6;", "address", "Lwx;", c.a, "Lx42;", "a", "Lx42;", "customerAddressService", "<init>", "(Lx42;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dt9  reason: default package */
/* loaded from: classes4.dex */
public final class dt9 implements ox1 {
    private final x42 a;

    /* compiled from: SaveAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addressform.SaveAddressInteractor$saveAddress$1", f = "SaveAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dt9$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super w6>, Object> {
        int a;
        final /* synthetic */ w6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w6 w6Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = w6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super w6> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return dt9.this.a.e(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public dt9(x42 x42Var) {
        z65.h(x42Var, "customerAddressService");
        this.a = x42Var;
    }

    public <T> wx<T> b(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<w6> c(w6 w6Var) {
        z65.h(w6Var, "address");
        return b(new a(w6Var, null));
    }
}
