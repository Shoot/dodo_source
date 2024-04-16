package com.fasterxml.jackson.databind;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JacksonException;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes2.dex */
public class JsonMappingException extends DatabindException {
    protected LinkedList<a> b;
    protected transient Closeable c;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        protected transient Object a;
        protected String b;
        protected int c;
        protected String d;

        protected a() {
            this.c = -1;
        }

        public String a() {
            Class<?> cls;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.a;
                if (obj == null) {
                    sb.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
                } else {
                    if (obj instanceof Class) {
                        cls = (Class) obj;
                    } else {
                        cls = obj.getClass();
                    }
                    int i = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        sb.append("[]");
                    }
                }
                sb.append('[');
                if (this.b != null) {
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    sb.append(this.b);
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else {
                    int i2 = this.c;
                    if (i2 >= 0) {
                        sb.append(i2);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this.d = sb.toString();
            }
            return this.d;
        }

        public String toString() {
            return a();
        }

        Object writeReplace() {
            a();
            return this;
        }

        public a(Object obj, String str) {
            this.c = -1;
            this.a = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.b = str;
        }

        public a(Object obj, int i) {
            this.a = obj;
            this.c = i;
        }
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.c = closeable;
        if (closeable instanceof ob5) {
            this.a = ((ob5) closeable).c();
        }
    }

    public static JsonMappingException j(ua5 ua5Var, String str) {
        return new JsonMappingException(ua5Var, str, null);
    }

    public static JsonMappingException k(ua5 ua5Var, String str, Throwable th) {
        return new JsonMappingException(ua5Var, str, th);
    }

    public static JsonMappingException l(IOException iOException) {
        return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), q81.n(iOException)));
    }

    public static JsonMappingException q(Throwable th, a aVar) {
        Closeable closeable;
        JsonMappingException jsonMappingException;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String n = q81.n(th);
            if (n == null || n.isEmpty()) {
                n = "(was " + th.getClass().getName() + ")";
            }
            if (th instanceof JacksonException) {
                Object c = ((JacksonException) th).c();
                if (c instanceof Closeable) {
                    closeable = (Closeable) c;
                    jsonMappingException = new JsonMappingException(closeable, n, th);
                }
            }
            closeable = null;
            jsonMappingException = new JsonMappingException(closeable, n, th);
        }
        jsonMappingException.n(aVar);
        return jsonMappingException;
    }

    public static JsonMappingException r(Throwable th, Object obj, int i) {
        return q(th, new a(obj, i));
    }

    public static JsonMappingException s(Throwable th, Object obj, String str) {
        return q(th, new a(obj, str));
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    @za5
    public Object c() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void e(Object obj, String str) {
        n(new a(obj, str));
    }

    protected void f(StringBuilder sb) {
        LinkedList<a> linkedList = this.b;
        if (linkedList == null) {
            return;
        }
        Iterator<a> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return i();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return i();
    }

    protected String i() {
        StringBuilder sb;
        String message = super.getMessage();
        if (this.b == null) {
            return message;
        }
        if (message == null) {
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder(message);
        }
        sb.append(" (through reference chain: ");
        StringBuilder m = m(sb);
        m.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return m.toString();
    }

    public StringBuilder m(StringBuilder sb) {
        f(sb);
        return sb;
    }

    public void n(a aVar) {
        if (this.b == null) {
            this.b = new LinkedList<>();
        }
        if (this.b.size() < 1000) {
            this.b.addFirst(aVar);
        }
    }

    public JsonMappingException o(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.c = closeable;
        if (th instanceof JacksonException) {
            this.a = ((JacksonException) th).a();
        } else if (closeable instanceof ob5) {
            this.a = ((ob5) closeable).c();
        }
    }
}
