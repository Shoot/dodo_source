package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: AnalyticEventBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\"\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, d2 = {"Lbc;", "", "", Action.KEY_ATTRIBUTE, "value", "", "ignoreIfNull", c.a, "paramName", "paramValue", DateTokenConverter.CONVERTER_KEY, "", "amount", "Ljava/util/Currency;", "currency", "b", "Lqc;", "a", "Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "Ljava/util/Map;", "params", "Li2b;", "Li2b;", "purchaseSum", "<init>", "(Ljava/lang/String;)V", "analytics-core"}, k = 1, mv = {1, 7, 1})
/* renamed from: bc */
/* loaded from: classes.dex */
public final class bc {
    private final String a;
    private final Map<String, Object> b;
    private i2b c;

    public bc(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = new LinkedHashMap();
        e(this, "eventName", str, false, 4, null);
    }

    private final bc c(String str, Object obj, boolean z) {
        if (z) {
            if (obj != null) {
                this.b.put(str, obj);
            }
        } else if (!z) {
            this.b.put(str, String.valueOf(obj));
        }
        return this;
    }

    public static /* synthetic */ bc e(bc bcVar, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        return bcVar.d(str, obj, z);
    }

    public final qc a() {
        return new qc(this.a, this.c, this.b);
    }

    public final bc b(double d, Currency currency) {
        z65.h(currency, "currency");
        this.c = new i2b(d, currency);
        return this;
    }

    public final bc d(String str, Object obj, boolean z) {
        z65.h(str, "paramName");
        return c(str, obj, z);
    }
}
