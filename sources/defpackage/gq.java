package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AppsFlyerDeepLinkExtractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002*&\u0010\u0006\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¨\u0006\u0007"}, d2 = {"", "", "", "Lru/dodopizza/app/application/appsflyer/AppsFlyerConversionData;", Action.KEY_ATTRIBUTE, "b", "AppsFlyerConversionData", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: gq  reason: default package */
/* loaded from: classes3.dex */
public final class gq {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Map<String, ? extends Object> map, String str) {
        String str2;
        Object obj = map.get(str);
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
