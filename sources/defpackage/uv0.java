package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R9\u0010&\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Luv0;", "T", "Lq94;", "Loz3;", "j", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "b", "i", "Ldl8;", Action.SCOPE_ATTRIBUTE, "", Image.TYPE_HIGH, "(Ldl8;Lcv1;)Ljava/lang/Object;", "Lqx1;", "La99;", Image.TYPE_MEDIUM, "Lpz3;", "collector", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "", e.a, "toString", "a", "Lkotlin/coroutines/CoroutineContext;", "I", c.a, "Lzg0;", "Lkotlin/Function2;", "Lcv1;", "", "k", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "l", "()I", "produceCapacity", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: uv0  reason: default package */
/* loaded from: classes3.dex */
public abstract class uv0<T> implements q94<T> {
    public final CoroutineContext a;
    public final int b;
    public final zg0 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: uv0$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ pz3<T> c;
        final /* synthetic */ uv0<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pz3<? super T> pz3Var, uv0<T> uv0Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = pz3Var;
            this.d = uv0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, this.d, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                pz3<T> pz3Var = this.c;
                a99<T> m = this.d.m((qx1) this.b);
                this.a = 1;
                if (wz3.r(pz3Var, m, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Ldl8;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: uv0$b */
    /* loaded from: classes3.dex */
    public static final class b extends f3b implements Function2<dl8<? super T>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ uv0<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(uv0<T> uv0Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = uv0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(dl8<? super T> dl8Var, cv1<? super Unit> cv1Var) {
            return ((b) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
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
                uv0<T> uv0Var = this.c;
                this.a = 1;
                if (uv0Var.h((dl8) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public uv0(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        this.a = coroutineContext;
        this.b = i;
        this.c = zg0Var;
    }

    static /* synthetic */ Object g(uv0 uv0Var, pz3 pz3Var, cv1 cv1Var) {
        Object d;
        Object e = rx1.e(new a(pz3Var, uv0Var, null), cv1Var);
        d = c75.d();
        if (e == d) {
            return e;
        }
        return Unit.a;
    }

    @Override // defpackage.q94
    public oz3<T> b(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        CoroutineContext P = coroutineContext.P(this.a);
        if (zg0Var == zg0.SUSPEND) {
            int i2 = this.b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            zg0Var = this.c;
        }
        if (z65.c(P, this.a) && i == this.b && zg0Var == this.c) {
            return this;
        }
        return i(P, i, zg0Var);
    }

    @Override // defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
        return g(this, pz3Var, cv1Var);
    }

    protected String e() {
        return null;
    }

    protected abstract Object h(dl8<? super T> dl8Var, cv1<? super Unit> cv1Var);

    protected abstract uv0<T> i(CoroutineContext coroutineContext, int i, zg0 zg0Var);

    public oz3<T> j() {
        return null;
    }

    public final Function2<dl8<? super T>, cv1<? super Unit>, Object> k() {
        return new b(this, null);
    }

    public final int l() {
        int i = this.b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public a99<T> m(qx1 qx1Var) {
        return bl8.e(qx1Var, this.a, l(), this.c, ux1.ATOMIC, null, k(), 16, null);
    }

    public String toString() {
        String i0;
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        if (this.a != kotlin.coroutines.e.a) {
            arrayList.add("context=" + this.a);
        }
        if (this.b != -3) {
            arrayList.add("capacity=" + this.b);
        }
        if (this.c != zg0.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jo2.a(this));
        sb.append('[');
        i0 = sc1.i0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(i0);
        sb.append(']');
        return sb.toString();
    }
}
