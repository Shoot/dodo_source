package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import defpackage.sm6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001AB.\u0012\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015ø\u0001\u0001¢\u0006\u0004\bF\u0010\"J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J-\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\tH\u0016J=\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bRe\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00152\"\u0010\u001c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00158\u0016@VX\u0096\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030,R\u00020\u00000+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030,R\u00020\u00000+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00103\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)R\u001f\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001d\u0010C\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001d\u0010E\u001a\u00020D8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b5\u0010B\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006G"}, d2 = {"Ll3b;", "Lsm6$c;", "Lk3b;", "Lie8;", "La03;", "Lkd8;", "pointerEvent", "Lmd8;", "pass", "", "i1", "Q0", "j0", "x0", "k1", "Lw55;", "bounds", "v", "(Lkd8;Lmd8;J)V", "h0", "R", "Lkotlin/Function2;", "Lr40;", "Lcv1;", "", "block", "T", "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "value", "n", "Lkotlin/jvm/functions/Function2;", "j1", "()Lkotlin/jvm/functions/Function2;", "l1", "(Lkotlin/jvm/functions/Function2;)V", "pointerInputHandler", "Ll95;", "o", "Ll95;", "pointerInputJob", "p", "Lkd8;", "currentEvent", "Lgr6;", "Ll3b$a;", "q", "Lgr6;", "pointerHandlers", "r", "dispatchingPointerHandlers", Image.TYPE_SMALL, "lastPointerEvent", "t", "J", "boundsSize", "", "getDensity", "()F", "density", "k0", "fontScale", "Lxyb;", "getViewConfiguration", "()Lxyb;", "viewConfiguration", "a", "()J", "size", "Lcna;", "extendedTouchPadding", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: l3b  reason: default package */
/* loaded from: classes.dex */
public final class l3b extends sm6.c implements k3b, ie8, a03 {
    private Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> n;
    private l95 o;
    private kd8 p;
    private final gr6<a<?>> q;
    private final gr6<a<?>> r;
    private kd8 s;
    private long t;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\bM\u0010NJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ \u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0001¢\u0006\u0004\b\"\u0010#JE\u0010*\u001a\u00028\u0001\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010(0'H\u0096@ø\u0001\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010C\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001d\u0010F\u001a\u00020D8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b,\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u0010L\u001a\u00020\u00108VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u0010E\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006O"}, d2 = {"Ll3b$a;", "R", "Lr40;", "La03;", "Lcv1;", "Li73;", "", "O", "(F)I", "", "n0", "(F)F", "Lwcb;", "S", "(J)F", "Ll73;", "Lcna;", "w0", "(J)J", "z", "(F)J", "Lkd8;", "event", "Lmd8;", "pass", "", "v", "", "cause", "r", "Lsk9;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Y", "(Lmd8;Lcv1;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "y", "(JLkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "a", "Lcv1;", "completion", "Lfn0;", com.huawei.hms.opendevice.c.a, "Lfn0;", "pointerAwaiter", DateTokenConverter.CONVERTER_KEY, "Lmd8;", "awaitPass", "Lkotlin/coroutines/CoroutineContext;", e.a, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "getDensity", "()F", "density", "k0", "fontScale", "a0", "()Lkd8;", "currentEvent", "Lw55;", "()J", "size", "Lxyb;", "getViewConfiguration", "()Lxyb;", "viewConfiguration", "J", "extendedTouchPadding", "<init>", "(Ll3b;Lcv1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: l3b$a */
    /* loaded from: classes.dex */
    public final class a<R> implements r40, a03, cv1<R> {
        private final cv1<R> a;
        private final /* synthetic */ l3b b;
        private fn0<? super kd8> c;
        private md8 d;
        private final CoroutineContext e;
        final /* synthetic */ l3b f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @nn2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {728}, m = "withTimeout")
        /* renamed from: l3b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0422a<T> extends ev1 {
            Object a;
            /* synthetic */ Object b;
            final /* synthetic */ a<R> c;
            int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0422a(a<R> aVar, cv1<? super C0422a> cv1Var) {
                super(cv1Var);
                this.c = aVar;
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.y(0L, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {720, 721}, m = "invokeSuspend")
        /* renamed from: l3b$a$b */
        /* loaded from: classes.dex */
        public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ long b;
            final /* synthetic */ a<R> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j, a<R> aVar, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.b = j;
                this.c = aVar;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new b(this.b, this.c, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // defpackage.e70
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = defpackage.a75.d()
                    int r1 = r8.a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    defpackage.vk9.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    defpackage.vk9.b(r9)
                    goto L2f
                L20:
                    defpackage.vk9.b(r9)
                    long r6 = r8.b
                    long r6 = r6 - r2
                    r8.a = r5
                    java.lang.Object r9 = defpackage.xt2.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.a = r4
                    java.lang.Object r9 = defpackage.xt2.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    l3b$a<R> r9 = r8.c
                    fn0 r9 = defpackage.l3b.a.d(r9)
                    if (r9 == 0) goto L54
                    sk9$a r0 = defpackage.sk9.b
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.b
                    r0.<init>(r1)
                    java.lang.Object r0 = defpackage.vk9.a(r0)
                    java.lang.Object r0 = defpackage.sk9.b(r0)
                    r9.resumeWith(r0)
                L54:
                    kotlin.Unit r9 = kotlin.Unit.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.l3b.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l3b l3bVar, cv1<? super R> cv1Var) {
            z65.h(cv1Var, "completion");
            this.f = l3bVar;
            this.a = cv1Var;
            this.b = l3bVar;
            this.d = md8.Main;
            this.e = kotlin.coroutines.e.a;
        }

        @Override // defpackage.r40
        public long J() {
            return this.f.J();
        }

        @Override // defpackage.a03
        public int O(float f) {
            return this.b.O(f);
        }

        @Override // defpackage.a03
        public float S(long j) {
            return this.b.S(j);
        }

        @Override // defpackage.r40
        public Object Y(md8 md8Var, cv1<? super kd8> cv1Var) {
            cv1 c;
            Object d;
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            this.d = md8Var;
            this.c = gn0Var;
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            return s;
        }

        @Override // defpackage.r40
        public long a() {
            return this.f.t;
        }

        @Override // defpackage.r40
        public kd8 a0() {
            return this.f.p;
        }

        @Override // defpackage.cv1
        public CoroutineContext getContext() {
            return this.e;
        }

        @Override // defpackage.a03
        public float getDensity() {
            return this.b.getDensity();
        }

        @Override // defpackage.r40
        public xyb getViewConfiguration() {
            return this.f.getViewConfiguration();
        }

        @Override // defpackage.a03
        public float k0() {
            return this.b.k0();
        }

        @Override // defpackage.a03
        public float n0(float f) {
            return this.b.n0(f);
        }

        public final void r(Throwable th) {
            fn0<? super kd8> fn0Var = this.c;
            if (fn0Var != null) {
                fn0Var.L(th);
            }
            this.c = null;
        }

        @Override // defpackage.cv1
        public void resumeWith(Object obj) {
            gr6 gr6Var = this.f.q;
            l3b l3bVar = this.f;
            synchronized (gr6Var) {
                l3bVar.q.x(this);
                Unit unit = Unit.a;
            }
            this.a.resumeWith(obj);
        }

        public final void v(kd8 kd8Var, md8 md8Var) {
            fn0<? super kd8> fn0Var;
            z65.h(kd8Var, "event");
            z65.h(md8Var, "pass");
            if (md8Var == this.d && (fn0Var = this.c) != null) {
                this.c = null;
                fn0Var.resumeWith(sk9.b(kd8Var));
            }
        }

        @Override // defpackage.a03
        public long w0(long j) {
            return this.b.w0(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [l95] */
        /* JADX WARN: Type inference failed for: r11v3, types: [l95] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // defpackage.r40
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object y(long r11, kotlin.jvm.functions.Function2<? super defpackage.r40, ? super defpackage.cv1<? super T>, ? extends java.lang.Object> r13, defpackage.cv1<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof defpackage.l3b.a.C0422a
                if (r0 == 0) goto L13
                r0 = r14
                l3b$a$a r0 = (defpackage.l3b.a.C0422a) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                l3b$a$a r0 = new l3b$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.b
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.a
                l95 r11 = (defpackage.l95) r11
                defpackage.vk9.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                defpackage.vk9.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                fn0<? super kd8> r14 = r10.c
                if (r14 == 0) goto L56
                sk9$a r2 = defpackage.sk9.b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = defpackage.vk9.a(r2)
                java.lang.Object r2 = defpackage.sk9.b(r2)
                r14.resumeWith(r2)
            L56:
                l3b r14 = r10.f
                qx1 r4 = r14.F0()
                r5 = 0
                r6 = 0
                l3b$a$b r7 = new l3b$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                l95 r11 = defpackage.qh0.d(r4, r5, r6, r7, r8, r9)
                r0.a = r11     // Catch: java.lang.Throwable -> L2d
                r0.d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                an0 r12 = defpackage.an0.a
                r11.a(r12)
                return r14
            L7b:
                an0 r13 = defpackage.an0.a
                r11.a(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.l3b.a.y(long, kotlin.jvm.functions.Function2, cv1):java.lang.Object");
        }

        @Override // defpackage.a03
        public long z(float f) {
            return this.b.z(f);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l3b$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[md8.values().length];
            try {
                iArr[md8.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[md8.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[md8.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l3b$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ a<R> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.a.r(th);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {562}, m = "invokeSuspend")
    /* renamed from: l3b$d */
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                Function2<ie8, cv1<? super Unit>, Object> j1 = l3b.this.j1();
                l3b l3bVar = l3b.this;
                this.a = 1;
                if (j1.invoke(l3bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public l3b(Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "pointerInputHandler");
        this.n = function2;
        this.p = j3b.b();
        this.q = new gr6<>(new a[16], 0);
        this.r = new gr6<>(new a[16], 0);
        this.t = w55.b.a();
    }

    private final void i1(kd8 kd8Var, md8 md8Var) {
        gr6<a<?>> gr6Var;
        int s;
        synchronized (this.q) {
            gr6<a<?>> gr6Var2 = this.r;
            gr6Var2.d(gr6Var2.s(), this.q);
        }
        try {
            int i = b.$EnumSwitchMapping$0[md8Var.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 && (s = (gr6Var = this.r).s()) > 0) {
                    int i2 = s - 1;
                    a<?>[] r = gr6Var.r();
                    do {
                        r[i2].v(kd8Var, md8Var);
                        i2--;
                    } while (i2 >= 0);
                }
            } else {
                gr6<a<?>> gr6Var3 = this.r;
                int s2 = gr6Var3.s();
                if (s2 > 0) {
                    a<?>[] r2 = gr6Var3.r();
                    int i3 = 0;
                    do {
                        r2[i3].v(kd8Var, md8Var);
                        i3++;
                    } while (i3 < s2);
                }
            }
        } finally {
            this.r.k();
        }
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean B() {
        return ee8.a(this);
    }

    public long J() {
        long w0 = w0(getViewConfiguration().c());
        long a2 = a();
        return ina.a(Math.max(0.0f, cna.i(w0) - w55.g(a2)) / 2.0f, Math.max(0.0f, cna.g(w0) - w55.f(a2)) / 2.0f);
    }

    @Override // defpackage.a03
    public /* synthetic */ int O(float f) {
        return zz2.a(this, f);
    }

    @Override // defpackage.sm6.c
    public void Q0() {
        k1();
        super.Q0();
    }

    @Override // defpackage.a03
    public /* synthetic */ float S(long j) {
        return zz2.b(this, j);
    }

    @Override // defpackage.ie8
    public <R> Object T(Function2<? super r40, ? super cv1<? super R>, ? extends Object> function2, cv1<? super R> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        a aVar = new a(this, gn0Var);
        synchronized (this.q) {
            this.q.b(aVar);
            cv1<Unit> a2 = fv1.a(function2, aVar, aVar);
            sk9.a aVar2 = sk9.b;
            a2.resumeWith(sk9.b(Unit.a));
        }
        gn0Var.u(new c(aVar));
        Object s = gn0Var.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        return s;
    }

    @Override // defpackage.ie8
    public long a() {
        return this.t;
    }

    @Override // defpackage.a03
    public float getDensity() {
        return au2.i(this).H().getDensity();
    }

    public xyb getViewConfiguration() {
        return au2.i(this).k0();
    }

    @Override // defpackage.fe8
    public void h0() {
        kd8 kd8Var = this.s;
        if (kd8Var == null) {
            return;
        }
        List<wd8> c2 = kd8Var.c();
        int size = c2.size();
        for (int i = 0; i < size; i++) {
            if (!(!c2.get(i).h())) {
                List<wd8> c3 = kd8Var.c();
                ArrayList arrayList = new ArrayList(c3.size());
                int size2 = c3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    wd8 wd8Var = c3.get(i2);
                    long f = wd8Var.f();
                    long g = wd8Var.g();
                    arrayList.add(new wd8(f, wd8Var.m(), g, false, wd8Var.i(), wd8Var.m(), wd8Var.g(), wd8Var.h(), wd8Var.h(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                kd8 kd8Var2 = new kd8(arrayList);
                this.p = kd8Var2;
                i1(kd8Var2, md8.Initial);
                i1(kd8Var2, md8.Main);
                i1(kd8Var2, md8.Final);
                this.s = null;
                return;
            }
        }
    }

    @Override // defpackage.fe8
    public void j0() {
        k1();
    }

    public Function2<ie8, cv1<? super Unit>, Object> j1() {
        return this.n;
    }

    @Override // defpackage.a03
    public float k0() {
        return au2.i(this).H().k0();
    }

    public void k1() {
        l95 l95Var = this.o;
        if (l95Var != null) {
            l95Var.a(new he8());
            this.o = null;
        }
    }

    public void l1(Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "value");
        k1();
        this.n = function2;
    }

    @Override // defpackage.a03
    public /* synthetic */ float n0(float f) {
        return zz2.c(this, f);
    }

    @Override // defpackage.fe8
    public void v(kd8 kd8Var, md8 md8Var, long j) {
        l95 d2;
        z65.h(kd8Var, "pointerEvent");
        z65.h(md8Var, "pass");
        this.t = j;
        if (md8Var == md8.Initial) {
            this.p = kd8Var;
        }
        if (this.o == null) {
            d2 = sh0.d(F0(), null, ux1.UNDISPATCHED, new d(null), 1, null);
            this.o = d2;
        }
        i1(kd8Var, md8Var);
        List<wd8> c2 = kd8Var.c();
        int size = c2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!ld8.d(c2.get(i))) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!(!z)) {
            kd8Var = null;
        }
        this.s = kd8Var;
    }

    @Override // defpackage.fe8
    public /* synthetic */ boolean v0() {
        return ee8.d(this);
    }

    @Override // defpackage.a03
    public /* synthetic */ long w0(long j) {
        return zz2.d(this, j);
    }

    @Override // defpackage.fe8
    public void x0() {
        k1();
    }

    @Override // defpackage.a03
    public /* synthetic */ long z(float f) {
        return zz2.e(this, f);
    }
}
