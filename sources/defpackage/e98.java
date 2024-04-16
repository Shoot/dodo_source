package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: PizzeriaService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Le98;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "Ld88;", "getPizzeriasInCountry", "Ldt5;", "locality", "a", c.a, "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e98  reason: default package */
/* loaded from: classes4.dex */
public interface e98 {
    Collection<d88> a(dt5 dt5Var);

    d88 b();

    Collection<d88> c(dt5 dt5Var);

    Collection<d88> getPizzeriasInCountry(String str);
}
