package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lvta;", "Lhia;", "Lkua;", "", "subscriptionCount", "Loz3;", "Lfia;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", c.a, "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: vta  reason: default package */
/* loaded from: classes3.dex */
public final class vta implements hia {
    private final long b;
    private final long c;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lfia;", "", "count", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    /* renamed from: vta$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements y84<pz3<? super fia>, Integer, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        /* synthetic */ int c;

        a(cv1<? super a> cv1Var) {
            super(3, cv1Var);
        }

        public final Object i(pz3<? super fia> pz3Var, int i, cv1<? super Unit> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = pz3Var;
            aVar.c = i;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Object invoke(pz3<? super fia> pz3Var, Integer num, cv1<? super Unit> cv1Var) {
            return i(pz3Var, num.intValue(), cv1Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r9.a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r10)
                goto L64
            L38:
                defpackage.vk9.b(r10)
                goto L9c
            L3c:
                defpackage.vk9.b(r10)
                java.lang.Object r10 = r9.b
                r1 = r10
                pz3 r1 = (defpackage.pz3) r1
                int r10 = r9.c
                if (r10 <= 0) goto L53
                fia r10 = defpackage.fia.START
                r9.a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                vta r10 = defpackage.vta.this
                long r6 = defpackage.vta.c(r10)
                r9.b = r1
                r9.a = r5
                java.lang.Object r10 = defpackage.xt2.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                vta r10 = defpackage.vta.this
                long r5 = defpackage.vta.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                fia r10 = defpackage.fia.STOP
                r9.b = r1
                r9.a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                vta r10 = defpackage.vta.this
                long r4 = defpackage.vta.b(r10)
                r9.b = r1
                r9.a = r3
                java.lang.Object r10 = defpackage.xt2.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                fia r10 = defpackage.fia.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.b = r3
                r9.a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vta.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lfia;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* renamed from: vta$b */
    /* loaded from: classes3.dex */
    static final class b extends f3b implements Function2<fia, cv1<? super Boolean>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(fia fiaVar, cv1<? super Boolean> cv1Var) {
            return ((b) create(fiaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((fia) this.b) != fia.START) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public vta(long j, long j2) {
        this.b = j;
        this.c = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // defpackage.hia
    public oz3<fia> a(kua<Integer> kuaVar) {
        return wz3.o(wz3.p(wz3.N(kuaVar, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof vta) {
            vta vtaVar = (vta) obj;
            if (this.b == vtaVar.b && this.c == vtaVar.c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (ax1.a(this.b) * 31) + ax1.a(this.c);
    }

    public String toString() {
        List d;
        List a2;
        String i0;
        d = jc1.d(2);
        if (this.b > 0) {
            d.add("stopTimeout=" + this.b + "ms");
        }
        if (this.c < Long.MAX_VALUE) {
            d.add("replayExpiration=" + this.c + "ms");
        }
        a2 = jc1.a(d);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        i0 = sc1.i0(a2, null, null, null, 0, null, null, 63, null);
        sb.append(i0);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
