package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00101J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010\"J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b2\u0010\u0016\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Llua;", "T", "Lg2;", "Lnua;", "Lfr6;", "", "Lq94;", "expectedState", "newState", "", "p", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", DateTokenConverter.CONVERTER_KEY, "value", "a", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "f", "()V", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "n", "()Lnua;", "", "size", "", "o", "(I)[Lnua;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lzg0;", "onBufferOverflow", "Loz3;", "b", "(Lkotlin/coroutines/CoroutineContext;ILzg0;)Loz3;", e.a, "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: lua  reason: default package */
/* loaded from: classes3.dex */
public final class lua<T> extends g2<nua> implements fr6<T>, oz3, q94<T> {
    private volatile /* synthetic */ Object _state;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateFlow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* renamed from: lua$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        /* synthetic */ Object f;
        final /* synthetic */ lua<T> g;
        int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(lua<T> luaVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.g = luaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.collect(null, this);
        }
    }

    public lua(Object obj) {
        this._state = obj;
    }

    private final boolean p(Object obj, Object obj2) {
        int i;
        nua[] m;
        m();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !z65.c(obj3, obj)) {
                return false;
            }
            if (z65.c(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.e;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.e = i3;
                nua[] m2 = m();
                Unit unit = Unit.a;
                while (true) {
                    nua[] nuaVarArr = m2;
                    if (nuaVarArr != null) {
                        for (nua nuaVar : nuaVarArr) {
                            if (nuaVar != null) {
                                nuaVar.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.e;
                        if (i == i3) {
                            this.e = i3 + 1;
                            return true;
                        }
                        m = m();
                        Unit unit2 = Unit.a;
                    }
                    m2 = m;
                    i3 = i;
                }
            } else {
                this.e = i2 + 2;
                return true;
            }
        }
    }

    @Override // defpackage.cr6
    public boolean a(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.q94
    public oz3<T> b(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return mua.d(this, coroutineContext, i, zg0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (defpackage.z65.c(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00af, B:40:0x00b4, B:50:0x00d5, B:52:0x00db, B:42:0x00ba, B:46:0x00c1, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [i2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d9 -> B:36:0x00ab). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00eb -> B:36:0x00ab). Please submit an issue!!! */
    @Override // defpackage.sha, defpackage.oz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(defpackage.pz3<? super T> r11, defpackage.cv1<?> r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lua.collect(pz3, cv1):java.lang.Object");
    }

    @Override // defpackage.fr6
    public boolean d(T t, T t2) {
        if (t == null) {
            t = (T) t37.a;
        }
        if (t2 == null) {
            t2 = (T) t37.a;
        }
        return p(t, t2);
    }

    @Override // defpackage.cr6, defpackage.pz3
    public Object emit(T t, cv1<? super Unit> cv1Var) {
        setValue(t);
        return Unit.a;
    }

    @Override // defpackage.cr6
    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.fr6, defpackage.kua
    public T getValue() {
        r3b r3bVar = t37.a;
        T t = (T) this._state;
        if (t == r3bVar) {
            return null;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g2
    /* renamed from: n */
    public nua i() {
        return new nua();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.g2
    /* renamed from: o */
    public nua[] j(int i) {
        return new nua[i];
    }

    @Override // defpackage.fr6
    public void setValue(T t) {
        if (t == null) {
            t = (T) t37.a;
        }
        p(null, t);
    }
}
