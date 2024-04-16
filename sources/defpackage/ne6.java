package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: MenuItemRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\b\u0010\t\u001a\u00020\bH&J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u000bH&¨\u0006\u0010"}, d2 = {"Lne6;", "", "", "id", "Lqd6;", "a", "", "getAll", "Lqd6$d;", c.a, "models", "", "save", ShoppingInfoEntity.FIELD_SHOPPING_ID, DateTokenConverter.CONVERTER_KEY, "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ne6  reason: default package */
/* loaded from: classes4.dex */
public interface ne6 {
    qd6 a(String str);

    void b();

    qd6.d c();

    Collection<qd6> d(String str);

    Collection<qd6> getAll();

    void save(Collection<? extends qd6> collection);
}
