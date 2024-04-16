package defpackage;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: bundleutils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aE\u0010\u0007\u001a\u00020\u000626\u0010\u0005\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u00040\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0086\u0004\" \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"(\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\r\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016*&\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u001a"}, d2 = {"", "Lkotlin/Pair;", "", "", "Lcom/dodopizza/android/utils/BundlePair;", "pairs", "Landroid/os/Bundle;", c.a, "([Lkotlin/Pair;)Landroid/os/Bundle;", "value", DateTokenConverter.CONVERTER_KEY, "Lxh0;", "a", "Lxh0;", "getDEFAULT_BUNDLE_BUILDER", "()Lxh0;", "getDEFAULT_BUNDLE_BUILDER$annotations", "()V", "DEFAULT_BUNDLE_BUILDER", "b", "getBundleBuilder", "setBundleBuilder", "(Lxh0;)V", "getBundleBuilder$annotations", "bundleBuilder", "BundlePair", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: bi0  reason: default package */
/* loaded from: classes.dex */
public final class bi0 {
    private static final xh0 a;
    private static xh0 b;

    static {
        xh0 xh0Var = new xh0() { // from class: ai0
            @Override // defpackage.xh0
            public final Bundle a(Pair[] pairArr) {
                Bundle b2;
                b2 = bi0.b(pairArr);
                return b2;
            }
        };
        a = xh0Var;
        b = xh0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle b(Pair[] pairArr) {
        z65.h(pairArr, "pairs");
        return zh0.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final Bundle c(Pair<String, ? extends Object>... pairArr) {
        z65.h(pairArr, "pairs");
        return b.a(pairArr);
    }

    public static final Pair<String, Object> d(String str, Object obj) {
        z65.h(str, "<this>");
        return new Pair<>(str, obj);
    }
}
