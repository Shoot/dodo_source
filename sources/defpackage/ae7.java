package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderHistory.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001\u0003B_\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\u001d\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u000e\u0010!R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0019\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b&\u0010\u0006¨\u0006."}, d2 = {"Lae7;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", e.a, "number", c.a, "address", "Lni7;", DateTokenConverter.CONVERTER_KEY, "Lni7;", "getState", "()Lni7;", "state", "Ljk7;", "Ljk7;", "j", "()Ljk7;", MessageAttributes.TYPE, "Ljava/util/Date;", "f", "Ljava/util/Date;", "()Ljava/util/Date;", "creationDate", "Lhn6;", "g", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "deliveryFee", "", "Lxf7;", "i", "Ljava/util/List;", "()Ljava/util/List;", "orderItems", "receiptUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lni7;Ljk7;Ljava/util/Date;Lhn6;Lhn6;Ljava/util/List;Ljava/lang/String;)V", "k", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ae7  reason: default package */
/* loaded from: classes2.dex */
public final class ae7 implements Serializable {
    public static final a k = new a(null);
    private static final DateFormat l;
    private final String a;
    private final String b;
    private final String c;
    private final ni7 d;
    private final jk7 e;
    private final Date f;
    private final hn6 g;
    private final hn6 h;
    private final List<xf7> i;
    private final String j;

    /* compiled from: OrderHistory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lae7$a;", "", "Ljava/text/DateFormat;", "dateTimeFormatter", "Ljava/text/DateFormat;", "a", "()Ljava/text/DateFormat;", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ae7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DateFormat a() {
            return ae7.l;
        }
    }

    static {
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 3, Locale.getDefault());
        z65.g(dateTimeInstance, "getDateTimeInstance(...)");
        l = dateTimeInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ae7(String str, String str2, String str3, ni7 ni7Var, jk7 jk7Var, Date date, hn6 hn6Var, hn6 hn6Var2, List<? extends xf7> list, String str4) {
        z65.h(str, "id");
        z65.h(str2, "number");
        z65.h(str3, "address");
        z65.h(ni7Var, "state");
        z65.h(jk7Var, MessageAttributes.TYPE);
        z65.h(date, "creationDate");
        z65.h(hn6Var, "price");
        z65.h(hn6Var2, "deliveryFee");
        z65.h(list, "orderItems");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ni7Var;
        this.e = jk7Var;
        this.f = date;
        this.g = hn6Var;
        this.h = hn6Var2;
        this.i = list;
        this.j = str4;
    }

    public final String b() {
        return this.c;
    }

    public final Date c() {
        return this.f;
    }

    public final hn6 d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final List<xf7> f() {
        return this.i;
    }

    public final String getId() {
        return this.a;
    }

    public final hn6 h() {
        return this.g;
    }

    public final String i() {
        return this.j;
    }

    public final jk7 j() {
        return this.e;
    }
}
