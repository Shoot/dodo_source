package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ArrayChannel.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020&\u0012 \u0010F\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`E¢\u0006\u0004\bG\u0010HJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00107\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010=\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u0014\u0010?\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010C\u001a\u00020@8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006I"}, d2 = {"Lfr;", "E", "La1;", "", "currentSize", "Lr3b;", "e0", "(I)Lr3b;", "element", "", "c0", "(ILjava/lang/Object;)V", "d0", "(I)V", "", "A", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkba;", "send", "j", "(Lkba;)Ljava/lang/Object;", "W", "()Ljava/lang/Object;", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "X", "(Lv5a;)Ljava/lang/Object;", "Lz89;", "receive", "", "M", "(Lz89;)Z", "wasClosed", "S", "(Z)V", DateTokenConverter.CONVERTER_KEY, "I", "capacity", "Lzg0;", e.a, "Lzg0;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "f", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "g", "[Ljava/lang/Object;", "buffer", Image.TYPE_HIGH, "head", "O", "()Z", "isBufferAlwaysEmpty", "P", "isBufferEmpty", "x", "isBufferAlwaysFull", "y", "isBufferFull", "Q", "isClosedForReceive", "", "k", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILzg0;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: fr  reason: default package */
/* loaded from: classes3.dex */
public class fr<E> extends a1<E> {
    private final int d;
    private final zg0 e;
    private final ReentrantLock f;
    private Object[] g;
    private int h;
    private volatile /* synthetic */ int size;

    /* compiled from: ArrayChannel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: fr$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zg0.values().length];
            iArr[zg0.SUSPEND.ordinal()] = 1;
            iArr[zg0.DROP_LATEST.ordinal()] = 2;
            iArr[zg0.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fr(int i, zg0 zg0Var, Function1<? super E, Unit> function1) {
        super(function1);
        this.d = i;
        this.e = zg0Var;
        if (i >= 1) {
            this.f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            xr.s(objArr, b1.a, 0, 0, 6, null);
            this.g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    private final void c0(int i, E e) {
        if (i < this.d) {
            d0(i);
            Object[] objArr = this.g;
            objArr[(this.h + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.g;
        int i2 = this.h;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.h = (i2 + 1) % objArr2.length;
    }

    private final void d0(int i) {
        Object[] objArr = this.g;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.d);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.g;
                objArr2[i2] = objArr3[(this.h + i2) % objArr3.length];
            }
            xr.q(objArr2, b1.a, i, min);
            this.g = objArr2;
            this.h = 0;
        }
    }

    private final r3b e0(int i) {
        if (i < this.d) {
            this.size = i + 1;
            return null;
        }
        int i2 = a.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b1.b;
        }
        return b1.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e2
    public Object A(E e) {
        b99<E> E;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            int i = this.size;
            ba1<?> m = m();
            if (m != null) {
                return m;
            }
            r3b e0 = e0(i);
            if (e0 != null) {
                return e0;
            }
            if (i == 0) {
                do {
                    E = E();
                    if (E != null) {
                        if (E instanceof ba1) {
                            this.size = i;
                            return E;
                        }
                        z65.e(E);
                    }
                } while (E.l(e, null) == null);
                this.size = i;
                Unit unit = Unit.a;
                reentrantLock.unlock();
                E.i(e);
                return E.c();
            }
            c0(i, e);
            return b1.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.a1
    public boolean M(z89<? super E> z89Var) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return super.M(z89Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.a1
    protected final boolean O() {
        return false;
    }

    @Override // defpackage.a1
    protected final boolean P() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.a1
    public boolean Q() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return super.Q();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.a1
    public void S(boolean z) {
        Function1<E, Unit> function1 = this.a;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.g[this.h];
                if (function1 != null && obj != b1.a) {
                    undeliveredElementException = g97.c(function1, obj, undeliveredElementException);
                }
                Object[] objArr = this.g;
                int i3 = this.h;
                objArr[i3] = b1.a;
                this.h = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.a;
            reentrantLock.unlock();
            super.S(z);
            if (undeliveredElementException == null) {
                return;
            }
            throw undeliveredElementException;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.a1
    protected Object W() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m = m();
                if (m == null) {
                    m = b1.d;
                }
                return m;
            }
            Object[] objArr = this.g;
            int i2 = this.h;
            Object obj = objArr[i2];
            kba kbaVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = b1.d;
            boolean z = false;
            if (i == this.d) {
                kba kbaVar2 = null;
                while (true) {
                    kba F = F();
                    if (F == null) {
                        kbaVar = kbaVar2;
                        break;
                    }
                    z65.e(F);
                    if (F.U(null) != null) {
                        obj2 = F.S();
                        kbaVar = F;
                        z = true;
                        break;
                    }
                    F.V();
                    kbaVar2 = F;
                }
            }
            if (obj2 != b1.d && !(obj2 instanceof ba1)) {
                this.size = i;
                Object[] objArr2 = this.g;
                objArr2[(this.h + i) % objArr2.length] = obj2;
            }
            this.h = (this.h + 1) % this.g.length;
            Unit unit = Unit.a;
            if (z) {
                z65.e(kbaVar);
                kbaVar.R();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:13:0x0019, B:15:0x002d, B:17:0x0037, B:34:0x0084, B:36:0x0088, B:38:0x008c, B:44:0x00ae, B:39:0x0098, B:41:0x009e, B:19:0x0047, B:21:0x004b, B:23:0x004f, B:25:0x0055, B:28:0x0061, B:31:0x0068, B:32:0x0082), top: B:51:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    @Override // defpackage.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object X(defpackage.v5a<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L19
            ba1 r9 = r8.m()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L15
            r3b r9 = defpackage.b1.d     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r9 = move-exception
            goto Lc7
        L15:
            r0.unlock()
            return r9
        L19:
            java.lang.Object[] r2 = r8.g     // Catch: java.lang.Throwable -> L12
            int r3 = r8.h     // Catch: java.lang.Throwable -> L12
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L12
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> L12
            r3b r2 = defpackage.b1.d     // Catch: java.lang.Throwable -> L12
            int r3 = r8.d     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r1 != r3) goto L83
        L2d:
            a1$g r3 = r8.K()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = r9.n(r3)     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L47
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> L12
            defpackage.z65.e(r5)     // Catch: java.lang.Throwable -> L12
            r2 = r5
            kba r2 = (defpackage.kba) r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r2.S()     // Catch: java.lang.Throwable -> L12
        L45:
            r3 = 1
            goto L84
        L47:
            r3b r3 = defpackage.b1.d     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L83
            java.lang.Object r3 = defpackage.ty.b     // Catch: java.lang.Throwable -> L12
            if (r7 == r3) goto L2d
            java.lang.Object r2 = defpackage.w5a.d()     // Catch: java.lang.Throwable -> L12
            if (r7 != r2) goto L61
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.g     // Catch: java.lang.Throwable -> L12
            int r1 = r8.h     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r7
        L61:
            boolean r2 = r7 instanceof defpackage.ba1     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto L68
            r2 = r7
            r5 = r2
            goto L45
        L68:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r7)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L12
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r9     // Catch: java.lang.Throwable -> L12
        L83:
            r3 = 0
        L84:
            r3b r7 = defpackage.b1.d     // Catch: java.lang.Throwable -> L12
            if (r2 == r7) goto L98
            boolean r7 = r2 instanceof defpackage.ba1     // Catch: java.lang.Throwable -> L12
            if (r7 != 0) goto L98
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.g     // Catch: java.lang.Throwable -> L12
            int r7 = r8.h     // Catch: java.lang.Throwable -> L12
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> L12
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> L12
            goto Lae
        L98:
            boolean r9 = r9.o()     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto Lae
            r8.size = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r9 = r8.g     // Catch: java.lang.Throwable -> L12
            int r1 = r8.h     // Catch: java.lang.Throwable -> L12
            r9[r1] = r4     // Catch: java.lang.Throwable -> L12
            java.lang.Object r9 = defpackage.w5a.d()     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            return r9
        Lae:
            int r9 = r8.h     // Catch: java.lang.Throwable -> L12
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.g     // Catch: java.lang.Throwable -> L12
            int r1 = r1.length     // Catch: java.lang.Throwable -> L12
            int r9 = r9 % r1
            r8.h = r9     // Catch: java.lang.Throwable -> L12
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L12
            r0.unlock()
            if (r3 == 0) goto Lc6
            defpackage.z65.e(r5)
            kba r5 = (defpackage.kba) r5
            r5.R()
        Lc6:
            return r4
        Lc7:
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.X(v5a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e2
    public Object j(kba kbaVar) {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            return super.j(kbaVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.e2
    protected String k() {
        return "(buffer:capacity=" + this.d + ",size=" + this.size + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.e2
    protected final boolean x() {
        return false;
    }

    @Override // defpackage.e2
    protected final boolean y() {
        if (this.size == this.d && this.e == zg0.SUSPEND) {
            return true;
        }
        return false;
    }
}
