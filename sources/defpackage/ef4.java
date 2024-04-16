package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: GetNumberCanceledOrderInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lef4;", "Lox1;", "Loz3;", "", c.a, "Lvc6;", "a", "Lvc6;", "memoryDataSource", "<init>", "(Lvc6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ef4  reason: default package */
/* loaded from: classes4.dex */
public final class ef4 implements ox1 {
    private final vc6 a;

    /* compiled from: GetNumberCanceledOrderInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ef4$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<oz3<? extends Integer>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<Integer> invoke() {
            return ef4.this.a.b();
        }
    }

    /* compiled from: GetNumberCanceledOrderInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.GetNumberCanceledOrderInteractor$getNumberCanceledOrder$2", f = "GetNumberCanceledOrderInteractor.kt", l = {15}, m = "invokeSuspend")
    /* renamed from: ef4$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((b) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                this.a = 1;
                if (xt2.a(50L, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public ef4(vc6 vc6Var) {
        z65.h(vc6Var, "memoryDataSource");
        this.a = vc6Var;
    }

    public <T> oz3<T> b(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    public final oz3<Integer> c() {
        return wz3.F(b(new a()), new b(null));
    }
}
