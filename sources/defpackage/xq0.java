package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CartItemProductIngredient.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017¨\u0006\u001b"}, d2 = {"Lxq0;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, "Lhn6;", c.a, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", DateTokenConverter.CONVERTER_KEY, "getImageUrl", "imageUrl", "", e.a, "Z", "()Z", "isInStop", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;Z)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: xq0  reason: default package */
/* loaded from: classes.dex */
public final class xq0 implements Serializable {
    private final String a;
    private final String b;
    private final hn6 c;
    private final String d;
    private final boolean e;

    public xq0(String str, String str2, hn6 hn6Var, String str3, boolean z) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        z65.h(str3, "imageUrl");
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = str3;
        this.e = z;
    }

    public final boolean a() {
        return this.e;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.b;
    }

    public final hn6 h() {
        return this.c;
    }

    public /* synthetic */ xq0(String str, String str2, hn6 hn6Var, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? kn6.f() : hn6Var, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z);
    }
}
