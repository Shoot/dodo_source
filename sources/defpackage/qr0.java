package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.rq0;
import defpackage.uq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartQueueItem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001e2\u00020\u0001:\u0004\n\u0010\u0014\u0002B3\b\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lqr0;", "", DateTokenConverter.CONVERTER_KEY, "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Luq0;", "b", "Luq0;", "()Luq0;", "cartItemId", com.huawei.hms.opendevice.c.a, "I", "()I", e.a, "(I)V", "count", "multiplier", "retryCount", "<init>", "(Ljava/lang/String;Luq0;III)V", "f", "Lqr0$a;", "Lqr0$c;", "Lqr0$d;", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: qr0  reason: default package */
/* loaded from: classes.dex */
public abstract class qr0 {
    public static final b f = new b(null);
    private final String a;
    private final uq0 b;
    private int c;
    private final int d;
    private final int e;

    /* compiled from: CartQueueItem.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B§\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\t¢\u0006\u0004\bR\u0010SJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016JË\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\tHÆ\u0001R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\"\u0010\u000f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b;\u0010(R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b5\u00102R\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b9\u0010(R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u00102R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010&\u001a\u0004\b=\u0010(R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b)\u0010BR\u0017\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\b<\u0010(R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b0\u0010FR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\b/\u0010OR\u001a\u0010#\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u00100\u001a\u0004\bQ\u00102¨\u0006T"}, d2 = {"Lqr0$a;", "Lqr0;", "Lvq0;", "", "toString", "", "other", "", "equals", "", "hashCode", "id", "Luq0;", "cartItemId", "shoppingItemId", "count", "isGift", Action.NAME_ATTRIBUTE, "imageUrl", "doughId", "doughTypeName", "sizeId", "sizeGroupName", "Lhn6;", "price", "productCategory", "Lqq0;", "customizations", "", "Ldq0;", "comboProducts", "Lmr0;", "pizzaHalves", "Lv23;", "discount", "retryCount", "f", "g", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", Image.TYPE_HIGH, "Luq0;", "a", "()Luq0;", "i", "X", "j", "I", "b", "()I", e.a, "(I)V", "k", "Z", "v0", "()Z", "l", "getName", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", "Lhn6;", "()Lhn6;", Image.TYPE_SMALL, "t", "Lqq0;", "()Lqq0;", "u", "Ljava/util/List;", "w0", "()Ljava/util/List;", "v", "z", "w", "Lv23;", "()Lv23;", "x", com.huawei.hms.opendevice.c.a, "<init>", "(Ljava/lang/String;Luq0;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lhn6;Ljava/lang/String;Lqq0;Ljava/util/List;Ljava/util/List;Lv23;I)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qr0$a */
    /* loaded from: classes.dex */
    public static final class a extends qr0 implements vq0 {
        private final String g;
        private final uq0 h;
        private final String i;
        private int j;
        private final boolean k;
        private final String l;
        private final String m;
        private final int n;
        private final String o;
        private final int p;
        private final String q;
        private final hn6 r;
        private final String s;
        private final qq0 t;
        private final List<dq0> u;
        private final List<mr0> v;
        private final v23 w;
        private final int x;

        public /* synthetic */ a(String str, uq0 uq0Var, String str2, int i, boolean z, String str3, String str4, int i2, String str5, int i3, String str6, hn6 hn6Var, String str7, qq0 qq0Var, List list, List list2, v23 v23Var, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uq0Var, str2, i, z, str3, str4, i2, str5, i3, str6, hn6Var, str7, qq0Var, list, list2, v23Var, (i5 & 131072) != 0 ? 0 : i4);
        }

        @Override // defpackage.vq0
        public qq0 I() {
            return this.t;
        }

        @Override // defpackage.vq0
        public String X() {
            return this.i;
        }

        @Override // defpackage.qr0
        public uq0 a() {
            return this.h;
        }

        @Override // defpackage.qr0
        public int b() {
            return this.j;
        }

        @Override // defpackage.qr0
        public int c() {
            return this.x;
        }

        @Override // defpackage.qr0
        public void e(int i) {
            this.j = i;
        }

