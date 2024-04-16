package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lxv0;", "S", "T", "Luv0;", "Lpz3;", "collector", "Lkotlin/coroutines/CoroutineContext;", "newContext", "", "p", "(Lpz3;Lkotlin/coroutines/CoroutineContext;Lcv1;)Ljava/lang/Object;", "q", "(Lpz3;Lcv1;)Ljava/lang/Object;", "Ldl8;", Action.SCOPE_ATTRIBUTE, Image.TYPE_HIGH, "(Ldl8;Lcv1;)Ljava/lang/Object;", "collect", "", "toString", "Loz3;", DateTokenConverter.CONVERTER_KEY, "Loz3;", "flow", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "<init>", "(Loz3;Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: xv0  reason: default package */
/* loaded from: classes3.dex */
public abstract class xv0<S, T> extends uv0<T> {
    protected final oz3<S> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lpz3;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend")
    /* renamed from: xv0$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ xv0<S, T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xv0<S, T> xv0Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = xv0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                xv0<S, T> xv0Var = this.c;
                this.a = 1;
                if (xv0Var.q((pz3) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xv0(oz3<? extends S> oz3Var, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        super(coroutineContext, i, zg0Var);
        this.d = oz3Var;
    }

    static /* synthetic */ Object n(xv0 xv0Var, pz3 pz3Var, cv1 cv1Var) {
        Object d;
        Object d2;
        Object d3;
        if (xv0Var.b == -3) {
            CoroutineContext context = cv1Var.getContext();
            CoroutineContext P = context.P(xv0Var.a);
            if (z65.c(P, context)) {
                Object q = xv0Var.q(pz3Var, cv1Var);
                d3 = c75.d();
                if (q == d3) {
                    return q;
                }
                return Unit.a;
            }
            d.b bVar = d.J4;
            if (z65.c(P.c(bVar), context.c(bVar))) {
                Object p = xv0Var.p(pz3Var, P, cv1Var);
                d2 = c75.d();
                if (p == d2) {
                    return p;
                }
                return Unit.a;
            }
        }
        Object collect = super.collect(pz3Var, cv1Var);
        d = c75.d();
        if (collect == d) {
            return collect;
        }
        return Unit.a;
    }

    static /* synthetic */ Object o(xv0 xv0Var, dl8 dl8Var, cv1 cv1Var) {
        Object d;
        Object q = xv0Var.q(new tba(dl8Var), cv1Var);
        d = c75.d();
        if (q == d) {
            return q;
        }
        return Unit.a;
    }

    private final Object p(pz3<? super T> pz3Var, CoroutineContext coroutineContext, cv1<? super Unit> cv1Var) {
        Object d;
        Object d2 = wv0.d(coroutineContext, wv0.a(pz3Var, cv1Var.getContext()), null, new a(this, null), cv1Var, 4, null);
        d = c75.d();
        if (d2 == d) {
            return d2;
        }
        return Unit.a;
    }

    @Override // defpackage.uv0, defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        return n(this, pz3Var, cv1Var);
    }

    @Override // defpackage.uv0
    protected Object h(dl8<? super T> dl8Var, cv1<? super Unit> cv1Var) {
        return o(this, dl8Var, cv1Var);
    }

    protected abstract Object q(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var);

    @Override // defpackage.uv0
    public String toString() {
        return this.d + " -> " + super.toString();
    }
}
