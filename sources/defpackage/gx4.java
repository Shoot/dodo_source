package defpackage;

import defpackage.dk6;
import defpackage.j;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InAppABTestLogic.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0002J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lgx4;", "Ldk6;", "", "", "", "inAppsForAbtest", "b", "allInApps", "a", "(Ljava/util/List;Lcv1;)Ljava/lang/Object;", "Lo42;", "Lo42;", "mixer", "Lfm6;", "Lfm6;", "repository", "<init>", "(Lo42;Lfm6;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gx4  reason: default package */
/* loaded from: classes.dex */
public final class gx4 implements dk6 {
    private final o42 a;
    private final fm6 b;

    /* compiled from: InAppABTestLogic.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: gx4$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.a.EnumC0369a.values().length];
            try {
                iArr[j.a.EnumC0369a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.EnumC0369a.CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppABTestLogic.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.abtests.InAppABTestLogic", f = "InAppABTestLogic.kt", l = {14}, m = "getInAppsPool")
    /* renamed from: gx4$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return gx4.this.a(null, this);
        }
    }

    public gx4(o42 o42Var, fm6 fm6Var) {
        z65.h(o42Var, "mixer");
        z65.h(fm6Var, "repository");
        this.a = o42Var;
        this.b = fm6Var;
    }

    private final Set<String> b(List<? extends Set<String>> list) {
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = sc1.e0((Set) next, (Set) it.next());
            }
            return (Set) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<java.lang.String> r17, defpackage.cv1<? super java.util.Set<java.lang.String>> r18) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx4.a(java.util.List, cv1):java.lang.Object");
    }

    public void c(String str) {
        dk6.a.c(this, str);
    }

    @Override // defpackage.dk6
    public void g(String str, Throwable th) {
        dk6.a.d(this, str, th);
    }

    @Override // defpackage.dk6
    public void h(String str, Throwable th) {
        dk6.a.a(this, str, th);
    }
}