        @Override // defpackage.qr0
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public final a f(String str, uq0 uq0Var, String str2, int i, boolean z, String str3, String str4, int i2, String str5, int i3, String str6, hn6 hn6Var, String str7, qq0 qq0Var, List<dq0> list, List<mr0> list2, v23 v23Var, int i4) {
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            z65.h(str2, "shoppingItemId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(str4, "imageUrl");
            z65.h(str5, "doughTypeName");
            z65.h(str6, "sizeGroupName");
            z65.h(hn6Var, "price");
            z65.h(str7, "productCategory");
            z65.h(qq0Var, "customizations");
            z65.h(list, "comboProducts");
            z65.h(list2, "pizzaHalves");
            return new a(str, uq0Var, str2, i, z, str3, str4, i2, str5, i3, str6, hn6Var, str7, qq0Var, list, list2, v23Var, i4);
        }

        @Override // defpackage.qr0
        public String getId() {
            return this.g;
        }

        public final String getName() {
            return this.l;
        }

        @Override // defpackage.vq0
        public hn6 h() {
            return this.r;
        }

        @Override // defpackage.qr0
        public int hashCode() {
            return super.hashCode();
        }

        public final v23 j() {
            return this.w;
        }

        public final int k() {
            return this.n;
        }

        public final String l() {
            return this.o;
        }

        public final String m() {
            return this.m;
        }

        public final String n() {
            return this.s;
        }

        public final String o() {
            return this.q;
        }

        public final int q() {
            return this.p;
        }

        @Override // defpackage.qr0
        public String toString() {
            String qr0Var = super.toString();
            return "AddToCartQueueItem " + qr0Var;
        }

        @Override // defpackage.vq0
        public boolean v0() {
            return this.k;
        }

        @Override // defpackage.vq0
        public List<dq0> w0() {
            return this.u;
        }

        @Override // defpackage.vq0
        public List<mr0> z() {
            return this.v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, uq0 uq0Var, String str2, int i, boolean z, String str3, String str4, int i2, String str5, int i3, String str6, hn6 hn6Var, String str7, qq0 qq0Var, List<dq0> list, List<mr0> list2, v23 v23Var, int i4) {
            super(str, uq0Var, i, 1, 0, 16, null);
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            z65.h(str2, "shoppingItemId");
            z65.h(str3, Action.NAME_ATTRIBUTE);
            z65.h(str4, "imageUrl");
            z65.h(str5, "doughTypeName");
            z65.h(str6, "sizeGroupName");
            z65.h(hn6Var, "price");
            z65.h(str7, "productCategory");
            z65.h(qq0Var, "customizations");
            z65.h(list, "comboProducts");
            z65.h(list2, "pizzaHalves");
            this.g = str;
            this.h = uq0Var;
            this.i = str2;
            this.j = i;
            this.k = z;
            this.l = str3;
            this.m = str4;
            this.n = i2;
            this.o = str5;
            this.p = i3;
            this.q = str6;
            this.r = hn6Var;
            this.s = str7;
            this.t = qq0Var;
            this.u = list;
            this.v = list2;
            this.w = v23Var;
            this.x = i4;
        }
    }

