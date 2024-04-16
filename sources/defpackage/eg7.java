package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: OrderItemVO.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020(\u0012\u0006\u00101\u001a\u00020-¢\u0006\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\t\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0014\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u000f\u00100¨\u00064"}, d2 = {"Leg7;", "", "", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "title", "Lkl8;", "b", "Lkl8;", e.a, "()Lkl8;", "productCategory", "", c.a, "I", "getSizeId", "()I", "sizeId", DateTokenConverter.CONVERTER_KEY, "imageUrl", "Lhn6;", "Lhn6;", "getPrice", "()Lhn6;", "price", "", "f", "Z", "i", "()Z", "isFromCombo", "g", "size", "sizeDescription", "Lnb6;", "Lnb6;", "()Lnb6;", "measure", "", "j", "Ljava/util/List;", "()Ljava/util/List;", "pizzaHalfImages", "Lb78;", "k", "Lb78;", "()Lb78;", "pizzaConcept", "<init>", "(Ljava/lang/String;Lkl8;ILjava/lang/String;Lhn6;ZLjava/lang/String;Ljava/lang/String;Lnb6;Ljava/util/List;Lb78;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eg7  reason: default package */
/* loaded from: classes.dex */
public final class eg7 {
    private final String a;
    private final kl8 b;
    private final int c;
    private final String d;
    private final hn6 e;
    private final boolean f;
    private final String g;
    private final String h;
    private final nb6 i;
    private final List<String> j;
    private final b78 k;

    public eg7(String str, kl8 kl8Var, int i, String str2, hn6 hn6Var, boolean z, String str3, String str4, nb6 nb6Var, List<String> list, b78 b78Var) {
        z65.h(str, "title");
        z65.h(kl8Var, "productCategory");
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(str3, "size");
        z65.h(str4, "sizeDescription");
        z65.h(nb6Var, "measure");
        z65.h(list, "pizzaHalfImages");
        z65.h(b78Var, "pizzaConcept");
        this.a = str;
        this.b = kl8Var;
        this.c = i;
        this.d = str2;
        this.e = hn6Var;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = nb6Var;
        this.j = list;
        this.k = b78Var;
    }

    public final String a() {
        return this.d;
    }

    public final nb6 b() {
        return this.i;
    }

    public final b78 c() {
        return this.k;
    }

    public final List<String> d() {
        return this.j;
    }

    public final kl8 e() {
        return this.b;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.h;
    }

    public final String h() {
        return this.a;
    }

    public final boolean i() {
        return this.f;
    }
}
