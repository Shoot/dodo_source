package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TabLayoutColorManager.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"Lp5b;", "Ln5b;", "", "Ldd6;", "categories", "", c.a, "a", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "b", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lp5b$a;", "Lp5b$a;", "listener", "<init>", "(Lcom/google/android/material/tabs/TabLayout;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p5b  reason: default package */
/* loaded from: classes2.dex */
public final class p5b implements n5b {
    private final TabLayout a;
    private final a b;

    public p5b(TabLayout tabLayout) {
        z65.h(tabLayout, "tabLayout");
        this.a = tabLayout;
        this.b = new a();
    }

    private final void c(List<dd6> list) {
        this.b.d(list);
        this.a.d(this.b);
    }

    @Override // defpackage.n5b
    public void a(List<dd6> list) {
        z65.h(list, "categories");
        c(list);
    }

    public final TabLayout b() {
        return this.a;
    }

    /* compiled from: TabLayoutColorManager.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lp5b$a;", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout;", "", "normalColor", "selectedColor", "", e.a, "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "a", "b", c.a, "", "Ldd6;", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "categories", "<init>", "(Lp5b;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p5b$a */
    /* loaded from: classes2.dex */
    public final class a implements TabLayout.d {
        private List<dd6> a;

        /* compiled from: TabLayoutColorManager.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: p5b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0475a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[y33.values().length];
                try {
                    iArr[y33.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y33.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        private final void e(TabLayout tabLayout, int i, int i2) {
            tabLayout.M(iu1.c(tabLayout.getContext(), i), iu1.c(tabLayout.getContext(), i2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
            r0 = defpackage.sc1.M0(r0);
         */
        @Override // com.google.android.material.tabs.TabLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.google.android.material.tabs.TabLayout.g r5) {
            /*
                r4 = this;
                java.util.List<dd6> r0 = r4.a
                if (r0 == 0) goto L61
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Iterable r0 = defpackage.ic1.M0(r0)
                if (r0 == 0) goto L61
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2a
                java.lang.Object r1 = r0.next()
                r2 = r1
                kotlin.collections.IndexedValue r2 = (kotlin.collections.IndexedValue) r2
                if (r5 == 0) goto L10
                int r2 = r2.a()
                int r3 = r5.g()
                if (r2 != r3) goto L10
                goto L2b
            L2a:
                r1 = 0
            L2b:
                kotlin.collections.IndexedValue r1 = (kotlin.collections.IndexedValue) r1
                if (r1 == 0) goto L61
                p5b r5 = defpackage.p5b.this
                java.lang.Object r0 = r1.b()
                dd6 r0 = (defpackage.dd6) r0
                y33 r0 = r0.b()
                int[] r1 = defpackage.p5b.a.C0475a.$EnumSwitchMapping$0
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L56
                r1 = 2
                if (r0 == r1) goto L4a
                goto L61
            L4a:
                com.google.android.material.tabs.TabLayout r5 = r5.b()
                int r0 = defpackage.ew8.D
                int r1 = defpackage.ew8.z
                r4.e(r5, r0, r1)
                goto L61
            L56:
                com.google.android.material.tabs.TabLayout r5 = r5.b()
                int r0 = defpackage.ew8.D
                int r1 = defpackage.ew8.A
                r4.e(r5, r0, r1)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.p5b.a.a(com.google.android.material.tabs.TabLayout$g):void");
        }

        public final void d(List<dd6> list) {
            this.a = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }
}
