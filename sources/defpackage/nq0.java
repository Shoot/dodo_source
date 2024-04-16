package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartItem.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bC\b\u0086\b\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001)Bé\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0#\u0012\u0006\u0010(\u001a\u00020\u0014¢\u0006\u0004\bl\u0010mJ\u009b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0#2\b\b\u0002\u0010(\u001a\u00020\u0014HÆ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0013\u0010.\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b:\u00105R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u00105R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bD\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\bI\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bC\u0010KR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010KR\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\b=\u00105R\"\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010>\u001a\u0004\bE\u0010@\"\u0004\bS\u0010TR\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bO\u00105R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bU\u0010TR\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010@R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bX\u0010>\u001a\u0004\bX\u0010@R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b?\u0010Y\u001a\u0004\b;\u0010ZR\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b[\u00103\u001a\u0004\bV\u00105R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010\\\u001a\u0004\b3\u0010]R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR \u0010'\u001a\b\u0012\u0004\u0012\u00020&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010_\u001a\u0004\bc\u0010aR\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\b^\u0010NR\u0017\u0010e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bd\u0010L\u001a\u0004\bb\u0010NR\u0011\u0010g\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bf\u0010NR\u0011\u0010i\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bh\u0010NR\u0011\u0010k\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bj\u0010N¨\u0006o"}, d2 = {"Lnq0;", "Lvq0;", "Ljava/io/Serializable;", "Luq0;", "id", "", "errorCode", "Lkl8;", "productCategory", "count", "maxCount", "", "title", "description", "sizeMeasurement", "", "sizeValue", "imageUrl", "Lhn6;", "price", "", "isGift", "availableMore", "totalPrice", "doughTypeId", "doughTypeName", "sizeGroupId", "sizeGroupName", "shoppingItemId", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lv23;", "discount", "sortOrder", "Lqq0;", "customizations", "", "Ldq0;", "comboProducts", "Lmr0;", "pizzaHalves", "isEditable", "a", "toString", "hashCode", "", "other", "equals", "Luq0;", "j", "()Luq0;", "b", "I", "getErrorCode", "()I", c.a, "Lkl8;", Image.TYPE_MEDIUM, "()Lkl8;", DateTokenConverter.CONVERTER_KEY, e.a, "l", "f", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "g", "getDescription", Image.TYPE_HIGH, "q", "i", "F", "r", "()F", "k", "Lhn6;", "()Lhn6;", "Z", "v0", "()Z", "n", "w", "o", "p", "setDoughTypeName", "(Ljava/lang/String;)V", "setSizeGroupName", Image.TYPE_SMALL, "X", "t", "Lv23;", "()Lv23;", "v", "Lqq0;", "()Lqq0;", "x", "Ljava/util/List;", "w0", "()Ljava/util/List;", "y", "z", "A", "isInStop", "H", "isSauce", "E", "isPizza", "G", "isPizzaHalves", "<init>", "(Luq0;ILkl8;IILjava/lang/String;Ljava/lang/String;IFLjava/lang/String;Lhn6;ZILhn6;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv23;ILqq0;Ljava/util/List;Ljava/util/List;Z)V", "B", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: nq0  reason: default package */
/* loaded from: classes.dex */
public final class nq0 implements vq0, Serializable {
    public static final a B = new a(null);
    private final boolean A;
    private final uq0 a;
    private final int b;
    private final kl8 c;
    private final int d;
    private final int e;
    private final String f;
    private final String g;
    private final int h;
    private final float i;
    private final String j;
    private final hn6 k;
    private final boolean l;
    private final int m;
    private final hn6 n;
    private final int o;
    private String p;
    private final int q;
    private String r;
    private final String s;
    private final String t;
    private final v23 u;
    private final int v;
    private final qq0 w;
    private final List<dq0> x;
    private final List<mr0> y;
    private final boolean z;

