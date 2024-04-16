package com.inappstory.sdk.exceptions;

import android.util.Log;
import com.inappstory.sdk.InAppStoryManager;
@Deprecated
/* loaded from: classes3.dex */
public class DataException extends Exception {
    Throwable cause;
    String message;

    public DataException() {
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.cause + " (" + this.message + ")";
    }

    public DataException(String str, Throwable th) {
        super(str, th);
        this.cause = th;
        this.message = str;
        if (str != null) {
            Log.d(InAppStoryManager.IAS_ERROR_TAG, str);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
    }
}
