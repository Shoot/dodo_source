package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: GetCurrentLocalityInfoInteractor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcf4;", "Lox1;", "Lwx;", "Ljt5;", DateTokenConverter.CONVERTER_KEY, "Ljv5;", "a", "Ljv5;", "localityService", "Lrt5;", "b", "Lrt5;", "localityInfoService", "<init>", "(Ljv5;Lrt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cf4  reason: default package */
/* loaded from: classes4.dex */
public final class cf4 implements ox1 {
    private final jv5 a;
    private final rt5 b;

    /* compiled from: GetCurrentLocalityInfoInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljt5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.allpizzerias.GetCurrentLocalityInfoInteractor$getCurrentLocalityInfo$1", f = "GetCurrentLocalityInfoInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cf4$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super jt5>, Object> {
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
        public final Object invoke(cv1<? super jt5> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dt5 i = cf4.this.a.i();
                if (i != null) {
                    return cf4.this.b.a(i);
                }
                throw new IllegalStateException("Couldn't retrieve current locality info");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public cf4(jv5 jv5Var, rt5 rt5Var) {
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        this.a = jv5Var;
        this.b = rt5Var;
    }

    public <T> wx<T> c(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<jt5> d() {
        return c(new a(null));
    }
}
