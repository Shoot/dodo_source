package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u0014\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0000\u001a\f\u0010\b\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a)\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0016\u0010\u0011\u001a\u00020\f*\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u000fH\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¨\u0006\u0018"}, d2 = {"", "", "k", "Lddc;", "kotlin.jvm.PlatformType", "b", "Lb55;", DateTokenConverter.CONVERTER_KEY, c.a, e.a, "", "values", "", "f", "(Ljava/lang/String;[Ljava/lang/String;)Z", "Landroid/content/Context;", "processName", Image.TYPE_HIGH, "g", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "", "i", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: vn3  reason: default package */
/* loaded from: classes.dex */
public final class vn3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: vn3$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<String> {
        final /* synthetic */ Map<String, String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, String> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String i0;
            Map<String, String> map = this.a;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey() + '=' + entry.getValue());
            }
            i0 = sc1.i0(arrayList, ContainerUtils.FIELD_DELIMITER, CallerData.NA, null, 0, null, null, 60, null);
            return i0;
        }
    }

    public static final String b(ddc ddcVar) {
        Object b;
        z65.h(ddcVar, "<this>");
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b(ddcVar.Q(an2.h("yyyy-MM-dd'T'HH:mm:ss'Z'")));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        Throwable d = sk9.d(b);
        if (d != null) {
            fk6.a.f("Mindbox", "Error converting date", d);
            b = "";
        }
        return (String) b;
    }

    public static final ddc c(String str) {
        z65.h(str, "<this>");
        try {
            sk9.a aVar = sk9.b;
            ddc P = es5.R0(str, an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h);
            z65.g(P, "parse(this, DateTimeForm…     ZoneOffset.UTC\n    )");
            return P;
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            Object b = sk9.b(vk9.a(th));
            Throwable d = sk9.d(b);
            if (d != null) {
                fk6.a.f("Mindbox", "Error converting date", d);
                b = es5.R0("1970-01-01T00:00:00", an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h);
            }
            z65.g(b, "runCatching {\n    return…oneOffset.UTC\n        )\n}");
            return (ddc) b;
        }
    }

    public static final ddc d(b55 b55Var) {
        z65.h(b55Var, "<this>");
        ddc N0 = ddc.N0(b55Var, wcc.h);
        z65.g(N0, "ofInstant(this, ZoneOffset.UTC)");
        return N0;
    }

    public static final ddc e(String str) {
        z65.h(str, "<this>");
        try {
            sk9.a aVar = sk9.b;
            ddc P = es5.R0(str, an2.h("yyyy-MM-dd'T'HH:mm:ss'Z'")).P(wcc.h);
            z65.g(P, "parse(this, DateTimeForm… ZoneOffset.UTC\n        )");
            return P;
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            Object b = sk9.b(vk9.a(th));
            Throwable d = sk9.d(b);
            if (d != null) {
                fk6.a.f("Mindbox", "Error converting date", d);
                b = es5.R0("1970-01-01T00:00:00", an2.h("yyyy-MM-dd'T'HH:mm:ss")).P(wcc.h);
            }
            z65.g(b, "runCatching {\n    return…oneOffset.UTC\n        )\n}");
            return (ddc) b;
        }
    }

    public static final boolean f(String str, String... strArr) {
        z65.h(strArr, "values");
        for (String str2 : strArr) {
            if (z65.c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final String g(Context context) {
        Object obj;
        String processName;
        z65.h(context, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        z65.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        z65.g(runningAppProcesses, "processes");
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null) {
            return null;
        }
        return runningAppProcessInfo.processName;
    }

    public static final boolean h(Context context, String str) {
        boolean y;
        z65.h(context, "<this>");
        String string = context.getString(c19.mindbox_android_process);
        y = l0b.y(string);
        if (y) {
            string = context.getPackageName();
        }
        if (str != null) {
            z65.g(string, "mainProcessName");
            return f(str, string, context.getPackageName() + CoreConstants.COLON_CHAR + string, context.getPackageName() + string);
        }
        return false;
    }

    public static final void i(final View view, final View.OnClickListener onClickListener) {
        z65.h(view, "<this>");
        z65.h(onClickListener, "listener");
        view.setOnClickListener(new View.OnClickListener() { // from class: tn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vn3.j(view, onClickListener, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(View view, View.OnClickListener onClickListener, View view2) {
        z65.h(view, "$this_setSingleClickListener");
        z65.h(onClickListener, "$listener");
        view.setOnClickListener(null);
        onClickListener.onClick(view2);
    }

    public static final String k(Map<String, String> map) {
        z65.h(map, "<this>");
        return (String) yx5.a.b("", new a(map));
    }
}
