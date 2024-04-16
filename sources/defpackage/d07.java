package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import kotlin.Metadata;
import ru.dodopizza.mindbox.model.MindboxProperties;
import ru.dodopizza.mindbox.model.User;
/* compiled from: NoopMindboxServiceImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Ld07;", "Lcl6;", "Lru/dodopizza/mindbox/model/MindboxProperties;", e.a, "", "pushToken", "", "a", "Lru/dodopizza/mindbox/model/User;", "user", DateTokenConverter.CONVERTER_KEY, "messageUniqueKey", "buttonUniqueKey", c.a, tmb.a.CITY_JSON_NAME, tmb.c.COUNTRY_JSON_NAME, "b", "<init>", "()V", "mindbox_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d07  reason: default package */
/* loaded from: classes4.dex */
public final class d07 implements cl6 {
    @Override // defpackage.cl6
    public void a(String str) {
        z65.h(str, "pushToken");
    }

    @Override // defpackage.cl6
    public void b(String str, String str2) {
        z65.h(str, tmb.a.CITY_JSON_NAME);
        z65.h(str2, tmb.c.COUNTRY_JSON_NAME);
    }

    @Override // defpackage.cl6
    public void c(String str, String str2) {
        z65.h(str, "messageUniqueKey");
        z65.h(str2, "buttonUniqueKey");
    }

    @Override // defpackage.cl6
    public void d(User user) {
        z65.h(user, "user");
    }

    @Override // defpackage.cl6
    public MindboxProperties e() {
        return MindboxProperties.Companion.getEMPTY();
    }
}
