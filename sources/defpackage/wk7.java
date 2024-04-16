package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.bq0;
import defpackage.nk9;
import defpackage.uu2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lwk7;", "Ljava/io/Serializable;", "", "a", "Z", "isCarryout", "()Z", "b", "isDelivery", c.a, DateTokenConverter.CONVERTER_KEY, "isRestaurant", "isCarryoutOrRestaurant", "isLoading", "<init>", "()V", "Lbq0;", "Luu2;", "Lnk9;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wk7  reason: default package */
/* loaded from: classes4.dex */
public abstract class wk7 implements Serializable {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public /* synthetic */ wk7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        if (!(this instanceof uu2.a.c) && !(this instanceof bq0.a.c) && !(this instanceof nk9.b.c) && !(this instanceof uu2.b)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        return this.c;
    }

    private wk7() {
        boolean z = this instanceof bq0;
        this.a = z;
        this.b = this instanceof uu2;
        boolean z2 = this instanceof nk9;
        this.c = z2;
        this.d = z || z2;
    }
}
