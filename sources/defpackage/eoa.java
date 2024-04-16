package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: SnackCartProductVO.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nBw\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020\b\u0012\u0006\u00105\u001a\u000201\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020706\u0012\u0006\u0010<\u001a\u00020\b¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001c\u0010$R\u001a\u0010)\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b\u0013\u0010(R\u0017\u0010-\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b\u0018\u0010,R\u0017\u00100\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010 R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b.\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000207068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b2\u0010:R\u0017\u0010<\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b8\u0010 ¨\u0006?"}, d2 = {"Leoa;", "Lor0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "f", "imageUrl", "Lhn6;", c.a, "Lhn6;", "i", "()Lhn6;", "price", DateTokenConverter.CONVERTER_KEY, "I", "()I", "count", e.a, "g", "maxCount", "Z", "()Z", "isInStop", "Lv23;", "Lv23;", "()Lv23;", "discount", "Lnq0;", "Lnq0;", "()Lnq0;", "cartItem", "Lkl8;", "Lkl8;", "()Lkl8;", "category", "j", Image.TYPE_MEDIUM, "isGift", "Leoa$a;", "k", "Leoa$a;", "()Leoa$a;", "size", "", "Lxq0;", "l", "Ljava/util/Collection;", "()Ljava/util/Collection;", "toppings", "isEditable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;IIZLv23;Lnq0;Lkl8;ZLeoa$a;Ljava/util/Collection;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eoa  reason: default package */
/* loaded from: classes2.dex */
public final class eoa extends or0 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final int d;
    private final int e;
    private final boolean f;
    private final v23 g;
    private final nq0 h;
    private final kl8 i;
    private final boolean j;
    private final a k;
    private final Collection<xq0> l;
    private final boolean m;

    /* compiled from: SnackCartProductVO.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Leoa$a;", "", "a", "b", "Leoa$a$a;", "Leoa$a$b;", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eoa$a */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: SnackCartProductVO.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Leoa$a$a;", "Leoa$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: eoa$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0307a implements a {
            private final String a;

            public C0307a(String str) {
                z65.h(str, "description");
                this.a = str;
            }

            public final String a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0307a) && z65.c(this.a, ((C0307a) obj).a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                String str = this.a;
                return "Description(description=" + str + ")";
            }
        }

        /* compiled from: SnackCartProductVO.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Leoa$a$b;", "Leoa$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lnb6;", "a", "Lnb6;", "()Lnb6;", "measure", "", "b", "F", "()F", "value", "<init>", "(Lnb6;F)V", "order_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: eoa$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements a {
            private final nb6 a;
            private final float b;

            public b(nb6 nb6Var, float f) {
                z65.h(nb6Var, "measure");
                this.a = nb6Var;
                this.b = f;
            }

            public final nb6 a() {
                return this.a;
            }

            public final float b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.a == bVar.a && Float.compare(this.b, bVar.b) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
            }

            public String toString() {
                nb6 nb6Var = this.a;
                float f = this.b;
                return "MeasureAndValue(measure=" + nb6Var + ", value=" + f + ")";
            }
        }
    }

    public eoa(String str, String str2, hn6 hn6Var, int i, int i2, boolean z, v23 v23Var, nq0 nq0Var, kl8 kl8Var, boolean z2, a aVar, Collection<xq0> collection, boolean z3) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(nq0Var, "cartItem");
        z65.h(kl8Var, "category");
        z65.h(aVar, "size");
        z65.h(collection, "toppings");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = v23Var;
        this.h = nq0Var;
        this.i = kl8Var;
        this.j = z2;
        this.k = aVar;
        this.l = collection;
        this.m = z3;
    }

    @Override // defpackage.or0
    public int a() {
        return this.d;
    }

    @Override // defpackage.or0
    public boolean b() {
        return this.f;
    }

    public nq0 c() {
        return this.h;
    }

    public final kl8 d() {
        return this.i;
    }

    public v23 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoa)) {
            return false;
        }
        eoa eoaVar = (eoa) obj;
        if (z65.c(this.a, eoaVar.a) && z65.c(this.b, eoaVar.b) && z65.c(this.c, eoaVar.c) && this.d == eoaVar.d && this.e == eoaVar.e && this.f == eoaVar.f && z65.c(this.g, eoaVar.g) && z65.c(this.h, eoaVar.h) && this.i == eoaVar.i && this.j == eoaVar.j && z65.c(this.k, eoaVar.k) && z65.c(this.l, eoaVar.l) && this.m == eoaVar.m) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + a91.a(this.f)) * 31;
        v23 v23Var = this.g;
        if (v23Var == null) {
            hashCode = 0;
        } else {
            hashCode = v23Var.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a91.a(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + a91.a(this.m);
    }

    public hn6 i() {
        return this.c;
    }

    public final a j() {
        return this.k;
    }

    public final Collection<xq0> k() {
        return this.l;
    }

    public final boolean l() {
        return this.m;
    }

    public final boolean m() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        hn6 hn6Var = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z = this.f;
        v23 v23Var = this.g;
        nq0 nq0Var = this.h;
        kl8 kl8Var = this.i;
        boolean z2 = this.j;
        a aVar = this.k;
        Collection<xq0> collection = this.l;
        boolean z3 = this.m;
        return "SnackCartProductVO(name=" + str + ", imageUrl=" + str2 + ", price=" + hn6Var + ", count=" + i + ", maxCount=" + i2 + ", isInStop=" + z + ", discount=" + v23Var + ", cartItem=" + nq0Var + ", category=" + kl8Var + ", isGift=" + z2 + ", size=" + aVar + ", toppings=" + collection + ", isEditable=" + z3 + ")";
    }
}
