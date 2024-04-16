package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.to6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\"<\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00008\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlin/Function3;", "Lqx1;", "Ls67;", "Lcv1;", "", "", "a", "Ly84;", "NoOpOnDragStarted", "Lqx9;", "b", "Lqx9;", "NoOpScrollScope", "Lyr8;", "", com.huawei.hms.opendevice.c.a, "Lyr8;", "()Lyr8;", "ModifierLocalScrollableContainer", "Lto6;", DateTokenConverter.CONVERTER_KEY, "Lto6;", "getDefaultScrollMotionDurationScale", "()Lto6;", "DefaultScrollMotionDurationScale", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: sx9  reason: default package */
/* loaded from: classes.dex */
public final class sx9 {
    private static final y84<qx1, s67, cv1<? super Unit>, Object> a = new c(null);
    private static final qx9 b = new d();
    private static final yr8<Boolean> c = wm6.a(b.a);
    private static final to6 d = new a();

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sx9$a", "Lto6;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sx9$a */
    /* loaded from: classes.dex */
    public static final class a implements to6 {
        a() {
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext P(CoroutineContext coroutineContext) {
            return to6.a.d(this, coroutineContext);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext T(CoroutineContext.b<?> bVar) {
            return to6.a.c(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
            return (E) to6.a.b(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        public /* synthetic */ CoroutineContext.b getKey() {
            return so6.a(this);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) to6.a.a(this, r, function2);
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: sx9$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Boolean> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lqx1;", "Ls67;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.ScrollableKt$NoOpOnDragStarted$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sx9$c */
    /* loaded from: classes.dex */
    static final class c extends f3b implements y84<qx1, s67, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(3, cv1Var);
        }

        public final Object i(qx1 qx1Var, long j, cv1<? super Unit> cv1Var) {
            return new c(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, s67 s67Var, cv1<? super Unit> cv1Var) {
            return i(qx1Var, s67Var.t(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sx9$d", "Lqx9;", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sx9$d */
    /* loaded from: classes.dex */
    public static final class d implements qx9 {
        d() {
        }
    }

    public static final yr8<Boolean> a() {
        return c;
    }
}
