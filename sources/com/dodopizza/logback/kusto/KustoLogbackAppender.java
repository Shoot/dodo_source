package com.dodopizza.logback.kusto;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.InitializedKusto;
import com.dodopizza.kustoworker.Kusto;
import com.dodopizza.kustoworker.KustoMessage;
import com.dodopizza.kustoworker.KustoMessageMeta;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.kustoworker.session.SessionData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: KustoLogbackAppender.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/logback/kusto/KustoLogbackAppender;", "Lch/qos/logback/core/AppenderBase;", "Lch/qos/logback/classic/spi/ILoggingEvent;", "()V", KustoStorage.KustoTable.TABLE_NAME, "Lcom/dodopizza/kustoworker/Kusto;", "getKusto", "()Lcom/dodopizza/kustoworker/Kusto;", "append", "", "eventObject", "buildApp", "", "", "sessionData", "Lcom/dodopizza/kustoworker/session/SessionData;", "buildDetails", "", "buildDevice", "buildError", "throwableProxy", "Lch/qos/logback/classic/spi/IThrowableProxy;", "buildOs", "buildStackTrace", "buildUser", "createKustoLogMessage", "Lcom/dodopizza/kustoworker/KustoMessage;", "logback-kusto_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class KustoLogbackAppender extends AppenderBase<ILoggingEvent> {
    private final Map<String, String> buildApp(SessionData sessionData) {
        Map<String, String> k;
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, sessionData.getAppData().getAppName()), lnb.a("packageName", sessionData.getAppData().getPackageName()), lnb.a("versionName", sessionData.getAppData().getVersionName()), lnb.a("versionCode", sessionData.getAppData().getVersionCode()));
        return k;
    }

    private final Map<String, Object> buildDetails(SessionData sessionData) {
        return sessionData.getCustomData();
    }

    private final Map<String, String> buildDevice(SessionData sessionData) {
        Map<String, String> k;
        k = g86.k(lnb.a("arch", sessionData.getDeviceData().getArch()), lnb.a("processors", String.valueOf(sessionData.getDeviceData().getAvailableProcessors())), lnb.a("diskSpace", String.valueOf(sessionData.getDeviceData().getDiskSpace())), lnb.a("isEmulator", String.valueOf(sessionData.getDeviceData().isEmulator())), lnb.a("manufacturer", sessionData.getDeviceData().getManufacturer()), lnb.a("model", sessionData.getDeviceData().getModel()));
        return k;
    }

    private final Map<String, String> buildError(IThrowableProxy iThrowableProxy) {
        Map<String, String> k;
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, iThrowableProxy.getClassName()), lnb.a("message", iThrowableProxy.getMessage()), lnb.a("stacktrace", buildStackTrace(iThrowableProxy)));
        return k;
    }

    private final Map<String, String> buildOs(SessionData sessionData) {
        Map<String, String> k;
        k = g86.k(lnb.a(Action.NAME_ATTRIBUTE, "android"), lnb.a("versionName", sessionData.getOsData().getVersionName()), lnb.a("versionCode", sessionData.getOsData().getVersion()), lnb.a("sdkVersion", String.valueOf(sessionData.getOsData().getSdkVersion())), lnb.a("isRooted", String.valueOf(sessionData.getOsData().isRooted())));
        return k;
    }

    private final String buildStackTrace(IThrowableProxy iThrowableProxy) {
        String O;
        StringBuilder sb = new StringBuilder();
        sb.append("Non-fatal Exception: ");
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
        sb.append(" \n\t ");
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        z65.g(stackTraceElementProxyArray, "throwableProxy.stackTraceElementProxyArray");
        O = yr.O(stackTraceElementProxyArray, " \n\t ", null, null, 0, null, KustoLogbackAppender$buildStackTrace$1.INSTANCE, 30, null);
        sb.append(O);
        String sb2 = sb.toString();
        z65.g(sb2, "StringBuilder()\n      .a…     }\n      ).toString()");
        return sb2;
    }

    private final Map<String, Object> buildUser(SessionData sessionData) {
        return sessionData.getUserData();
    }

    private final KustoMessage createKustoLogMessage(ILoggingEvent iLoggingEvent) {
        Map k;
        Map<String, String> buildError;
        Kusto kusto = getKusto();
        if (kusto != null) {
            SessionData session = ((InitializedKusto) kusto).getSession();
            String uuid = UUID.randomUUID().toString();
            z65.g(uuid, "UUID.randomUUID().toString()");
            KustoMessageMeta kustoMessageMeta = new KustoMessageMeta(uuid, null, 2, null);
            Pair[] pairArr = new Pair[13];
            pairArr[0] = lnb.a("id", uuid);
            pairArr[1] = lnb.a(RemoteMessageConst.Notification.CONTENT, iLoggingEvent.getMessage());
            pairArr[2] = lnb.a("application", buildApp(session));
            pairArr[3] = lnb.a("applicationName", session.getAppData().getAppName());
            pairArr[4] = lnb.a("device", buildDevice(session));
            pairArr[5] = lnb.a("os", buildOs(session));
            pairArr[6] = lnb.a("user", buildUser(session));
            Object obj = session.getCustomData().get("environmentName");
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            pairArr[7] = lnb.a("environmentName", obj);
            pairArr[8] = lnb.a("clientTimestamp", Long.valueOf(iLoggingEvent.getTimeStamp()));
            pairArr[9] = lnb.a("session", session.getSessionId());
            pairArr[10] = lnb.a("level", iLoggingEvent.getLevel());
            IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
            if (throwableProxy != null && (buildError = buildError(throwableProxy)) != null) {
                obj2 = buildError;
            }
            pairArr[11] = lnb.a("error", obj2);
            pairArr[12] = lnb.a("details", buildDetails(session));
            k = g86.k(pairArr);
            return new KustoMessage(kustoMessageMeta, k);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.dodopizza.kustoworker.InitializedKusto");
    }

    private final Kusto getKusto() {
        return Kusto.Companion.instance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.AppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        KustoMessage createKustoLogMessage;
        if (!isStarted() || !(getKusto() instanceof InitializedKusto) || iLoggingEvent == null || (createKustoLogMessage = createKustoLogMessage(iLoggingEvent)) == null) {
            return;
        }
        getKusto().sendMessage(createKustoLogMessage);
    }
}