    /* compiled from: CartItem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnq0$a;", "", "", "MAX_NUMBER_VALUE", "I", "<init>", "()V", "cart"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nq0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nq0(uq0 uq0Var, int i, kl8 kl8Var, int i2, int i3, String str, String str2, int i4, float f, String str3, hn6 hn6Var, boolean z, int i5, hn6 hn6Var2, int i6, String str4, int i7, String str5, String str6, String str7, v23 v23Var, int i8, qq0 qq0Var, List<dq0> list, List<mr0> list2, boolean z2) {
        z65.h(uq0Var, "id");
        z65.h(kl8Var, "productCategory");
        z65.h(str, "title");
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "totalPrice");
        z65.h(str4, "doughTypeName");
        z65.h(str5, "sizeGroupName");
        z65.h(str6, "shoppingItemId");
        z65.h(str7, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(qq0Var, "customizations");
        z65.h(list, "comboProducts");
        z65.h(list2, "pizzaHalves");
        this.a = uq0Var;
        this.b = i;
        this.c = kl8Var;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = f;
        this.j = str3;
        this.k = hn6Var;
        this.l = z;
        this.m = i5;
        this.n = hn6Var2;
        this.o = i6;
        this.p = str4;
        this.q = i7;
        this.r = str5;
        this.s = str6;
        this.t = str7;
        this.u = v23Var;
        this.v = i8;
        this.w = qq0Var;
        this.x = list;
        this.y = list2;
        this.z = z2;
        this.A = i != 1;
    }

    public final boolean E() {
        if (this.c == kl8.b) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if (E() && (!z().isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if (this.c == kl8.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vq0
    public qq0 I() {
        return this.w;
    }

    @Override // defpackage.vq0
    public String X() {
        return this.s;
    }

    public final nq0 a(uq0 uq0Var, int i, kl8 kl8Var, int i2, int i3, String str, String str2, int i4, float f, String str3, hn6 hn6Var, boolean z, int i5, hn6 hn6Var2, int i6, String str4, int i7, String str5, String str6, String str7, v23 v23Var, int i8, qq0 qq0Var, List<dq0> list, List<mr0> list2, boolean z2) {
        z65.h(uq0Var, "id");
        z65.h(kl8Var, "productCategory");
        z65.h(str, "title");
        z65.h(str2, "description");
        z65.h(str3, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "totalPrice");
        z65.h(str4, "doughTypeName");
        z65.h(str5, "sizeGroupName");
        z65.h(str6, "shoppingItemId");
        z65.h(str7, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(qq0Var, "customizations");
        z65.h(list, "comboProducts");
        z65.h(list2, "pizzaHalves");
        return new nq0(uq0Var, i, kl8Var, i2, i3, str, str2, i4, f, str3, hn6Var, z, i5, hn6Var2, i6, str4, i7, str5, str6, str7, v23Var, i8, qq0Var, list, list2, z2);
    }

    public final int c() {
        return this.m;
    }

    public final int d() {
        return this.d;
    }

    public final v23 e() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq0)) {
            return false;
        }
        nq0 nq0Var = (nq0) obj;
        if (z65.c(this.a, nq0Var.a) && this.b == nq0Var.b && this.c == nq0Var.c && this.d == nq0Var.d && this.e == nq0Var.e && z65.c(this.f, nq0Var.f) && z65.c(this.g, nq0Var.g) && this.h == nq0Var.h && Float.compare(this.i, nq0Var.i) == 0 && z65.c(this.j, nq0Var.j) && z65.c(this.k, nq0Var.k) && this.l == nq0Var.l && this.m == nq0Var.m && z65.c(this.n, nq0Var.n) && this.o == nq0Var.o && z65.c(this.p, nq0Var.p) && this.q == nq0Var.q && z65.c(this.r, nq0Var.r) && z65.c(this.s, nq0Var.s) && z65.c(this.t, nq0Var.t) && z65.c(this.u, nq0Var.u) && this.v == nq0Var.v && z65.c(this.w, nq0Var.w) && z65.c(this.x, nq0Var.x) && z65.c(this.y, nq0Var.y) && this.z == nq0Var.z) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.o;
    }

    @Override // defpackage.vq0
    public hn6 h() {
        return this.k;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + Float.floatToIntBits(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + a91.a(this.l)) * 31) + this.m) * 31) + this.n.hashCode()) * 31) + this.o) * 31) + this.p.hashCode()) * 31) + this.q) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31;
        v23 v23Var = this.u;
        if (v23Var == null) {
            hashCode = 0;
        } else {
            hashCode = v23Var.hashCode();
        }
        return ((((((((((hashCode2 + hashCode) * 31) + this.v) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + a91.a(this.z);
    }

    public final String i() {
        return this.p;
    }

    public final uq0 j() {
        return this.a;
    }

    public final String k() {
        return this.j;
    }

    public final int l() {
        return this.e;
    }

    public final kl8 m() {
        return this.c;
    }

    public final int n() {
        return this.q;
    }

    public final String o() {
        return this.r;
    }

    public final int q() {
        return this.h;
    }

    public final float r() {
        return this.i;
    }

    public final int s() {
        return this.v;
    }

    public final String t() {
        return this.t;
    }

    public String toString() {
        uq0 uq0Var = this.a;
        int i = this.b;
        kl8 kl8Var = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String str = this.f;
        String str2 = this.g;
        int i4 = this.h;
        float f = this.i;
        String str3 = this.j;
        hn6 hn6Var = this.k;
        boolean z = this.l;
        int i5 = this.m;
        hn6 hn6Var2 = this.n;
        int i6 = this.o;
        String str4 = this.p;
        int i7 = this.q;
        String str5 = this.r;
        String str6 = this.s;
        String str7 = this.t;
        v23 v23Var = this.u;
        int i8 = this.v;
        qq0 qq0Var = this.w;
        List<dq0> list = this.x;
        List<mr0> list2 = this.y;
        boolean z2 = this.z;
        return "CartItem(id=" + uq0Var + ", errorCode=" + i + ", productCategory=" + kl8Var + ", count=" + i2 + ", maxCount=" + i3 + ", title=" + str + ", description=" + str2 + ", sizeMeasurement=" + i4 + ", sizeValue=" + f + ", imageUrl=" + str3 + ", price=" + hn6Var + ", isGift=" + z + ", availableMore=" + i5 + ", totalPrice=" + hn6Var2 + ", doughTypeId=" + i6 + ", doughTypeName=" + str4 + ", sizeGroupId=" + i7 + ", sizeGroupName=" + str5 + ", shoppingItemId=" + str6 + ", productId=" + str7 + ", discount=" + v23Var + ", sortOrder=" + i8 + ", customizations=" + qq0Var + ", comboProducts=" + list + ", pizzaHalves=" + list2 + ", isEditable=" + z2 + ")";
    }

    public final String u() {
        return this.f;
    }

    @Override // defpackage.vq0
    public boolean v0() {
        return this.l;
    }

    public final hn6 w() {
        return this.n;
    }

    @Override // defpackage.vq0
    public List<dq0> w0() {
        return this.x;
    }

    public final boolean x() {
        return this.z;
    }

    public final boolean y() {
        return this.A;
    }

    @Override // defpackage.vq0
    public List<mr0> z() {
        return this.y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ nq0(defpackage.uq0 r29, int r30, defpackage.kl8 r31, int r32, int r33, java.lang.String r34, java.lang.String r35, int r36, float r37, java.lang.String r38, defpackage.hn6 r39, boolean r40, int r41, defpackage.hn6 r42, int r43, java.lang.String r44, int r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, defpackage.v23 r49, int r50, defpackage.qq0 r51, java.util.List r52, java.util.List r53, boolean r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r28 = this;
            r0 = 8388608(0x800000, float:1.1754944E-38)
            r0 = r55 & r0
            if (r0 == 0) goto Ld
            java.util.List r0 = defpackage.ic1.l()
            r25 = r0
            goto Lf
        Ld:
            r25 = r52
        Lf:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r55 & r0
            if (r0 == 0) goto L1c
            java.util.List r0 = defpackage.ic1.l()
            r26 = r0
            goto L1e
        L1c:
            r26 = r53
        L1e:
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            r23 = r50
            r24 = r51
            r27 = r54
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.<init>(uq0, int, kl8, int, int, java.lang.String, java.lang.String, int, float, java.lang.String, hn6, boolean, int, hn6, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, v23, int, qq0, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
