package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CompositeProduct.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0004\b6\u00107J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010#\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00198\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010(\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010)\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010.\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b+\u0010\u001dR\u001a\u00105\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104¨\u00068"}, d2 = {"Lao1;", "Lfl8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "getName", Action.NAME_ATTRIBUTE, c.a, e.a, "category", DateTokenConverter.CONVERTER_KEY, "f", "description", "", "Ltl8;", "Ljava/util/Collection;", "j", "()Ljava/util/Collection;", "images", "l", "metaProductId", "g", "q", "weight", Image.TYPE_HIGH, "o", "products", "i", "allergens", "allergensCanContain", "Lrl8;", "k", "Lrl8;", "()Lrl8;", "foodValue", "Lul8;", "ingredients", "Lkm8;", Image.TYPE_MEDIUM, "Lkm8;", "()Lkm8;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ao1  reason: default package */
/* loaded from: classes.dex */
public final class ao1 extends fl8 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Collection<tl8> e;
    private final String f;
    private final String g;
    private final Collection<fl8> h;
    private final String i;
    private final String j;
    private final rl8 k;
    private final Collection<ul8> l;
    private final km8 m;

    /* JADX WARN: Multi-variable type inference failed */
    public ao1(String str, String str2, String str3, String str4, Collection<tl8> collection, String str5, String str6, Collection<? extends fl8> collection2) {
        List l;
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "category");
        z65.h(str4, "description");
        z65.h(collection, "images");
        z65.h(str5, "metaProductId");
        z65.h(str6, "weight");
        z65.h(collection2, "products");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = collection;
        this.f = str5;
        this.g = str6;
        this.h = collection2;
        this.i = "";
        this.j = "";
        this.k = new rl8("", "", "", "", "");
        l = kc1.l();
        this.l = l;
        this.m = new km8(null, null, 3, null);
    }

    @Override // defpackage.fl8
    public String b() {
        return this.i;
    }

    @Override // defpackage.fl8
    public String c() {
        return this.j;
    }

    @Override // defpackage.fl8
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao1)) {
            return false;
        }
        ao1 ao1Var = (ao1) obj;
        if (z65.c(this.a, ao1Var.a) && z65.c(this.b, ao1Var.b) && z65.c(this.c, ao1Var.c) && z65.c(this.d, ao1Var.d) && z65.c(this.e, ao1Var.e) && z65.c(this.f, ao1Var.f) && z65.c(this.g, ao1Var.g) && z65.c(this.h, ao1Var.h)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fl8
    public String f() {
        return this.d;
    }

    @Override // defpackage.fl8
    public String getId() {
        return this.a;
    }

    @Override // defpackage.fl8
    public String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    @Override // defpackage.fl8
    public rl8 i() {
        return this.k;
    }

    @Override // defpackage.fl8
    public Collection<tl8> j() {
        return this.e;
    }

    @Override // defpackage.fl8
    public Collection<ul8> k() {
        return this.l;
    }

    @Override // defpackage.fl8
    public String l() {
        return this.f;
    }

    @Override // defpackage.fl8
    public km8 m() {
        return this.m;
    }

    public final Collection<fl8> o() {
        return this.h;
    }

    public final String q() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Collection<tl8> collection = this.e;
        String str5 = this.f;
        String str6 = this.g;
        Collection<fl8> collection2 = this.h;
        return "CompositeProduct(id=" + str + ", name=" + str2 + ", category=" + str3 + ", description=" + str4 + ", images=" + collection + ", metaProductId=" + str5 + ", weight=" + str6 + ", products=" + collection2 + ")";
    }
}
