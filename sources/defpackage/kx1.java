package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, d2 = {"Lkx1;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "W", "", "parallelism", "e0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "x", "L", "T", "Lcv1;", "continuation", "b0", "Q", "", "toString", "<init>", "()V", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: kx1  reason: default package */
/* loaded from: classes3.dex */
public abstract class kx1 extends kotlin.coroutines.a implements d {
    public static final a b = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkx1$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/d;", "Lkx1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kx1$a */
    /* loaded from: classes3.dex */
    public static final class a extends b<d, kx1> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "Lkx1;", "a", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkx1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kx1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0418a extends ej5 implements Function1<CoroutineContext.Element, kx1> {
            public static final C0418a a = new C0418a();

            C0418a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final kx1 invoke(CoroutineContext.Element element) {
                if (element instanceof kx1) {
                    return (kx1) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(d.J4, C0418a.a);
        }
    }

    public kx1() {
        super(d.J4);
    }

    public void L(CoroutineContext coroutineContext, Runnable runnable) {
        x(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.d
    public final void Q(cv1<?> cv1Var) {
        ((n33) cv1Var).p();
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return d.a.b(this, bVar);
    }

    public boolean W(CoroutineContext coroutineContext) {
        return true;
    }

    @Override // kotlin.coroutines.d
    public final <T> cv1<T> b0(cv1<? super T> cv1Var) {
        return new n33(this, cv1Var);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) d.a.a(this, bVar);
    }

    public kx1 e0(int i) {
        up5.a(i);
        return new tp5(this, i);
    }

    public String toString() {
        return jo2.a(this) + '@' + jo2.b(this);
    }

    public abstract void x(CoroutineContext coroutineContext, Runnable runnable);
}
