package org.java_websocket.exceptions;

import com.huawei.hms.adapter.internal.CommonCode;
/* loaded from: classes3.dex */
public class InvalidFrameException extends InvalidDataException {
    public InvalidFrameException() {
        super(CommonCode.BusInterceptor.PRIVACY_CANCEL);
    }

    public InvalidFrameException(String str) {
        super((int) CommonCode.BusInterceptor.PRIVACY_CANCEL, str);
    }
}
