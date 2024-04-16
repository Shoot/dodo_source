package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0004R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/a;", "Lu2;", "", "text", "", com.huawei.hms.push.e.a, "", "start", "end", "", com.huawei.hms.opendevice.c.a, "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "b", "[I", tmb.g.SEGMENT_JSON_NAME, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class a implements u2 {
    protected String a;
    private final int[] b = new int[2];

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] c(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = this.b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        z65.z("text");
        return null;
    }

    public void e(String str) {
        z65.h(str, "text");
        f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        z65.h(str, "<set-?>");
        this.a = str;
    }
}
