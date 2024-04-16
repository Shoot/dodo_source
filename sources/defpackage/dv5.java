package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: LocalityRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\tH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0012"}, d2 = {"Ldv5;", "", "", "id", LocalityEntity.FIELD_COUNTRY_CODE, "Ldt5;", "f", DateTokenConverter.CONVERTER_KEY, "locality", "", "k", "p", "", "j", "models", "g", "", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dv5  reason: default package */
/* loaded from: classes4.dex */
public interface dv5 {
    boolean c();

    dt5 d();

    dt5 f(String str, String str2);

    void g(String str, Collection<? extends dt5> collection);

    Collection<dt5> j(String str);

    void k(dt5 dt5Var);

    void p();
}
