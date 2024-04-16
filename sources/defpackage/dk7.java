package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.activeorder.feature.ordersummary.presentation.b;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderSummaryVO.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020&\u0012\u0006\u00100\u001a\u00020&\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00107\u001a\u000201\u0012\u0006\u00109\u001a\u000201\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020;0:\u0012\b\u0010C\u001a\u0004\u0018\u00010@\u0012\u0006\u0010D\u001a\u00020\u0002\u0012\b\u0010G\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010M\u001a\u00020H\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010Q\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010U\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010U\u0012\u000e\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:\u0012\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:\u0012\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010*\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010-\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u0017\u00100\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b+\u00104R\u0017\u00109\u001a\u0002018\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b.\u00104R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u001c\u0010>R\u0019\u0010C\u001a\u0004\u0018\u00010@8\u0006¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\b6\u0010BR\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0019\u0010G\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010E\u001a\u0004\b<\u0010FR\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0019\u0010T\u001a\u0004\u0018\u00010Q8\u0006¢\u0006\f\n\u0004\bO\u0010R\u001a\u0004\b8\u0010SR\u0019\u0010X\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b$\u0010V\u001a\u0004\b\u0014\u0010WR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b(\u0010V\u001a\u0004\bN\u0010WR\u001f\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:8\u0006¢\u0006\f\n\u0004\b/\u0010=\u001a\u0004\b\u000f\u0010>R\u001f\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:8\u0006¢\u0006\f\n\u0004\b,\u0010=\u001a\u0004\bI\u0010>R\u001f\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0:8\u0006¢\u0006\f\n\u0004\b]\u0010=\u001a\u0004\b\t\u0010>¨\u0006a"}, d2 = {"Ldk7;", "", "", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "id", "", "b", "I", "i", "()I", "number", "Lpi7;", c.a, "Lpi7;", "l", "()Lpi7;", "orderStateVO", DateTokenConverter.CONVERTER_KEY, "g", "itemsCount", "Lhn6;", "Lhn6;", "q", "()Lhn6;", "totalPrice", "f", "address", "Ljk7;", "Ljk7;", "r", "()Ljk7;", MessageAttributes.TYPE, Image.TYPE_HIGH, "v", "videoUrl", "", "Z", "w", "()Z", "isCancelable", "j", "y", "isRatable", "k", "x", "isDeferredOrder", "", "J", "p", "()J", "timeRemaining", Image.TYPE_MEDIUM, "orderCreatedTimeLocal", "n", "orderEndTimeLocal", "", "Leg7;", "o", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "()Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "orderTrackingPhone", "noGlovesWebsite", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "tableNumber", "Ld88;", Image.TYPE_SMALL, "Ld88;", "getPizzeria", "()Ld88;", "pizzeria", "t", "u", MessageAttributes.UUID, "Ldta;", "Ldta;", "()Ldta;", "stackGame", "Lgg7;", "Lgg7;", "()Lgg7;", "deliveryLocation", "unitLocation", "Ltv5;", "deliveryIconsVO", "unitIconsVO", "z", "courierIconsVO", "<init>", "(Ljava/lang/String;ILpi7;ILhn6;Ljava/lang/String;Ljk7;Ljava/lang/String;ZZZJJJLjava/util/List;Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;Ljava/lang/String;Ljava/lang/Integer;Ld88;Ljava/lang/String;Ldta;Lgg7;Lgg7;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dk7  reason: default package */
/* loaded from: classes.dex */
public final class dk7 {
    private final String a;
    private final int b;
    private final pi7 c;
    private final int d;
    private final hn6 e;
    private final String f;
    private final jk7 g;
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final long l;
    private final long m;
    private final long n;
    private final List<eg7> o;
    private final b p;
    private final String q;
    private final Integer r;
    private final d88 s;
    private final String t;
    private final dta u;
    private final gg7 v;
    private final gg7 w;
    private final List<tv5> x;
    private final List<tv5> y;
    private final List<tv5> z;

    public dk7(String str, int i, pi7 pi7Var, int i2, hn6 hn6Var, String str2, jk7 jk7Var, String str3, boolean z, boolean z2, boolean z3, long j, long j2, long j3, List<eg7> list, b bVar, String str4, Integer num, d88 d88Var, String str5, dta dtaVar, gg7 gg7Var, gg7 gg7Var2, List<tv5> list2, List<tv5> list3, List<tv5> list4) {
        z65.h(str, "id");
        z65.h(pi7Var, "orderStateVO");
        z65.h(hn6Var, "totalPrice");
        z65.h(str2, "address");
        z65.h(jk7Var, MessageAttributes.TYPE);
        z65.h(str3, "videoUrl");
        z65.h(list, "items");
        z65.h(str4, "noGlovesWebsite");
        z65.h(d88Var, "pizzeria");
        z65.h(str5, MessageAttributes.UUID);
        z65.h(list2, "deliveryIconsVO");
        z65.h(list3, "unitIconsVO");
        z65.h(list4, "courierIconsVO");
        this.a = str;
        this.b = i;
        this.c = pi7Var;
        this.d = i2;
        this.e = hn6Var;
        this.f = str2;
        this.g = jk7Var;
        this.h = str3;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.o = list;
        this.p = bVar;
        this.q = str4;
        this.r = num;
        this.s = d88Var;
        this.t = str5;
        this.u = dtaVar;
        this.v = gg7Var;
        this.w = gg7Var2;
        this.x = list2;
        this.y = list3;
        this.z = list4;
    }

    public final String a() {
        return this.f;
    }

    public final List<tv5> b() {
        return this.z;
    }

    public final List<tv5> c() {
        return this.x;
    }

    public final gg7 d() {
        return this.v;
    }

    public final String e() {
        return this.a;
    }

    public final List<eg7> f() {
        return this.o;
    }

    public final int g() {
        return this.d;
    }

    public final String h() {
        return this.q;
    }

    public final int i() {
        return this.b;
    }

    public final long j() {
        return this.m;
    }

    public final long k() {
        return this.n;
    }

    public final pi7 l() {
        return this.c;
    }

    public final b m() {
        return this.p;
    }

    public final dta n() {
        return this.u;
    }

    public final Integer o() {
        return this.r;
    }

    public final long p() {
        return this.l;
    }

    public final hn6 q() {
        return this.e;
    }

    public final jk7 r() {
        return this.g;
    }

    public final List<tv5> s() {
        return this.y;
    }

    public final gg7 t() {
        return this.w;
    }

    public final String u() {
        return this.t;
    }

    public final String v() {
        return this.h;
    }

    public final boolean w() {
        return this.i;
    }

    public final boolean x() {
        return this.k;
    }

    public final boolean y() {
        return this.j;
    }
}
