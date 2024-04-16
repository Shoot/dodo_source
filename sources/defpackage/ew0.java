package defpackage;

import defpackage.cw0;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Llba;", "element", "Lcw0;", "", "b", "(Llba;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Llba;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: ew0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: ew0$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ lba<E> b;
        final /* synthetic */ E c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(lba<? super E> lbaVar, E e, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = lbaVar;
            this.c = e;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
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
                lba<E> lbaVar = this.b;
                E e = this.c;
                this.a = 1;
                if (lbaVar.p(e, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"E", "Lqx1;", "Lcw0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: ew0$b */
    /* loaded from: classes3.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super cw0<? extends Unit>>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ lba<E> c;
        final /* synthetic */ E d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(lba<? super E> lbaVar, E e, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = lbaVar;
            this.d = e;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, this.d, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super cw0<Unit>> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object b;
            Object a;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    qx1 qx1Var = (qx1) this.b;
                    lba<E> lbaVar = this.c;
                    E e = this.d;
                    sk9.a aVar = sk9.b;
                    this.a = 1;
                    if (lbaVar.p(e, this) == d) {
                        return d;
                    }
                }
                b = sk9.b(Unit.a);
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            if (sk9.i(b)) {
                a = cw0.b.c(Unit.a);
            } else {
                a = cw0.b.a(sk9.d(b));
            }
            return cw0.b(a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super cw0<? extends Unit>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super cw0<Unit>>) cv1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> void a(lba<? super E> lbaVar, E e) {
        if (!cw0.j(lbaVar.h(e))) {
            rh0.b(null, new a(lbaVar, e, null), 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object b(lba<? super E> lbaVar, E e) {
        Object b2;
        Object h = lbaVar.h(e);
        if (h instanceof cw0.c) {
            b2 = rh0.b(null, new b(lbaVar, e, null), 1, null);
            return ((cw0) b2).l();
        }
        Unit unit = (Unit) h;
        return cw0.b.c(Unit.a);
    }
}
