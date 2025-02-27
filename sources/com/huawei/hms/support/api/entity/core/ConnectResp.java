package com.huawei.hms.support.api.entity.core;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public class ConnectResp implements IMessageEntity {
    @Packed
    public List<Integer> protocolVersion = Arrays.asList(1, 2);
    @Packed
    public String sessionId;

    public String toString() {
        StringBuilder sb = new StringBuilder("protocol version:");
        for (Integer num : this.protocolVersion) {
            sb.append(num);
            sb.append(CoreConstants.COMMA_CHAR);
        }
        return sb.toString();
    }
}
