package com.fasterxml.jackson.databind.exc;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    protected final Collection<Object> d;
    protected transient String e;

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String d() {
        String str = this.e;
        if (str == null && this.d != null) {
            StringBuilder sb = new StringBuilder(100);
            int size = this.d.size();
            if (size == 1) {
                sb.append(" (one known property: \"");
                sb.append(String.valueOf(this.d.iterator().next()));
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else {
                sb.append(" (");
                sb.append(size);
                sb.append(" known properties: ");
                Iterator<Object> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    sb.append(String.valueOf(it.next()));
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    if (sb.length() > 1000) {
                        sb.append(" [truncated]");
                        break;
                    } else if (it.hasNext()) {
                        sb.append(", ");
                    }
                }
            }
            sb.append("])");
            String sb2 = sb.toString();
            this.e = sb2;
            return sb2;
        }
        return str;
    }
}
