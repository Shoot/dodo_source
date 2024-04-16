package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PaymentWayAcquirerFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Llw7;", "Lkw7;", "", "Ljw7;", "paymentWays", "", "b", "", "a", "Ljava/util/Collection;", "acquirers", "<init>", "(Ljava/util/Collection;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lw7  reason: default package */
/* loaded from: classes2.dex */
public final class lw7 implements kw7 {
    private final Collection<String> a;

    /* compiled from: PaymentWayAcquirerFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lw7$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[dt7.values().length];
            try {
                iArr[dt7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[du7.values().length];
            try {
                iArr2[du7.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[du7.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[du7.l.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[du7.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[du7.k.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[du7.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[du7.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[du7.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[du7.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public lw7(Collection<String> collection) {
        z65.h(collection, "acquirers");
        this.a = collection;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0010 A[SYNTHETIC] */
    @Override // defpackage.kw7
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<defpackage.jw7> a(java.util.Collection<? extends defpackage.jw7> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "paymentWays"
            defpackage.z65.h(r6, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            r2 = r1
            jw7 r2 = (defpackage.jw7) r2
            du7 r3 = r2.c()
            int[] r4 = defpackage.lw7.a.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L54;
                case 2: goto L54;
                case 3: goto L54;
                case 4: goto L38;
                case 5: goto L2d;
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L10
        L2d:
            java.util.Collection<java.lang.String> r3 = r5.a
            java.lang.String r2 = r2.a()
            boolean r2 = r3.contains(r2)
            goto L52
        L38:
            dt7 r3 = r2.b()
            int[] r4 = defpackage.lw7.a.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 != r4) goto L48
            goto L54
        L48:
            java.util.Collection<java.lang.String> r3 = r5.a
            java.lang.String r2 = r2.a()
            boolean r2 = r3.contains(r2)
        L52:
            if (r2 == 0) goto L10
        L54:
            r0.add(r1)
            goto L10
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw7.a(java.util.Collection):java.util.List");
    }
}
