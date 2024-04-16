package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.mindbox.model.MindboxProperties;
import ru.dodopizza.mindbox.model.User;
/* compiled from: MindboxService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0011"}, d2 = {"Lcl6;", "", "Lru/dodopizza/mindbox/model/MindboxProperties;", e.a, "", "pushToken", "", "a", "Lru/dodopizza/mindbox/model/User;", "user", DateTokenConverter.CONVERTER_KEY, "messageUniqueKey", "buttonUniqueKey", c.a, tmb.a.CITY_JSON_NAME, tmb.c.COUNTRY_JSON_NAME, "b", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cl6  reason: default package */
/* loaded from: classes4.dex */
public interface cl6 {

    /* compiled from: MindboxService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cl6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(cl6 cl6Var, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "";
                }
                cl6Var.c(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPushClick");
        }
    }

    void a(String str);

    void b(String str, String str2);

    void c(String str, String str2);

    void d(User user);

    MindboxProperties e();
}
