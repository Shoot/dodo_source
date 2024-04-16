package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HalfPizzaModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010)\u001a\u00020%\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000201008\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001f\u00104¨\u00068"}, d2 = {"Lxj4;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "", "I", "i", "()I", "sizeGroupId", "Lkm8;", c.a, "Lkm8;", "getSize", "()Lkm8;", "size", DateTokenConverter.CONVERTER_KEY, "f", "pizzaMenuItemId", e.a, "doughId", Action.NAME_ATTRIBUTE, "Lhn6;", "g", "Lhn6;", "()Lhn6;", "price", "Lfna;", Image.TYPE_HIGH, "Lfna;", "getSizeGroup", "()Lfna;", "sizeGroup", ElementGenerator.TYPE_IMAGE, "", "j", "Z", "()Z", "isStopped", "", "Lul8;", "k", "Ljava/util/Collection;", "()Ljava/util/Collection;", "ingredients", "", "Llm8;", "l", "Ljava/util/List;", "()Ljava/util/List;", "productTags", "<init>", "(Ljava/lang/String;ILkm8;Ljava/lang/String;ILjava/lang/String;Lhn6;Lfna;Ljava/lang/String;ZLjava/util/Collection;Ljava/util/List;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xj4  reason: default package */
/* loaded from: classes2.dex */
public final class xj4 {
    private final String a;
    private final int b;
    private final km8 c;
    private final String d;
    private final int e;
    private final String f;
    private final hn6 g;
    private final fna h;
    private final String i;
    private final boolean j;
    private final Collection<ul8> k;
    private final List<lm8> l;

    public xj4(String str, int i, km8 km8Var, String str2, int i2, String str3, hn6 hn6Var, fna fnaVar, String str4, boolean z, Collection<ul8> collection, List<lm8> list) {
        z65.h(str, "id");
        z65.h(km8Var, "size");
        z65.h(str2, "pizzaMenuItemId");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        z65.h(fnaVar, "sizeGroup");
        z65.h(collection, "ingredients");
        z65.h(list, "productTags");
        this.a = str;
        this.b = i;
        this.c = km8Var;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = hn6Var;
        this.h = fnaVar;
        this.i = str4;
        this.j = z;
        this.k = collection;
        this.l = list;
    }

    public final int a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.i;
    }

    public final Collection<ul8> d() {
        return this.k;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.d;
    }

    public final hn6 g() {
        return this.g;
    }

    public final List<lm8> h() {
        return this.l;
    }

    public final int i() {
        return this.b;
    }

    public final boolean j() {
        return this.j;
    }
}
