package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: MenuService.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0002H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0016\u001a\u00020\u0014H&J\u001a\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u0018H&J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H&J\b\u0010!\u001a\u00020 H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH&J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0004H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH&J \u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0019H&J \u0010.\u001a\u00020,2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0019H&J\u0010\u00100\u001a\u00020$2\u0006\u0010/\u001a\u00020\bH&J\u0010\u00101\u001a\u00020$2\u0006\u0010/\u001a\u00020\bH&¨\u00062"}, d2 = {"Lah6;", "", "", "menuItemId", "Lqd6;", "a", "menuItemV5Id", "o", "Lte6;", "b", "id", "Ltja;", "k", ShoppingInfoEntity.FIELD_SHOPPING_ID, "n", "", Image.TYPE_SMALL, "", "Lkl8;", "l", "Ldd6;", Image.TYPE_MEDIUM, "menuCategory", DateTokenConverter.CONVERTER_KEY, "", "", "Lnk4;", "j", "firstHalfId", "secondHalfId", "Lil4;", e.a, "Lgl4;", "f", "i", "menuItem", "", Image.TYPE_HIGH, "r", "Ljk7;", "orderType", "Lfb8;", "placeReference", LocalityEntity.FIELD_COUNTRY_CODE, "", "g", c.a, "menuItemV5", "p", "q", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ah6  reason: default package */
/* loaded from: classes4.dex */
public interface ah6 {
    qd6 a(String str);

    te6 b(String str);

    void c(jk7 jk7Var, fb8 fb8Var, int i);

    List<qd6> d(dd6 dd6Var);

    Map<Integer, il4> e(String str, String str2);

    gl4 f();

    void g(jk7 jk7Var, fb8 fb8Var, int i);

    boolean h(qd6 qd6Var);

    Collection<qd6> i();

    Map<Integer, Collection<nk4>> j();

    tja k(String str);

    List<kl8> l();

    List<dd6> m();

    qd6 n(String str);

    qd6 o(String str);

    boolean p(te6 te6Var);

    boolean q(te6 te6Var);

    Collection<qd6> r();

    Collection<tja> s(String str);
}
