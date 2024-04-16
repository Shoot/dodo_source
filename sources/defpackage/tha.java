package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: SharedFlow.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010H\u001a\u00020\u0015\u0012\u0006\u0010I\u001a\u00020\u0015\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bg\u0010hJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010\u0001\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u000eH\u0002J\u001b\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u0013H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0002012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\nJ\u001b\u00105\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\fH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0016R\u0014\u0010H\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010-R\u0014\u0010I\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010-R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010-R\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010-R\u0014\u0010Y\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u00107R\u0014\u0010\\\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0014\u0010_\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u00107R\u0014\u0010a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u00107R\u001a\u0010f\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bd\u0010e\u001a\u0004\bb\u0010c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Ltha;", "T", "Lg2;", "Lvha;", "Lcr6;", "", "Lq94;", "value", "", "R", "(Ljava/lang/Object;)Z", "S", "", "E", "", "newHead", "B", "item", "H", "", "curBuffer", "", "curSize", "newSize", "Q", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "G", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "Ltha$a;", "emitter", "y", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "V", "z", "slot", "U", "index", "M", "x", "(Lvha;Lcv1;)Ljava/lang/Object;", "Lcv1;", "resumesIn", "I", "([Lcv1;)[Lcv1;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "a", "emit", "X", "()J", "oldIndex", "W", "(J)[Lcv1;", "C", "size", "D", "(I)[Lvha;", "f", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lzg0;", "onBufferOverflow", "Loz3;", "b", e.a, "replay", "bufferCapacity", "g", "Lzg0;", Image.TYPE_HIGH, "[Ljava/lang/Object;", "buffer", "i", "J", "replayIndex", "j", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "K", "head", "O", "()I", "replaySize", "P", "totalSize", "bufferEndIndex", "N", "queueEndIndex", "L", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: tha  reason: default package */
/* loaded from: classes3.dex */
public class tha<T> extends g2<vha> implements cr6<T>, oz3, q94<T> {
    private final int e;
    private final int f;
    private final zg0 g;
    private Object[] h;
    private long i;
    private long j;
    private int k;
    private int l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Ltha$a;", "Lf43;", "", "a", "Ltha;", "Ltha;", "flow", "", "b", "J", "index", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/Object;", "value", "Lcv1;", DateTokenConverter.CONVERTER_KEY, "Lcv1;", "cont", "<init>", "(Ltha;JLjava/lang/Object;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: tha$a */
    /* loaded from: classes3.dex */
    public static final class a implements f43 {
        public final tha<?> a;
        public long b;
        public final Object c;
        public final cv1<Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(tha<?> thaVar, long j, Object obj, cv1<? super Unit> cv1Var) {
            this.a = thaVar;
            this.b = j;
            this.c = obj;
            this.d = cv1Var;
        }

        @Override // defpackage.f43
        public void a() {
            this.a.y(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: tha$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zg0.values().length];
            iArr[zg0.SUSPEND.ordinal()] = 1;
            iArr[zg0.DROP_LATEST.ordinal()] = 2;
            iArr[zg0.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
    /* renamed from: tha$c */
    /* loaded from: classes3.dex */
    public static final class c extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        /* synthetic */ Object e;
        final /* synthetic */ tha<T> f;
        int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(tha<T> thaVar, cv1<? super c> cv1Var) {
            super(cv1Var);
            this.f = thaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return tha.A(this.f, null, this);
        }
    }

    public tha(int i, int i2, zg0 zg0Var) {
        this.e = i;
        this.f = i2;
        this.g = zg0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object A(defpackage.tha r8, defpackage.pz3 r9, defpackage.cv1 r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tha.A(tha, pz3, cv1):java.lang.Object");
    }

    private final void B(long j) {
        i2[] g;
        if (g2.e(this) != 0 && (g = g2.g(this)) != null) {
            for (i2 i2Var : g) {
                if (i2Var != null) {
                    vha vhaVar = (vha) i2Var;
                    long j2 = vhaVar.a;
                    if (j2 >= 0 && j2 < j) {
                        vhaVar.a = j;
                    }
                }
            }
        }
        this.j = j;
    }

    private final void E() {
        Object[] objArr = this.h;
        z65.e(objArr);
        uha.g(objArr, K(), null);
        this.k--;
        long K = K() + 1;
        if (this.i < K) {
            this.i = K;
        }
        if (this.j < K) {
            B(K);
        }
    }

    static /* synthetic */ Object F(tha thaVar, Object obj, cv1 cv1Var) {
        Object d;
        if (thaVar.a(obj)) {
            return Unit.a;
        }
        Object G = thaVar.G(obj, cv1Var);
        d = c75.d();
        if (G == d) {
            return G;
        }
        return Unit.a;
    }

    private final Object G(T t, cv1<? super Unit> cv1Var) {
        cv1 c2;
        cv1<Unit>[] cv1VarArr;
        a aVar;
        Object d;
        Object d2;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        cv1<Unit>[] cv1VarArr2 = h2.a;
        synchronized (this) {
            try {
                if (R(t)) {
                    sk9.a aVar2 = sk9.b;
                    gn0Var.resumeWith(sk9.b(Unit.a));
                    cv1VarArr = I(cv1VarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, P() + K(), t, gn0Var);
                    H(aVar3);
                    this.l++;
                    if (this.f == 0) {
                        cv1VarArr2 = I(cv1VarArr2);
                    }
                    cv1VarArr = cv1VarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            in0.a(gn0Var, aVar);
        }
        for (cv1<Unit> cv1Var2 : cv1VarArr) {
            if (cv1Var2 != null) {
                sk9.a aVar4 = sk9.b;
                cv1Var2.resumeWith(sk9.b(Unit.a));
            }
        }
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        d2 = c75.d();
        if (s == d2) {
            return s;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int P = P();
        Object[] objArr = this.h;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P >= objArr.length) {
            objArr = Q(objArr, P, objArr.length * 2);
        }
        uha.g(objArr, K() + P, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final cv1<Unit>[] I(cv1<Unit>[] cv1VarArr) {
        i2[] g;
        vha vhaVar;
        cv1<? super Unit> cv1Var;
        int length = cv1VarArr.length;
        if (g2.e(this) != 0 && (g = g2.g(this)) != null) {
            int length2 = g.length;
            int i = 0;
            cv1VarArr = cv1VarArr;
            while (i < length2) {
                i2 i2Var = g[i];
                if (i2Var != null && (cv1Var = (vhaVar = (vha) i2Var).b) != null && T(vhaVar) >= 0) {
                    int length3 = cv1VarArr.length;
                    cv1VarArr = cv1VarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cv1VarArr, Math.max(2, cv1VarArr.length * 2));
                        z65.g(copyOf, "copyOf(this, newSize)");
                        cv1VarArr = copyOf;
                    }
                    cv1VarArr[length] = cv1Var;
                    vhaVar.b = null;
                    length++;
                }
                i++;
                cv1VarArr = cv1VarArr;
            }
        }
        return cv1VarArr;
    }

    private final long J() {
        return K() + this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.j, this.i);
    }

    private final Object M(long j) {
        Object f;
        Object[] objArr = this.h;
        z65.e(objArr);
        f = uha.f(objArr, j);
        if (f instanceof a) {
            return ((a) f).c;
        }
        return f;
    }

    private final long N() {
        return K() + this.k + this.l;
    }

    private final int O() {
        return (int) ((K() + this.k) - this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.k + this.l;
    }

    private final Object[] Q(Object[] objArr, int i, int i2) {
        Object f;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K = K();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + K;
                f = uha.f(objArr, j);
                uha.g(objArr2, j, f);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(T t) {
        if (l() == 0) {
            return S(t);
        }
        if (this.k >= this.f && this.j <= this.i) {
            int i = b.$EnumSwitchMapping$0[this.g.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        H(t);
        int i2 = this.k + 1;
        this.k = i2;
        if (i2 > this.f) {
            E();
        }
        if (O() > this.e) {
            V(this.i + 1, this.j, J(), N());
        }
        return true;
    }

    private final boolean S(T t) {
        if (this.e == 0) {
            return true;
        }
        H(t);
        int i = this.k + 1;
        this.k = i;
        if (i > this.e) {
            E();
        }
        this.j = K() + this.k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(vha vhaVar) {
        long j = vhaVar.a;
        if (j < J()) {
            return j;
        }
        if (this.f > 0 || j > K() || this.l == 0) {
            return -1L;
        }
        return j;
    }

    private final Object U(vha vhaVar) {
        Object obj;
        cv1<Unit>[] cv1VarArr = h2.a;
        synchronized (this) {
            try {
                long T = T(vhaVar);
                if (T < 0) {
                    obj = uha.a;
                } else {
                    long j = vhaVar.a;
                    Object M = M(T);
                    vhaVar.a = T + 1;
                    cv1VarArr = W(j);
                    obj = M;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (cv1<Unit> cv1Var : cv1VarArr) {
            if (cv1Var != null) {
                sk9.a aVar = sk9.b;
                cv1Var.resumeWith(sk9.b(Unit.a));
            }
        }
        return obj;
    }

    private final void V(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long K = K(); K < min; K++) {
            Object[] objArr = this.h;
            z65.e(objArr);
            uha.g(objArr, K, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
    }

    private final Object x(vha vhaVar, cv1<? super Unit> cv1Var) {
        cv1 c2;
        Object d;
        Object d2;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        synchronized (this) {
            try {
                if (T(vhaVar) < 0) {
                    vhaVar.b = gn0Var;
                } else {
                    sk9.a aVar = sk9.b;
                    gn0Var.resumeWith(sk9.b(Unit.a));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        d2 = c75.d();
        if (s == d2) {
            return s;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        Object f;
        synchronized (this) {
            if (aVar.b < K()) {
                return;
            }
            Object[] objArr = this.h;
            z65.e(objArr);
            f = uha.f(objArr, aVar.b);
            if (f == aVar) {
                uha.g(objArr, aVar.b, uha.a);
                z();
                Unit unit = Unit.a;
            }
        }
    }

    private final void z() {
        Object f;
        if (this.f == 0 && this.l <= 1) {
            return;
        }
        Object[] objArr = this.h;
        z65.e(objArr);
        while (this.l > 0) {
            f = uha.f(objArr, (K() + P()) - 1);
            if (f == uha.a) {
                this.l--;
                uha.g(objArr, K() + P(), null);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g2
    /* renamed from: C */
    public vha i() {
        return new vha();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g2
    /* renamed from: D */
    public vha[] j(int i) {
        return new vha[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T L() {
        Object f;
        Object[] objArr = this.h;
        z65.e(objArr);
        f = uha.f(objArr, (this.i + O()) - 1);
        return (T) f;
    }

    public final cv1<Unit>[] W(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        Object f;
        Object f2;
        long j5;
        i2[] g;
        if (j > this.j) {
            return h2.a;
        }
        long K = K();
        long j6 = this.k + K;
        if (this.f == 0 && this.l > 0) {
            j6++;
        }
        if (g2.e(this) != 0 && (g = g2.g(this)) != null) {
            for (i2 i2Var : g) {
                if (i2Var != null) {
                    long j7 = ((vha) i2Var).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.j) {
            return h2.a;
        }
        long J = J();
        if (l() > 0) {
            i = Math.min(this.l, this.f - ((int) (J - j6)));
        } else {
            i = this.l;
        }
        cv1<Unit>[] cv1VarArr = h2.a;
        long j8 = this.l + J;
        if (i > 0) {
            cv1VarArr = new cv1[i];
            Object[] objArr = this.h;
            z65.e(objArr);
            long j9 = J;
            int i2 = 0;
            while (true) {
                if (J < j8) {
                    f2 = uha.f(objArr, J);
                    j2 = j6;
                    r3b r3bVar = uha.a;
                    if (f2 != r3bVar) {
                        if (f2 != null) {
                            a aVar = (a) f2;
                            int i3 = i2 + 1;
                            j3 = j8;
                            cv1VarArr[i2] = aVar.d;
                            uha.g(objArr, J, r3bVar);
                            uha.g(objArr, j9, aVar.c);
                            j5 = 1;
                            j9++;
                            if (i3 >= i) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j3 = j8;
                        j5 = 1;
                    }
                    J += j5;
                    j6 = j2;
                    j8 = j3;
                } else {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
            }
            J = j9;
        } else {
            j2 = j6;
            j3 = j8;
        }
        int i4 = (int) (J - K);
        if (l() == 0) {
            j4 = J;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.i, J - Math.min(this.e, i4));
        if (this.f == 0 && max < j3) {
            Object[] objArr2 = this.h;
            z65.e(objArr2);
            f = uha.f(objArr2, max);
            if (z65.c(f, uha.a)) {
                J++;
                max++;
            }
        }
        V(max, j4, J, j3);
        z();
        if (cv1VarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return I(cv1VarArr);
        }
        return cv1VarArr;
    }

    public final long X() {
        long j = this.i;
        if (j < this.j) {
            this.j = j;
        }
        return j;
    }

    @Override // defpackage.cr6
    public boolean a(T t) {
        int i;
        boolean z;
        cv1<Unit>[] cv1VarArr = h2.a;
        synchronized (this) {
            if (R(t)) {
                cv1VarArr = I(cv1VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (cv1<Unit> cv1Var : cv1VarArr) {
            if (cv1Var != null) {
                sk9.a aVar = sk9.b;
                cv1Var.resumeWith(sk9.b(Unit.a));
            }
        }
        return z;
    }

    @Override // defpackage.q94
    public oz3<T> b(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return uha.e(this, coroutineContext, i, zg0Var);
    }

    @Override // defpackage.sha, defpackage.oz3
    public Object collect(pz3<? super T> pz3Var, cv1<?> cv1Var) {
        return A(this, pz3Var, cv1Var);
    }

    @Override // defpackage.cr6, defpackage.pz3
    public Object emit(T t, cv1<? super Unit> cv1Var) {
        return F(this, t, cv1Var);
    }

    @Override // defpackage.cr6
    public void f() {
        synchronized (this) {
            V(J(), this.j, J(), N());
            Unit unit = Unit.a;
        }
    }
}
