package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CustomizationService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006!"}, d2 = {"Ld62;", "Lc62;", "", "productMenuItemId", "", "removedIngredientsIds", "", "j", "g", "toppingParentIds", "f", Image.TYPE_HIGH, "comboMenuItemId", "selectedComboSlotsProductsIds", "i", "k", e.a, "menuItemId", DateTokenConverter.CONVERTER_KEY, "a", c.a, "b", "Lde9;", "Lde9;", "removedIngredientsRepository", "Lljb;", "Lljb;", "toppingsRepository", "Lxg1;", "Lxg1;", "comboCustomizationRepository", "<init>", "(Lde9;Lljb;Lxg1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d62  reason: default package */
/* loaded from: classes4.dex */
public final class d62 implements c62 {
    private final de9 a;
    private final ljb b;
    private final xg1 c;

    public d62(de9 de9Var, ljb ljbVar, xg1 xg1Var) {
        z65.h(de9Var, "removedIngredientsRepository");
        z65.h(ljbVar, "toppingsRepository");
        z65.h(xg1Var, "comboCustomizationRepository");
        this.a = de9Var;
        this.b = ljbVar;
        this.c = xg1Var;
    }

    @Override // defpackage.c62
    public void a(String str) {
        z65.h(str, "menuItemId");
        this.a.a(str);
    }

    @Override // defpackage.c62
    public Collection<String> b() {
        return this.a.b();
    }

    @Override // defpackage.c62
    public Collection<String> c() {
        return this.b.c();
    }

    @Override // defpackage.c62
    public void d(String str) {
        z65.h(str, "menuItemId");
        this.b.d(str);
    }

    @Override // defpackage.c62
    public void e() {
        this.b.b();
        this.a.e0();
        this.c.b();
    }

    @Override // defpackage.c62
    public void f(String str, Collection<String> collection) {
        z65.h(str, "productMenuItemId");
        z65.h(collection, "toppingParentIds");
        this.b.e(str, collection);
    }

    @Override // defpackage.c62
    public Collection<String> g(String str) {
        z65.h(str, "productMenuItemId");
        return this.a.c(str);
    }

    @Override // defpackage.c62
    public Collection<String> h(String str) {
        z65.h(str, "productMenuItemId");
        return this.b.a(str);
    }

    @Override // defpackage.c62
    public void i(String str, Collection<String> collection) {
        z65.h(str, "comboMenuItemId");
        z65.h(collection, "selectedComboSlotsProductsIds");
        this.c.c(str, collection);
    }

    @Override // defpackage.c62
    public void j(String str, Collection<String> collection) {
        z65.h(str, "productMenuItemId");
        z65.h(collection, "removedIngredientsIds");
        this.a.d(str, collection);
    }

    @Override // defpackage.c62
    public Collection<String> k(String str) {
        z65.h(str, "comboMenuItemId");
        return this.c.a(str);
    }
}
