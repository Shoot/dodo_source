package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class StatusPrinter {
    private static PrintStream ps = System.out;
    static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    private static void appendThrowable(StringBuilder sb, Throwable th) {
        String[] convert;
        String str;
        for (String str2 : ThrowableToStringArray.convert(th)) {
            if (!str2.startsWith(CoreConstants.CAUSED_BY)) {
                if (Character.isDigit(str2.charAt(0))) {
                    str = "\t... ";
                } else {
                    str = "\tat ";
                }
                sb.append(str);
            }
            sb.append(str2);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void buildStr(StringBuilder sb, String str, Status status) {
        StringBuilder sb2;
        String str2;
        if (status.hasChildren()) {
            sb2 = new StringBuilder();
            sb2.append(str);
            str2 = "+ ";
        } else {
            sb2 = new StringBuilder();
            sb2.append(str);
            str2 = "|-";
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb.append(" ");
        }
        sb.append(sb3);
        sb.append(status);
        sb.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it = status.iterator();
            while (it.hasNext()) {
                buildStr(sb, str + "  ", it.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb, List<Status> list) {
        if (list == null) {
            return;
        }
        for (Status status : list) {
            buildStr(sb, "", status);
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void printIfErrorsOccured(Context context) {
        if (context != null) {
            StatusManager statusManager = context.getStatusManager();
            if (statusManager == null) {
                PrintStream printStream = ps;
                printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
                return;
            } else if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("Context argument cannot be null");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void setPrintStream(PrintStream printStream) {
        ps = printStream;
    }

    public static void print(Context context, long j) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j);
            return;
        }
        PrintStream printStream = ps;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j) >= 1) {
                print(statusManager, j);
                return;
            }
            return;
        }
        PrintStream printStream = ps;
        printStream.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j) {
        StringBuilder sb = new StringBuilder();
        buildStrFromStatusList(sb, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j));
        ps.println(sb.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb = new StringBuilder();
        buildStrFromStatusList(sb, list);
        ps.println(sb.toString());
    }
}
