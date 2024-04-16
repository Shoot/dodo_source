package com.fasterxml.jackson.databind.deser;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    private List<grb> d;

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (this.d == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        Iterator<grb> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.DOT);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    /* renamed from: u */
    public synchronized UnresolvedForwardReference fillInStackTrace() {
        return this;
    }
}
