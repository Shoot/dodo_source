package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Topping.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\n\u0010\u001d¨\u0006%"}, d2 = {"Lejb;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", MessageAttributes.UUID, "b", c.a, "parentUuid", "getName", Action.NAME_ATTRIBUTE, "imageUrl", "Lhn6;", e.a, "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "f", "Z", "()Z", "isInStop$annotations", "()V", "isInStop", "g", "canAddToVariation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhn6;ZZ)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ejb  reason: default package */
/* loaded from: classes.dex */
public final class ejb implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final hn6 e;
    private final boolean f;
    private final boolean g;

    public ejb(String str, String str2, String str3, String str4, hn6 hn6Var, boolean z, boolean z2) {
        z65.h(str, MessageAttributes.UUID);
        z65.h(str2, "parentUuid");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "imageUrl");
        z65.h(hn6Var, "price");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hn6Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean a() {
        return this.g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejb)) {
            return false;
        }
        ejb ejbVar = (ejb) obj;
        if (z65.c(this.a, ejbVar.a) && z65.c(this.b, ejbVar.b) && z65.c(this.c, ejbVar.c) && z65.c(this.d, ejbVar.d) && z65.c(this.e, ejbVar.e) && this.f == ejbVar.f && this.g == ejbVar.g) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.c;
    }

    public final hn6 h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        hn6 hn6Var = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        return "Topping(uuid=" + str + ", parentUuid=" + str2 + ", name=" + str3 + ", imageUrl=" + str4 + ", price=" + hn6Var + ", isInStop=" + z + ", canAddToVariation=" + z2 + ")";
    }
}
