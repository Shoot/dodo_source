package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LoyaltyService.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\t\u001a\u00020\bH&J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u0002H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H&J\b\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H&J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H&J%\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lx26;", "", "", "localityId", "pizzeriaId", "Lt06;", Image.TYPE_HIGH, "f", "Lt16;", "getLoyaltyMissionsInfo", "missionId", "userAnswer", "Lx06;", "g", c.a, "", "alreadyLoadedCount", "", "Lo06;", e.a, "Lab1;", "a", "Lac9;", "getReferrerInfo", "Lra9;", "getReferrerHistory", "", "getEnterCodeAvailability", "code", "Lja9;", DateTokenConverter.CONVERTER_KEY, "activeOrderId", "Lwd7;", "b", "", "rewardAmount", "Lxd7;", "i", "(Ljava/lang/String;D)Ljava/lang/String;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x26  reason: default package */
/* loaded from: classes4.dex */
public interface x26 {
    ab1 a();

    wd7 b(String str);

    x06 c(String str);

    ja9 d(String str);

    List<o06> e(int i);

    t06 f(String str, String str2);

    x06 g(String str, String str2);

    boolean getEnterCodeAvailability();

    t16 getLoyaltyMissionsInfo();

    List<ra9> getReferrerHistory();

    ac9 getReferrerInfo();

    t06 h(String str, String str2);

    String i(String str, double d);
}
