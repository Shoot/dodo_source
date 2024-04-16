package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaidOrderResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0001\u0005B'\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Ljp7;", "", "", DateTokenConverter.CONVERTER_KEY, "Llp7;", "a", "Llp7;", c.a, "()Llp7;", "state", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", "", "Lik3;", "Ljava/util/List;", "()Ljava/util/List;", "errors", "<init>", "(Llp7;Ljava/lang/String;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jp7  reason: default package */
/* loaded from: classes4.dex */
public final class jp7 {
    public static final a d = new a(null);
    private final lp7 a;
    private final String b;
    private final List<ik3> c;

    /* compiled from: PaidOrderResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Ljp7$a;", "", "", BonusActionEntity.ORDER, "Ljp7;", c.a, "a", "", "Lik3;", "errorMessages", DateTokenConverter.CONVERTER_KEY, "b", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jp7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jp7 a() {
            List l;
            lp7 lp7Var = lp7.b;
            l = kc1.l();
            return new jp7(lp7Var, "", l, null);
        }

        public final jp7 b() {
            List l;
            lp7 lp7Var = lp7.c;
            l = kc1.l();
            return new jp7(lp7Var, "", l, null);
        }

        public final jp7 c(String str) {
            List l;
            z65.h(str, BonusActionEntity.ORDER);
            lp7 lp7Var = lp7.a;
            l = kc1.l();
            return new jp7(lp7Var, str, l, null);
        }

        public final jp7 d(List<ik3> list) {
            z65.h(list, "errorMessages");
            return new jp7(lp7.d, "", list, null);
        }
    }

    public /* synthetic */ jp7(lp7 lp7Var, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(lp7Var, str, list);
    }

    public final List<ik3> a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final lp7 c() {
        return this.a;
    }

    public final boolean d() {
        lp7 lp7Var = this.a;
        if (lp7Var != lp7.a && lp7Var != lp7.b) {
            return false;
        }
        return true;
    }

    private jp7(lp7 lp7Var, String str, List<ik3> list) {
        this.a = lp7Var;
        this.b = str;
        this.c = list;
    }
}
