package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocalityService.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\rH&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ljv5;", "", "", "f", "", LocalityEntity.FIELD_COUNTRY_CODE, Image.TYPE_HIGH, "", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "localityId", "b", "locality", "", "g", "localityUuid", "", "Lbq3;", e.a, c.a, "i", "()Ldt5;", "getCurrentLocality$annotations", "()V", "currentLocality", "", "a", "()I", "getCountryCode$annotations", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jv5  reason: default package */
/* loaded from: classes4.dex */
public interface jv5 {
    int a();

    dt5 b(String str, String str2);

    boolean c();

    Collection<dt5> d(String str);

    List<bq3> e(String str, String str2);

    void f();

    boolean g(dt5 dt5Var);

    void h(String str);

    dt5 i();
}
