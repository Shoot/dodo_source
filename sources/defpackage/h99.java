package defpackage;

import androidx.compose.runtime.ComposeRuntimeError;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fn0;
import defpackage.l95;
import defpackage.sk9;
import defpackage.yoa;
import defpackage.zoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  \u00012\u00020\u0001:\u00040?PSB\u0013\u0012\b\u0010\u0088\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J*\u0010\u0010\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u0002J\u0013\u0010\u0011\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0019\u001a\u00020\u00032(\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0002J\"\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\r2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010\u001b\u001a\u00020\rH\u0002J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010\u001b\u001a\u00020\r2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dH\u0002J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002J\u0013\u0010+\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0012J\u0006\u0010,\u001a\u00020\u0003J\u0013\u0010-\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0012J%\u00100\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\r2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030.H\u0010¢\u0006\u0004\b0\u00101J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u0003J\u001d\u00107\u001a\u00020\u00032\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0010¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0010¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010<\u001a\u00020!H\u0010¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020!H\u0010¢\u0006\u0004\b?\u0010>J\u001f\u0010B\u001a\u00020\u00032\u0006\u0010<\u001a\u00020!2\u0006\u0010A\u001a\u00020@H\u0010¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0010¢\u0006\u0004\bD\u0010:J\u0019\u0010E\u001a\u0004\u0018\u00010@2\u0006\u0010<\u001a\u00020!H\u0010¢\u0006\u0004\bE\u0010FR$\u0010L\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010NR\u0014\u0010R\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\r0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\r0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010[R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\r0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020!0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010[R.\u0010f\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170d\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0Y0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010eR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020@0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010eR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010[R\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010jR\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010sR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\u0088\u0001\u001a\u00030\u0084\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b]\u0010\u0087\u0001R\u001c\u0010\u008c\u0001\u001a\u00070\u0089\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u008e\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u008e\u0001R\u001a\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020|0\u0098\u00018F¢\u0006\u0007\u001a\u0005\bs\u0010\u0099\u0001R\u0016\u0010\u009c\u0001\u001a\u00020o8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bZ\u0010\u009b\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bS\u0010\u008e\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¡\u0001"}, d2 = {"Lh99;", "Ldo1;", "Lfn0;", "", "W", "", "p0", "Ll95;", "callingJob", "q0", "Ljava/lang/Exception;", "Lkotlin/Exception;", com.huawei.hms.push.e.a, "Ljv1;", "failedInitialComposition", "recoverable", "l0", "U", "(Lcv1;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lqx1;", "Lno6;", "Lcv1;", "", "block", "o0", "(Ly84;Lcv1;)Ljava/lang/Object;", "composition", "h0", "Llt4;", "modifiedValues", "k0", "", "Lhp6;", "references", "j0", "X", "Lkotlin/Function1;", "n0", "t0", "Ldr6;", "snapshot", "T", "s0", "V", "f0", "Lkotlin/Function0;", RemoteMessageConst.Notification.CONTENT, "a", "(Ljv1;Lkotlin/jvm/functions/Function2;)V", "g0", "r0", "", "Lfo1;", "table", "l", "(Ljava/util/Set;)V", "q", "(Ljv1;)V", "i", "reference", Image.TYPE_HIGH, "(Lhp6;)V", "b", "Lgp6;", "data", "j", "(Lhp6;Lgp6;)V", "n", "k", "(Lhp6;)Lgp6;", "", "<set-?>", "J", "Y", "()J", "changeCount", "Lfg0;", "Lfg0;", "broadcastFrameClock", com.huawei.hms.opendevice.c.a, "Ljava/lang/Object;", "stateLock", DateTokenConverter.CONVERTER_KEY, "Ll95;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "knownCompositions", "g", "Llt4;", "snapshotInvalidations", "compositionInvalidations", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Lfp6;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", Image.TYPE_MEDIUM, "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "o", "Lfn0;", "workContinuation", "", "p", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Lh99$b;", "r", "Lh99$b;", "errorState", Image.TYPE_SMALL, "frameClockPaused", "Lfr6;", "Lh99$d;", "t", "Lfr6;", "_state", "Lbl1;", "u", "Lbl1;", "effectJob", "Lkotlin/coroutines/CoroutineContext;", "v", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Lh99$c;", "w", "Lh99$c;", "recomposerInfo", "b0", "()Z", "hasBroadcastFrameClockAwaitersLocked", "a0", "hasBroadcastFrameClockAwaiters", "e0", "shouldKeepRecomposing", "d0", "hasSchedulingWork", "c0", "hasFrameWorkLocked", "Lkua;", "()Lkua;", "currentState", "()I", "compoundHashKey", "collectingParameterInformation", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "x", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h99  reason: default package */
/* loaded from: classes.dex */
public final class h99 extends do1 {
    private long a;
    private final fg0 b;
    private final Object c;
    private l95 d;
    private Throwable e;
    private final List<jv1> f;
    private lt4<Object> g;
    private final List<jv1> h;
    private final List<jv1> i;
    private final List<hp6> j;
    private final Map<fp6<Object>, List<hp6>> k;
    private final Map<hp6, gp6> l;
    private List<jv1> m;
    private Set<jv1> n;
    private fn0<? super Unit> o;
    private int p;
    private boolean q;
    private b r;
    private boolean s;
    private final fr6<d> t;
    private final bl1 u;
    private final CoroutineContext v;
    private final c w;
    public static final a x = new a(null);
    public static final int y = 8;
    private static final fr6<wz7<c>> z = mua.a(xn3.b());
    private static final AtomicReference<Boolean> A = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003H\u0002R4\u0010\f\u001a\"\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bj\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lh99$a;", "", "Lh99$c;", "Lh99;", "info", "", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lfr6;", "Lwz7;", "_runningRecomposers", "Lfr6;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: h99$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            wz7 wz7Var;
            wz7 add;
            do {
                wz7Var = (wz7) h99.z.getValue();
                add = wz7Var.add((wz7) cVar);
                if (wz7Var == add) {
                    return;
                }
            } while (!h99.z.d(wz7Var, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            wz7 wz7Var;
            wz7 remove;
            do {
                wz7Var = (wz7) h99.z.getValue();
                remove = wz7Var.remove((wz7) cVar);
                if (wz7Var == remove) {
                    return;
                }
            } while (!h99.z.d(wz7Var, remove));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\u0010\u000e\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000e\u001a\u00060\bj\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lh99$b;", "", "", "a", "Z", "getRecoverable", "()Z", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "Ljava/lang/Exception;", "getCause", "()Ljava/lang/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: h99$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final boolean a;
        private final Exception b;

        public b(boolean z, Exception exc) {
            z65.h(exc, "cause");
            this.a = z;
            this.b = exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh99$c;", "", "<init>", "(Lh99;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: h99$c */
    /* loaded from: classes.dex */
    public final class c {
        public c() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lh99$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: h99$d */
    /* loaded from: classes.dex */
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h99$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            fn0 W;
            Object obj = h99.this.c;
            h99 h99Var = h99.this;
            synchronized (obj) {
                W = h99Var.W();
                if (((d) h99Var.t.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw tl3.a("Recomposer shutdown; frame clock awaiter will never resume", h99Var.e);
                }
            }
            if (W != null) {
                sk9.a aVar = sk9.b;
                W.resumeWith(sk9.b(Unit.a));
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h99$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<Throwable, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "runnerJobCause", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: h99$f$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ h99 a;
            final /* synthetic */ Throwable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h99 h99Var, Throwable th) {
                super(1);
                this.a = h99Var;
                this.b = th;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Object obj = this.a.c;
                h99 h99Var = this.a;
                Throwable th2 = this.b;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (!(!(th instanceof CancellationException))) {
                                th = null;
                            }
                            if (th != null) {
                                vl3.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    h99Var.e = th2;
                    h99Var.t.setValue(d.ShutDown);
                    Unit unit = Unit.a;
                }
            }
        }

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            fn0 fn0Var;
            fn0 fn0Var2;
            CancellationException a2 = tl3.a("Recomposer effect job completed", th);
            Object obj = h99.this.c;
            h99 h99Var = h99.this;
            synchronized (obj) {
                try {
                    l95 l95Var = h99Var.d;
                    fn0Var = null;
                    if (l95Var != null) {
                        h99Var.t.setValue(d.ShuttingDown);
                        if (h99Var.q) {
                            if (h99Var.o != null) {
                                fn0Var2 = h99Var.o;
                                h99Var.o = null;
                                l95Var.r(new a(h99Var, th));
                                fn0Var = fn0Var2;
                            }
                        } else {
                            l95Var.a(a2);
                        }
                        fn0Var2 = null;
                        h99Var.o = null;
                        l95Var.r(new a(h99Var, th));
                        fn0Var = fn0Var2;
                    } else {
                        h99Var.e = a2;
                        h99Var.t.setValue(d.ShutDown);
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (fn0Var != null) {
                sk9.a aVar = sk9.b;
                fn0Var.resumeWith(sk9.b(Unit.a));
            }
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh99$d;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: h99$g */
    /* loaded from: classes.dex */
    static final class g extends f3b implements Function2<d, cv1<? super Boolean>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(d dVar, cv1<? super Boolean> cv1Var) {
            return ((g) create(dVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((d) this.b) == d.ShutDown) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h99$h */
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ lt4<Object> a;
        final /* synthetic */ jv1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(lt4<Object> lt4Var, jv1 jv1Var) {
            super(0);
            this.a = lt4Var;
            this.b = jv1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            lt4<Object> lt4Var = this.a;
            jv1 jv1Var = this.b;
            Object[] t = lt4Var.t();
            int size = lt4Var.size();
            for (int i = 0; i < size; i++) {
                Object obj = t[i];
                z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                jv1Var.q(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: h99$i */
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ jv1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(jv1 jv1Var) {
            super(1);
            this.a = jv1Var;
        }

        public final void a(Object obj) {
            z65.h(obj, "value");
            this.a.b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {945}, m = "invokeSuspend")
    /* renamed from: h99$j */
    /* loaded from: classes.dex */
    public static final class j extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ y84<qx1, no6, cv1<? super Unit>, Object> e;
        final /* synthetic */ no6 f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {946}, m = "invokeSuspend")
        /* renamed from: h99$j$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ y84<qx1, no6, cv1<? super Unit>, Object> c;
            final /* synthetic */ no6 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(y84<? super qx1, ? super no6, ? super cv1<? super Unit>, ? extends Object> y84Var, no6 no6Var, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = y84Var;
                this.d = no6Var;
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
                    y84<qx1, no6, cv1<? super Unit>, Object> y84Var = this.c;
                    no6 no6Var = this.d;
                    this.a = 1;
                    if (y84Var.invoke((qx1) this.b, no6Var, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Lyoa;", "<anonymous parameter 1>", "", "a", "(Ljava/util/Set;Lyoa;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: h99$j$b */
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function2<Set<? extends Object>, yoa, Unit> {
            final /* synthetic */ h99 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h99 h99Var) {
                super(2);
                this.a = h99Var;
            }

            public final void a(Set<? extends Object> set, yoa yoaVar) {
                fn0 fn0Var;
                z65.h(set, "changed");
                z65.h(yoaVar, "<anonymous parameter 1>");
                Object obj = this.a.c;
                h99 h99Var = this.a;
                synchronized (obj) {
                    if (((d) h99Var.t.getValue()).compareTo(d.Idle) >= 0) {
                        h99Var.g.g(set);
                        fn0Var = h99Var.W();
                    } else {
                        fn0Var = null;
                    }
                }
                if (fn0Var != null) {
                    sk9.a aVar = sk9.b;
                    fn0Var.resumeWith(sk9.b(Unit.a));
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, yoa yoaVar) {
                a(set, yoaVar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(y84<? super qx1, ? super no6, ? super cv1<? super Unit>, ? extends Object> y84Var, no6 no6Var, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.e = y84Var;
            this.f = no6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(this.e, this.f, cv1Var);
            jVar.c = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((j) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h99.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lqx1;", "Lno6;", "parentFrameClock", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {526, 537}, m = "invokeSuspend")
    /* renamed from: h99$k */
    /* loaded from: classes.dex */
    public static final class k extends f3b implements y84<qx1, no6, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        /* synthetic */ Object g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: h99$k$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<Long, Unit> {
            final /* synthetic */ h99 a;
            final /* synthetic */ List<jv1> b;
            final /* synthetic */ List<hp6> c;
            final /* synthetic */ Set<jv1> d;
            final /* synthetic */ List<jv1> e;
            final /* synthetic */ Set<jv1> f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h99 h99Var, List<jv1> list, List<hp6> list2, Set<jv1> set, List<jv1> list3, Set<jv1> set2) {
                super(1);
                this.a = h99Var;
                this.b = list;
                this.c = list2;
                this.d = set;
                this.e = list3;
                this.f = set2;
            }

            public final void a(long j) {
                Object a;
                if (this.a.a0()) {
                    h99 h99Var = this.a;
                    rjb rjbVar = rjb.a;
                    a = rjbVar.a("Recomposer:animation");
                    try {
                        h99Var.b.s(j);
                        yoa.e.g();
                        Unit unit = Unit.a;
                        rjbVar.b(a);
                    } finally {
                    }
                }
                h99 h99Var2 = this.a;
                List<jv1> list = this.b;
                List<hp6> list2 = this.c;
                Set<jv1> set = this.d;
                List<jv1> list3 = this.e;
                Set<jv1> set2 = this.f;
                a = rjb.a.a("Recomposer:recompose");
                try {
                    h99Var2.p0();
                    synchronized (h99Var2.c) {
                        List list4 = h99Var2.h;
                        int size = list4.size();
                        for (int i = 0; i < size; i++) {
                            list.add((jv1) list4.get(i));
                        }
                        h99Var2.h.clear();
                        Unit unit2 = Unit.a;
                    }
                    lt4 lt4Var = new lt4();
                    lt4 lt4Var2 = new lt4();
                    while (true) {
                        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                            break;
                        }
                        try {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                jv1 jv1Var = list.get(i2);
                                lt4Var2.add(jv1Var);
                                jv1 k0 = h99Var2.k0(jv1Var, lt4Var);
                                if (k0 != null) {
                                    list3.add(k0);
                                }
                            }
                            list.clear();
                            if (lt4Var.u()) {
                                synchronized (h99Var2.c) {
                                    List list5 = h99Var2.f;
                                    int size3 = list5.size();
                                    for (int i3 = 0; i3 < size3; i3++) {
                                        jv1 jv1Var2 = (jv1) list5.get(i3);
                                        if (!lt4Var2.contains(jv1Var2) && jv1Var2.l(lt4Var)) {
                                            list.add(jv1Var2);
                                        }
                                    }
                                    Unit unit3 = Unit.a;
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    k.n(list2, h99Var2);
                                    while (!list2.isEmpty()) {
                                        pc1.C(set, h99Var2.j0(list2, lt4Var));
                                        k.n(list2, h99Var2);
                                    }
                                } catch (Exception e) {
                                    h99.m0(h99Var2, e, null, true, 2, null);
                                    k.l(list, list2, list3, set, set2);
                                    return;
                                }
                            }
                        } catch (Exception e2) {
                            h99.m0(h99Var2, e2, null, true, 2, null);
                            k.l(list, list2, list3, set, set2);
                            list.clear();
                        }
                    }
                    if (!list3.isEmpty()) {
                        h99Var2.a = h99Var2.Y() + 1;
                        try {
                            int size4 = list3.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                set2.add(list3.get(i4));
                            }
                            int size5 = list3.size();
                            for (int i5 = 0; i5 < size5; i5++) {
                                list3.get(i5).o();
                            }
                            list3.clear();
                        } catch (Exception e3) {
                            h99.m0(h99Var2, e3, null, false, 6, null);
                            k.l(list, list2, list3, set, set2);
                            list3.clear();
                            return;
                        }
                    }
                    if (!set.isEmpty()) {
                        try {
                            pc1.C(set2, set);
                            for (jv1 jv1Var3 : set) {
                                jv1Var3.e();
                            }
                            set.clear();
                        } catch (Exception e4) {
                            h99.m0(h99Var2, e4, null, false, 6, null);
                            k.l(list, list2, list3, set, set2);
                            set.clear();
                            return;
                        }
                    }
                    if (!set2.isEmpty()) {
                        try {
                            for (jv1 jv1Var4 : set2) {
                                jv1Var4.r();
                            }
                            set2.clear();
                        } catch (Exception e5) {
                            h99.m0(h99Var2, e5, null, false, 6, null);
                            k.l(list, list2, list3, set, set2);
                            set2.clear();
                            return;
                        }
                    }
                    synchronized (h99Var2.c) {
                        h99Var2.W();
                    }
                    yoa.e.c();
                    h99Var2.n = null;
                    Unit unit4 = Unit.a;
                } finally {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                a(l.longValue());
                return Unit.a;
            }
        }

        k(cv1<? super k> cv1Var) {
            super(3, cv1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(List<jv1> list, List<hp6> list2, List<jv1> list3, Set<jv1> set, Set<jv1> set2) {
            list.clear();
            list2.clear();
            list3.clear();
            set.clear();
            set2.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(List<hp6> list, h99 h99Var) {
            list.clear();
            synchronized (h99Var.c) {
                try {
                    List list2 = h99Var.j;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((hp6) list2.get(i));
                    }
                    h99Var.j.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00dd -> B:23:0x00e1). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00eb -> B:11:0x0086). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h99.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.y84
        /* renamed from: k */
        public final Object invoke(qx1 qx1Var, no6 no6Var, cv1<? super Unit> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.g = no6Var;
            return kVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: h99$l */
    /* loaded from: classes.dex */
    public static final class l extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ jv1 a;
        final /* synthetic */ lt4<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(jv1 jv1Var, lt4<Object> lt4Var) {
            super(1);
            this.a = jv1Var;
            this.b = lt4Var;
        }

        public final void a(Object obj) {
            z65.h(obj, "value");
            this.a.q(obj);
            lt4<Object> lt4Var = this.b;
            if (lt4Var != null) {
                lt4Var.add(obj);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    public h99(CoroutineContext coroutineContext) {
        z65.h(coroutineContext, "effectCoroutineContext");
        fg0 fg0Var = new fg0(new e());
        this.b = fg0Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.g = new lt4<>();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.t = mua.a(d.Inactive);
        bl1 a2 = q95.a((l95) coroutineContext.c(l95.M));
        a2.r(new f());
        this.u = a2;
        this.v = coroutineContext.P(fg0Var).P(a2);
        this.w = new c();
    }

    private final void T(dr6 dr6Var) {
        try {
            if (!(dr6Var.C() instanceof zoa.a)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
        } finally {
            dr6Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(cv1<? super Unit> cv1Var) {
        cv1 c2;
        gn0 gn0Var;
        Object d2;
        Object d3;
        if (!d0()) {
            c2 = b75.c(cv1Var);
            gn0 gn0Var2 = new gn0(c2, 1);
            gn0Var2.w();
            synchronized (this.c) {
                if (!d0()) {
                    this.o = gn0Var2;
                    gn0Var = null;
                } else {
                    gn0Var = gn0Var2;
                }
            }
            if (gn0Var != null) {
                sk9.a aVar = sk9.b;
                gn0Var.resumeWith(sk9.b(Unit.a));
            }
            Object s = gn0Var2.s();
            d2 = c75.d();
            if (s == d2) {
                io2.c(cv1Var);
            }
            d3 = c75.d();
            if (s == d3) {
                return s;
            }
            return Unit.a;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fn0<Unit> W() {
        d dVar;
        if (this.t.getValue().compareTo(d.ShuttingDown) <= 0) {
            this.f.clear();
            this.g = new lt4<>();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.m = null;
            fn0<? super Unit> fn0Var = this.o;
            if (fn0Var != null) {
                fn0.a.a(fn0Var, null, 1, null);
            }
            this.o = null;
            this.r = null;
            return null;
        }
        if (this.r != null) {
            dVar = d.Inactive;
        } else if (this.d == null) {
            this.g = new lt4<>();
            this.h.clear();
            if (b0()) {
                dVar = d.InactivePendingWork;
            } else {
                dVar = d.Inactive;
            }
        } else if (!(!this.h.isEmpty()) && !this.g.u() && !(!this.i.isEmpty()) && !(!this.j.isEmpty()) && this.p <= 0 && !b0()) {
            dVar = d.Idle;
        } else {
            dVar = d.PendingWork;
        }
        this.t.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        fn0 fn0Var2 = this.o;
        this.o = null;
        return fn0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        int i2;
        List l2;
        List y2;
        synchronized (this.c) {
            try {
                if (!this.k.isEmpty()) {
                    y2 = lc1.y(this.k.values());
                    this.k.clear();
                    l2 = new ArrayList(y2.size());
                    int size = y2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        hp6 hp6Var = (hp6) y2.get(i3);
                        l2.add(lnb.a(hp6Var, this.l.get(hp6Var)));
                    }
                    this.l.clear();
                } else {
                    l2 = kc1.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = l2.size();
        for (i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) l2.get(i2);
            hp6 hp6Var2 = (hp6) pair.a();
            gp6 gp6Var = (gp6) pair.b();
            if (gp6Var != null) {
                hp6Var2.b().h(gp6Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0() {
        boolean b0;
        synchronized (this.c) {
            b0 = b0();
        }
        return b0;
    }

    private final boolean b0() {
        if (!this.s && this.b.p()) {
            return true;
        }
        return false;
    }

    private final boolean c0() {
        if ((!this.h.isEmpty()) || b0()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d0() {
        boolean z2;
        synchronized (this.c) {
            z2 = true;
            if (!this.g.u() && !(!this.h.isEmpty())) {
                if (!b0()) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        boolean z2;
        synchronized (this.c) {
            z2 = !this.q;
        }
        if (z2) {
            return true;
        }
        for (l95 l95Var : this.u.l()) {
            if (l95Var.b()) {
                return true;
            }
        }
        return false;
    }

    private final void h0(jv1 jv1Var) {
        synchronized (this.c) {
            List<hp6> list = this.j;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (z65.c(list.get(i2).b(), jv1Var)) {
                    Unit unit = Unit.a;
                    ArrayList arrayList = new ArrayList();
                    i0(arrayList, this, jv1Var);
                    while (!arrayList.isEmpty()) {
                        j0(arrayList, null);
                        i0(arrayList, this, jv1Var);
                    }
                    return;
                }
            }
        }
    }

    private static final void i0(List<hp6> list, h99 h99Var, jv1 jv1Var) {
        list.clear();
        synchronized (h99Var.c) {
            try {
                Iterator<hp6> it = h99Var.j.iterator();
                while (it.hasNext()) {
                    hp6 next = it.next();
                    if (z65.c(next.b(), jv1Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<jv1> j0(List<hp6> list, lt4<Object> lt4Var) {
        List<jv1> F0;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            hp6 hp6Var = list.get(i2);
            jv1 b2 = hp6Var.b();
            Object obj = hashMap.get(b2);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b2, obj);
            }
            ((ArrayList) obj).add(hp6Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            jv1 jv1Var = (jv1) entry.getKey();
            List list2 = (List) entry.getValue();
            tn1.T(!jv1Var.p());
            dr6 h2 = yoa.e.h(n0(jv1Var), t0(jv1Var, lt4Var));
            try {
                yoa l2 = h2.l();
                synchronized (this.c) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        hp6 hp6Var2 = (hp6) list2.get(i3);
                        arrayList.add(lnb.a(hp6Var2, i99.b(this.k, hp6Var2.c())));
                    }
                }
                jv1Var.g(arrayList);
                Unit unit = Unit.a;
                h2.s(l2);
            } finally {
                T(h2);
            }
        }
        F0 = sc1.F0(hashMap.keySet());
        return F0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jv1 k0(jv1 jv1Var, lt4<Object> lt4Var) {
        Set<jv1> set;
        if (jv1Var.p() || jv1Var.i() || ((set = this.n) != null && set.contains(jv1Var))) {
            return null;
        }
        dr6 h2 = yoa.e.h(n0(jv1Var), t0(jv1Var, lt4Var));
        try {
            yoa l2 = h2.l();
            if (lt4Var != null && lt4Var.u()) {
                jv1Var.m(new h(lt4Var, jv1Var));
            }
            boolean k2 = jv1Var.k();
            h2.s(l2);
            if (!k2) {
                return null;
            }
            return jv1Var;
        } finally {
            T(h2);
        }
    }

    private final void l0(Exception exc, jv1 jv1Var, boolean z2) {
        Boolean bool = A.get();
        z65.g(bool, "_hotReloadEnabled.get()");
        if (bool.booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                try {
                    e6.d("Error was captured in composition while live edit was enabled.", exc);
                    this.i.clear();
                    this.h.clear();
                    this.g = new lt4<>();
                    this.j.clear();
                    this.k.clear();
                    this.l.clear();
                    this.r = new b(z2, exc);
                    if (jv1Var != null) {
                        List list = this.m;
                        if (list == null) {
                            list = new ArrayList();
                            this.m = list;
                        }
                        if (!list.contains(jv1Var)) {
                            list.add(jv1Var);
                        }
                        this.f.remove(jv1Var);
                    }
                    W();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw exc;
    }

    static /* synthetic */ void m0(h99 h99Var, Exception exc, jv1 jv1Var, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jv1Var = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        h99Var.l0(exc, jv1Var, z2);
    }

    private final Function1<Object, Unit> n0(jv1 jv1Var) {
        return new i(jv1Var);
    }

    private final Object o0(y84<? super qx1, ? super no6, ? super cv1<? super Unit>, ? extends Object> y84Var, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.b, new j(y84Var, oo6.a(cv1Var.getContext()), null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p0() {
        List I0;
        boolean c0;
        synchronized (this.c) {
            if (this.g.isEmpty()) {
                return c0();
            }
            lt4<Object> lt4Var = this.g;
            this.g = new lt4<>();
            synchronized (this.c) {
                I0 = sc1.I0(this.f);
            }
            try {
                int size = I0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((jv1) I0.get(i2)).n(lt4Var);
                    if (this.t.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.g = new lt4<>();
                synchronized (this.c) {
                    if (W() == null) {
                        c0 = c0();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                }
                return c0;
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.g.g(lt4Var);
                    Unit unit = Unit.a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(l95 l95Var) {
        synchronized (this.c) {
            Throwable th = this.e;
            if (th == null) {
                if (this.t.getValue().compareTo(d.ShuttingDown) > 0) {
                    if (this.d == null) {
                        this.d = l95Var;
                        W();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    private final Function1<Object, Unit> t0(jv1 jv1Var, lt4<Object> lt4Var) {
        return new l(jv1Var, lt4Var);
    }

    public final void V() {
        synchronized (this.c) {
            try {
                if (this.t.getValue().compareTo(d.Idle) >= 0) {
                    this.t.setValue(d.ShuttingDown);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        l95.a.a(this.u, null, 1, null);
    }

    public final long Y() {
        return this.a;
    }

    public final kua<d> Z() {
        return this.t;
    }

    @Override // defpackage.do1
    public void a(jv1 jv1Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(jv1Var, "composition");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        boolean p = jv1Var.p();
        try {
            yoa.a aVar = yoa.e;
            dr6 h2 = aVar.h(n0(jv1Var), t0(jv1Var, null));
            yoa l2 = h2.l();
            try {
                jv1Var.c(function2);
                Unit unit = Unit.a;
                T(h2);
                if (!p) {
                    aVar.c();
                }
                synchronized (this.c) {
                    if (this.t.getValue().compareTo(d.ShuttingDown) > 0 && !this.f.contains(jv1Var)) {
                        this.f.add(jv1Var);
                    }
                }
                try {
                    h0(jv1Var);
                    try {
                        jv1Var.o();
                        jv1Var.e();
                        if (!p) {
                            aVar.c();
                        }
                    } catch (Exception e2) {
                        m0(this, e2, null, false, 6, null);
                    }
                } catch (Exception e3) {
                    l0(e3, jv1Var, true);
                }
            } finally {
                h2.s(l2);
            }
        } catch (Exception e4) {
            l0(e4, jv1Var, true);
        }
    }

    @Override // defpackage.do1
    public void b(hp6 hp6Var) {
        z65.h(hp6Var, "reference");
        synchronized (this.c) {
            i99.a(this.k, hp6Var.c(), hp6Var);
        }
    }

    @Override // defpackage.do1
    public boolean d() {
        return false;
    }

    @Override // defpackage.do1
    public int f() {
        return 1000;
    }

    public final Object f0(cv1<? super Unit> cv1Var) {
        Object d2;
        Object v = wz3.v(Z(), new g(null), cv1Var);
        d2 = c75.d();
        if (v == d2) {
            return v;
        }
        return Unit.a;
    }

    @Override // defpackage.do1
    public CoroutineContext g() {
        return this.v;
    }

    public final void g0() {
        synchronized (this.c) {
            this.s = true;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.do1
    public void h(hp6 hp6Var) {
        fn0<Unit> W;
        z65.h(hp6Var, "reference");
        synchronized (this.c) {
            this.j.add(hp6Var);
            W = W();
        }
        if (W != null) {
            sk9.a aVar = sk9.b;
            W.resumeWith(sk9.b(Unit.a));
        }
    }

    @Override // defpackage.do1
    public void i(jv1 jv1Var) {
        fn0<Unit> fn0Var;
        z65.h(jv1Var, "composition");
        synchronized (this.c) {
            if (!this.h.contains(jv1Var)) {
                this.h.add(jv1Var);
                fn0Var = W();
            } else {
                fn0Var = null;
            }
        }
        if (fn0Var != null) {
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(Unit.a));
        }
    }

    @Override // defpackage.do1
    public void j(hp6 hp6Var, gp6 gp6Var) {
        z65.h(hp6Var, "reference");
        z65.h(gp6Var, "data");
        synchronized (this.c) {
            this.l.put(hp6Var, gp6Var);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.do1
    public gp6 k(hp6 hp6Var) {
        gp6 remove;
        z65.h(hp6Var, "reference");
        synchronized (this.c) {
            remove = this.l.remove(hp6Var);
        }
        return remove;
    }

    @Override // defpackage.do1
    public void l(Set<fo1> set) {
        z65.h(set, "table");
    }

    @Override // defpackage.do1
    public void n(jv1 jv1Var) {
        z65.h(jv1Var, "composition");
        synchronized (this.c) {
            try {
                Set set = this.n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.n = set;
                }
                set.add(jv1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.do1
    public void q(jv1 jv1Var) {
        z65.h(jv1Var, "composition");
        synchronized (this.c) {
            this.f.remove(jv1Var);
            this.h.remove(jv1Var);
            this.i.remove(jv1Var);
            Unit unit = Unit.a;
        }
    }

    public final void r0() {
        fn0<Unit> fn0Var;
        synchronized (this.c) {
            if (this.s) {
                this.s = false;
                fn0Var = W();
            } else {
                fn0Var = null;
            }
        }
        if (fn0Var != null) {
            sk9.a aVar = sk9.b;
            fn0Var.resumeWith(sk9.b(Unit.a));
        }
    }

    public final Object s0(cv1<? super Unit> cv1Var) {
        Object d2;
        Object o0 = o0(new k(null), cv1Var);
        d2 = c75.d();
        if (o0 == d2) {
            return o0;
        }
        return Unit.a;
    }
}
