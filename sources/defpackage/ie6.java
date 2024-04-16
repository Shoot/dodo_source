package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MenuItemImageUrlProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lie6;", "Lhe6;", "", "menuItemId", "Lre6;", "menuItemType", "", "a", "Luja;", "Luja;", "shoppingItemRepository", "Lah6;", "b", "Lah6;", "menuService", "Lwr2;", c.a, "Lwr2;", "defaultShoppingItemSelectorFactory", "<init>", "(Luja;Lah6;Lwr2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ie6  reason: default package */
/* loaded from: classes2.dex */
public final class ie6 implements he6 {
    private final uja a;
    private final ah6 b;
    private final wr2 c;

    /* compiled from: MenuItemImageUrlProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ie6$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[re6.values().length];
            try {
                iArr[re6.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[re6.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[re6.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ie6(uja ujaVar, ah6 ah6Var, wr2 wr2Var) {
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(ah6Var, "menuService");
        z65.h(wr2Var, "defaultShoppingItemSelectorFactory");
        this.a = ujaVar;
        this.b = ah6Var;
        this.c = wr2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
        r4 = defpackage.sc1.B0(r4, 2);
     */
    @Override // defpackage.he6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> a(java.lang.String r4, defpackage.re6 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "menuItemId"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "menuItemType"
            defpackage.z65.h(r5, r0)
            uja r0 = r3.a
            java.util.Collection r4 = r0.b(r4)
            int[] r0 = defpackage.ie6.a.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 0
            r1 = 1
            r2 = 2
            if (r5 == r1) goto L4f
            if (r5 == r2) goto L37
            r1 = 3
            if (r5 == r1) goto L37
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = defpackage.ic1.t0(r4)
            tja r4 = (defpackage.tja) r4
            fl8 r4 = r4.Y()
            java.lang.String r4 = r4.d()
            java.util.List r4 = defpackage.ic1.e(r4)
            goto L9e
        L37:
            wr2 r5 = r3.c
            vr2 r5 = r5.a(r4)
            r1 = 0
            tja r4 = defpackage.vr2.a.a(r5, r4, r1, r2, r0)
            fl8 r4 = r4.Y()
            java.lang.String r4 = r4.d()
            java.util.List r4 = defpackage.ic1.e(r4)
            goto L9e
        L4f:
            ah6 r4 = r3.b
            java.util.Map r4 = r4.j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.get(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L96
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = defpackage.ic1.B0(r4, r2)
            if (r4 == 0) goto L96
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ic1.w(r4, r5)
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L7a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L96
            java.lang.Object r5 = r4.next()
            nk4 r5 = (defpackage.nk4) r5
            tja r5 = r5.b()
            fl8 r5 = r5.Y()
            java.lang.String r5 = r5.d()
            r0.add(r5)
            goto L7a
        L96:
            if (r0 != 0) goto L9d
            java.util.List r4 = defpackage.ic1.l()
            goto L9e
        L9d:
            r4 = r0
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.a(java.lang.String, re6):java.util.List");
    }
}
