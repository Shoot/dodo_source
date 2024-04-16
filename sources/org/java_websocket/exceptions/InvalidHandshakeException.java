package org.java_websocket.exceptions;

import com.huawei.hms.adapter.internal.CommonCode;
/* loaded from: classes3.dex */
public class InvalidHandshakeException extends InvalidDataException {
    public InvalidHandshakeException() {
        super(CommonCode.BusInterceptor.PRIVACY_CANCEL);
    }

    public InvalidHandshakeException(String str) {
        super((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, str);
    }
}
