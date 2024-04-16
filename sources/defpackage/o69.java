package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: RatingService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H&J0\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0015"}, d2 = {"Lo69;", "", "", "orderId", "Lb59;", "a", "", "orderTypeId", "", "", "Lq69;", "b", "rating", "", c.a, "ratingPhotosIds", "", "userProvidedBinaryFeedback", "Ldj9;", "requestedContactType", DateTokenConverter.CONVERTER_KEY, "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o69  reason: default package */
/* loaded from: classes.dex */
public interface o69 {
    b59 a(String str);

    Map<Integer, List<q69>> b(int i);

    void c(b59 b59Var);

    void d(b59 b59Var, List<String> list, boolean z, dj9 dj9Var);
}
