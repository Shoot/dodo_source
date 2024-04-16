package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: LocalityListInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n2\n\u0010\u0003\u001a\u00060\u0002j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0002H&J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\u0003\u001a\u00060\u0002j\u0002`\bH&J\u0014\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0002j\u0002`\bH&¨\u0006\u0010"}, d2 = {"Lau5;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "Loz3;", "", "Ln6a;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/domain/country/models/CountryCode;", "filter", "Lwx;", "Lmv5;", c.a, "a", "Ltl5;", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: au5  reason: default package */
/* loaded from: classes4.dex */
public interface au5 {
    wx<String> a(String str);

    tl5 b(String str);

    wx<Collection<mv5>> c(String str, String str2);

    oz3<Collection<n6a>> d(String str);
}
