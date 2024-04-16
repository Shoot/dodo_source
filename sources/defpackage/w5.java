package defpackage;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import defpackage.s5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, d2 = {"Lw5;", "Ls5;", "", "", "", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Ls5$a;", e.a, "(Landroid/content/Context;[Ljava/lang/String;)Ls5$a;", "", "resultCode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "f", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w5  reason: default package */
/* loaded from: classes.dex */
public final class w5 extends s5<String[], Map<String, Boolean>> {
    public static final a a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lw5$a;", "", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: w5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] strArr) {
            z65.h(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            z65.g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // defpackage.s5
    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(strArr, "input");
        return a.a(strArr);
    }

    @Override // defpackage.s5
    /* renamed from: e */
    public s5.a<Map<String, Boolean>> b(Context context, String[] strArr) {
        int e;
        int e2;
        Map h;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(strArr, "input");
        if (strArr.length == 0) {
            h = g86.h();
            return new s5.a<>(h);
        }
        for (String str : strArr) {
            if (iu1.a(context, str) != 0) {
                return null;
            }
        }
        e = f86.e(strArr.length);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (String str2 : strArr) {
            Pair a2 = lnb.a(str2, Boolean.TRUE);
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new s5.a<>(linkedHashMap);
    }

    @Override // defpackage.s5
    /* renamed from: f */
    public Map<String, Boolean> c(int i, Intent intent) {
        Map<String, Boolean> h;
        List B;
        List N0;
        Map<String, Boolean> s;
        boolean z;
        Map<String, Boolean> h2;
        Map<String, Boolean> h3;
        if (i != -1) {
            h3 = g86.h();
            return h3;
        } else if (intent == null) {
            h2 = g86.h();
            return h2;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                h = g86.h();
                return h;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
            }
            B = yr.B(stringArrayExtra);
            N0 = sc1.N0(B, arrayList);
            s = g86.s(N0);
            return s;
        }
    }
}
