package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.no6;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: BroadcastFrameClock.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J-\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lfg0;", "Lno6;", "", "cause", "", Image.TYPE_MEDIUM, "", "timeNanos", Image.TYPE_SMALL, "R", "Lkotlin/Function1;", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "onNewAwaiters", "", "b", "Ljava/lang/Object;", "lock", c.a, "Ljava/lang/Throwable;", "failureCause", "", "Lfg0$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "awaiters", e.a, "spareList", "", "p", "()Z", "hasAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fg0  reason: default package */
/* loaded from: classes.dex */
public final class fg0 implements no6 {
    private final Function0<Unit> a;
    private Throwable c;
    private final Object b = new Object();
    private List<a<?>> d = new ArrayList();
    private List<a<?>> e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Lfg0$a;", "R", "", "", "timeNanos", "", "b", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "onFrame", "Lcv1;", "Lcv1;", "()Lcv1;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function1;Lcv1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fg0$a */
    /* loaded from: classes.dex */
    public static final class a<R> {
        private final Function1<Long, R> a;
        private final cv1<R> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var) {
            z65.h(function1, "onFrame");
            z65.h(cv1Var, "continuation");
            this.a = function1;
            this.b = cv1Var;
        }

        public final cv1<R> a() {
            return this.b;
        }

        public final void b(long j) {
            Object b;
            cv1<R> cv1Var = this.b;
            try {
                sk9.a aVar = sk9.b;
                b = sk9.b(this.a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            cv1Var.resumeWith(b);
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: fg0$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ ea9<a<R>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ea9<a<R>> ea9Var) {
            super(1);
            this.b = ea9Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            a aVar;
            Object obj = fg0.this.b;
            fg0 fg0Var = fg0.this;
            ea9<a<R>> ea9Var = this.b;
            synchronized (obj) {
                try {
                    List list = fg0Var.d;
                    Object obj2 = ea9Var.a;
                    if (obj2 == null) {
                        z65.z("awaiter");
                        aVar = null;
                    } else {
                        aVar = (a) obj2;
                    }
                    list.remove(aVar);
                    Unit unit = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public fg0(Function0<Unit> function0) {
        this.a = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Throwable th) {
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    return;
                }
                this.c = th;
                List<a<?>> list = this.d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    cv1<?> a2 = list.get(i).a();
                    sk9.a aVar = sk9.b;
                    a2.resumeWith(sk9.b(vk9.a(th)));
                }
                this.d.clear();
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return no6.a.d(this, coroutineContext);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [fg0$a, T] */
    @Override // defpackage.no6
    public <R> Object S(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var) {
        cv1 c;
        a aVar;
        Object d;
        c = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c, 1);
        gn0Var.w();
        ea9 ea9Var = new ea9();
        synchronized (this.b) {
            Throwable th = this.c;
            if (th != null) {
                sk9.a aVar2 = sk9.b;
                gn0Var.resumeWith(sk9.b(vk9.a(th)));
            } else {
                ea9Var.a = new a(function1, gn0Var);
                boolean z = !this.d.isEmpty();
                List list = this.d;
                T t = ea9Var.a;
                if (t == 0) {
                    z65.z("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t;
                }
                list.add(aVar);
                boolean z2 = !z;
                gn0Var.u(new b(ea9Var));
                if (z2 && this.a != null) {
                    try {
                        this.a.invoke();
                    } catch (Throwable th2) {
                        m(th2);
                    }
                }
            }
        }
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return no6.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) no6.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return mo6.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) no6.a.a(this, r, function2);
    }

    public final boolean p() {
        boolean z;
        synchronized (this.b) {
            z = !this.d.isEmpty();
        }
        return z;
    }

    public final void s(long j) {
        synchronized (this.b) {
            try {
                List<a<?>> list = this.d;
                this.d = this.e;
                this.e = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).b(j);
                }
                list.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