    /* compiled from: CartQueueItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lqr0$b;", "", "Lrq0$a;", "cartItemData", "Luq0$b;", "b", "Lrq0;", "Lqr0;", "a", "", "ADD_MULTIPLIER", "I", "EDIT_MULTIPLIER", "REMOVE_MULTIPLIER", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qr0$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final uq0.b b(rq0.a aVar) {
            int w;
            int w2;
            int w3;
            int w4;
            uq0.b.a aVar2 = uq0.b.c;
            String l = aVar.l();
            hn6 j = aVar.j();
            Collection<xq0> b = aVar.c().b();
            w = lc1.w(b, 10);
            ArrayList arrayList = new ArrayList(w);
            for (xq0 xq0Var : b) {
                arrayList.add(xq0Var.getId());
            }
            Collection<xq0> a = aVar.c().a();
            w2 = lc1.w(a, 10);
            ArrayList arrayList2 = new ArrayList(w2);
            for (xq0 xq0Var2 : a) {
                arrayList2.add(xq0Var2.getId());
            }
            List<dq0> b2 = aVar.b();
            w3 = lc1.w(b2, 10);
            ArrayList arrayList3 = new ArrayList(w3);
            for (dq0 dq0Var : b2) {
                arrayList3.add(dq0Var.getId());
            }
            List<mr0> i = aVar.i();
            w4 = lc1.w(i, 10);
            ArrayList arrayList4 = new ArrayList(w4);
            for (mr0 mr0Var : i) {
                arrayList4.add(mr0Var.getId());
            }
            return aVar2.a(l, j, arrayList, arrayList2, arrayList3, arrayList4);
        }

        public final qr0 a(rq0 rq0Var) {
            z65.h(rq0Var, "cartItemData");
            if (rq0Var instanceof rq0.a) {
                rq0.a aVar = (rq0.a) rq0Var;
                return new a(ht4.a.a(), b((rq0.a) rq0Var), aVar.l(), rq0Var.a(), aVar.o(), aVar.h(), aVar.g(), aVar.e(), aVar.f(), aVar.n(), aVar.m(), aVar.j(), aVar.k(), aVar.c(), aVar.b(), aVar.i(), aVar.d(), 0, 131072, null);
            } else if (rq0Var instanceof rq0.b) {
                rq0.b bVar = (rq0.b) rq0Var;
                return new c(ht4.a.a(), bVar.b(), rq0Var.a(), bVar.e(), bVar.c(), bVar.d(), 0, 64, null);
            } else if (rq0Var instanceof rq0.c) {
                return new d(ht4.a.a(), ((rq0.c) rq0Var).b(), rq0Var.a(), 0, 8, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: CartQueueItem.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b/\u00100JW\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!¨\u00061"}, d2 = {"Lqr0$c;", "Lqr0;", "", "id", "Luq0;", "cartItemId", "", "count", "shoppingItemId", "", "Ldq0;", "comboProducts", "Lqq0;", "customizations", "retryCount", "f", "toString", "hashCode", "", "other", "", "equals", "g", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", Image.TYPE_HIGH, "Luq0;", "a", "()Luq0;", "i", "I", "b", "()I", e.a, "(I)V", "j", "X", "k", "Ljava/util/List;", "w0", "()Ljava/util/List;", "l", "Lqq0;", "()Lqq0;", Image.TYPE_MEDIUM, com.huawei.hms.opendevice.c.a, "<init>", "(Ljava/lang/String;Luq0;ILjava/lang/String;Ljava/util/List;Lqq0;I)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qr0$c */
    /* loaded from: classes.dex */
    public static final class c extends qr0 {
        private final String g;
        private final uq0 h;
        private int i;
        private final String j;
        private final List<dq0> k;
        private final qq0 l;
        private final int m;

        public /* synthetic */ c(String str, uq0 uq0Var, int i, String str2, List list, qq0 qq0Var, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uq0Var, i, (i3 & 8) != 0 ? "" : str2, list, (i3 & 32) != 0 ? null : qq0Var, (i3 & 64) != 0 ? 0 : i2);
        }

