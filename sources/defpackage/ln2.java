package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.nio.CharBuffer;
/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* renamed from: ln2  reason: default package */
/* loaded from: classes.dex */
public class ln2 {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String c(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return CallerData.NA + i;
            }
        }
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static String e(MotionLayout motionLayout, int i) {
        return f(motionLayout, i, -1);
    }

    public static String f(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 != -1) {
            if (resourceEntryName.length() > i2) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i2 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                int length2 = (resourceEntryName.length() - i2) / length;
                return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, CoreConstants.DOT) + "_", "_");
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }

    public static void g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str3);
        }
    }
}
