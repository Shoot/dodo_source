package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\tB\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxf7;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lhn6;", "b", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "<init>", "(Ljava/lang/String;Lhn6;)V", "Lxf7$a;", "Lxf7$b;", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xf7  reason: default package */
/* loaded from: classes2.dex */
public abstract class xf7 implements Serializable {
    private final String a;
    private final hn6 b;

    /* compiled from: OrderItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lxf7$a;", "Lxf7;", "Ljava/io/Serializable;", "", "Lxg7;", c.a, "Ljava/util/List;", "a", "()Ljava/util/List;", "orderProducts", "", Action.NAME_ATTRIBUTE, "Lhn6;", "price", "<init>", "(Ljava/lang/String;Lhn6;Ljava/util/List;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xf7$a */
    /* loaded from: classes2.dex */
    public static final class a extends xf7 implements Serializable {
        private final List<xg7> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, hn6 hn6Var, List<xg7> list) {
            super(str, hn6Var, null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(hn6Var, "price");
            z65.h(list, "orderProducts");
            this.c = list;
        }

        public final List<xg7> a() {
            return this.c;
        }
    }

    /* compiled from: OrderItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lxf7$b;", "Lxf7;", "Ljava/io/Serializable;", "Lxg7;", c.a, "Lxg7;", "a", "()Lxg7;", "orderProduct", "", Action.NAME_ATTRIBUTE, "Lhn6;", "price", "<init>", "(Ljava/lang/String;Lhn6;Lxg7;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xf7$b */
    /* loaded from: classes2.dex */
    public static final class b extends xf7 implements Serializable {
        private final xg7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, hn6 hn6Var, xg7 xg7Var) {
            super(str, hn6Var, null);
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(hn6Var, "price");
            z65.h(xg7Var, "orderProduct");
            this.c = xg7Var;
        }

        public final xg7 a() {
            return this.c;
        }
    }

    public /* synthetic */ xf7(String str, hn6 hn6Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hn6Var);
    }

    public final String getName() {
        return this.a;
    }

    public final hn6 h() {
        return this.b;
    }

    private xf7(String str, hn6 hn6Var) {
        this.a = str;
        this.b = hn6Var;
    }
}