        public static /* synthetic */ c i(c cVar, String str, uq0 uq0Var, int i, String str2, List list, qq0 qq0Var, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = cVar.g;
            }
            if ((i3 & 2) != 0) {
                uq0Var = cVar.h;
            }
            uq0 uq0Var2 = uq0Var;
            if ((i3 & 4) != 0) {
                i = cVar.i;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                str2 = cVar.j;
            }
            String str3 = str2;
            List<dq0> list2 = list;
            if ((i3 & 16) != 0) {
                list2 = cVar.k;
            }
            List list3 = list2;
            if ((i3 & 32) != 0) {
                qq0Var = cVar.l;
            }
            qq0 qq0Var2 = qq0Var;
            if ((i3 & 64) != 0) {
                i2 = cVar.m;
            }
            return cVar.f(str, uq0Var2, i4, str3, list3, qq0Var2, i2);
        }

        public final qq0 I() {
            return this.l;
        }

        public final String X() {
            return this.j;
        }

        @Override // defpackage.qr0
        public uq0 a() {
            return this.h;
        }

        @Override // defpackage.qr0
        public int b() {
            return this.i;
        }

        @Override // defpackage.qr0
        public int c() {
            return this.m;
        }

        @Override // defpackage.qr0
        public void e(int i) {
            this.i = i;
        }

        @Override // defpackage.qr0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.g, cVar.g) && z65.c(this.h, cVar.h) && this.i == cVar.i && z65.c(this.j, cVar.j) && z65.c(this.k, cVar.k) && z65.c(this.l, cVar.l) && this.m == cVar.m) {
                return true;
            }
            return false;
        }

        public final c f(String str, uq0 uq0Var, int i, String str2, List<dq0> list, qq0 qq0Var, int i2) {
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            z65.h(str2, "shoppingItemId");
            z65.h(list, "comboProducts");
            return new c(str, uq0Var, i, str2, list, qq0Var, i2);
        }

        @Override // defpackage.qr0
        public String getId() {
            return this.g;
        }

        @Override // defpackage.qr0
        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.g.hashCode() * 31) + this.h.hashCode()) * 31) + this.i) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
            qq0 qq0Var = this.l;
            if (qq0Var == null) {
                hashCode = 0;
            } else {
                hashCode = qq0Var.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.m;
        }

        @Override // defpackage.qr0
        public String toString() {
            String str = this.g;
            uq0 uq0Var = this.h;
            int i = this.i;
            String str2 = this.j;
            List<dq0> list = this.k;
            qq0 qq0Var = this.l;
            int i2 = this.m;
            return "EditInCartQueueItem(id=" + str + ", cartItemId=" + uq0Var + ", count=" + i + ", shoppingItemId=" + str2 + ", comboProducts=" + list + ", customizations=" + qq0Var + ", retryCount=" + i2 + ")";
        }

        public final List<dq0> w0() {
            return this.k;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, uq0 uq0Var, int i, String str2, List<dq0> list, qq0 qq0Var, int i2) {
            super(str, uq0Var, i, 0, 0, 16, null);
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            z65.h(str2, "shoppingItemId");
            z65.h(list, "comboProducts");
            this.g = str;
            this.h = uq0Var;
            this.i = i;
            this.j = str2;
            this.k = list;
            this.l = qq0Var;
            this.m = i2;
        }
    }

    /* compiled from: CartQueueItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lqr0$d;", "Lqr0;", "", "toString", "", "other", "", "equals", "", "hashCode", "id", "Luq0;", "cartItemId", "count", "retryCount", "f", "g", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", Image.TYPE_HIGH, "Luq0;", "a", "()Luq0;", "i", "I", "b", "()I", e.a, "(I)V", "j", com.huawei.hms.opendevice.c.a, "<init>", "(Ljava/lang/String;Luq0;II)V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qr0$d */
    /* loaded from: classes.dex */
    public static final class d extends qr0 {
        private final String g;
        private final uq0 h;
        private int i;
        private final int j;

        public /* synthetic */ d(String str, uq0 uq0Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uq0Var, i, (i3 & 8) != 0 ? 0 : i2);
        }

        public static /* synthetic */ d i(d dVar, String str, uq0 uq0Var, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = dVar.g;
            }
            if ((i3 & 2) != 0) {
                uq0Var = dVar.h;
            }
            if ((i3 & 4) != 0) {
                i = dVar.i;
            }
            if ((i3 & 8) != 0) {
                i2 = dVar.j;
            }
            return dVar.f(str, uq0Var, i, i2);
        }

        @Override // defpackage.qr0
        public uq0 a() {
            return this.h;
        }

        @Override // defpackage.qr0
        public int b() {
            return this.i;
        }

        @Override // defpackage.qr0
        public int c() {
            return this.j;
        }

        @Override // defpackage.qr0
        public void e(int i) {
            this.i = i;
        }

        @Override // defpackage.qr0
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public final d f(String str, uq0 uq0Var, int i, int i2) {
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            return new d(str, uq0Var, i, i2);
        }

        @Override // defpackage.qr0
        public String getId() {
            return this.g;
        }

        @Override // defpackage.qr0
        public int hashCode() {
            return super.hashCode();
        }

        @Override // defpackage.qr0
        public String toString() {
            String qr0Var = super.toString();
            return "RemoveFromCartQueueItem " + qr0Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, uq0 uq0Var, int i, int i2) {
            super(str, uq0Var, i, -1, 0, 16, null);
            z65.h(str, "id");
            z65.h(uq0Var, "cartItemId");
            this.g = str;
            this.h = uq0Var;
            this.i = i;
            this.j = i2;
        }
    }

    public /* synthetic */ qr0(String str, uq0 uq0Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uq0Var, i, i2, i3);
    }

    public uq0 a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public final qr0 d() {
        int i = this.d;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    e(b() + 1);
                }
            } else {
                b();
            }
        } else {
            e(b() - 1);
        }
        return this;
    }

    public void e(int i) {
        this.c = i;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(cls2, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type com.dodopizza.cart.edit.queue.CartQueueItem");
        if (z65.c(a(), ((qr0) obj).a())) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.a;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        String id = getId();
        uq0 a2 = a();
        int b2 = b();
        return "[id='" + id + "', cartItemId=" + a2 + ", count=" + b2 + "]";
    }

    private qr0(String str, uq0 uq0Var, int i, int i2, int i3) {
        this.a = str;
        this.b = uq0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ qr0(String str, uq0 uq0Var, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uq0Var, i, i2, (i4 & 16) != 0 ? 0 : i3, null);
    }
}
