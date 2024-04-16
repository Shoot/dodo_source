package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: IngredientGroupV5.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010(\u001a\u00020\u0016\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001f¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001f8\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$¨\u0006/"}, d2 = {"Ln25;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "", "b", "Z", "isBasis", "()Z", c.a, "getName", Action.NAME_ATTRIBUTE, "Ld71;", DateTokenConverter.CONVERTER_KEY, "Ld71;", "getChoiceType", "()Ld71;", "choiceType", "", e.a, "I", "getTotalQuantityMin", "()I", "totalQuantityMin", "f", "getTotalQuantityMax", "totalQuantityMax", "", "Lo25;", "g", "Ljava/util/List;", "getIngredients", "()Ljava/util/List;", "ingredients", Image.TYPE_HIGH, "getIndex", "index", "Lv6;", "i", "getAdditionalData", "additionalData", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ld71;IILjava/util/List;ILjava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: n25  reason: default package */
/* loaded from: classes.dex */
public final class n25 {
    private final String a;
    private final boolean b;
    private final String c;
    private final d71 d;
    private final int e;
    private final int f;
    private final List<o25> g;
    private final int h;
    private final List<v6> i;

    public n25(String str, boolean z, String str2, d71 d71Var, int i, int i2, List<o25> list, int i3, List<v6> list2) {
        z65.h(str, "code");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(d71Var, "choiceType");
        z65.h(list, "ingredients");
        z65.h(list2, "additionalData");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = d71Var;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = i3;
        this.i = list2;
    }
}
