package androidx.compose.runtime.snapshots;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Ldr6;", "Lkotlin/Function1;", "", "", "readObserver", "Lyoa;", "x", "writeObserver", "P", "o", "()V", "snapshot", "", "T", "(Lyoa;)Ljava/lang/Void;", "S", "Lzoa;", "C", DateTokenConverter.CONVERTER_KEY, "", "id", "Lbpa;", "invalid", "<init>", "(ILbpa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a extends dr6 {

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.snapshots.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0018a extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ List<Function1<Object, Unit>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0018a(List<Function1<Object, Unit>> list) {
            super(1);
            this.a = list;
        }

        public final void a(Object obj) {
            z65.h(obj, "state");
            List<Function1<Object, Unit>> list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(obj);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbpa;", "invalid", "Ldr6;", "a", "(Lbpa;)Ldr6;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<bpa, dr6> {
        final /* synthetic */ Function1<Object, Unit> a;
        final /* synthetic */ Function1<Object, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.a = function1;
            this.b = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final dr6 invoke(bpa bpaVar) {
            int i;
            z65.h(bpaVar, "invalid");
            synchronized (fpa.G()) {
                i = fpa.e;
                fpa.e = i + 1;
            }
            return new dr6(i, bpaVar, this.a, this.b);
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbpa;", "invalid", "Lo79;", "a", "(Lbpa;)Lo79;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<bpa, o79> {
        final /* synthetic */ Function1<Object, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1<Object, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final o79 invoke(bpa bpaVar) {
            int i;
            z65.h(bpaVar, "invalid");
            synchronized (fpa.G()) {
                i = fpa.e;
                fpa.e = i + 1;
            }
            return new o79(i, bpaVar, this.a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r5, defpackage.bpa r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            defpackage.z65.h(r6, r0)
            java.lang.Object r0 = defpackage.fpa.G()
            monitor-enter(r0)
            java.util.List r1 = defpackage.fpa.h()     // Catch: java.lang.Throwable -> L24
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r1 = defpackage.fpa.h()     // Catch: java.lang.Throwable -> L24
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L24
            java.util.List r1 = defpackage.ic1.I0(r1)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r5 = move-exception
            goto L3d
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L37
            java.lang.Object r3 = defpackage.ic1.w0(r1)     // Catch: java.lang.Throwable -> L24
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L38
            androidx.compose.runtime.snapshots.a$a r3 = new androidx.compose.runtime.snapshots.a$a     // Catch: java.lang.Throwable -> L24
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L24
            goto L38
        L37:
            r3 = r2
        L38:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L3d:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.<init>(int, bpa):void");
    }

    @Override // defpackage.dr6
    public zoa C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // defpackage.dr6
    public dr6 P(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        yoa Z;
        Z = fpa.Z(new b(function1, function12));
        return (dr6) Z;
    }

    @Override // defpackage.dr6, defpackage.yoa
    /* renamed from: S */
    public Void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6, defpackage.yoa
    /* renamed from: T */
    public Void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void d() {
        synchronized (fpa.G()) {
            q();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void o() {
        fpa.z();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public yoa x(Function1<Object, Unit> function1) {
        yoa Z;
        Z = fpa.Z(new c(function1));
        return Z;
    }
}
