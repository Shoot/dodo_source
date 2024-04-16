package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PackageGroupV5.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010#\u001a\u00020\u0011\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u001a¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u001a8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f¨\u0006*"}, d2 = {"Lno7;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getName", Action.NAME_ATTRIBUTE, "Ld71;", c.a, "Ld71;", "getChoiceType", "()Ld71;", "choiceType", "", DateTokenConverter.CONVERTER_KEY, "I", "getTotalQuantityMin", "()I", "totalQuantityMin", e.a, "getTotalQuantityMax", "totalQuantityMax", "", "Lyo7;", "f", "Ljava/util/List;", "getPackageOptions", "()Ljava/util/List;", "packageOptions", "g", "getIndex", "index", "Lv6;", Image.TYPE_HIGH, "getAdditionalData", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ld71;IILjava/util/List;ILjava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: no7  reason: default package */
/* loaded from: classes.dex */
public final class no7 {
    private final String a;
    private final String b;
    private final d71 c;
    private final int d;
    private final int e;
    private final List<yo7> f;
    private final int g;
    private final List<v6> h;

    public no7(String str, String str2, d71 d71Var, int i, int i2, List<yo7> list, int i3, List<v6> list2) {
        z65.h(str, "code");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(d71Var, "choiceType");
        z65.h(list, "packageOptions");
        z65.h(list2, "additionalData");
        this.a = str;
        this.b = str2;
        this.c = d71Var;
        this.d = i;
        this.e = i2;
        this.f = list;
        this.g = i3;
        this.h = list2;
    }
}
