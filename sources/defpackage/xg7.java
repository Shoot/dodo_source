package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: OrderProduct.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\b\b\u0002\u0010 \u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000b\u0010$¨\u0006("}, d2 = {"Lxg7;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "imageUrl", "Lkl8;", c.a, "Lkl8;", DateTokenConverter.CONVERTER_KEY, "()Lkl8;", "productCategory", "getDescription", "description", "Lena;", e.a, "Lena;", "()Lena;", "sizeDetails", "", "f", "I", "()I", "sortOrder", "Lx52;", "g", "Lx52;", "()Lx52;", "customization", "Lb78;", Image.TYPE_HIGH, "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkl8;Ljava/lang/String;Lena;ILx52;Lb78;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xg7  reason: default package */
/* loaded from: classes2.dex */
public final class xg7 implements Serializable {
    private final String a;
    private final String b;
    private final kl8 c;
    private final String d;
    private final ena e;
    private final int f;
    private final x52 g;
    private final b78 h;

    public xg7(String str, String str2, kl8 kl8Var, String str3, ena enaVar, int i, x52 x52Var, b78 b78Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(kl8Var, "productCategory");
        z65.h(str3, "description");
        z65.h(enaVar, "sizeDetails");
        z65.h(x52Var, "customization");
        z65.h(b78Var, "pizzaConcept");
        this.a = str;
        this.b = str2;
        this.c = kl8Var;
        this.d = str3;
        this.e = enaVar;
        this.f = i;
        this.g = x52Var;
        this.h = b78Var;
    }

    public final x52 a() {
        return this.g;
    }

    public final String b() {
        return this.b;
    }

    public final b78 c() {
        return this.h;
    }

    public final kl8 d() {
        return this.c;
    }

    public final ena e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final String getName() {
        return this.a;
    }
}
