package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.LatLng;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Pizzeria.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001\u000bBÍ\u0001\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00108\u001a\u000203\u0012\u0006\u0010=\u001a\u00020\u000f\u0012\u0006\u0010B\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020>\u0012\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0F\u0012\u0006\u0010O\u001a\u00020\t\u0012\u0006\u0010Q\u001a\u00020\t\u0012\u0006\u0010T\u001a\u00020\t\u0012\u0006\u0010V\u001a\u00020\t\u0012\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0F\u0012\u0006\u0010\\\u001a\u00020\u000f\u0012\u0006\u0010_\u001a\u00020\u000f\u0012\u0006\u0010a\u001a\u00020\u000f\u0012\u0006\u0010d\u001a\u00020\u000f\u0012\b\u0010f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bg\u0010hJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010=\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010B\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010E\u001a\u00020>8\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010O\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bM\u0010\u0011\u001a\u0004\bN\u0010\u0013R\u0017\u0010Q\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010\u0011\u001a\u0004\bP\u0010\u0013R\u0017\u0010T\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bR\u0010\u0011\u001a\u0004\bS\u0010\u0013R\u0017\u0010V\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bN\u0010\u0011\u001a\u0004\bU\u0010\u0013R\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0F8\u0006¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010KR\u0017\u0010\\\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\b[\u0010<R\u0017\u0010_\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<R\u0017\u0010a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\b`\u0010<R\u0017\u0010d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bb\u0010:\u001a\u0004\bc\u0010<R\u0019\u0010f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\be\u0010\u0013¨\u0006i"}, d2 = {"Ld88;", "", "Ljava/io/Serializable;", "Lja1;", "other", "", "k", "Lcom/google/android/gms/maps/model/LatLng;", "getPosition", "", "getTitle", "a", "toString", "hashCode", "", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, c.a, "w", "localityId", DateTokenConverter.CONVERTER_KEY, "E", "managerPhoneNumber", e.a, "M", "videoUrl", "Lov5;", "f", "Lov5;", "x", "()Lov5;", "location", "Lh98;", "g", "Lh98;", "getStatus", "()Lh98;", "status", "", Image.TYPE_HIGH, "J", "L", "()J", "timeZoneOffset", "Lhn6;", "i", "Lhn6;", "getMinDeliveryPrice", "()Lhn6;", "minDeliveryPrice", "j", "Z", "Q", "()Z", "isOpenBySchedule", "Lmv9;", "Lmv9;", "H", "()Lmv9;", "restaurantSchedule", "l", "o", "deliverySchedule", "", "Lib7;", Image.TYPE_MEDIUM, "Ljava/util/List;", "G", "()Ljava/util/List;", "operationalTypes", "n", "q", "infoFullAddress", "u", "infoShortAddress", "p", Image.TYPE_SMALL, "infoLocalityName", "getPostcode", "postcode", "Lok9;", "r", "K", "restaurantServiceTypes", "W", "isTableDeliverySupported", "t", "T", "isTableDeliveryEnabled", "N", "isHasKidsPlayground", "v", "P", "isHasWorkshops", "getWorkshopUrl", "workshopUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lov5;Lh98;JLhn6;ZLmv9;Lmv9;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d88  reason: default package */
/* loaded from: classes4.dex */
public final class d88 implements Comparable<d88>, Serializable, ja1 {
    public static final a x = new a(null);
    private static d88 y;
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final ov5 f;
    private final h98 g;
    private final long h;
    private final hn6 i;
    private final boolean j;
    private final mv9 k;
    private final mv9 l;
    private final List<ib7> m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final List<ok9> r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final String w;

    /* compiled from: Pizzeria.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ld88$a;", "", "Ld88;", "DEFAULT", "Ld88;", "a", "()Ld88;", "setDEFAULT", "(Ld88;)V", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d88$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d88 a() {
            return d88.y;
        }
    }

    static {
        ov5 ov5Var = new ov5(0.0d, 0.0d, null, null, 12, null);
        h98 h98Var = h98.b;
        hn6 f = kn6.f();
        mv9 mv9Var = mv9.c;
        z65.g(mv9Var, "DEFAULT");
        z65.g(mv9Var, "DEFAULT");
        y = new d88("", "", "", "", "", ov5Var, h98Var, 0L, f, true, mv9Var, mv9Var, ic1.l(), "", "", "", "", ic1.l(), false, false, false, false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d88(String str, String str2, String str3, String str4, String str5, ov5 ov5Var, h98 h98Var, long j, hn6 hn6Var, boolean z, mv9 mv9Var, mv9 mv9Var2, List<? extends ib7> list, String str6, String str7, String str8, String str9, List<? extends ok9> list2, boolean z2, boolean z3, boolean z4, boolean z5, String str10) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "localityId");
        z65.h(str4, "managerPhoneNumber");
        z65.h(str5, "videoUrl");
        z65.h(ov5Var, "location");
        z65.h(h98Var, "status");
        z65.h(hn6Var, "minDeliveryPrice");
        z65.h(mv9Var, "restaurantSchedule");
        z65.h(mv9Var2, "deliverySchedule");
        z65.h(list, "operationalTypes");
        z65.h(str6, "infoFullAddress");
        z65.h(str7, "infoShortAddress");
        z65.h(str8, "infoLocalityName");
        z65.h(str9, "postcode");
        z65.h(list2, "restaurantServiceTypes");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = ov5Var;
        this.g = h98Var;
        this.h = j;
        this.i = hn6Var;
        this.j = z;
        this.k = mv9Var;
        this.l = mv9Var2;
        this.m = list;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = list2;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = str10;
    }

    public final String E() {
        return this.d;
    }

    public final List<ib7> G() {
        return this.m;
    }

    public final mv9 H() {
        return this.k;
    }

    public final List<ok9> K() {
        return this.r;
    }

    public final long L() {
        return this.h;
    }

    public final String M() {
        return this.e;
    }

    public final boolean N() {
        return this.u;
    }

    public final boolean P() {
        return this.v;
    }

    public final boolean Q() {
        return this.j;
    }

    public final boolean T() {
        return this.t;
    }

    public final boolean W() {
        return this.s;
    }

    @Override // defpackage.ja1
    public String a() {
        return this.o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d88)) {
            return false;
        }
        d88 d88Var = (d88) obj;
        if (z65.c(this.a, d88Var.a) && z65.c(this.b, d88Var.b) && z65.c(this.c, d88Var.c) && z65.c(this.d, d88Var.d) && z65.c(this.e, d88Var.e) && z65.c(this.f, d88Var.f) && this.g == d88Var.g && this.h == d88Var.h && z65.c(this.i, d88Var.i) && this.j == d88Var.j && z65.c(this.k, d88Var.k) && z65.c(this.l, d88Var.l) && z65.c(this.m, d88Var.m) && z65.c(this.n, d88Var.n) && z65.c(this.o, d88Var.o) && z65.c(this.p, d88Var.p) && z65.c(this.q, d88Var.q) && z65.c(this.r, d88Var.r) && this.s == d88Var.s && this.t == d88Var.t && this.u == d88Var.u && this.v == d88Var.v && z65.c(this.w, d88Var.w)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    @Override // defpackage.ja1
    public LatLng getPosition() {
        return new LatLng(this.f.b(), this.f.c());
    }

    @Override // defpackage.ja1
    public String getTitle() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + ax1.a(this.h)) * 31) + this.i.hashCode()) * 31) + a91.a(this.j)) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + a91.a(this.s)) * 31) + a91.a(this.t)) * 31) + a91.a(this.u)) * 31) + a91.a(this.v)) * 31;
        String str = this.w;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public int compareTo(d88 d88Var) {
        z65.h(d88Var, "other");
        return this.a.compareTo(d88Var.a);
    }

    public final mv9 o() {
        return this.l;
    }

    public final String q() {
        return this.n;
    }

    public final String s() {
        return this.p;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        ov5 ov5Var = this.f;
        h98 h98Var = this.g;
        long j = this.h;
        hn6 hn6Var = this.i;
        boolean z = this.j;
        mv9 mv9Var = this.k;
        mv9 mv9Var2 = this.l;
        List<ib7> list = this.m;
        String str6 = this.n;
        String str7 = this.o;
        String str8 = this.p;
        String str9 = this.q;
        List<ok9> list2 = this.r;
        boolean z2 = this.s;
        boolean z3 = this.t;
        boolean z4 = this.u;
        boolean z5 = this.v;
        String str10 = this.w;
        return "Pizzeria(id=" + str + ", name=" + str2 + ", localityId=" + str3 + ", managerPhoneNumber=" + str4 + ", videoUrl=" + str5 + ", location=" + ov5Var + ", status=" + h98Var + ", timeZoneOffset=" + j + ", minDeliveryPrice=" + hn6Var + ", isOpenBySchedule=" + z + ", restaurantSchedule=" + mv9Var + ", deliverySchedule=" + mv9Var2 + ", operationalTypes=" + list + ", infoFullAddress=" + str6 + ", infoShortAddress=" + str7 + ", infoLocalityName=" + str8 + ", postcode=" + str9 + ", restaurantServiceTypes=" + list2 + ", isTableDeliverySupported=" + z2 + ", isTableDeliveryEnabled=" + z3 + ", isHasKidsPlayground=" + z4 + ", isHasWorkshops=" + z5 + ", workshopUrl=" + str10 + ")";
    }

    public final String u() {
        return this.o;
    }

    public final String w() {
        return this.c;
    }

    public final ov5 x() {
        return this.f;
    }
}
