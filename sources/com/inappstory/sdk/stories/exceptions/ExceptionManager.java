package com.inappstory.sdk.stories.exceptions;

import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.network.ApiInterface;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.stories.api.models.Session;
import com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback;
import com.inappstory.sdk.stories.api.models.logs.ExceptionLog;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import com.inappstory.sdk.stories.utils.SessionManager;
import java.lang.reflect.Type;
import java.util.UUID;
/* loaded from: classes3.dex */
public class ExceptionManager {
    public static final String SAVED_EX = "saved_exception";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements OpenSessionCallback {
        final /* synthetic */ ExceptionLog a;

        /* renamed from: com.inappstory.sdk.stories.exceptions.ExceptionManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0264a extends NetworkCallback {
            C0264a() {
            }

            @Override // com.inappstory.sdk.network.Callback
            public Type getType() {
                return null;
            }

            @Override // com.inappstory.sdk.network.Callback
            public void onSuccess(Object obj) {
                SharedPreferencesAPI.removeString(ExceptionManager.SAVED_EX);
            }
        }

        a(ExceptionLog exceptionLog) {
            this.a = exceptionLog;
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onError() {
            SharedPreferencesAPI.removeString(ExceptionManager.SAVED_EX);
        }

        @Override // com.inappstory.sdk.stories.api.models.callbacks.OpenSessionCallback
        public void onSuccess() {
            if (Session.getInstance().statisticPermissions != null && Session.getInstance().statisticPermissions.allowCrash) {
                ApiInterface statApi = NetworkClient.getStatApi();
                ExceptionLog exceptionLog = this.a;
                String str = exceptionLog.session;
                Long valueOf = Long.valueOf(exceptionLog.timestamp / 1000);
                ExceptionLog exceptionLog2 = this.a;
                statApi.sendException(str, valueOf, exceptionLog2.message, exceptionLog2.file, Integer.valueOf(exceptionLog2.line), this.a.stacktrace).enqueue(new C0264a());
                return;
            }
            SharedPreferencesAPI.removeString(ExceptionManager.SAVED_EX);
        }
    }

    public ExceptionLog generateExceptionLog(Throwable th) {
        ExceptionLog exceptionLog = new ExceptionLog();
        exceptionLog.id = UUID.randomUUID().toString();
        exceptionLog.timestamp = System.currentTimeMillis();
        exceptionLog.message = th.getClass().getCanonicalName() + ": " + th.getMessage();
        exceptionLog.session = Session.getInstance().id;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 0) {
            String str = "";
            for (StackTraceElement stackTraceElement : stackTrace) {
                str = str + stackTraceElement.toString() + "\n";
            }
            exceptionLog.stacktrace = str;
            exceptionLog.file = stackTrace[0].getFileName();
            exceptionLog.line = stackTrace[0].getLineNumber();
        }
        return exceptionLog;
    }

    public ExceptionLog getSavedException() {
        String string = SharedPreferencesAPI.getString(SAVED_EX, null);
        if (string == null) {
            return null;
        }
        return (ExceptionLog) JsonParser.fromJson(string, ExceptionLog.class);
    }

    void logException(ExceptionLog exceptionLog) {
        InAppStoryManager.sendExceptionLog(exceptionLog);
    }

    public void saveException(ExceptionLog exceptionLog) {
        try {
            SharedPreferencesAPI.saveString(SAVED_EX, JsonParser.getJson(exceptionLog));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendException(ExceptionLog exceptionLog) {
        logException(exceptionLog);
        ExceptionLog exceptionLog2 = new ExceptionLog();
        exceptionLog2.stacktrace = exceptionLog.stacktrace;
        exceptionLog2.timestamp = exceptionLog.timestamp;
        exceptionLog2.message = exceptionLog.message;
        exceptionLog2.file = exceptionLog.file;
        exceptionLog2.session = exceptionLog.session;
        exceptionLog2.line = exceptionLog.line;
        SessionManager.getInstance().useOrOpenSession(new a(exceptionLog2));
    }

    public void sendSavedException() {
        ExceptionLog savedException = getSavedException();
        if (savedException == null) {
            return;
        }
        sendException(savedException);
    }
}
