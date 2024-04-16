package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.jr6;
import kotlin.Metadata;
/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u0007*\u00020\u0003H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\n*\u00020\u0007H\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0013\u0010\u0016\u001a\u00020\u0013H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010#\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\"\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Lej8;", "Ldj8;", "La03;", "Li73;", "", "O", "(F)I", "", "n0", "(F)F", "Lwcb;", "S", "(J)F", "Ll73;", "Lcna;", "w0", "(J)J", "z", "(F)J", "", "b", DateTokenConverter.CONVERTER_KEY, e.a, "(Lcv1;)Ljava/lang/Object;", "", "C", "Z", "isReleased", c.a, "isCanceled", "Ljr6;", "Ljr6;", "mutex", "getDensity", "()F", "density", "k0", "fontScale", "<init>", "(La03;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ej8  reason: default package */
/* loaded from: classes.dex */
final class ej8 implements dj8, a03 {
    private final /* synthetic */ a03 a;
    private boolean b;
    private boolean c;
    private final jr6 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {357}, m = "reset")
    /* renamed from: ej8$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ej8.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
    /* renamed from: ej8$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ej8.this.C(this);
        }
    }

    public ej8(a03 a03Var) {
        z65.h(a03Var, "density");
        this.a = a03Var;
        this.d = lr6.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // defpackage.dj8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(defpackage.cv1<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ej8.b
            if (r0 == 0) goto L13
            r0 = r6
            ej8$b r0 = (defpackage.ej8.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ej8$b r0 = new ej8$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.a
            ej8 r0 = (defpackage.ej8) r0
            defpackage.vk9.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            defpackage.vk9.b(r6)
            boolean r6 = r5.b
            if (r6 != 0) goto L55
            boolean r6 = r5.c
            if (r6 != 0) goto L55
            jr6 r6 = r5.d
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = defpackage.jr6.a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            jr6 r6 = r0.d
            defpackage.jr6.a.b(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.b
            java.lang.Boolean r6 = defpackage.nf0.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej8.C(cv1):java.lang.Object");
    }

    @Override // defpackage.a03
    public int O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.a03
    public float S(long j) {
        return this.a.S(j);
    }

    public final void b() {
        this.c = true;
        jr6.a.b(this.d, null, 1, null);
    }

    public final void d() {
        this.b = true;
        jr6.a.b(this.d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ej8.a
            if (r0 == 0) goto L13
            r0 = r5
            ej8$a r0 = (defpackage.ej8.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ej8$a r0 = new ej8$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.a
            ej8 r0 = (defpackage.ej8) r0
            defpackage.vk9.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            defpackage.vk9.b(r5)
            jr6 r5 = r4.d
            r0.a = r4
            r0.d = r3
            r2 = 0
            java.lang.Object r5 = defpackage.jr6.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.b = r5
            r0.c = r5
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej8.e(cv1):java.lang.Object");
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.a03
    public float k0() {
        return this.a.k0();
    }

    @Override // defpackage.a03
    public float n0(float f) {
        return this.a.n0(f);
    }

    @Override // defpackage.a03
    public long w0(long j) {
        return this.a.w0(j);
    }

    @Override // defpackage.a03
    public long z(float f) {
        return this.a.z(f);
    }
}
