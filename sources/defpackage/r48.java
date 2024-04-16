package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: PhonePrefixListInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lr48;", "Lox1;", "Lwx;", "", "Lj48;", c.a, "Lz48;", "a", "Lz48;", "phonePrefixService", "<init>", "(Lz48;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: r48  reason: default package */
/* loaded from: classes4.dex */
public final class r48 implements ox1 {
    private final z48 a;

    /* compiled from: PhonePrefixListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lj48;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListInteractor$getPhonePrefixes$1", f = "PhonePrefixListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r48$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends j48>>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<j48>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return r48.this.a.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public r48(z48 z48Var) {
        z65.h(z48Var, "phonePrefixService");
        this.a = z48Var;
    }

    public <T> wx<T> b(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<List<j48>> c() {
        return b(new a(null));
    }
}
