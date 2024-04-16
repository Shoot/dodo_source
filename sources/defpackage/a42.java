package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tja;
import java.io.Serializable;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomShoppingItem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e\u0012\b\b\u0002\u0010+\u001a\u00020$¢\u0006\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0007R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"La42;", "Ltja;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lhn6;", "b", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "Lfl8;", c.a, "Lfl8;", "Y", "()Lfl8;", "product", "Ll18;", DateTokenConverter.CONVERTER_KEY, "Ll18;", "v", "()Ll18;", "personalPrice", e.a, "G0", ShoppingInfoEntity.FIELD_SHOPPING_ID, "", "f", "Ljava/util/Collection;", "getComponents", "()Ljava/util/Collection;", "components", "", "g", "Z", "p", "()Z", "setStopped", "(Z)V", "isStopped", "<init>", "(Ljava/lang/String;Lhn6;Lfl8;Ll18;Ljava/lang/String;Ljava/util/Collection;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a42  reason: default package */
/* loaded from: classes4.dex */
public final class a42 implements tja, Serializable {
    private final String a;
    private final hn6 b;
    private final fl8 c;
    private final l18 d;
    private final String e;
    private final Collection<tja> f;
    private boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public a42(String str, hn6 hn6Var, fl8 fl8Var, l18 l18Var, String str2, Collection<? extends tja> collection, boolean z) {
        z65.h(str, "id");
        z65.h(hn6Var, "price");
        z65.h(fl8Var, "product");
        z65.h(str2, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        z65.h(collection, "components");
        this.a = str;
        this.b = hn6Var;
        this.c = fl8Var;
        this.d = l18Var;
        this.e = str2;
        this.f = collection;
        this.g = z;
    }

    @Override // defpackage.qja
    public String G0() {
        return this.e;
    }

    @Override // defpackage.tja
    public fl8 Y() {
        return this.c;
    }

    @Override // defpackage.qja
    public String getId() {
        return this.a;
    }

    @Override // defpackage.qja
    public hn6 h() {
        return this.b;
    }

    @Override // defpackage.qja
    public boolean p() {
        return this.g;
    }

    @Override // defpackage.tja, defpackage.qja
    public String t() {
        return tja.a.a(this);
    }

    @Override // defpackage.tja
    public <T extends fl8> T t0() {
        return (T) tja.a.b(this);
    }

    @Override // defpackage.qja
    public l18 v() {
        return this.d;
    }

    public /* synthetic */ a42(String str, hn6 hn6Var, fl8 fl8Var, l18 l18Var, String str2, Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hn6Var, fl8Var, l18Var, str2, collection, (i & 64) != 0 ? false : z);
    }
}
